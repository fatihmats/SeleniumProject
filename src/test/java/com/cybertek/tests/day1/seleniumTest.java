package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //setup webdriver manager
        WebDriverManager.chromedriver().setup();
        //create setup
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().fullscreen();

        System.out.println("Current title of page = " + driver.getTitle());
        System.out.println("Current url = " + driver.getCurrentUrl());
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        driver.navigate().to("https://www.tesla.com");
        Thread.sleep(1000);
        driver.get("https://www.mynet.com");
        Thread.sleep(1000);
        System.out.println("Current title of page = " + driver.getTitle());



    }
}
