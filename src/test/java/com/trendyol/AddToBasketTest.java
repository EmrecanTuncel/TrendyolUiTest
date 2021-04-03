package com.trendyol;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductDetailPage;
import pages.ResultPage;

public class AddToBasketTest extends BaseTest {

    @Test
    public void test(){
        HomePage homePage = new HomePage(driver);
        homePage.fancyBox();
        ResultPage resultPage = homePage.searchItem();
        ProductDetailPage productDetailPage = resultPage.clickFirstItem();
        productDetailPage.setAddToBasket();
        productDetailPage.hoverBasket();
        productDetailPage.checkAddedBasket();


    }
}

