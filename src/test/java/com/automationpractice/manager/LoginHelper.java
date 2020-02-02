package com.automationpractice.manager;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginHelper {
    private WebDriver driver;
    private WebDriverWait wait;
    private Faker faker;

    public LoginHelper(WebDriver driver, WebDriverWait wait, Faker faker) {
        this.driver = driver;
        this.wait = wait;
        this.faker = faker;
    }

    public void fillGeneratedEmailForCreateNewUser() {
        String email = faker.lorem().characters(10) + "@test.com";
        driver.findElement(By.xpath("//*[@id = 'email_create']")).sendKeys(email);
    }

    public void clickOnCreateAnAccountButton() {
        driver.findElement(By.xpath("//*[@id = 'SubmitCreate']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id = 'account-creation_form']")));
    }
}