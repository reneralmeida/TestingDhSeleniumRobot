import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class BasePage {

    public BasePage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void openApp() {
        driver.get(URL);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getWebElement(By locator) {
        WebElement element = driver.findElement(locator);
    }


}
