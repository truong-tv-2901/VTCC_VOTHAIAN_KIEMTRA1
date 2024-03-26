package vn.viettelai.baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class baseTest {
    public WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void CreateDiver(){
//        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

    }
    @BeforeTest
    public void login(){
        //Đăng nhập vào trang chủ
        driver.get("https://cms.anhtester.com/login");
        driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("admin@example.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();

    }
//    @AfterTest
//    public void Sleep() throws InterruptedException {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @AfterClass
    public void CloseDrive(){

        driver.quit();
    }
}
