package ex_04_30122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.beans.Expression;

public class Selenium21 {
    @Test
    public void testMethod01() throws Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--Start--maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

      // driver.manage().window().maximize();

        //<input _
        // ngcontent-brl-c4=""
        // autofocus=""
        // abc = xyz
        // class="id-form-ctrl ng-pristine ng-valid ng-touched"
        // id="username"
        // name="username"
        // type="email">

     //  WebElement username_input_id = driver.findElement(By.id("username"));
        // WebElement username_input_name = driver.findElement(By.name("username"));
       // WebElement username_input_class = driver.findElement(By.className("id-form-ctr"));
        WebElement username_input_xpath = driver.findElement(By.xpath("//input[@id = 'username'"));
      //  WebElement username_input_xpath = driver.findElement(By.xpath("//input[@abc = 'xyz'"));
        username_input_xpath.sendKeys("augtest_040823@idrive.com");

        

    }
}
