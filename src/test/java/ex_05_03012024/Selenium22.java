package ex_05_03012024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

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