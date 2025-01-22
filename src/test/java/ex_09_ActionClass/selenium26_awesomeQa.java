package ex_09_ActionClass;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selenium26_awesomeQa {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }

        @Description("verify actions")
                @Test
        public void test_actions() throws InterruptedException{
        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();

            WebElement firstName = driver.findElement(By.name("firstname"));

            Actions actions = new Actions((driver));
            actions.keyDown(Keys.SHIFT).sendKeys(firstName,"the testing academy").keyUp(Keys.SHIFT);

    }

   @AfterTest
    public void closeBrowser(){}

}
