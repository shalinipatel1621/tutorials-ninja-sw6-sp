package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MacBookPage extends Utility {

    private static final Logger log = LogManager.getLogger(MacBookPage.class.getName());

    public MacBookPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[text()='MacBook']")
    WebElement textMacBook;
    @CacheLookup
    @FindBy(css = "#button-cart")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(css = ".alert.alert-success.alert-dismissible")
    WebElement textSuccess;
    @CacheLookup
    @FindBy(css = ".alert.alert-success.alert-dismissible a:nth-of-type(2)")
    WebElement linkShoppingCart;

    public String getTextMacBook() {
        log.info("Get text macbook " + textMacBook.toString());
        return getTextFromElement(textMacBook);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
        log.info("Click on add to cart button " + addToCartButton.toString());
    }

    public String getTextSuccess() {
        log.info("Get text success " + textSuccess.toString());
        return getTextFromElement(textSuccess);
    }

    public void clickLinkShoppingCart() {
        clickOnElement(linkShoppingCart);
        log.info("Click link shopping cart " + linkShoppingCart.toString());
    }

}
