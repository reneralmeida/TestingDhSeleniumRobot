import Base.BasePage;
import Pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

    private static LoginPage page;

    @BeforeEach
    public void setUp() {

        page = new LoginPage();
        page.openApp();
    }

    @Test
    public void testeLogin() throws InterruptedException {

        page.inserirDadosLogin("standard_user", "secret_sauce");
        page.fazerLogin();
        String products = page.getHeader();
        assertTrue(products.contains("PRODUCTS"));
    }

    @AfterEach
    public void tearDown() {
        page.quitDriver();
    }
}
