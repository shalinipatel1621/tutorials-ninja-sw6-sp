package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.MyAccountsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MyAccountSteps {
    //1.1 Click on My Account Link.
    //2.1 Click on My Account Link.
    @And("^I click on My Account link$")
    public void iClickOnMyAccountLink() {
        new MyAccountsPage().clickOnMyAccountLink();
    }
    //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
    @And("^call the method selectMyAccountOptions method with parameter \"([^\"]*)\"$")
    public void callTheMethodSelectMyAccountOptionsMethodWithParameter(String arg0)  {
        new MyAccountsPage().callSelectMyAccountOptionMethod();
    }
    //1.3 Verify the text “Register Account”.
    @Then("^I can see the text 'Register Account'$")
    public void iCanSeeTheTextRegisterAccount() {
        Assert.assertEquals(new MyAccountsPage().getTextRegister(),"Register Account","Error");
    }

    //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
    @And("^I call the method selectMyAccountOptions method with parameter \"([^\"]*)\"$")
    public void iCallTheMethodSelectMyAccountOptionsMethodWithParameter(String login)  {
        new MyAccountsPage().callSelectMyAccountLoginMethod();
    }
    //2.3 Verify the text “Returning Customer”.
    @Then("^I can see the text 'Returning Customer'$")
    public void iCanSeeTheTextReturningCustomer() {
        Assert.assertEquals(new MyAccountsPage().getTextReturningCustomer(),"Returning Customer","Error");
    }
    //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
    @And("^I can call the method selectMyAccountOptions method with parameter \"([^\"]*)\"$")
    public void iCanCallTheMethodSelectMyAccountOptionsMethodWithParameter(String myAccountOption)  {
        new MyAccountsPage().callSelectMyAccountOptionMethod();
    }
    //3.3 Enter First Name 3.4 Enter Last Name 3.5 Enter Email 3.6 Enter Telephone 3.7 Enter Password 3.8 Enter Password Confirm
    //3.9 Select Subscribe Yes radio button 3.10 Click on Privacy Policy check box 3.11 Click on Continue button
    @And("^I enter First Name and I enter Last Name and I enter Email and I enter Telephone and I enter Password and I enter Password Confirm and I select Subscribe Yes radio button and I click on Privacy Policy check box and I click on Continue button$")
    public void iEnterFirstNameAndIEnterLastNameAndIEnterEmailAndIEnterTelephoneAndIEnterPasswordAndIEnterPasswordConfirmAndISelectSubscribeYesRadioButtonAndIClickOnPrivacyPolicyCheckBoxAndIClickOnContinueButton() {
        new MyAccountsPage().fillInInformation();
    }
    //3.12 Verify the message “Your Account Has Been Created!”
    @Then("^I can see the message 'Your Account Has Been Created!'$")
    public void iCanSeeTheMessageYourAccountHasBeenCreated() {
        Assert.assertEquals(new MyAccountsPage().getTextAccountCreated(),"Your Account Has Been Created!","Error");
    }
    //3.13 Click on Continue button
    @And("^I click on Continue button$")
    public void iClickOnContinueButton() {
        new MyAccountsPage().clickOnContinueButton();
    }
    //3.14 Click on My Account Link.
    @And("^I click on my Accounts Link\\.$")
    public void iClickOnMyAccountsLink() {
        new MyAccountsPage().clickOnMyAccountLink();
    }
    //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
    @And("^I call the method “selectMyAccountOptions” method and pass the parameter “Logout”$")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogout() {
        new MyAccountsPage().callSelectMyAccountLogoutMethod();
    }
    //3.16 Verify the text “Account Logout”
    @Then("^I can see the text 'Account Logout'$")
    public void iCanSeeTheTextAccountLogout() {
        Assert.assertEquals(new MyAccountsPage().getTextAccountLogOut(),"Account Logout","Error");
    }
    //3.17 Click on Continue button
    @And("^I click on the continue button$")
    public void iClickOnTheContinueButton() {
        new MyAccountsPage().clickOnContinueButton2();
    }
    ////4.1 Click on My Account Link.
    //        myAccountsPage.clickOnMyAccountLink();
    //    //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
    //        myAccountsPage.callSelectMyAccountLogoutMethod();
    //    //4.11 Click on Continue button
    //      myAccountsPage.clickOnContinueButton2();
    //4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
    @And("^I can call the method selectMyAccountOptions method with the parameter \"([^\"]*)\"$")
    public void iCanCallTheMethodSelectMyAccountOptionsMethodWithTheParameter(String login) {
        new MyAccountsPage().callSelectMyAccountLoginMethod();
    }
    //4.3 Enter Email address 4.5 Enter Password 4.6 Click on Login button
    @And("^I enter Email address and and I enter Password and I click on Login button$")
    public void iEnterEmailAddressAndAndIEnterPasswordAndIClickOnLoginButton() {
        new MyAccountsPage().fillInEmailPassword();
    }
    //4.7 Verify text “My Account”
    @Then("^I can see the text “My Account”$")
    public void iCanSeeTheTextMyAccount() {
        Assert.assertEquals(new MyAccountsPage().getTextMyAccount(),"My Account","Error");
    }
    //4.8 Click on My Account Link.
    @And("^I click on the My Account Link\\.$")
    public void iClickOnTheMyAccountLink() {
        new MyAccountsPage().clickOnMyAccountLink1();
    }
    //4.10 Verify the text “Account Logout”
    @Then("^I can see text “Account Logout”$")
    public void iCanSeeTextAccountLogout() {
        Assert.assertEquals(new MyAccountsPage().getTextAccountLogOut(),"Account Logout","Error");
    }

}