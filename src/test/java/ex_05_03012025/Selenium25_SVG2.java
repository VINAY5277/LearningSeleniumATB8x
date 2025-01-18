package ex_05_03012025;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.List;

public class Selenium25_SVG2 {
    @Description("verify that the tripura is in india and click on it")
    @Test
    public void test_svg_india_search_click() {
        WebDriver driver = null;
        driver.manage().window().maximize();
        String URL = "https://www.amcharts.com/svg-maps/?map=india";
        driver.get(URL);
        driver.manage().window().maximize();

        List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg']/*local-name()='g'][7]/*[local-name()='g']/*[local-name()='g']/*[local-name()='path']"));
        for(WebElement state:states){
            System.out.println(state.getAttribute("aria=label"));
        }

    }
}