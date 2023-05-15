package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _loginButton = By.xpath("//button[@class='button-1 login-button']");
    public void enterLoginDetails(){
        //type email adderss
        typeText(_email,loadProp.getProperty("myEmail"));
        //type password
        typeText(_password,loadProp.getProperty("password"));
        //click on login button
        clickOnElement(_loginButton);
    }
}
