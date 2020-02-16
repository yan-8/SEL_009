package com.automationpractice.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsHelper extends BaseHelper {
    public ContactUsHelper(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public int getAmountOfButtonsOnForm() {
        return driver.findElements(By.xpath("//div[@class = 'submit']//button")).size();
    }
}