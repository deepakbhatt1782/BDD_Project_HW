package org.example;

import org.openqa.selenium.By;

public class EmailAFriend extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _appleAddToCartButton = By.xpath("(//button[text()='Add to cart'])[2]");
    private By _emailAFriendButton = By.xpath("//button[text()='Email a friend']");
    private By _enterFriendEmailAddress = By.id("FriendEmail");
    private By _enterYourEmailAddress = By.id("YourEmailAddress");
    private By _enterPersonalMessage = By.id("PersonalMessage");
    private By _sendEmailButton = By.name("send-email");
    public void addProductToTheCart() {
        //click on apple add to cart button
        clickOnElement(_appleAddToCartButton);
    }
    public void enterEmailDetailsToReferAProductToFriend(){
        //click on email a friend button
        clickOnElement(_emailAFriendButton);
        //enter friend email address
        typeText(_enterFriendEmailAddress,loadProp.getProperty("friendEmail"));
        //enter your email address
        typeText(_enterYourEmailAddress,loadProp.getProperty("myEmail"));
        //enter personal message
        typeText(_enterPersonalMessage,loadProp.getProperty("personalMessage"));
        //click on send email button
        clickOnElement(_sendEmailButton);
    }
}
