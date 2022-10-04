package com.Tests;

import com.Pages.RegisteringPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class RegisteringTestPage {

    private static RegisteringPage page;

    @BeforeAll
    static void setUp() {
        page = new RegisteringPage();
        page.openApp();
    }

    @Test
    @Tag("Regression")
    public void fazerRegistro() throws InterruptedException {
        page.registering("Joelmir", "Da Silva", "Rua Tupi", "Guarulhos", "SP",
                "241313", "45411818", "84131818", "joelmir4Silva", "joe2");

        System.out.println("Registro efetuado com sucesso");
    }

    @AfterAll
    static void tearDown() {
        page.quitDriver();
    }

}
