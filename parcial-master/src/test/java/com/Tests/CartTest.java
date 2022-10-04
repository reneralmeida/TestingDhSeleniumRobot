package com.Tests;

import com.Base.BasePage;
import com.Pages.CartPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CartTest {

    private static WebDriver driver;

    @BeforeAll
    static void setUp() {
        BasePage basePage = new BasePage();
        basePage.openApp();
        driver = basePage.getDriver();
    }

    @Test
    public void cartTest() throws InterruptedException {

        CartPage page = new CartPage();
        page.cartDrill("Iphone");
        Thread.sleep(300);

        System.out.println("Carrinho testado com sucesso.");

    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}
