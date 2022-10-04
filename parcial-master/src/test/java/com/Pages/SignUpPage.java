package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {

    protected static final String myAccount = "/html/body/nav/div/div[2]/ul/li[2]/a/i"; //xpath

    protected static final String btnRegister = "/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a"; //xpath

    protected static final String firstName = "//*[@id=\"input-firstname\"]"; //xpath

    protected static final String xlastName = "//*[@id=\"input-lastname\"]"; //xpath

    protected static final String myEmail = "//*[@id=\"input-email\"]"; //xpath

    protected static final String myTelephone = "//*[@id=\"input-telephone\"]"; //xpath

    protected static final String myPassword = "//*[@id=\"input-password\"]"; //xpath

    protected static final String confirmPassword = "//*[@id=\"input-confirm\"]"; //xpath

    protected static final String denyingNewsletter = "/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]"; //xpath

    protected static final String selectingCheckbox = "/html/body/div[2]/div/div/form/div/div/input[1]"; //xpath

    protected static final String clickContinue = "/html/body/div[2]/div/div/form/div/div/input[2]"; //xpath

    protected static final String assertSignUp = "/html/body/div[2]/div/div/p[1]"; //xpath

    public void signingUp(String name, String lastName, String email, String telephone, String password) throws InterruptedException {
        WebElement clickingMyAccount = getWebElement(By.xpath(myAccount));
        clickingMyAccount.click();
        Thread.sleep(300);
        WebElement clickingRegister = getWebElement(By.xpath(btnRegister));
        clickingRegister.click();
        Thread.sleep(300);
        WebElement insertFirstName = getWebElement(By.xpath(firstName));
        insertFirstName.click();
        insertFirstName.sendKeys(name);
        WebElement insertLastName = getWebElement(By.xpath(xlastName));
        insertLastName.click();
        insertLastName.sendKeys(lastName);
        WebElement insertEmail = getWebElement(By.xpath(myEmail));
        insertEmail.click();
        insertEmail.sendKeys(email);
        WebElement insertTelephone = getWebElement(By.xpath(myTelephone));
        insertTelephone.click();
        insertTelephone.sendKeys(telephone);
        WebElement insertPassword = getWebElement(By.xpath(myPassword));
        insertPassword.click();
        insertPassword.sendKeys(password);
        WebElement confirmingPassword = getWebElement(By.xpath(confirmPassword));
        confirmingPassword.click();
        confirmingPassword.sendKeys(password);
        WebElement newsletterStep = getWebElement(By.xpath(denyingNewsletter));
        newsletterStep.click();
        WebElement checkboxStep = getWebElement(By.xpath(selectingCheckbox));
        checkboxStep.click();
        WebElement continueStep = getWebElement(By.xpath(clickContinue));
        continueStep.click();
        Thread.sleep(300);
        WebElement lastStep = getWebElement(By.xpath(assertSignUp));
        lastStep.getText().contains("Congratulations! Your new account has been successfully created!");
        Thread.sleep(1000);
    }
}
