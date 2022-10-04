package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class AccountPage extends BasePage {

    protected static final String newAccount = "/html/body/div[1]/div[3]/div[1]/ul/li[1]/a"; //XPATH
    protected static final String checkBox = "//*[@id=\"type\"]"; //xpath
    protected static final String confirmNewAccount = "/html/body/div[1]/div[3]/div[2]/div/div/form/div/input"; //xpath
    protected static final String confirmMessage = "/html/body/div[1]/div[3]/div[2]/div/div/p[1]"; //XPATH
    protected static final String nickField = "/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input"; //XPATH
    protected static final String passField = "/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input"; //XPATH
    protected static final String userName = "joelmir4Silva";
    protected static final String passWord = "joe2";
    protected static final String logginIn = "/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input"; //XPATH

    protected static final String accountOverview = "/html/body/div[1]/div[3]/div[1]/ul/li[2]/a"; //XPATH
    protected static final String overviewText = "/html/body/div[1]/div[3]/div[2]/div/div/table/tfoot/tr/td"; //XPATH
    protected static final String accountSelect = "/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[1]/a"; //XPATH
    protected static final String accountText = "/html/body/div[1]/div[3]/div[2]/div/div[1]/h1"; //XPATH
    protected static final String firstDropDown = "//*[@id=\"month\"]"; //XPATH
    protected static final String secondDropDown = "//*[@id=\"transactionType\"]"; //XPATH
    protected static final String clickGo = "/html/body/div[1]/div[3]/div[2]/div/div[2]/form/table/tbody/tr[3]/td[2]/input"; //XPATH

    public void openingAccount() throws InterruptedException {
        WebElement insertUser = getWebElement(By.xpath(nickField));
        insertUser.click();
        insertUser.sendKeys(userName);
        WebElement insertPass = getWebElement(By.xpath(passField));
        insertPass.click();
        insertPass.sendKeys(passWord);
        WebElement entering = getWebElement(By.xpath(logginIn));
        entering.click();
        Thread.sleep(500);
        WebElement accountOpening = getWebElement(By.xpath(newAccount));
        accountOpening.click();
        Select savings = new Select(driver.findElement(By.xpath(checkBox)));
        savings.selectByVisibleText("SAVINGS");
        Thread.sleep(300);
        WebElement accountConfirm = getWebElement(By.xpath(confirmNewAccount));
        accountConfirm.click();
        Thread.sleep(1000);
        WebElement confirmingMessage = getWebElement(By.xpath(confirmMessage));
        confirmingMessage.getText().contains("Congratulations, your account is now open.");
    }

    public void accountStatus() throws InterruptedException{
        WebElement overview = getWebElement(By.xpath(accountOverview));
        overview.click();
        Thread.sleep(300);
        WebElement confirmingText = getWebElement(By.xpath(overviewText));
        confirmingText.getText().contains("*Balance includes deposits that may be subject to holds");
        Thread.sleep(1000);
    }

    public void accountActivity()throws InterruptedException {
        WebElement inserindoUsuario = getWebElement(By.xpath(nickField));
        inserindoUsuario.click();
        inserindoUsuario.sendKeys(userName);
        WebElement insertSenha = getWebElement(By.xpath(passField));
        insertSenha.click();
        insertSenha.sendKeys(passWord);
        WebElement entering = getWebElement(By.xpath(logginIn));
        entering.click();
        Thread.sleep(500);
        WebElement visaoGeral = getWebElement(By.xpath(accountOverview));
        visaoGeral.click();
        Thread.sleep(300);
        WebElement confirmaçãoTexto = getWebElement(By.xpath(overviewText));
        confirmaçãoTexto.getText().contains("*Balance includes deposits that may be subject to holds");
        Thread.sleep(1000);
        WebElement clickandoConta = getWebElement(By.xpath(accountSelect));
        clickandoConta.click();
        WebElement textoConta = getWebElement(By.xpath(accountText));
        textoConta.getText().contains("Account Details");
        WebElement dropdown = getWebElement(By.xpath(firstDropDown));
        dropdown.click();
        Thread.sleep(1000);
        Select clicking = new Select(driver.findElement(By.xpath(firstDropDown)));
        clicking.selectByVisibleText("All");
        Thread.sleep(500);
        WebElement dropdown2 = getWebElement(By.xpath(secondDropDown));
        dropdown2.click();
        Thread.sleep(1000);
        Select clicking2 = new Select(driver.findElement(By.xpath(secondDropDown)));
        clicking2.selectByVisibleText("All");
        Thread.sleep(500);
        WebElement finalStep = getWebElement(By.xpath(clickGo));
        finalStep.click();
        Thread.sleep(300);
    }
}