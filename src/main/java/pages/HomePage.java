package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    By closeFancyBox = By.className("fancybox-close");
    By searchBox = By.className("search-box");

    WebDriver driver;
    public  HomePage(WebDriver driver){ this.driver = driver; }
    public void fancyBox(){
        driver.findElement(closeFancyBox).click();
    }
    public ResultPage searchItem(){
        driver.findElement(searchBox).sendKeys("kulaklık", Keys.ENTER);
        return new ResultPage(driver);
    }
}
