package com.techproed.tests;

import com.techproed.pages.Register;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.DataProviderHolder;
import org.testng.annotations.Test;

public class CreateNewAccountNegatif_Jahan {
    Register register = new Register();

    @Test
    public void userName() throws InterruptedException {
        register.loginPage();
        register.userName.sendKeys("" + Keys.TAB +
                ConfigReader.getProperty("password") + Keys.TAB +
                ConfigReader.getProperty("email") + Keys.TAB +
                ConfigReader.getProperty("fullName") + Keys.TAB +
                ConfigReader.getProperty("phoneNumber") + Keys.TAB +
                ConfigReader.getProperty("ssn") + Keys.TAB +
                ConfigReader.getProperty("drivingLicense") + Keys.TAB);

        Select select = new Select(register.country);
        select.selectByVisibleText(ConfigReader.getProperty("country"));

        Select select1 = new Select(register.state);
        select1.selectByVisibleText(ConfigReader.getProperty("state"));

        register.adress.sendKeys(ConfigReader.getProperty("adress") + Keys.TAB +
                ConfigReader.getProperty("workingSector") + Keys.TAB +
                ConfigReader.getProperty("birthDay") + Keys.TAB);
        register.save.click();
        String expected = "Please select a username";
        String actual = register.userNameHata.getText();
        Assert.assertEquals(actual, expected);
Thread.sleep(3000);
    }

    @Test
    public void password() throws InterruptedException {
        register.loginPage();
        register.userName.sendKeys(ConfigReader.getProperty("userName") + Keys.TAB +
                ConfigReader.getProperty("yalnisPassword") + Keys.TAB +
                ConfigReader.getProperty("email") + Keys.TAB +
                ConfigReader.getProperty("fullName") + Keys.TAB +
                ConfigReader.getProperty("phoneNumber") + Keys.TAB +
                ConfigReader.getProperty("ssn") + Keys.TAB +
                ConfigReader.getProperty("drivingLicense") + Keys.TAB);

        Select select = new Select(register.country);
        select.selectByVisibleText(ConfigReader.getProperty("country"));

        Select select1 = new Select(register.state);
        select1.selectByVisibleText(ConfigReader.getProperty("state"));

        register.adress.sendKeys(ConfigReader.getProperty("adress") + Keys.TAB +
                ConfigReader.getProperty("workingSector") + Keys.TAB +
                ConfigReader.getProperty("birthDay") + Keys.TAB);
        register.save.click();
        String expected = "At least one uppercase character is required";
        String actual = register.passwordHata.getText();
        Assert.assertEquals(actual, expected);
        Thread.sleep(3000);
    }

    @Test
    public void email() throws InterruptedException {
        register.loginPage();
        register.userName.sendKeys(ConfigReader.getProperty("userName") + Keys.TAB +
                ConfigReader.getProperty("password") + Keys.TAB +
                ConfigReader.getProperty("yalnisEmail") + Keys.TAB +
                ConfigReader.getProperty("fullName") + Keys.TAB +
                ConfigReader.getProperty("phoneNumber") + Keys.TAB +
                ConfigReader.getProperty("ssn") + Keys.TAB +
                ConfigReader.getProperty("drivingLicense") + Keys.TAB);

        Select select = new Select(register.country);
        select.selectByVisibleText(ConfigReader.getProperty("country"));

        Select select1 = new Select(register.state);
        select1.selectByVisibleText(ConfigReader.getProperty("state"));

        register.adress.sendKeys(ConfigReader.getProperty("adress") + Keys.TAB +
                ConfigReader.getProperty("workingSector") + Keys.TAB +
                ConfigReader.getProperty("birthDay") + Keys.TAB);
        register.save.click();
        String expected = "Please provide correct email address";
        String actual = register.emailHata.getText();
        Assert.assertEquals(actual, expected);
Thread.sleep(3000);
    }

    @Test
    public void fullName() throws InterruptedException {
        register.loginPage();
        register.userName.sendKeys(ConfigReader.getProperty("userName") + Keys.TAB +
                ConfigReader.getProperty("password") + Keys.TAB +
                ConfigReader.getProperty("email") + Keys.TAB);
        register.fullName.sendKeys("" + Keys.TAB +
                ConfigReader.getProperty("phoneNumber") + Keys.TAB +
                ConfigReader.getProperty("ssn") + Keys.TAB +
                ConfigReader.getProperty("drivingLicense") + Keys.TAB);

        Select select = new Select(register.country);
        select.selectByVisibleText(ConfigReader.getProperty("country"));

        Select select1 = new Select(register.state);
        select1.selectByVisibleText(ConfigReader.getProperty("state"));

        register.adress.sendKeys(ConfigReader.getProperty("adress") + Keys.TAB +
                ConfigReader.getProperty("workingSector") + Keys.TAB +
                ConfigReader.getProperty("birthDay") + Keys.TAB);
        register.save.click();
        String expected = "This field is required.";
        String actual = register.hata.getText();
        Assert.assertEquals(actual, expected);
Thread.sleep(3000);
    }

