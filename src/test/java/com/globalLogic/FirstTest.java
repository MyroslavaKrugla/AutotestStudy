package com.globalLogic;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.globallogic.com/ua/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Розробка програмного забезпечення Компанія в Україні"));
        driver.quit();
    }
}
