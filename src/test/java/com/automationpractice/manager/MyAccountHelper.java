package com.automationpractice.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class MyAccountHelper extends BaseHelper {
    public MyAccountHelper(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void loggingOutOfUser() {
        clickAndWaitForElementVisible(By.xpath("//*[@class = 'logout']"), By.xpath("//*[@id = 'slider_row']"));
        waitForElementVisible(By.xpath("//div[@id = 'center_column']//h1"));
    }
}