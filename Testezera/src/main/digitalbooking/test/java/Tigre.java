import Base.BasePage;
import Pages.SearchPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class Tigre {

    public static WebDriver driver;

    @BeforeAll
    static void setUp() {
        BasePage basePage = new BasePage();
        basePage.openApp();
        driver = basePage.getDriver();
    }

    @Test
    public void testSearch() throws InterruptedException {

        SearchPage page = new SearchPage();
        page.buscarCidade("Tigre");
        page.buscar();
        Thread.sleep(5000);
        String resultadoBusca = page.getResultado();

        assertTrue(resultadoBusca.contains("La Carmelita"));

        System.out.println("Resultado" + resultadoBusca);
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}
