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

public class selenium32_JS {

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
        String URL = "https://selectorshub.com/xpath-practice-page/";
        driver.get(URL);
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        List<WebElement> div_to_scroll = driver.findElements(By.xpath("//div[@id=name]"));
        js.executeScript("div_to_scroll.scrollIntoView(true);", div_to_scroll);
    }
}