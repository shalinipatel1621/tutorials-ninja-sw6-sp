package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComponentsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComponentsPage.class.getName());

    public ComponentsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css ="#content h2")
    WebElement components;


    public String getTextComponents(){
        log.info("Get text from components " + components.toString());
        return getTextFromElement(components);
    }
}