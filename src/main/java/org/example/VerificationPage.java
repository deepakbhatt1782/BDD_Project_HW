package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class VerificationPage extends Utils {
    private By _welcomeToStorePage =  By.xpath("//*[text()='Welcome to our store']");
    private By _yourPersonalDetails = By.xpath("//*[text()='Your Personal Details']");
    private By _actualErrorMessage = By.xpath("//div[@class='result']");
    private By _actualRegistrationSuccessMessage = By.xpath("//div[@class='result']");
    private By _referAFriendErrorMessage = By.xpath("//*[@class='message-error validation-summary-errors']");
    private By _actualMessage = By.xpath("//h2[text()='Welcome to our store']");
    private By _actualEmailAFriendMessage = By.xpath("//div[@class='result']");

    public void verifyUserOnHomePage(){

     Assert.assertEquals(getTextFromElement(_welcomeToStorePage),"Welcome to our store");
    }
    public  void verifyUserOnRegistrationPage(){

        Assert.assertEquals(getTextFromElement(_yourPersonalDetails),"Your Personal Details");
    }
    public void verifyUserRegisteredSuccessfully() {
        String expectedRegistrationCompleteMsg ="Your registration completed";
        //gettext from webelement
        String actualMessage = getTextFromElement(_actualRegistrationSuccessMessage);
        System.out.println("My message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedRegistrationCompleteMsg, "Thanks for registration");
    }
    public void verifyUserShouldNotReferProductToFriendWithoutRegistration() {
        String actualErrorMessage = getTextFromElement(_referAFriendErrorMessage);
        String expectedErrorMessage = "Only registered customers can use email a friend feature";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    public void verifyUserShouldSeeErrorMessage(){
        System.out.println("Error message: " + getTextFromElement(_referAFriendErrorMessage));
    }
    public void verifyUserLoginSuccessfully(){
        //gettext from webelement
        String actualMessage = getTextFromElement(_actualMessage);
        String expectedLoginCompleteMsg = "Welcome to our store";
        System.out.println("Login Successfully Message: "+ actualMessage);
        Assert.assertEquals(actualMessage,expectedLoginCompleteMsg);
    }
    public void verifyUserShouldReferProductToFriendWithRegistration(){
        String actualMessage = getTextFromElement(_actualEmailAFriendMessage);
        String expectedMessage = "Your message has been sent.";
        Assert.assertEquals(actualMessage,expectedMessage);
    }
    public void verifyUserShouldSeeEmailSendMessage(){
        System.out.println("Email Send To Friend Message :  "+getTextFromElement(_actualEmailAFriendMessage));
    }
}
