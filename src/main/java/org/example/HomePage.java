package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By _registerButton = By.className("ico-register");
    private By _loginButton = By.className("ico-login");


    public void clickOnRegistrationButton(){
        //click on register button
        clickOnElement(_registerButton);
    }
    public void clickOnLoginButton() {
        //click on login button
        clickOnElement(_loginButton);
    }
}
