package com.automationpractice.manager;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpHelper {
    private WebDriver driver;
    private WebDriverWait wait;
    private Faker faker;

    public SignUpHelper(WebDriver driver, WebDriverWait wait, Faker faker) {
        this.driver = driver;
        this.wait = wait;
        this.faker = faker;
    }

    public void fillUserDataToSignUp() {
        System.out.println("FFFFF");
    }
}