    @Test
    public void phone() throws InterruptedException {
        register.loginPage();
        register.userName.sendKeys(ConfigReader.getProperty("userName") + Keys.TAB +
                ConfigReader.getProperty("password") + Keys.TAB +
                ConfigReader.getProperty("email") + Keys.TAB +
                ConfigReader.getProperty("fullName") + Keys.TAB);
        register.phoneNo.sendKeys("" + Keys.TAB +
                ConfigReader.getProperty("ssn") + Keys.TAB +
                ConfigReader.getProperty("drivingLicense") + Keys.TAB);

        Select select = new Select(register.country);
        select.selectByVisibleText(ConfigReader.getProperty("country"));

        Select select1 = new Select(register.state);
        select1.selectByVisibleText(ConfigReader.getProperty("state"));

        register.adress.sendKeys(ConfigReader.getProperty("adress") + Keys.TAB +
                ConfigReader.getProperty("workingSector") + Keys.TAB +
                ConfigReader.getProperty("birthDay") + Keys.TAB);
        register.save.click();
        String expected = "Please enter phone number";
        String actual = register.phoneHata.getText();
        Assert.assertEquals(actual, expected);
Thread.sleep(3000);
    }

    @Test
    public void ssn() throws InterruptedException {
        register.loginPage();
        register.userName.sendKeys(ConfigReader.getProperty("userName") + Keys.TAB +
                ConfigReader.getProperty("password") + Keys.TAB +
                ConfigReader.getProperty("email") + Keys.TAB +
                ConfigReader.getProperty("fullName") + Keys.TAB +
                ConfigReader.getProperty("phoneNumber"));
        register.ssn.sendKeys("" + Keys.TAB +
                ConfigReader.getProperty("drivingLicense") + Keys.TAB);

        Select select = new Select(register.country);
        select.selectByVisibleText(ConfigReader.getProperty("country"));

        Select select1 = new Select(register.state);
        select1.selectByVisibleText(ConfigReader.getProperty("state"));

        register.adress.sendKeys(ConfigReader.getProperty("adress") + Keys.TAB +
                ConfigReader.getProperty("workingSector") + Keys.TAB +
                ConfigReader.getProperty("birthDay") + Keys.TAB);
        register.save.click();
        String expected = "This field is required.";
        String actual = register.hata.getText();
        Assert.assertEquals(actual, expected);
        Thread.sleep(3000);
    }

    @Test
    public void license() throws InterruptedException {
        register.loginPage();
        register.userName.sendKeys(ConfigReader.getProperty("userName") + Keys.TAB +
                ConfigReader.getProperty("password") + Keys.TAB +
                ConfigReader.getProperty("email") + Keys.TAB +
                ConfigReader.getProperty("fullName") + Keys.TAB +
                ConfigReader.getProperty("phoneNumber") + Keys.TAB +
                ConfigReader.getProperty("ssn") + Keys.TAB);
        register.driverLicense.sendKeys("");

        Select select = new Select(register.country);
        select.selectByVisibleText(ConfigReader.getProperty("country"));

        Select select1 = new Select(register.state);
        select1.selectByVisibleText(ConfigReader.getProperty("state"));

        register.adress.sendKeys(ConfigReader.getProperty("adress") + Keys.TAB +
                ConfigReader.getProperty("workingSector") + Keys.TAB +
                ConfigReader.getProperty("birthDay") + Keys.TAB);
        register.save.click();
        String expected = "This field is required.";
        String actual = register.hata.getText();
        Assert.assertEquals(actual, expected);
        Thread.sleep(3000);
    }

    @Test
    public void country() throws InterruptedException {
        register.loginPage();
        register.userName.sendKeys(ConfigReader.getProperty("userName") + Keys.TAB +
                ConfigReader.getProperty("password") + Keys.TAB +
                ConfigReader.getProperty("email") + Keys.TAB +
                ConfigReader.getProperty("fullName") + Keys.TAB +
                ConfigReader.getProperty("phoneNumber") + Keys.TAB +
                ConfigReader.getProperty("ssn") + Keys.TAB +
                ConfigReader.getProperty("drivingLicense") + Keys.TAB + Keys.TAB);

        Select select1 = new Select(register.state);
        select1.selectByVisibleText(ConfigReader.getProperty("state"));

        register.adress.sendKeys(ConfigReader.getProperty("adress") + Keys.TAB +
                ConfigReader.getProperty("workingSector") + Keys.TAB +
                ConfigReader.getProperty("birthDay") + Keys.TAB);
        register.save.click();
        String expected = "Select Country";
        String actual = register.countryHata.getText();
        Assert.assertEquals(actual, expected);
        Thread.sleep(3000);
    }

