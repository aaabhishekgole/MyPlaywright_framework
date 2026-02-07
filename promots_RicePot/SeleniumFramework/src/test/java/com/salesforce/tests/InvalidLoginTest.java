package com.salesforce.tests;

import com.salesforce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invaliduser@gmail.com", "WrongPass");
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage,
                "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
    }
}
