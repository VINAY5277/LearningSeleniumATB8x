package com.thetestingacademy.ex_01_18122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium05 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
    }
}
