package com.automationpractice.tests;

import org.junit.Test;

public class Tests extends BaseTest {
    @Test
    public void registrationNewUser() {
        automationPractice.getHeaderHelper().goToSignInPage();
        automationPractice.getLoginHelper().fillGeneratedEmailForCreateNewUser();
        automationPractice.getLoginHelper().clickOnCreateAnAccountButtonWithWait();
        automationPractice.getSignUpHelper().fillUserDataToSignUp();
    }
}