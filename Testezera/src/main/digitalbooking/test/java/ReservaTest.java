import Base.BasePage;
import Pages.LoginPage;
import Pages.SearchPage;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class ReservaTest {

    private static WebDriver driver;

    @BeforeEach
    public void setUp() {
        BasePage basePage = new BasePage();
        basePage.openApp();
        driver = basePage.getDriver();
    }

    @Test
    public void testSearch() throws InterruptedException {

        LoginPage login = new LoginPage();
        login.irParaIniciarSessao();
        Thread.sleep(2000);
        login.inserirDadosLogin("tgomes@digitalhouse.com","turma01");
        Thread.sleep(2000);
        login.fazerLogin();
        Thread.sleep(2000);

        SearchPage search = new SearchPage();
        search.buscarCidade("Tigre");
        Thread.sleep(2000);
        search.buscar();
        Thread.sleep(2000);
        search.verDetalhe();
        Thread.sleep(2000);
        search.iniciarReserva();
        Thread.sleep(2000);
        search.preencherCidade("Buenos Aires");
        Thread.sleep(2000);
        search.confirmaReserva();
        Thread.sleep(2000);
        String mensagemErro = search.getMensagemErro();

        assertTrue(mensagemErro.contains("Falta completar campos obligatorios"));

        System.out.println("Resultado:" + mensagemErro);
    }

    @Test
    public void textSearch2() throws InterruptedException {

        SearchPage search = new SearchPage();
        search.inserirData("20/04/2023 - 22/04/2023");
        search.buscar();
        Thread.sleep(2000);
        String hermosa = search.getResultado();
        assertTrue(hermosa.contains("Hermosa"));
        assertTrue(hermosa.contains("Exclusivo"));
        assertTrue(hermosa.contains("Kantounes"));
        assertTrue(hermosa.contains("La Soñada"));
        System.out.println("Resultado: " + hermosa);

    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}
