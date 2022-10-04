package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    protected static final String inputUsername = "user-name"; //id
    protected static final String inputPassword = "password"; //id
    protected static final String btnLogin = "login-button"; //id

    protected static final String txtHeader = "/html/body/div/div/div/div[1]/div[2]/span"; //xpath

    public void inserirDadosLogin(String email, String senha) {
        WebElement campoUsername = getWebElement(By.id(inputUsername));
        campoUsername.clear();
        campoUsername.sendKeys(email);
        WebElement campoSenha = getWebElement(By.id(inputPassword));
        campoSenha.clear();
        campoSenha.sendKeys(senha);
    }

    public void fazerLogin() {
        WebElement botaoLogin = getWebElement(By.id(btnLogin));
        botaoLogin.click();
    }

    public String getHeader() {
        WebElement getHeader = getWebElement(By.xpath(txtHeader));
        return getHeader.getText();
    }
}
