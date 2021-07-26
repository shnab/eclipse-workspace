package com.techproed.tests;


import com.techproed.pages.DefaultPage;
import com.techproed.pages.HotelListCreation;
import com.techproed.pages.LoginPage;
import com.techproed.pages.MainPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HotelListCreationPozitif_Halime extends TestBase{


    HotelListCreation hotelListCreation;
    DefaultPage defaultPage;
    LoginPage loginPage;

    @BeforeMethod
    public void defaultLogin() throws InterruptedException {
        loginPage = new LoginPage();
        loginPage.koalaResortLogin();

        hotelListCreation = new HotelListCreation();
        hotelListCreation.hotelManangement();
        hotelListCreation.hotelList();
        hotelListCreation.addHotel.click();
    }

    @Test
    public void dogruDatalarlaHotelOlusturma() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        actions.click(hotelListCreation.code)
                .sendKeys(ConfigReader.getProperty("kr_code"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("kr_customer_name"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("kr_customer_adress"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("kr_customer_phone"))
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("kr_customer_email"))
                .perform();


        Select select = new Select(hotelListCreation.selectGroup);
        select.selectByVisibleText(ConfigReader.getProperty("kr_dropdown_value"));

        Thread.sleep(2000);

        hotelListCreation.saveButton.click();
        Thread.sleep(2000);
        Assert.assertTrue(hotelListCreation.successfullYazisi.isDisplayed());
    //  Assert.assertEquals(hotelListCreation.successfullYazisi.getText(),ConfigReader.getProperty("kr_successfull_yazisi"));
        hotelListCreation.OKButtonu.click();

    }

    @AfterMethod
    public void tearDown() {
         Driver.closeDriver();

    }
}