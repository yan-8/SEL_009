package com.automationpractice.manager;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationManager {
    private WebDriver driver;
    private WebDriverWait wait;
    private Faker faker;
    private LoginHelper loginHelper;
    private SignUpHelper signUpHelper;

    public LoginHelper getLoginHelper() {
        return loginHelper;
    }

    public SignUpHelper getSignUpHelper() {
        return signUpHelper;
    }

    public void initBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/mac/chrome/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15); // явное
        faker = new Faker();

        driver.get("http://automationpractice.com");

        loginHelper = new LoginHelper(driver, wait, faker);
        signUpHelper = new SignUpHelper(driver, wait, faker);
    }

    public void tearDownBrowser() {
        driver.quit();
    }

    public void goToLoginPage() {
        driver.findElement(By.xpath("//*[@class = 'login']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id = 'center_column']")));
    }
}