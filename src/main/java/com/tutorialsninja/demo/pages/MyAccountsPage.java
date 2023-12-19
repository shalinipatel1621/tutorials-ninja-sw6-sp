package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountsPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountsPage.class.getName());

    public MyAccountsPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccountLink1;
    @CacheLookup
    @FindBy(css = "#top-links a")
    WebElement myAccountOption;
    @CacheLookup
    @FindBy(css = "#content h1")
    WebElement textRegister;
    @CacheLookup
    @FindBy(css = "#content > div > div:nth-child(2) > div > h2")
    WebElement textReturningCustomer;
    @CacheLookup
    @FindBy(css = "#input-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(css = "#input-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(css = "#input-email")
    WebElement email;
    @CacheLookup
    @FindBy(css = "#input-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(css = "#input-password")
    WebElement password;
    @CacheLookup
    @FindBy(css = "#input-confirm")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(css = "input[type='radio'][name='newsletter'][value='1']")
    WebElement radioYes;
    @CacheLookup
    @FindBy(css = "input[type='checkbox']")
    WebElement checkPrivacy;
    @CacheLookup
    @FindBy(css = "input[value='Continue']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    WebElement textAccountCreated;
    @CacheLookup
    @FindBy(css = "a[class='btn btn-primary']")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Account Logout']")
    WebElement textAccountLogOut;
    @CacheLookup
    @FindBy(css = ".btn.btn-primary")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(css = "input[value='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement textMyAccount;

    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
        log.info("Click on my account link " + myAccountLink.toString());
    }
    public void clickOnMyAccountLink1(){
        clickOnElement(myAccountLink1);
        log.info("Click on my account link " + myAccountLink1.toString());
    }
    public void callSelectMyAccountOptionMethod(){
        selectMyAccountOptions("Register");
        log.info("Select my account option ");
    }
    public void callSelectMyAccountLogoutMethod(){
        selectMyAccountOptions("Logout");
        log.info("Select my account logout option ");
    }
    public String getTextRegister(){
        log.info("Get text from element " +textRegister.toString());
        return getTextFromElement(textRegister);
    }
    public void callSelectMyAccountLoginMethod(){
        selectMyAccountOptions("Login");
        log.info("Select my account Login ");
    }
    public String getTextReturningCustomer(){
        log.info("Get text returning customer " +textReturningCustomer);
        return getTextFromElement(textReturningCustomer);
    }
    public void fillInInformation(){
        sendTextToElement(firstName,"Helen");
        sendTextToElement(lastName,"Wood");
        sendTextToElement(email,"helenwood134@gmail.com");
        sendTextToElement(telephone,"78569245325");
        sendTextToElement(password,"12as5464");
        sendTextToElement(confirmPassword,"12as5464");
        clickOnElement(radioYes);
        clickOnElement(checkPrivacy);
        clickOnElement(continueButton);
        log.info("All the information " );
    }
    public void fillInEmailPassword(){
        sendTextToElement(email,"helenwood789@gmail.com");
        sendTextToElement(password,"12as5464");
        clickOnElement(loginButton);
        log.info("Email password information ");
    }
    public String getTextAccountCreated(){
        log.info("Get text account created : " +textAccountCreated);
        return getTextFromElement(textAccountCreated);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton1);
        log.info("Click on continue button " +continueButton1);
    }
    public String getTextAccountLogOut(){
        log.info("Get text Account log out " +textAccountLogOut);
        return getTextFromElement(textAccountLogOut);
    }
    public void clickOnContinueButton2(){
        clickOnElement(continueButton2);
        log.info("Click on continue button " +continueButton2);
    }
    public String getTextMyAccount(){
        log.info("Get text my account " +textMyAccount);
        return getTextFromElement(textMyAccount);
    }
}