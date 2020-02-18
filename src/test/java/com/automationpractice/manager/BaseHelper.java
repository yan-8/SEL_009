package com.automationpractice.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

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

    protected void waitForElementVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public String getTextOfElementOnPage(By element) {
        return driver.findElement(element).getText();
    }

    public List<String> getListOfElements() {
        List<String> words = new ArrayList<String>();
        List<WebElement> elements = driver.findElements(By.xpath("//ul[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li"));

        for (WebElement element : elements) {
//            String name = element.getText();
//            String myWords = name;
//            words.add(myWords);
            words.add(element.getText());
        }
        return words;
    }
}