package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    protected static final String searchBox = "/html/body/header/div/div/div[2]/div/input"; //xpath

    protected static final String clickSearch = "/html/body/header/div/div/div[2]/div/span/button/i"; //xpath

    protected static final String add2Cart = "/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[2]/button[1]/i"; //xpath

    protected static final String cartMessage = "/html/body/div[2]/div[1]"; //xpath

    public void cartDrill(String iphone) throws InterruptedException{
        WebElement firstStep = getWebElement(By.xpath(searchBox));
        firstStep.click();
        firstStep.sendKeys(iphone);
        WebElement secondStep = getWebElement(By.xpath(clickSearch));
        secondStep.click();
        Thread.sleep(500);
        WebElement thirdStep = getWebElement(By.xpath(add2Cart));
        thirdStep.click();
        Thread.sleep(300);
        WebElement finalStep = getWebElement(By.xpath(cartMessage));
        finalStep.getText().contains("Success: You have added iPhone to your shopping cart!");
        Thread.sleep(1000);
    }


}
