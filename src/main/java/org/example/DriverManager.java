package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    public static WebDriver driver;

    public static WebDriver getDriver() {

        return driver;
    }

    public static void setDriver(WebDriver driver) {

        DriverManager.driver = driver;
    }

    public static void init() {
        String browser = utils.readKey("browser");
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                driver = new ChromeDriver(chromeOptions);
                break;

        }
        if (getDriver() != null) {
            driver.quit();
            driver = null;
        }

    }



}
