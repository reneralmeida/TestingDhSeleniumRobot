package com.Tests;

import com.Pages.TransfersPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TransferTestPage {

    private static TransfersPage tPage;

    @BeforeAll
    static void setUp() {
        tPage = new TransfersPage();
        tPage.openApp();
    }

    @Test
    @Tag("Regression")
    public void transferindoValores() throws  InterruptedException {
        tPage.transferFunds("500");
        System.out.println("Transferência realizada com sucesso");
    }

    @AfterAll
    static void tearDown() {
        tPage.quitDriver();
    }

}
