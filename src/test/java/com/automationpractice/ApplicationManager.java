package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    private WebDriver driver;

    protected void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/mac/chrome/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
    }

    protected void stop() {
        driver.quit();
    }
}