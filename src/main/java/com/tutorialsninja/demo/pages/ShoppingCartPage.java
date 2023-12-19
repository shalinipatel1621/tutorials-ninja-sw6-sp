package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "#content>h1")
    WebElement textShoppingCart;
    @CacheLookup
    @FindBy(css = "body > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)")
    WebElement textProductName;
    @CacheLookup
    @FindBy(xpath = "//small[text()='Delivery Date:2022-11-30']")
    WebElement textDeliveryDate;
    @CacheLookup
    @FindBy(xpath = "//td[text()='Product 21']")
    WebElement textModel;
    @CacheLookup
    @FindBy(css = "#content > div.row > div > table > tbody > tr:nth-child(4) > td:nth-child(2)")
    WebElement textTotal;
    @CacheLookup
    @FindBy(css = "body > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)")
    WebElement textMacBook;
    @CacheLookup
    @FindBy(css = "div.input-group.btn-block>input")
    WebElement quantity;
    @CacheLookup
    @FindBy(css = ".fa.fa-refresh")
    WebElement updateTab;
    @CacheLookup
    @FindBy(css = ".alert.alert-success.alert-dismissible")
    WebElement textMessage;
    @CacheLookup
    @FindBy(css = "#content > div.row > div > table > tbody > tr:nth-child(4) > td:nth-child(2)")
    WebElement textTotal1;
    @CacheLookup
    @FindBy(css = "a.btn.btn-primary")
    WebElement checkOutbtn;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Checkout']")
    WebElement textCheckout;
    @CacheLookup
    @FindBy(xpath = "//h2[text()='New Customer']")
    WebElement textNewCustomer;
    @CacheLookup
    @FindBy(css = "input[value='guest']")
    WebElement guestCheckOutRadio;
    @CacheLookup
    @FindBy(css = "#button-account")
    WebElement continueButton;
    @CacheLookup
    @FindBy(css = "#input-payment-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(css = "#input-payment-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(css = "#input-payment-email")
    WebElement email;
    @CacheLookup
    @FindBy(css = "#input-payment-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(css = "#input-payment-address-1")
    WebElement address;
    @CacheLookup
    @FindBy(css = "#input-payment-city")
    WebElement city;
    @CacheLookup
    @FindBy(css = "#input-payment-postcode")
    WebElement postcode;
    @CacheLookup
    @FindBy(css = "#input-payment-zone")
    WebElement zone;
    @CacheLookup
    @FindBy(css = "#button-guest")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(css = "textarea[name='comment']")
    WebElement addCommentsAboutOrder;
    @CacheLookup
    @FindBy(css = "input[type='checkbox']")
    WebElement tncCheckbox;
    @CacheLookup
    @FindBy(css = "#button-payment-method")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(css = ".alert.alert-danger.alert-dismissible")
    WebElement textWarning;

    public String getTextShoppingCart() {
        log.info("Get text shopping cart : " + textShoppingCart.toString());
        return getTextFromElement(textShoppingCart);
    }

    public String getTextProductName() {
        log.info("Get text product name : " + textProductName.toString());
        return getTextFromElement(textProductName);
    }

    public String getTextDeliveryDate() {
        log.info("Get text delivery date : " + textDeliveryDate.toString());
        return getTextFromElement(textDeliveryDate);
    }

    public String getTextModel() {
        log.info("Get text model " + textModel.toString());
        return getTextFromElement(textModel);
    }

    public String getTextTotal() {
        log.info("Get text total " + textTotal.toString());
        return getTextFromElement(textTotal);
    }

    public String getTextMacBook() {
        log.info("Get text MacBook " + textMacBook.toString());
        return getTextFromElement(textMacBook);
    }

    public void changeQuantity() {
        sendTextToElement(quantity, Keys.BACK_SPACE + "2");
        log.info("Change Quantity " + quantity.toString());
    }

    public void clickOnUpdateTab() {
        clickOnElement(updateTab);
        log.info("Click on update tab " + updateTab.toString());
    }

    public String getTextMessage() {
        log.info("get text message " + textMessage.toString());
        return getTextFromElement(textMessage);
    }

    public String getTextTotal1() {
        log.info("Get text total " + textTotal1.toString());
        return getTextFromElement(textTotal1);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOutbtn);
        log.info("Click on check out button " + checkOutbtn.toString());
    }

    public String getTextCheckOut() {
        log.info("Get text Check out " + textCheckout.toString());
        return getTextFromElement(textCheckout);
    }

    public String getTextNewCustomer() {
        log.info("Get text new customer " + textNewCustomer.toString());
        return getTextFromElement(textNewCustomer);
    }

    public void clickOnGuestCheckOutRadio() {
        clickOnElement(guestCheckOutRadio);
        log.info("Click on guest check out radio " + guestCheckOutRadio.toString());
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Click on continue button " + continueButton.toString());
    }

    public void fillInMandatoryFields() {
        sendTextToElement(firstName, "Bella");
        sendTextToElement(lastName, "Cooper");
        sendTextToElement(email, "bellacooper@gmail.com");
        sendTextToElement(telephone, "75864125874");
        sendTextToElement(address, "Oxford Street");
        sendTextToElement(city, "London");
        sendTextToElement(postcode, "NW4 4EB");
        selectByVisibleTextFromDropDown(zone, "Berkshire");
        log.info("Mandatory fields ");
    }

    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
        log.info("Click on continue button " + continueButton1.toString());
    }

    public void addCommentsAboutOrder() {
        sendTextToElement(addCommentsAboutOrder, "Thank You for Your Order");
        log.info("Add comments about order " + addCommentsAboutOrder.toString());
    }

    public void clickOnTermsAndConditionCheckbox() {
        clickOnElement(tncCheckbox);
        log.info("Click on terms and condition checkbox " + tncCheckbox.toString());
    }

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
        log.info("Click on continue button " + continueButton2.toString());
    }

    public String getTextWarningMessage() {
        log.info("Get text warning message " + textWarning.toString());
        return getTextFromElement(textWarning);
    }
}