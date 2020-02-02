package com.automationpractice.tests;

import com.automationpractice.manager.ApplicationManager;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    protected final ApplicationManager automationPracticeApp = new ApplicationManager();

    @Before
    public void start() {
        automationPracticeApp.initBrowser();
    }

    @After
    public void stop() {
        automationPracticeApp.tearDownBrowser();
    }
}