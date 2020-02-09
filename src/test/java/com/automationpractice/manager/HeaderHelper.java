package com.automationpractice.manager;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderHelper extends BaseHelper {
    public HeaderHelper(WebDriver driver, WebDriverWait wait, Faker faker) {
        super(driver, wait, faker);
    }

    public void goToSignInPage() {
        if (isElementPresent(By.xpath("//div[@id = 'center_column']//h1")) && driver.findElement(By.xpath("//div[@id = 'center_column']//h1")).getText().equals("AUTHENTICATION")) {
            return;
        }
        driver.findElement(By.xpath("//*[@class = 'login']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id = 'center_column']")));
    }
}