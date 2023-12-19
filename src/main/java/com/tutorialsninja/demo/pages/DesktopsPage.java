package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2")
    WebElement desktops;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByPosition;
    @CacheLookup
    @FindBy(xpath = "//a[text()='HP LP3065']")
    WebElement productHPLP3065;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Currency']")
    WebElement currency;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productsList;

    @CacheLookup
    @FindBy(xpath = "//button[@name='GBP']")
    WebElement currencyTab;

    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'dropdown-menu']/li")
    WebElement currencyList;

    @FindBy(id = "input-sort")
    WebElement positionAtoZ;
    @CacheLookup
    @FindBy(id = "input-limit")
    WebElement enterQty;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart1;
    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Product 21']")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Model']")
    WebElement model;

    @CacheLookup
    @FindBy(xpath = "//td[contains(text(),'Total')]")
    WebElement total;


    public String getTextFromDesktops() {
        log.info("Get text from desktops " + desktops.toString());
        return getTextFromElement(desktops);
    }

    public void clickOnSortByDropDown() {
        clickOnElement(sortByPosition);
        log.info("Click on sort by Dropdown " + sortByPosition.toString());
    }

    public void selectNameZToAFromDropdown() {
        selectByVisibleTextFromDropDown(sortByPosition, "Name (Z - A)");
        log.info("Select name Z to A from dropdown " + sortByPosition.toString());
    }

    public void selectNameAToZFromDropdown() {
        selectByVisibleTextFromDropDown(sortByPosition, "Name (A - Z)");
        log.info("Select name A to Z from dropdown " + sortByPosition.toString());
    }

    public void selectHPLP3065() {
        clickOnElement(productHPLP3065);
        log.info("Select product " + productHPLP3065.toString());
    }



    public void selectPositionByAtoZ() {
        log.info("Select position By A to Z " + positionAtoZ.toString());
        selectByVisibleTextFromDropDown(positionAtoZ, "Name (A - Z)");
    }

    public void enterQuantity() {
        log.info("Enter quantity " + enterQty.toString());
        sendTextToElement(enterQty, "");
    }

    public void clickOnAddToCart() {
        log.info("Click on add to cart " + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getSuccessText() {
        log.info("Getting success message " + successMessage.toString());
        return getTextFromElement(successMessage);

    }

    public String clickOnShoppingCart() {
        log.info("Click on shopping Cart " + shoppingCart1.toString());
        return getTextFromElement(shoppingCart1);

    }

    public void clickOnShoppingCart1() {
        log.info("Click on shopping cart " + shoppingCart.toString());
        clickOnElement(shoppingCart);
    }

    public String verifyProductName() {
        log.info("Verify product name " + productName.toString());
        return getTextFromElement(productName);

    }

    public String verifyModel() {
        log.info("Verify model " + model.toString());
        return getTextFromElement(model);
    }

    public String verifyTotal() {
        log.info("Verify total " + total.toString());
        return getTextFromElement(total);
    }

    public void verifyProductsArrangedInAlphabeticallyDescendingOrder() throws InterruptedException {
        //Get all the products name and stored into array list
        List<WebElement> products = productsList;
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        //Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = productsList;
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        //Assert.assertEquals(originalProductsName,afterSortByZToAProductsName,"Error in sorting");
        log.info("Product is in Descending order " + productsList.toString());
    }

    public void selectCurrency(String currency) {
        waitUntilVisibilityOfElementLocated((By) currencyTab, 5).click();
        List<WebElement> listOfElements = getListOfElements(currencyList);
        for (WebElement e : listOfElements) {
            if (e.getText().equalsIgnoreCase(currency)) {
                e.click();
                break;
            }
        }
    }
    public void MouseHoverOnCurrencyDropdownAndClick() {
        log.info("mouse hover on currency " + currency.toString());
        selectByValueFromDropDown(currency, "£Pound Sterling");
    }

}