package com.Tests;

import com.Base.BasePage;
import com.Pages.SignUpPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class SignUpTest {

	private static WebDriver driver;

	@BeforeAll
	static void setUp() {
		BasePage basePage = new BasePage();
		basePage.openApp();
		driver = basePage.getDriver();
	}

	@Test
	public void testingSignUp() throws InterruptedException {

		SignUpPage page = new SignUpPage();
		page.signingUp("Juarez","Silva", "juarsilva36@whatever.com", "21998571345", "whatever");
		Thread.sleep(300);

		System.out.println("Teste de registro realizado com sucesso.");

	}

	@AfterAll
	static void tearDown() {
		driver.quit();
	}

}
