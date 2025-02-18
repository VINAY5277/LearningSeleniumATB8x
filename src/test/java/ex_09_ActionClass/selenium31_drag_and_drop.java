package ex_09_ActionClass;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selenium31_drag_and_drop {

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
        String URL = "https://the-internet.herokuapp.com/drag_and_drop";
        driver.get(URL);
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        // source and destination
        // from and to

        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));

        actions.dragAndDrop(from,to).build().perform();
        driver.quit();
    }
}
