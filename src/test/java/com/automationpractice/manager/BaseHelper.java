package com.automationpractice.manager;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseHelper {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Faker faker;

    public BaseHelper(WebDriver driver, WebDriverWait wait, Faker faker) {
        this.driver = driver;
        this.wait = wait;
        this.faker = faker;
    }

    protected void type(By locator, String text) {
        if (text != null) {
            click(locator);
            String currentText = driver.findElement(locator).getAttribute("value");

            if (!text.equals(currentText)) {
                driver.findElement(locator).clear();
                driver.findElement(locator).sendKeys(text);
            }
        }
    }

    protected void selectFromDropdown(By locator, String text) {
        if (isElementPresent(locator)) {
            new Select(driver.findElement(locator)).selectByValue(text);
        }
    }

    private boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException nsee) {
            return false;
        }
    }

    protected void click(By locator) {
        waitForElementVisible(locator);
        driver.findElement(locator).click();
    }

    private void waitForElementVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}