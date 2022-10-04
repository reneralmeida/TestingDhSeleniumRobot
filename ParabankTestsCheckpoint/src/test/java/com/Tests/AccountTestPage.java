package com.Tests;

import com.Pages.AccountPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AccountTestPage {

        private static AccountPage hadnlingAccounts;

        @BeforeAll
        static void setUp() {
            hadnlingAccounts = new AccountPage();
            hadnlingAccounts.openApp();
        }

        @Test
        @Tag("Regression")
        public void abrindoConta_e_Overview() throws  InterruptedException {
            hadnlingAccounts.openingAccount();
            System.out.println("Conta criada com sucesso.");

            hadnlingAccounts.accountStatus();
            System.out.println("Visão geral concluída com sucesso");
        }

        @Test
        @Tag("Regression")
        public void atividadeContas() throws InterruptedException {
            hadnlingAccounts.accountActivity();
            System.out.println("Verificação de atividade de conta concluída com sucesso");
        }

        @AfterAll
        static void tearDown() {
            hadnlingAccounts.quitDriver();
        }
    }
