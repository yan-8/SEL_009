package com.automationpractice.manager;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginHelper extends BaseHelper {
//    private WebDriverWait wait;
//    private Faker faker;

    public LoginHelper(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
//        this.wait = wait;
//        this.faker = faker;
    }

    public void fillGeneratedEmailForCreateNewUser(String email) {
        email = email + "@test.com";
        type(By.xpath("//*[@id = 'email_create']"), email);
    }

    public void clickOnCreateAnAccountButtonWithWait() {
        click(By.xpath("//*[@id = 'SubmitCreate']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id = 'center_column']//h1[contains(text(), 'Create an account')]")));
    }
}