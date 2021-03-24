package com.trendyol;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class uitest {

        WebDriver webDriver;
        Actions driver;
        @Test
        public void checkFavBox() throws InterruptedException {
            ChromeOptions options = new ChromeOptions();
         //   Actions builder = new Actions ((WebDriver) driver);
            options.addArguments("--disable-notifications");
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
            webDriver = new ChromeDriver(options);
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            webDriver.get("https://www.trendyol.com");

            webDriver.findElement(By.className("fancybox-close")).click();

            webDriver.findElement(By.className("i-user-orange")).click();

            webDriver.findElement(By.xpath("//span[text()='Üye Ol']")).click();

            webDriver.findElement(By.id("register-email")).sendKeys("zwf83237@eoopy.com");
            webDriver.findElement(By.id("register-password-input")).sendKeys("12345qwert" + Keys.ENTER);

            webDriver.findElement(By.className("modal-close")).click();


            webDriver.findElement(By.xpath("//*[text()='ELEKTRONİK']")).click();
            webDriver.findElement(By.xpath("//div[@data-index='9']")).click();

            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0,5000)");




        }

}
