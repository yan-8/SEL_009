package com.automationpractice.tests;

import com.automationpractice.manager.ApplicationManager;
import org.junit.After;
import org.junit.Before;
import sun.plugin2.util.BrowserType;
import java.net.MalformedURLException;

public class BaseTest {
    protected final ApplicationManager automationPractice = new ApplicationManager(BrowserType.DEFAULT);

    @Before
    public void start() throws MalformedURLException {
        automationPractice.initBrowser();
    }

    @After
    public void stop() {
        automationPractice.tearDownBrowser();
    }
}