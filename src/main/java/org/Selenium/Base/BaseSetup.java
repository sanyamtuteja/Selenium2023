package org.Selenium.Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;


public class BaseSetup {

    public static WebDriver driver;
    private static final Logger LOG = LogManager.getLogger(BaseSetup.class.getName());


    @BeforeClass
    public void beforeClassMethod() {
//    Initializing the extent report here
        LOG.info("**********");
       driver =  WebdriverManager.setupDriver("Chrome", driver);

    }

    @BeforeMethod
    public void beforeMethodMethod() {
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
//        capture the report, screenshot if failed
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
