package JSExecuter_05012025;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class relative_locators2 {
    @Test
    public void testMethod01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        String URL = "https://www.aqi.in/real-time-most-polluted-city-ranking";
        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get(URL);
        driver.manage().window().maximize();

        List<WebElement> searchBox = driver.findElements(By.xpath("//input[@type=\"search\"]"));
        searchBox.get(1).sendKeys("india" + Keys.ENTER);

        List<WebElement> locations = driver.findElements(By.cssSelector("div.location-name>p"));
        for (WebElement e : locations) {
            System.out.println(e.getText());
        }

    }
}
