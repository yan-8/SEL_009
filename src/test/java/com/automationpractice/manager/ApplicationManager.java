package com.automationpractice.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.plugin2.util.BrowserType;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationManager {
    private WebDriver driver;
    private WebDriverWait wait;
    private LoginHelper loginHelper;
    private SignInHelper signInHelper;
    private HeaderHelper headerHelper;
    private int browser;

    public ApplicationManager(int browser) {
        this.browser = browser;
    }

    public LoginHelper getLoginHelper() {
        return loginHelper;
    }

    public SignInHelper getSignInHelper() {
        return signInHelper;
    }

    public HeaderHelper getHeaderHelper() {
        return headerHelper;
    }

    public void initBrowser() throws MalformedURLException {
        if (browser == BrowserType.DEFAULT) {

            // temp remote driver init
            URL remoteServerURL = new URL("http://192.168.55.102:4444/wd/hub");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");
            driver = new RemoteWebDriver(remoteServerURL, capabilities); // запуск с ChromeOptions
            // temp remote driver init

            // local chrome driver initial
//            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/mac/chrome/chromedriver");
//            driver = new ChromeDriver();
        } else if (browser == BrowserType.MOZILLA) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/mac/gecko/geckodriver");
            driver = new FirefoxDriver();
        } else if (browser == BrowserType.SAFARI_MACOSX) {
            driver = new SafariDriver();
        } else {
            System.out.println("NO BROWSER");
        }

        wait = new WebDriverWait(driver, 15); // явное
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com");

        loginHelper = new LoginHelper(driver, wait);
        signInHelper = new SignInHelper(driver, wait);
        headerHelper = new HeaderHelper(driver, wait);
    }

    public void tearDownBrowser() {
        driver.quit();
    }
}