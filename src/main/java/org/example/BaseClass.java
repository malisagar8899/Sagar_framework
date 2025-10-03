package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.DriverManager.getDriver;

public class BaseClass {

    public void OpenUrl(){
        getDriver().get(utils.readKey("url"));
    }
    public void clickElement(WebElement by) {
        by.click();

    }
    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }
    public void enterInput(By by, String key) {
        getDriver().findElement(by).sendKeys(key);
    }

    public void enterInput(WebElement by, String key) {

        by.sendKeys(key);
    }

    public String getText(WebElement by){

        return by.getText();
    }




}
