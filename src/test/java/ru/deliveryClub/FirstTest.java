package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    private ChromeDriver driver;

    @Before
    public void setUp() {
        System.out.println("start");
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://google.com.ua");

        String title = driver.getTitle();

        Assert.assertTrue("Failed title", title.equals("Google"));
        driver.quit();
    }

    @Test
    public void firstTest2() {
        driver.get("https://google.com.ua");

        String title = driver.getTitle();

        Assert.assertTrue("Failed title", title.equals("Google"));
        driver.quit();
    }

    @After
    public void down() {
        System.out.println("close");
    }
}
