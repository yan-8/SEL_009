package com.automationpractice;

import org.junit.After;
import org.junit.Before;

public class BaseTest {
    private final ApplicationManager applicationManager = new ApplicationManager();

    @Before
    public void start() {
        applicationManager.init();
    }

    @After
    public void end() {
        applicationManager.stop();
    }
}