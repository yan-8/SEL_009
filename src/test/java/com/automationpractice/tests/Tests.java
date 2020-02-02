package com.automationpractice.tests;

import org.junit.Test;

public class Tests extends BaseTest {
    @Test
    public void registrationOfNewUser() {
        automationPracticeApp.goToLoginPage();
        automationPracticeApp.getLoginHelper().fillGeneratedEmailForCreateNewUser();
        automationPracticeApp.getLoginHelper().clickOnCreateAnAccountButtonWithWait();
        automationPracticeApp.getSignUpHelper().fillUserDataToSignUp();
    }
}