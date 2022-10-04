import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumWebDriver {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.mercadolivre.com.br");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement campoBusca = driver.findElement(By.xpath("//*[@id=\"cb1-edit\"]"));

        campoBusca.sendKeys("iPhone 13");
        driver.manage().window().maximize();

        WebElement lupa = driver.findElement(By.cssSelector("body > header > div > form > button > div"));
        lupa.click();

        WebElement firstResult = driver.findElement(By.cssSelector("#root-app > div > div.ui-search-main.ui-search-main--only-products.ui-search-main--with-topkeywords > section > ol > li:nth-child(1) > div > div > div.ui-search-result__content-wrapper > div.ui-search-item__group.ui-search-item__group--title > a > h2"));
        firstResult.click();

        WebElement secondResult = driver.findElement(By.cssSelector("#ui-pdp-main-container > div.ui-pdp-container__col.col-3.ui-pdp-container--column-center.pb-40 > div > div.ui-pdp-container__row.ui-pdp-with--separator--fluid.ui-pdp-with--separator--40 > div.ui-pdp-container__col.col-2.mr-32 > div.ui-pdp-variations > div:nth-child(1) > div > a:nth-child(3) > div > p"));
        secondResult.click();

        WebElement color = driver.findElement(By.cssSelector("#ui-pdp-main-container > div.ui-pdp-container__col.col-3.ui-pdp-container--column-center.pb-40 > div > div.ui-pdp-container__row.ui-pdp-with--separator--fluid.ui-pdp-with--separator--40 > div.ui-pdp-container__col.col-2.mr-32 > div.ui-pdp-variations > div:nth-child(2) > div > a:nth-child(4) > div > img"));
        color.click();

        WebElement sendToChart = driver.findElement(By.xpath("//*[@id=\"buybox-form\"]/div[6]/div/button[2]"));
        sendToChart.click();

    }
}
