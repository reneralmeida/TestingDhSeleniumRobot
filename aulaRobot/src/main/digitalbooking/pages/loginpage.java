import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class loginpage {

    public class loginpage extends BasePage {
        protected static final String txtIniciarSessao = "Iniciar sesión";
        protected static final String email = "email"; //id
        protected static final String senha = "password";//id
        protected static final String botaoLogin = "btn btn-primario btn-sm"; //class

    }

    public void iniciarSessao() {
        WebElement botaoIniciarSessao = getWebElement(By.partialLinkText(txtIniciarSessao));
        botaoIniciarSessao.click();
        Thread.sleep(1000);
    }

    public void inserirDados() {
        WebElement user = getWebElement(By.id(email));
        user.clear();
        user.sendKeys(email);

        WebElement password = getWebElement(By.id(senha));
        password.clear();
        password.sendKeys(senha);
    }

    public void logar() {
        WebElement login = getWebElement(By.className(botaoLogin));
        login.click();
    }

}

}