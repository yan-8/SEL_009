package com.automationpractice.tests;

import org.junit.Assert;
import org.junit.Test;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

public class Tests extends BaseTest {
    @Test
    public void registrationNewUser() {
        Faker faker = new Faker();
        final String firstName = faker.name().firstName();
        final String lastName = faker.name().lastName();
        final String password = faker.lorem().characters(8, true);
        final String email = faker.lorem().characters(10);

        app.getHeaderHelper().goToSignInPage();
        app.getLoginHelper().fillGeneratedEmailForCreateNewUser(email);
        app.getLoginHelper().clickOnCreateAnAccountButtonWithWait();
        app.getSignInHelper().fillUserDataToSignUp(firstName, lastName, password);
    }

    @Test
    public void loggingInAndOutOfExistingUser() {
        final String login = "bglwuaf@mailboxt.net";
        final String password = "11111";

        app.getHeaderHelper().goToSignInPage();
        app.getSignInHelper().loggingInAsUser(login, password);
        Assert.assertEquals("SHOULD BE EXPECTED TEXT", "MY ACCOUNT", app.getMyAccountHelper().getTextOfElementOnPage(By.xpath("//div[@id = 'center_column']//h1")));

        app.getMyAccountHelper().loggingOutOfUser();
        Assert.assertEquals("SHOULD BE EXPECTED TEXT", "AUTHENTICATION", app.getLoginHelper().getTextOfElementOnPage(By.xpath("//div[@id = 'center_column']//h1")));
    }

    @Test
    public void amountOfButtonsOnContactUsPage() {
        app.getHeaderHelper().goToContactUsPage();
        Assert.assertEquals("SHOULD BE 1 BUTTON ON FORM", 1, app.getContactUsHelper().getAmountOfButtonsOnForm());
    }
}