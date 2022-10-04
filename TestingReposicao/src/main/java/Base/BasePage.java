package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.sql.DriverManager.getDriver;

public class BasePage {

    public static WebDriver driver;
    protected static final String URL = "https://www.saucedemo.com/";

    public BasePage() {
        this.driver = new FirefoxDriver();
    }

    public void openApp() {
        getDriver().get(URL);
        getDriver().manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getWebElement(By locator) {
        WebElement elemento = null;
        try {
            elemento = driver.findElement(locator);
        } catch (Exception e) {
            System.out.println("Elemento não encontrado");
            System.out.println("Mensagem de erro" + e);
        }
        return elemento;
    }

    public void quitDriver() {
        getDriver().quit();
    }
}
