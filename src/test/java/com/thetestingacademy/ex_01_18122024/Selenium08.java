package com.thetestingacademy.ex_01_18122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium08 {
    @Test
    public void testMethod(){
        EdgeOptions edgeOptions = new EdgeOptions();
       // edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--window-size=800,600");
        edgeOptions.addArguments("--incognito");
      //  edgeOptions.addArguments("--headless");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://google.com");
        System.out.println(driver.getTitle());

    }

}
