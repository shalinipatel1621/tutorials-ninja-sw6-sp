package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.ComponentsPage;
import com.tutorialsninja.demo.pages.DesktopsPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
    }
    //1.1 Mouse hover on “Desktops” Tab and click
    @And("^I hover on the Desktops tab and click$")
    public void iHoverOnTheDesktopsTabAndClick() {
        new HomePage().hoverOnDesktopsTabAndClick();
    }
    //1.2 call selectMenu method and pass the menu = “Show All Desktops”
    //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
    //3.2 call selectMenu method and pass the menu = “Show All Components”
    @And("^call selectMenu method and pass the menu \"([^\"]*)\"$")
    public void callSelectMenuMethodAndPassTheMenu(String menu) {
        new HomePage().callSelectMenuMethodAndClick(menu);
    }
    //1.3 Verify the text ‘Desktops
    @Then("^I can see the text 'Desktops'$")
    public void iCanSeeTheTextDesktops() {
        Assert.assertEquals(new DesktopsPage().getTextFromDesktops(), "Desktops", "Error");
    }

    //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    @And("^I hover on the Laptops & Notebooks tab and click$")
    public void iHoverOnTheLaptopsNotebooksTabAndClick() {
        new HomePage().hoverOnlaptopsAndNotebooksAndClick();
    }

    //2.3 Verify the text ‘Laptops & Notebooks’
    @Then("^I can see the text 'Laptops & Notebooks'$")
    public void iCanSeeTheTextLaptopsNotebooks() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getTextFromLaptopsAndNotebooks(),"Laptops & Notebooks","Error");
    }

    //3.1 Mouse hover on “Components” Tab and click
    @And("^I hover on the Components tab and click$")
    public void iHoverOnTheComponentsTabAndClick() {
        new HomePage().hoverOnComponentsAndClick();
    }
    //3.3 Verify the text ‘Components’
    @Then("^I can see the text 'Components'$")
    public void iCanSeeTheTextComponents() {
        Assert.assertEquals(new ComponentsPage().getTextComponents(),"Components","Error");
    }
}