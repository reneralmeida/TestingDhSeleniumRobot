package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private static final String btnAddToCart = "add-to-cart-sauce-labs-backpack"; //id
    private static final String btnCart = "shopping_cart_link"; //class

    public void AdicionarProduto() {
        WebElement botaoAdd = getWebElement(By.id(btnAddToCart));
        botaoAdd.click();
    }

    public void acessarCarrinho() {
        WebElement botaoCart = getWebElement(By.id(btnCart));
        botaoCart.click();
    }
}
