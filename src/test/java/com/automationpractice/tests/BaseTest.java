package com.automationpractice.tests;

import com.automationpractice.manager.ApplicationManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import sun.plugin2.util.BrowserType;
import java.net.MalformedURLException;

public class BaseTest {
//    protected final ApplicationManager app = new ApplicationManager(BrowserType.DEFAULT);
    protected static final ApplicationManager app = new ApplicationManager(BrowserType.DEFAULT);

//    @Before
    @BeforeClass
//    public void start() throws MalformedURLException {
    public static void start() throws MalformedURLException {
        app.initBrowser();
    }

//    @After
    @AfterClass
//    public void stop() {
    public static void stop() {
        app.tearDownBrowser();
    }
}