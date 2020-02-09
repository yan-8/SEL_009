package com.automationpractice.manager;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginHelper extends BaseHelper {
//    private WebDriverWait wait;
//    private Faker faker;

    public LoginHelper(WebDriver driver, WebDriverWait wait, Faker faker) {
        super(driver, wait, faker);
//        this.wait = wait;
//        this.faker = faker;
    }

    public void fillGeneratedEmailForCreateNewUser() {
        String email = faker.lorem().characters(10) + "@test.com";
        type(By.xpath("//*[@id = 'email_create']"), email);
    }

    public void clickOnCreateAnAccountButtonWithWait() {
        click(By.xpath("//*[@id = 'SubmitCreate']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id = 'account-creation_form']")));
    }
}