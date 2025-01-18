package ex_05_03012025;

import org.assertj.core.error.ShouldBeEqualIgnoringSeconds;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class Selenium22 {

    private long Seconds;

    @Test
    public void testMethod01() throws Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--Start--maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        //condition
       // WebDriver wait wait = new WebDriver wait(Driver, Duration.of(Seconds(5));
      //  wait.get(ExpectedConditions.visibilityOfElementLocated(By.xpath("span[@data-cy='close model']")));

            }
}