    @Test
    public void state() throws InterruptedException {
        register.loginPage();
        register.userName.sendKeys(ConfigReader.getProperty("userName") + Keys.TAB +
                ConfigReader.getProperty("password") + Keys.TAB +
                ConfigReader.getProperty("email") + Keys.TAB +
                ConfigReader.getProperty("fullName") + Keys.TAB +
                ConfigReader.getProperty("phoneNumber") + Keys.TAB +
                ConfigReader.getProperty("ssn") + Keys.TAB+
                ConfigReader.getProperty("drivingLicense"));

        Select select = new Select(register.country);
        select.selectByVisibleText(ConfigReader.getProperty("country"));

        register.adress.sendKeys(ConfigReader.getProperty("adress") + Keys.TAB +
                ConfigReader.getProperty("workingSector") + Keys.TAB +
                ConfigReader.getProperty("birthDay") + Keys.TAB);
        register.save.click();
        String expected = "Select State";
        String actual = register.stateHata.getText();
        Assert.assertEquals(actual, expected);
        Thread.sleep(3000);
    }
    @Test
    public void adress() throws InterruptedException {
        register.loginPage();
        register.userName.sendKeys(ConfigReader.getProperty("userName") + Keys.TAB +
                ConfigReader.getProperty("password") + Keys.TAB +
                ConfigReader.getProperty("email") + Keys.TAB +
                ConfigReader.getProperty("fullName") + Keys.TAB +
                ConfigReader.getProperty("phoneNumber") + Keys.TAB +
                ConfigReader.getProperty("ssn") + Keys.TAB+
                ConfigReader.getProperty("drivingLicense"));

        Select select = new Select(register.country);
        select.selectByVisibleText(ConfigReader.getProperty("country"));

        Select select1 = new Select(register.state);
        select1.selectByVisibleText(ConfigReader.getProperty("state"));

        register.adress.sendKeys("" + Keys.TAB +
                ConfigReader.getProperty("workingSector") + Keys.TAB +
                ConfigReader.getProperty("birthDay") + Keys.TAB);
        register.save.click();
        String expected = "This field is required.";
        String actual = register.hata.getText();
        Assert.assertEquals(actual, expected);
        Thread.sleep(3000);
    }
    @Test
    public void workingSector() throws InterruptedException {
        register.loginPage();
        register.userName.sendKeys(ConfigReader.getProperty("userName") + Keys.TAB +
                ConfigReader.getProperty("password") + Keys.TAB +
                ConfigReader.getProperty("email") + Keys.TAB +
                ConfigReader.getProperty("fullName") + Keys.TAB +
                ConfigReader.getProperty("phoneNumber") + Keys.TAB +
                ConfigReader.getProperty("ssn") + Keys.TAB+
                ConfigReader.getProperty("drivingLicense"));

        Select select = new Select(register.country);
        select.selectByVisibleText(ConfigReader.getProperty("country"));

        Select select1 = new Select(register.state);
        select1.selectByVisibleText(ConfigReader.getProperty("state"));

        register.adress.sendKeys(ConfigReader.getProperty("adress")+Keys.TAB);
               register.workingSector.sendKeys(""+Keys.TAB+
                ConfigReader.getProperty("birthDay") + Keys.TAB);
        register.save.click();
        String expected = "This field is required.";
        String actual = register.hata.getText();
        Assert.assertEquals(actual, expected);
        Thread.sleep(3000);
    }
    @Test
    public void birthDay() throws InterruptedException {
        register.loginPage();
        register.userName.sendKeys(ConfigReader.getProperty("userName") + Keys.TAB +
                ConfigReader.getProperty("password") + Keys.TAB +
                ConfigReader.getProperty("email") + Keys.TAB +
                ConfigReader.getProperty("fullName") + Keys.TAB +
                ConfigReader.getProperty("phoneNumber") + Keys.TAB +
                ConfigReader.getProperty("ssn") + Keys.TAB+
                ConfigReader.getProperty("drivingLicense"));

        Select select = new Select(register.country);
        select.selectByVisibleText(ConfigReader.getProperty("country"));

        Select select1 = new Select(register.state);
        select1.selectByVisibleText(ConfigReader.getProperty("state"));

        register.adress.sendKeys(ConfigReader.getProperty("adress")+Keys.TAB+
        ConfigReader.getProperty("workingSector")+Keys.TAB);
               register.birthDate.sendKeys("");
        register.save.click();
        String expected = "This field is required.";
        String actual = register.hata.getText();
        Assert.assertEquals(actual, expected);
        //Driver.closeDriver();
        Thread.sleep(3000);
    }
}