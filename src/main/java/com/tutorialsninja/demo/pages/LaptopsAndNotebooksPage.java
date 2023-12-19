package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {

    private static final Logger log = LogManager.getLogger(LaptopsAndNotebooksPage.class.getName());

    public LaptopsAndNotebooksPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(css = "#content h2")
    WebElement laptopsAndNotebooks;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement selectSortBy;
    @CacheLookup
    @FindBy(xpath = "//a[text()='MacBook']")
    WebElement productMacBook;

    public String getTextFromLaptopsAndNotebooks(){
        log.info("Get text " + laptopsAndNotebooks.toString());
        return getTextFromElement(laptopsAndNotebooks);
    }
    public void clickOnSortByDropDown(){
        clickOnElement(selectSortBy);
        log.info("Click on sort by dropdown " + selectSortBy.toString());
    }
    public void selectPriceHighToLowFromDropdown(){
        selectByVisibleTextFromDropDown(selectSortBy,"Price (High > Low)");
        log.info("Select price high to low " + selectSortBy.toString());
    }
    public void selectProductMacBook(){
        clickOnElement(productMacBook);
        log.info("Select product macbook " + productMacBook.toString());
    }
    public void verifyProductsArrangedByPriceHighToLow(){
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // After filter Price (High > Low) Get all the products price and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(afterSortByPrice);
        Assert.assertEquals(originalProductsPrice, afterSortByPrice,"Product not sorted by price High to Low");
        log.info("Select product macbook " + afterSortByPrice.toString());
    }
}