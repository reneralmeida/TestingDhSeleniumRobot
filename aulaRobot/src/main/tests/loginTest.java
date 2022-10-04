import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class loginTest {

    private static WebDriver driver;

    @BeforeAll
    static void setUp() {
        BasePage _basePage = new BasePage();
        _basePage.openApp();
        driver + _basePage.getDriver();
    }

    @Test
    public void testLogin
}