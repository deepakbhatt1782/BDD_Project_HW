package org.example;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class Utils extends BasePage {
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    public static void typeText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public static  String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
    public static void clickAndClear(By by){
        driver.findElement(by).click();
        driver.findElement(by).clear();
    }
    public static long timeStamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }
    public static boolean elementIsDisplayed(By by) {
        return driver.findElement(by).isDisplayed();
    }
    public static void manageTimeouts(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
    public static void waitForVisibilityOfElement(By by, int sec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void waitForElementToBeClickable(By by, int sec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void waitForInVisibilityOfElement(By by, int sec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
    public static void selectElementByText(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void  selectElementByValue(By by,String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public static void selectElementByIndex(By by,int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    public static String currentTimeStamp(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);
    }
    public static void captureScreenshot(String fileName){

        //convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);

        //call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File destFile = new File("src\\test\\Screenshots\\"+fileName+""+currentTimeStamp()+".png");

        //copy file at destination
        try{
            FileUtils.copyFile(SrcFile,destFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
