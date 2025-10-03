package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    private static WebDriver driver;

    public static void init() {
        String browser = utils.readKey("browser");

        switch (browser) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                driver = new ChromeDriver(options);
                break;
            // Add other browsers if needed
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("WebDriver not initialized. Call DriverManager.init() first.");
        }
        return driver;
    }

    public static void down() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
