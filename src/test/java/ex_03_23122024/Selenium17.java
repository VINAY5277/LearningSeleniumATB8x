package ex_03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium17 {
    @Test
    public void testMethod01() throws Exception{
        //input type= "email"
        //class= "text input w(100%)"
        //name= "username"
        //id= "login-username"
        //data-qa="hocewqisi"

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

      //  Assert.assertEquals(driver.getTitle(),"vwo - Application");
       // Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        //1. find the email input box and enter the email
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        // <input type= "password"
        // class= "text-input W(100%)"
        // name= "password"
        //id= "login-password"
        //data-qa= "jobodapuxe">

        WebElement passwordInputBox = driver.findElement(By.id("login-password"));
        passwordInputBox.sendKeys("admin123");

        //btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        Thread.sleep(3000);

        //<div
        // class="notification-box-description"
        //id="js-notification-box-msg"
        //data-qa="rixawilomi"> // Custom Attribute(id, Class, nam
        //your email, password, IP address or location did not match
        //</div>

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(),"your email, password, IP address or location did not match");


        driver.quit();

    }
}