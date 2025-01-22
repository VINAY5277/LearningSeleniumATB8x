package JSExecuter_05012025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class selenium31_relative_locators {
    @Test
    public void testMethod01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        String URL = "https://awesomeqa.com/practice.html";
        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get(URL);
        driver.manage().window().maximize();

        //to right
        //to left
        //above of
        //below
        //near

        driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));
        By span_element = null;
        driver.findElement(with(By.id("exp-2")).toRightOf(span_element)).click();
    
    }
}

