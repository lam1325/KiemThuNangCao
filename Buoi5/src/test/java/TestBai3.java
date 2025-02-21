import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestBai3 {
    ChromeDriver chromeDriver;
    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }
//    @AfterEach
//    public void tearDown(){
//        if (chromeDriver != null){
//            chromeDriver.quit();
//        }
//    }
    @Test
    public void test(){
        chromeDriver.get("https://vitimex.com.vn/");

        WebElement cuahang = chromeDriver.findElement(By.xpath("//a[@id='menu_item_36']"));
        cuahang.click();

        WebElement tinh = chromeDriver.findElement(By.xpath("//option[@value='1']"));
        tinh.click();

        WebElement timkiem = chromeDriver.findElement(By.xpath("//input[@id='search-showroom']"));
        timkiem.sendKeys("Vitimex BigC Thăng Long - Hà Nội");

    }

    @Test
    public void test2(){
        chromeDriver.get("https://vitimex.com.vn/");

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
        WebElement aolen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='item']//img[@title='Áo Len']")));
        aolen.click();

        WebElement ao = chromeDriver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[3]/a[2]/div[1]/img[2]"));
        ao.click();

        WebElement size = chromeDriver.findElement(By.xpath("//a[@id='size1']"));
        size.click();

        WebElement sl = chromeDriver.findElement(By.xpath("//button[@id='increment']//*[name()='svg']"));
        sl.click();

        WebElement giohang = chromeDriver.findElement(By.xpath("//span[@class='change-mess']"));
        giohang.click();
    }
}
