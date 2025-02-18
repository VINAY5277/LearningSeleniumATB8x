package ex_09_ActionClass;

import jdk.jfr.Description;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selenium29_scrolling {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }

    @Description("verify actions")
    @Test
    public void test_actions() throws InterruptedException {
        String URL = "https://www.thetestingacademy.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        System.out.println("scroll down");
    }
    }
