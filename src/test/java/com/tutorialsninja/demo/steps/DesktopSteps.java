package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopsPage;
import com.tutorialsninja.demo.pages.HPLP3065Page;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DesktopSteps {
    //
//        homePage.hoverOnDesktopsTabAndClick();

    //1.2 Click on “Show All Desktops”
    @And("^click on \"([^\"]*)\"$")
    public void clickOn(String showDesktop) {
        new HomePage().callSelectMenuMethodAndClick("Show AllDesktops");
    }
    //1.3 Select Sort By position "Name: Z to A"
    @And("^select sort by position \"([^\"]*)\"$")
    public void selectSortByPosition(String zToa) {
        new DesktopsPage().clickOnSortByDropDown();
        new DesktopsPage().selectNameZToAFromDropdown();
    }
    //1.4 Verify the Product will arrange in Descending order.
    @Then("^I can see the products in descending order$")
    public void iCanSeeTheProductsInDescendingOrder() throws InterruptedException {
        new DesktopsPage().verifyProductsArrangedInAlphabeticallyDescendingOrder();
    }

    //2.3 Select Sort By position "Name: A to Z"
    @And("^select sort by the position \"([^\"]*)\"$")
    public void selectSortByThePosition(String aToz)  {
        new DesktopsPage().clickOnSortByDropDown();
        new DesktopsPage().selectNameAToZFromDropdown();
    }
    //2.4 Select product “HP LP3065”
    @And("^select product 'HP LP(\\d+)'$")
    public void selectProductHPLP(int arg0) {
        new DesktopsPage().selectHPLP3065();
    }
    //2.5 Verify the Text "HP LP3065"
    @Then("^I can see the text \"([^\"]*)\"$")
    public void iCanSeeTheText(String arg0)  {
        Assert.assertEquals(new HPLP3065Page().getTextHPLP3065(),"HP LP3065","Error");
    }
    //2.6 Select Delivery Date "2022-11-30"
    @And("^select delivery date '(\\d+)-(\\d+)-(\\d+)'$")
    public void selectDeliveryDate(int arg0, int arg1, int arg2) {
        new HPLP3065Page().selectDeliveryDate();
    }
    //2.7.Enter Qty "1” using Select class.
    @And("^enter qty (\\d+) using select class$")
    public void enterQtyUsingSelectClass(int arg0) {
        new HPLP3065Page().enterQuantity();
    }
    //2.8 Click on “Add to Cart” button
    @And("^click on 'Add to Cart' button$")
    public void clickOnAddToCartButton() {
        new HPLP3065Page().clickOnAddToCartButton();
    }
    //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    //2.10 Click on link “shopping cart” display into success message
    @And("^I click on link 'shopping cart' display into success message$")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        Assert.assertEquals(new HPLP3065Page().getTextMessageSuccess(),"Success: You have added HP LP3065 to your shopping cart!\n" +
                "×","Error");
        new HPLP3065Page().clickOnLinkShoppingCart();
    }
    //2.11 Verify the text "Shopping Cart"
    @Then("^I can see the text 'Shopping Cart'$")
    public void iCanSeeTheTextShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().getTextShoppingCart(),"Shopping Cart  (1.00kg)","Error");
    }

    //2.12 Verify the Product name "HP LP3065"

    @Then("^I can see the Product name \"([^\"]*)\"$")
    public void iCanSeeTheProductName(String arg0)  {
        Assert.assertEquals(new ShoppingCartPage().getTextProductName(),"HP LP3065","Error");
    }
    //2.13 Verify the Delivery Date "2022-11-30"
    @Then("^I can see the Delivery Date \"([^\"]*)\"$")
    public void iCanSeeTheDeliveryDate(String arg0) {
        Assert.assertEquals(new ShoppingCartPage().getTextDeliveryDate(),"Delivery Date:2022-11-30","Error");
    }
    //2.14 Verify the Model "Product21"
    @Then("^I can see the Model \"([^\"]*)\"$")
    public void iCanSeeTheModel(String arg0)  {
        Assert.assertEquals(new ShoppingCartPage().getTextModel(),"Product 21","Error");
    }
    //2.15 Verify the Total "£74.73"
    @Then("^I can see the Total \"([^\"]*)\"$")
    public void iCanSeeTheTotal(String arg0)  {
        Assert.assertEquals(new ShoppingCartPage().getTextTotal(),"$122.00","Error");
    }

    @When("I mouse hover and click on desktop tab")
    public void iMouseHoverAndClickOnDesktopTab() {
    }

    @And("I select currency {string}")
    public void iSelectCurrency(String currency) {
        new DesktopsPage().MouseHoverOnCurrencyDropdownAndClick();
    }

    @And("I click on show all desktops")
    public void iClickOnShowAllDesktops() {
        new HomePage().callSelectMenuMethodAndClick("Show AllDesktops");
    }

    @And("I select product sort by {string}")
    public void iSelectProductSortBy(String arg0) {
    }

    @And("I select product “<product>”")
    public void iSelectProductProduct(String product) {
        new DesktopsPage().selectPositionByAtoZ();
    }

    @Then("Verify the Text {string} is diaplayd")
    public void verifyTheTextIsDiaplayd(String arg0) {
    }

    @And("I add quantity {string} for product using Select class.")
    public void iAddQuantityForProductUsingSelectClass(String value) {
        new DesktopsPage().enterQuantity();
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new DesktopsPage().clickOnAddToCart();
    }

    @And("Verify the Message “Success: You have added “<product>” to your shopping cart!”")
    public void verifyTheMessageSuccessYouHaveAddedProductToYourShoppingCart() {
        String actualText1 = new DesktopsPage().getSuccessText();
        Assert.assertEquals(actualText1, "Success: You have added “<product>” to your shopping cart!");
    }

    @And("I click on shopping cart button")
    public void iClickOnShoppingCartButton() {
            new DesktopsPage().clickOnShoppingCart1();
    }

    @Then("I should see shopping cart text")
    public void iShouldSeeShoppingCartText() {
        String actualText2 = new DesktopsPage().clickOnShoppingCart();
        Assert.assertEquals(actualText2, "Shopping Cart");
    }

    @And("Verify the Product name {string}")
    public void verifyTheProductName(String value) {
        String actualText3 = new DesktopsPage().verifyProductName();
        Assert.assertEquals(actualText3, "Product name");
    }

    @And("Verify the Model {string}")
    public void verifyTheModel(String value) {
        String actualText4 = new DesktopsPage().verifyModel();
        Assert.assertEquals(actualText4, "model");

    }

    @And("Verify the Total {string}")
    public void verifyTheTotal(String value) {
        String actualText5 = new DesktopsPage().verifyTotal();
        Assert.assertEquals(actualText5, "total");

    }
}