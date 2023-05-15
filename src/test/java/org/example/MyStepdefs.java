package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    HomePage homePage = new HomePage();
    VerificationPage verificationPage = new VerificationPage();
    RegistrationPage registrationPage = new RegistrationPage();
    EmailAFriend emailAFriend = new EmailAFriend();
    LoginPage loginPage = new LoginPage();
    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        verificationPage.verifyUserOnHomePage();
        homePage.clickOnRegistrationButton();
        verificationPage.verifyUserOnRegistrationPage();
    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
       registrationPage.enterRegistrationDetails();
    }
    @Then("I should  able to register successfully")
    public void iShouldAbleToRegisterSuccessfully() {
        verificationPage.verifyUserRegisteredSuccessfully();
    }

    @Given("I am on homepage")
    public void iAmOnHomepage() {
        verificationPage.verifyUserOnHomePage();
    }
    @When("I add product to the cart")
    public void iAddProductToTheCart() {
     emailAFriend.addProductToTheCart();
    }
    @And("I enter email details")
    public void iEnterEmailDetails() {
     emailAFriend.enterEmailDetailsToReferAProductToFriend();
    }
    @Then("I should not able to refer product to my friend")
    public void iShouldNotAbleToReferProductToMyFriend() {
        verificationPage.verifyUserShouldNotReferProductToFriendWithoutRegistration();
    }
    @And("I should see registration required error message")
    public void iShouldSeeRegistrationRequiredErrorMessage() {
        verificationPage.verifyUserShouldSeeErrorMessage();
    }
    @And("I click on login button")
    public void iClickOnLoginButton() {
        homePage.clickOnLoginButton();
    }
    @And("I enter login details")
    public void iEnterLoginDetails() {
        loginPage.enterLoginDetails();
    }

    @And("I logged in successfully")
    public void iLoggedInSuccessfully() {
        verificationPage.verifyUserLoginSuccessfully();
    }

    @Then("I should able to refer a product to my friend")
    public void iShouldAbleToReferAProductToMyFriend() {
        verificationPage.verifyUserShouldReferProductToFriendWithRegistration();
    }
    @And("I should see email send message")
    public void iShouldSeeEmailSendMessage() {
        verificationPage.verifyUserShouldSeeEmailSendMessage();
    }
}
