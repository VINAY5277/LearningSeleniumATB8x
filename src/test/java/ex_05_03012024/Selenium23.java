package ex_05_03012024;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium23 {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.findElement(By.name("firstname")).sendKeys("the testing academy");

        //radio box
       driver.findElement(By.id("sex-1")).click();

        //check box
        driver.findElement(By.id("tool-1")).click();
    }
}
