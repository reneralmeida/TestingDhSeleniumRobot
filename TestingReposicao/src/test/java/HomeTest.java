import Pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Base.BasePage.driver;

public class HomeTest {

    private static HomePage page;

        @BeforeEach
    public void setUp() {
        page = new HomePage();
        page.openApp();
    }

    @Test
    public void testHome() throws InterruptedException {
        page.AdicionarProduto();
        Thread.sleep(1000);
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));

        page.acessarCarrinho();;
    }

    @AfterEach
    public void tearDown() {
        page.quitDriver();
    }
}
