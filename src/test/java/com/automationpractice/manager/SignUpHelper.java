package com.automationpractice.manager;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpHelper extends BaseHelper {
//    private WebDriverWait wait;
//    private Faker faker;

    public SignUpHelper(WebDriver driver, WebDriverWait wait, Faker faker) {
        super(driver, wait, faker);
//        this.wait = wait;
//        this.faker = faker;
    }

    public void fillUserDataToSignUp() {
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String password = faker.lorem().characters(8, true);

        click(By.xpath("//*[@id = 'uniform-id_gender2']"));
        type(By.xpath("//*[@id = 'customer_firstname']"), firstName);
        type(By.xpath("//*[@id = 'customer_lastname']"), lastName);
        type(By.xpath("//*[@id = 'passwd']"), password);

        selectFromDropdownByValue(By.xpath("//select[@name = 'days']"), "1");
        selectFromDropdownByValue(By.xpath("//select[@name = 'months']"), "1");
        selectFromDropdownByValue(By.xpath("//select[@name = 'years']"), "1970");

    }
}