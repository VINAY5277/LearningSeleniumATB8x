package ex_09_ActionClass;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class selenium33_RL {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }

    @Description("verify RL")
    @Test
    public void test_actions() throws InterruptedException {
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        List<WebElement> locations = driver.findElements(By.xpath("//div[@id=name]"));
        for (WebElement e : locations) {
            System.out.println(e.getText());
            String rank = driver.findElement(with(By.tagName("p")).toLeftof(e)).getText();
            String aqi = driver.findElement(with(By.tagName("span")).toRightof(e)).getText();


        }
    }
}
