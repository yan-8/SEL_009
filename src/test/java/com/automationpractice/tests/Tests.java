package com.automationpractice.tests;

import org.junit.Test;
import com.github.javafaker.Faker;

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
        // bglwuaf@mailboxt.net 11111
        app.getHeaderHelper().goToSignInPage();
//        app.getSignInHelper().loggingInOfUser();
//        app.getMyAccountHelper().loggingOutOfUser();
    }
}
// посмотрел - 39 Коллекции Наборы элементов