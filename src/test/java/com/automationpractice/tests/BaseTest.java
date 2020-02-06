package com.automationpractice.tests;

import com.automationpractice.manager.ApplicationManager;
import org.junit.After;
import org.junit.Before;
import sun.plugin2.util.BrowserType;

public class BaseTest {
    protected final ApplicationManager automationPracticeApp = new ApplicationManager(BrowserType.MOZILLA);

    @Before
    public void start() {
        automationPracticeApp.initBrowser();
    }

    @After
    public void stop() {
        automationPracticeApp.tearDownBrowser();
    }
}