package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ProductDetailPage {
    By addToBasketBtn = By.className("add-to-bs");
    By basketBtn = By.className("account-basket");
    By basketBtnAdded = By.className("slideUpBox");
    WebDriver driver;
    Actions actions;

    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    public void setAddToBasket() {
        driver.findElement(addToBasketBtn).click();
    }

    public void hoverBasket() {
        actions.moveToElement(driver.findElement(basketBtn)).build().perform();
    }

    public void checkAddedBasket() {
        Boolean RedmiAirdots = driver.findElement(basketBtnAdded).isDisplayed();
        Assert.assertEquals(RedmiAirdots, Boolean.TRUE);
        System.out.println("");
    }

}
