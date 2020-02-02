package com.automationpractice.tests;

import org.junit.Test;

public class Tests extends BaseTest {
    @Test
    public void registrationOfNewUser() throws InterruptedException {
        automationPracticeApp.goToLoginPage();
        automationPracticeApp.getLoginHelper().fillGeneratedEmailForCreateNewUser();
        automationPracticeApp.getLoginHelper().clickOnCreateAnAccountButton();
        automationPracticeApp.getSignUpHelper().fillUserDataToSignUp();
    }
}