package org.Selenium.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class WebdriverManager {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    public static WebDriver setupDriver(String browser, WebDriver driver) {

        if (browser.equalsIgnoreCase("chrome")) {
//             driver = new ChromeDriver();
//             driver.get("https://www.google.com/");
WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
        }
        return driver;
    }
}
