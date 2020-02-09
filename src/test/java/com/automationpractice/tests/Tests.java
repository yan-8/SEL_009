package com.automationpractice.tests;

import org.junit.Test;

public class Tests extends BaseTest {
    @Test
    public void registrationNewUser() {
        automationPracticeApp.getHeaderHelper().goToSignInPage();
        automationPracticeApp.getLoginHelper().fillGeneratedEmailForCreateNewUser();
        automationPracticeApp.getLoginHelper().clickOnCreateAnAccountButtonWithWait();
        automationPracticeApp.getSignUpHelper().fillUserDataToSignUp();
    }
}