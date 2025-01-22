package ex_05_03012024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class action_windows_iframe01 {
    @Description("verify actions")
    @Test
    public void test_actions() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        String URL = ("https://awesomeqa.com/practice.html");
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement firstname = driver.findElement(By.name("firstname"));
        //keyboard -> keydown -> shift -> send key -> key up

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(firstname,"the testing academy");
        actions.keyUp(Keys.SHIFT).build().perform();
        

        }

    }
