package com.automationpractice.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseHelper {
    protected WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
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
//        Select select = new Select(locator);
//        driver.findElements(By.xpath(locator));
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }


}