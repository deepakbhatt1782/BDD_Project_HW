package org.example;
import org.openqa.selenium.By;

public class RegistrationPage extends Utils {
    LoadProp loadProp =new LoadProp();
    private By _firstName = By.id("FirstName" );
    private By _lastname = By.id("LastName");
    private By _dateOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    private By _dateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    private By _dateOfBirthYear = By.xpath("//select[@name='DateOfBirthYear']");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerSubmitButton = By.id("register-button");
    public void enterRegistrationDetails(){
        //type firstname
        typeText(_firstName,loadProp.getProperty("firstName"));
        //type lastname
        typeText(_lastname,loadProp.getProperty("lastName"));
        //select day of birth
        selectElementByValue(_dateOfBirth,loadProp.getProperty("dateOfBirth"));
        //select birth month
        selectElementByText(_dateOfBirthMonth,loadProp.getProperty("dateOfBirthMonth"));
        //select birth year
        selectElementByText(_dateOfBirthYear,loadProp.getProperty("dateOfBirthYear"));
        //type email address
        typeText(_email,loadProp.getProperty("email")+timeStamp()+loadProp.getProperty("emailDomain"));
        //type password
        typeText(_password,loadProp.getProperty("password"));
        //type confirm password
        typeText(_confirmPassword,loadProp.getProperty("confirmPassword"));
        //click on register submit button
        clickOnElement(_registerSubmitButton);
    }
}
