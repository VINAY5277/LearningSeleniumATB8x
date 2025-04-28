package ex_05_03012024;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.sql.Driver;

public class tiso {
        @Description("verify actions")
        @Test
        public void test_actions() throws InterruptedException {
            WebDriver driver = new EdgeDriver();
            driver.manage().window().maximize();
            String URL = ("https://pwiddy.interview.tisostudio.com");
            driver.get(URL);
            driver.manage().window().maximize();

            WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for restaurants...']"));
            search.sendKeys("West, Mayer and Wintheiser");
            WebElement searchButton= driver.findElement(By.xpath("//button[@type='submit']"));
            searchButton.click();
            Thread.sleep(2000);
            WebElement searchResult = driver.findElement(By.xpath("//span[contains(text(),'Japanese')]"));
            searchResult.click();
            Thread.sleep(2000);
            WebElement cartItem1;
            cartItem1 = driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')][1]"));
            cartItem1.click();
            Thread.sleep(2000);
            WebElement cart = driver.findElement(By.xpath("//a[@href='/cart']"));
            cart.click();
            Thread.sleep(2000);
            WebElement checkout = driver.findElement(By.xpath("//button[contains(text(),'Proceed to Checkout')]"));
            checkout.click();
            Thread.sleep(2000);
            WebElement placeOrder = driver.findElement(By.xpath("//button[text()='Place Order']"));
            placeOrder.click();
            Thread.sleep(2000);
            String actualConfirmationMsg = driver.getTitle();
            System.out.println(actualConfirmationMsg);
            driver.quit();

        }

    }