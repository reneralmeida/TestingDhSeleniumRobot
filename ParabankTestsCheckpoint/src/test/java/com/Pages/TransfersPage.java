package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TransfersPage extends BasePage {

    protected static final String transferFunds = "/html/body/div[1]/div[3]/div[1]/ul/li[3]/a"; //XPATH
    protected static final String transferText = "/html/body/div[1]/div[3]/div[2]/div/div/h1"; //xpath
    protected static final String insertAmmount = "//*[@id=\"amount\"]"; //xpath
    protected static final String toAccount = "//*[@id=\"toAccountId\"]"; //cssSelector
    protected static final String transferClick = "/html/body/div[1]/div[3]/div[2]/div/div/form/div[2]/input"; //XPATH
    protected static final String transferCompleteText = "/html/body/div[1]/div[3]/div[2]/div/div/h1"; //XPATH
    protected static final String nickField = "/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input"; //XPATH
    protected static final String passField = "/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input"; //XPATH
    protected static final String userName = "joelmir4Silva";
    protected static final String passWord = "joe2";
    protected static final String logginIn = "/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input"; //XPATH

    public void transferFunds(CharSequence ammount) throws InterruptedException {
        WebElement insertUser = getWebElement(By.xpath(nickField));
        insertUser.click();
        insertUser.sendKeys(userName);
        WebElement insertPass = getWebElement(By.xpath(passField));
        insertPass.click();
        insertPass.sendKeys(passWord);
        WebElement entering = getWebElement(By.xpath(logginIn));
        entering.click();
        Thread.sleep(500);
        WebElement stepOne = getWebElement(By.xpath(transferFunds));
        stepOne.click();
        WebElement stepTwo = getWebElement(By.xpath(transferText));
        stepTwo.getText().contains("Transfer Funds");
        Thread.sleep(1000);
        WebElement checbox = getWebElement(By.xpath(toAccount));
        checbox.click();
        Thread.sleep(1000);
        Select clicking = new Select(driver.findElement(By.xpath(toAccount)));
        clicking.selectByVisibleText("14232");
        Thread.sleep(500);
        WebElement stepThree = getWebElement(By.xpath(insertAmmount));
        stepThree.click();
        stepThree.clear();
        stepThree.sendKeys(ammount);
        WebElement stepFour = getWebElement(By.xpath(transferClick));
        stepFour.click();
        Thread.sleep(300);
        WebElement stepFive = getWebElement(By.xpath(transferCompleteText));
        stepFive.getText().contains("Transfer Complete!");
        Thread.sleep(1000);
    }
}
