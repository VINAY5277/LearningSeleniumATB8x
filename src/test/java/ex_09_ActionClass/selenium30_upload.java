package ex_09_ActionClass;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selenium30_upload {
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
        String URL = "https://www.awesomeqa.com/upload.html";
        driver.get(URL);
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement uploadFileInput = driver.findElement(By.id("fileupload"));

        String working_dir = System.getProperty("user.dir");

        uploadFileInput.sendKeys(working_dir + "src/test/java/ex_09_ActionClass/Testdata.txt");
        System.out.println("working_dir");
        driver.findElement(By.name("submit")).click();
driver.quit();

    }
}
