package com.automationpractice.tests;

import org.junit.Test;

public class Tests extends BaseTest {
    @Test
    public void registrationNewUser() {
        app.getHeaderHelper().goToSignInPage();
        app.getLoginHelper().fillGeneratedEmailForCreateNewUser();
        app.getLoginHelper().clickOnCreateAnAccountButtonWithWait();
        app.getSignInHelper().fillUserDataToSignUp();



    }

    @Test
    public void loggingInAndOutOfExistingUser() {
        // bglwuaf@mailboxt.net 11111
        app.getHeaderHelper().goToSignInPage();
//        app.getSignInHelper().loggingInOfUser();
//        app.getMyAccountHelper().loggingOutOfUser();
    }
}