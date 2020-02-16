package com.automationpractice.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInHelper extends BaseHelper {
    public SignInHelper(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void fillUserDataToSignUp(String firstName, String lastName, String password) {
        click(By.xpath("//*[@id = 'uniform-id_gender2']"));
        type(By.xpath("//*[@id = 'customer_firstname']"), firstName);
        type(By.xpath("//*[@id = 'customer_lastname']"), lastName);
        type(By.xpath("//*[@id = 'passwd']"), password);

        selectFromDropdownByValue(By.xpath("//select[@name = 'days']"), "1");
        selectFromDropdownByValue(By.xpath("//select[@name = 'months']"), "1");
        selectFromDropdownByValue(By.xpath("//select[@name = 'years']"), "1970");
    }

    public void loggingInAsUser(String login, String password) {
        type(By.xpath("//*[@id = 'email']"), login);
        type(By.xpath("//*[@id = 'passwd']"), password);
        clickAndWaitForElementVisible(By.xpath("//*[@id = 'SubmitLogin']"), By.xpath("//div[@id = 'center_column']//h1"));
    }

}