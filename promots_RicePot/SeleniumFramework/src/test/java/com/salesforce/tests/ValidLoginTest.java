package com.salesforce.tests;

import com.salesforce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidLoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("validuser@gmail.com", "Password@123");
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Home") || actualTitle.contains("Salesforce"),
                "Login failed or title mismatched");
    }
}
