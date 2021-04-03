package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultPage {
    By resultList = By.className("p-card-wrppr");

    WebDriver driver;
    public  ResultPage (WebDriver driver){
        this.driver = driver;
    }
    public ProductDetailPage clickFirstItem(){
        List<WebElement> productList = driver.findElements(resultList);
        productList.get(0).click();

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        return new ProductDetailPage(driver);
    }

}
