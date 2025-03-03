package com.example.DeMau1Lan2.selenium_webDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverTest {

    private WebDriver webDriver;

    @BeforeEach
    void setup(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    void testSteps() throws InterruptedException {
        //open
        webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        //click menu
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();

        //login
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();

//        Thread.sleep(1000);
//        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).click();
//        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).click();
        // input value into form
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");
        //submit form
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();
        Thread.sleep(1000);

        //
        webDriver.findElement(By.xpath("/html/body/div[3]/div/div[1]/button")).click();
        Thread.sleep(1000);

        webDriver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[4]/select")).click();
        webDriver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[4]/select/option[3]")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[6]/button")).click();

        webDriver.quit();

    }
}
