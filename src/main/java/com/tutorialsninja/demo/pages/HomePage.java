package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
       // PageFactory.initElements(driver, this);

    }
    @CacheLookup
    @FindBy(xpath = "//a[text()='Desktops']")
    WebElement desktopTab;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Laptops & Notebooks']")
    WebElement laptopsAndNotebooks;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Components']")
    WebElement components;

    public void hoverOnDesktopsTabAndClick(){
        mouseHoverToElementAndClick(desktopTab);
        log.info("Hover on desktop and click " + desktopTab.toString());
    }
    public void callSelectMenuMethodAndClick(String menu){
        selectMenu(menu);
        log.info("Call select menu method and click " + desktopTab.toString());
    }
    public void hoverOnlaptopsAndNotebooksAndClick(){
        mouseHoverToElementAndClick(laptopsAndNotebooks);
        log.info("Hover on the laptops and notebooks and click " + laptopsAndNotebooks.toString());
    }
    public void hoverOnComponentsAndClick(){
        mouseHoverToElementAndClick(components);
        log.info("Hover on the components and click " + components.toString());
    }
}