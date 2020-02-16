package com.automationpractice.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderHelper extends BaseHelper {
    public HeaderHelper(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void goToSignInPage() {
        if (isElementPresent(By.xpath("//div[@id = 'center_column']//h1")) && driver.findElement(By.xpath("//div[@id = 'center_column']//h1")).getText().equals("AUTHENTICATION")) {
            return;
        }

        driver.findElement(By.xpath("//a[@class = 'login']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id = 'center_column']//h1[contains(text(), 'Authentication')]")));
    }

    public void goToContactUsPage() {
        if (isElementPresent(By.xpath("//div[@id = 'center_column']//h1")) && driver.findElement(By.xpath("//div[@id = 'center_column']//h1")).getText().equals("CUSTOMER SERVICE - CONTACT US")) {
            return;
        }

        driver.findElement(By.xpath("//div[@id = 'contact-link']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id = 'center_column']//h1[contains(text(), 'Customer service - Contact us')]")));
    }
}