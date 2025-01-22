package JSExecuter_05012025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class selenium30 {
    @Test
    public void testMethod01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        String URL = "https://selectorshub.com/xpath-practice-page/";
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get(URL);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='username']"));
        js.executeScript("argument.scrollIntoView(true);", div_to_scroll);
        System.out.println(true);


        Thread.sleep(3000);
        driver.quit();
    }
}