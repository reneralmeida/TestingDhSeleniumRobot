package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RegisteringPage extends BasePage {

    protected static final String registerButton = "/html/body/div[1]/div[3]/div[1]/div/p[2]/a"; //XPATH
    protected static final String firstName = "//*[@id=\"customer.firstName\"]"; //xpath
    protected static final String lastName = "//*[@id=\"customer.lastName\"]"; //xpath
    protected static final String address = "//*[@id=\"customer.address.street\"]"; //XPATH
    protected static final String city = "//*[@id=\"customer.address.city\"]"; //XPATH
    protected static final String state = "//*[@id=\"customer.address.state\"]"; //XPATH
    protected static final String zipCode = "//*[@id=\"customer.address.zipCode\"]"; //XPATH
    protected static final String phone = "//*[@id=\"customer.phoneNumber\"]"; //XPATH
    protected static final String ssn = "//*[@id=\"customer.ssn\"]"; //XPATH
    protected static final String userName = "//*[@id=\"customer.username\"]"; //XPATH
    protected static final String passWord = "//*[@id=\"customer.password\"]"; //XPATH
    protected static final String confirmPassword = "//*[@id=\"repeatedPassword\"]"; //XPATH
    protected static final String confirmSignUp = "/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input"; //XPATH
    protected static final String loginMessage = "/html/body/div[1]/div[3]/div[2]/p"; //XPATH

    public void registering(String nome, String sobrenome, String endereco, String cidade, String estado, String cep, String telefone,
                            String seguroSocial, String nick, String senha) throws InterruptedException {
        WebElement signinUp = getWebElement(By.xpath(registerButton));
        signinUp.click();
        Thread.sleep(300);
        WebElement firstStepForm = getWebElement(By.xpath(firstName));
        firstStepForm.click();
        firstStepForm.sendKeys(nome);
        WebElement secondStepForm = getWebElement(By.xpath(lastName));
        secondStepForm.click();
        secondStepForm.sendKeys(sobrenome);
        WebElement thirdStepForm = getWebElement(By.xpath(address));
        thirdStepForm.click();
        thirdStepForm.sendKeys(endereco);
        WebElement fourthStepForm = getWebElement(By.xpath(city));
        fourthStepForm.click();
        fourthStepForm.sendKeys(cidade);
        WebElement fithStepForm = getWebElement(By.xpath(state));
        fithStepForm.click();
        fithStepForm.sendKeys(estado);
        WebElement sixthStepForm = getWebElement(By.xpath(zipCode));
        sixthStepForm.click();
        sixthStepForm.sendKeys(cep);
        WebElement seventhStepForm = getWebElement(By.xpath(phone));
        seventhStepForm.click();
        seventhStepForm.sendKeys(telefone);
        WebElement eighthStepForm = getWebElement(By.xpath(ssn));
        eighthStepForm.click();
        eighthStepForm.sendKeys(seguroSocial);
        WebElement ninthStepForm = getWebElement(By.xpath(userName));
        ninthStepForm.click();
        ninthStepForm.sendKeys(nick);
        WebElement tenthStepForm = getWebElement(By.xpath(passWord));
        tenthStepForm.click();
        tenthStepForm.sendKeys(senha);
        WebElement eleventhStepForm = getWebElement(By.xpath(confirmPassword));
        eleventhStepForm.click();
        eleventhStepForm.sendKeys(senha);
        WebElement confirming = getWebElement(By.xpath(confirmSignUp));
        confirming.click();
        Thread.sleep(300);
        WebElement finalStep = getWebElement(By.xpath(loginMessage));
        finalStep.getText().contains("Your account was created successfully. You are now logged in.");
    }
}
