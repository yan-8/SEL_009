package com.automationpractice;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/mac/chrome/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
    }

    @After
    public void end() {
        driver.quit();
    }
}