package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.demo.pages.MacBookPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LaptopsAndNotebooksSteps {

    //1.1 Mouse hover on Laptops & Notebooks Tab.and click
    @And("^I hover on Laptops & Notebooks Tab and click$")
    public void iHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().hoverOnlaptopsAndNotebooksAndClick();
    }
    //1.2 Click on “Show All Laptops & Notebooks
    @And("^I click on “Show All Laptops & Notebooks”$")
    public void iClickOnShowAllLaptopsNotebooks() {
        new HomePage().callSelectMenuMethodAndClick("Show AllLaptops & Notebooks");
    }
    //1.3 Select Sort By "Price (High > Low)"
    @And("^I select Sort By \"([^\"]*)\"$")
    public void iSelectSortBy(String arg0)  {
        new LaptopsAndNotebooksPage().clickOnSortByDropDown();
        new LaptopsAndNotebooksPage().selectPriceHighToLowFromDropdown();
    }
    //1.4 Verify the Product price will arrange in High to Low order.
    @Then("^I can see the Product price will arrange in High to Low order\\.$")
    public void iCanSeeTheProductPriceWillArrangeInHighToLowOrder() {
        new LaptopsAndNotebooksPage().verifyProductsArrangedByPriceHighToLow();
    }
    //2.4 Select Product “MacBook”
    @And("^I select Product 'MacBook'$")
    public void iSelectProductMacBook() {
        new LaptopsAndNotebooksPage().selectProductMacBook();
    }
    //2.5 Verify the text “MacBook”
    @Then("^I can see the text 'MacBook'$")
    public void iCanSeeTheTextMacBook() {
        Assert.assertEquals(new MacBookPage().getTextMacBook(),"MacBook","Error");
    }
    //2.6 Click on ‘Add To Cart’ button
    @And("^I click on ‘Add To Cart’ button$")
    public void iClickOnAddToCartButton() {
        new MacBookPage().clickOnAddToCartButton();
    }
    //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
    @Then("^I can see the message 'Success: You have added MacBook to your shopping cart!'$")
    public void iCanSeeTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        Assert.assertEquals(new MacBookPage().getTextSuccess(),"Success: You have added MacBook to your shopping cart!\n" +
                "×","Error");
    }
    //2.8 Click on link “shopping cart” display into success message
    @And("^I click on link 'shopping cart' displayed into success message$")
    public void iClickOnLinkShoppingCartDisplayedIntoSuccessMessage() {
        new MacBookPage().clickLinkShoppingCart();
    }
    //2.9 Verify the text "Shopping Cart"
    @Then("^I can able to see the text \"([^\"]*)\"$")
    public void iCanAbleToSeeTheText(String arg0)  {
        Assert.assertEquals(new ShoppingCartPage().getTextShoppingCart(),"Shopping Cart  (0.00kg)","Error");
    }
    //2.10 Verify the Product name "MacBook"
    @Then("^I can able to see the Product name \"([^\"]*)\"$")
    public void iCanAbleToSeeTheProductName(String arg0)  {
        Assert.assertEquals(new ShoppingCartPage().getTextMacBook(),"MacBook","Error");
    }
    //2.11 Change Quantity "2"
    @And("^I change Quantity to (\\d+)$")
    public void iChangeQuantityTo(int arg0) {
        new ShoppingCartPage().changeQuantity();
    }
    //2.12 Click on “Update” Tab
    @And("^I click on 'Update' Tab$")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnUpdateTab();
    }
    //2.13 Verify the message “Success: You have modified your shopping cart!”
    @Then("^I can see the message 'Success: You have modified your shopping cart!'$")
    public void iCanSeeTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().getTextMessage(),"Success: You have modified your shopping cart!\n" +
                "×","Error");
    }
    //2.14 Verify the Total £737.45
    @Then("^I can see the Total £(\\d+)\\.(\\d+)$")
    public void iCanSeeTheTotal£(int arg0, int arg1) {
        Assert.assertEquals(new ShoppingCartPage().getTextTotal1(),"$1,204.00","Error");
    }
    //2.15 Click on “Checkout” button
    @And("^I click on 'Checkout' button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }
    //2.16 Verify the text “Checkout”
    @Then("^I can see the text 'Checkout'$")
    public void iCanSeeTheTextCheckout() {
        Assert.assertEquals(new ShoppingCartPage().getTextCheckOut(),"Checkout","Error");
    }
    //2.17 Verify the Text “New Customer”
    @Then("^I can see the Text 'New Customer'$")
    public void iCanSeeTheTextNewCustomer() throws Exception{
        Thread.sleep(5000);
        Assert.assertEquals(new ShoppingCartPage().getTextNewCustomer(),"New Customer","Error");
    }
    //2.18 Click on “Guest Checkout” radio button
    @And("^I click on 'Guest Checkout' radio button$")
    public void iClickOnGuestCheckoutRadioButton() {
        new ShoppingCartPage().clickOnGuestCheckOutRadio();
    }
    //2.19 Click on “Continue” tab
    @And("^I click on 'Continue' tab$")
    public void iClickOnContinueTab() {
        new ShoppingCartPage().clickOnContinueButton();
    }
    //2.20 Fill the mandatory fields
    @And("^I fill the mandatory fields$")
    public void iFillTheMandatoryFields() {
        new ShoppingCartPage().fillInMandatoryFields();
    }
    //2.21 Click on “Continue” Button
    @And("^I click on 'Continue' Button$")
    public void iClickOnContinueButton() {
        new ShoppingCartPage().clickOnContinueButton1();
    }
    //2.22 Add Comments About your order into text area
    @And("^I add Comments About your order into text area$")
    public void iAddCommentsAboutYourOrderIntoTextArea() {
        new ShoppingCartPage().addCommentsAboutOrder();
    }
    //2.23 Check the Terms & Conditions check box
    @And("^I check the Terms & Conditions check box$")
    public void iCheckTheTermsConditionsCheckBox() {
        new ShoppingCartPage().clickOnTermsAndConditionCheckbox();
    }
    //2.24 Click on “Continue” button
    @And("^I click on 'Continue' button$")
    public void iClickOnContinueButton1() {
        new ShoppingCartPage().clickOnContinueButton2();
    }
    //2.25 Verify the message “Warning: Payment method required!”
    @Then("^I can see the message 'Warning: Payment method required!'$")
    public void iCanSeeTheMessageWarningPaymentMethodRequired() {
        Assert.assertEquals(new ShoppingCartPage().getTextWarningMessage(),"Warning: Payment method required!\n" +
                "×","Error");
    }

}