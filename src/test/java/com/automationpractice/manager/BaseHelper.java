package com.automationpractice.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseHelper {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseHelper(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
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

    protected void selectFromDropdownByValue(By locator, String text) {
        if (isElementPresent(locator)) {
            new Select(driver.findElement(locator)).selectByValue(text);
        }
    }

    protected boolean isElementPresent(By locator) {
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

    protected void clickAndWaitForElementVisible(By locatorForClick, By locatorForWait) {
        waitForElementVisible(locatorForClick);
        driver.findElement(locatorForClick).click();
        waitForElementVisible(locatorForWait);
    }

    private void waitForElementVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}