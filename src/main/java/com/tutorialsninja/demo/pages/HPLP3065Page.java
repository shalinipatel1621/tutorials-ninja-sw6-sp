package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HPLP3065Page extends Utility {

    private static final Logger log = LogManager.getLogger(HPLP3065Page.class.getName());

    public HPLP3065Page() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(css = "#content h1")
    WebElement textHPLP3065;
    @CacheLookup
    @FindBy(css = "#input-quantity")
    WebElement quantity;
    @CacheLookup
    @FindBy(css = "#button-cart")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(css = ".alert.alert-success.alert-dismissible")
    WebElement textMessageSuccess;
    @CacheLookup
    @FindBy(css = ".alert.alert-success.alert-dismissible a:nth-of-type(2)")
    WebElement linkShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement dateOption;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")
    WebElement monthAndYearOption;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='next']")
    WebElement datePickerOption;

    public String getTextHPLP3065(){
        log.info("Get text " + textHPLP3065.toString());
        return getTextFromElement(textHPLP3065);
    }
    public void enterQuantity(){
        sendTextToElement(quantity,"");
        log.info("Enter quantity " + quantity.toString());
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
        log.info("Click on add to cart button " + addToCartButton.toString());
    }
    public String getTextMessageSuccess(){
        log.info("Get text message Success : " + textMessageSuccess.toString());
        return getTextFromElement(textMessageSuccess);
    }
    public void clickOnLinkShoppingCart(){
        clickOnElement(linkShoppingCart);
        log.info("Click on shopping cart link : " + linkShoppingCart.toString());
    }
    public void selectDeliveryDate(){
        String year = "2023";
        String month = "December";
        String date = "30";
        clickOnElement(dateOption);
        while (true) {
            String monthAndYear = monthAndYearOption.getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(datePickerOption);
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
        log.info("Select delivery date : " + allDates.toString());
    }
}

