package com.automationpractice.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseHelper {
    protected WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    protected void type(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    protected void selectFromDropdown(By locator, String text) {
//        Select select = new Select(locator);
//        driver.findElements(By.xpath(locator));
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }
}