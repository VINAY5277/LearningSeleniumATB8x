package com.thetestingacademy.ex_01_18122024;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium01 {
    @Test
    public void test_selenium(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.VWO.com");
    }
}
