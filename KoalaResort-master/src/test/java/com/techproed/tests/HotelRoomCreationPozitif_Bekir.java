package com.techproed.tests;

import com.techproed.pages.DefaultPage;
import com.techproed.pages.LoginPage;
import com.techproed.pages.HotelRoomPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HotelRoomCreationPozitif_Bekir {
    LoginPage loginPage;
    DefaultPage defaultPage;
    HotelRoomPage hotelRoomPage;
    //Login teh application:
    @BeforeMethod
    public void setUp(){
        loginPage= new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("application_login_url"));
        loginPage.username.sendKeys(ConfigReader.getProperty("admin_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("admin_password"));
        loginPage.loginButton.click();
//        Checking if the login is successful
        defaultPage=new DefaultPage();
        Assert.assertTrue(defaultPage.addUserButton.isDisplayed());

    }

    @Test
    public void hotelRoomCreation() throws InterruptedException {
//Click on Hotel Management
        defaultPage.hotelManagement.click();

//Click on Hotel Rooms
        defaultPage.hotelRooms.click();

//Click on Add Hotel Room
        hotelRoomPage=new HotelRoomPage();
        hotelRoomPage.addHotelRoomButton.click();

//Enter All required fieldd
//        WebElement -> done in page class
//        2. Select object
        Select select=new Select(hotelRoomPage.hotelIdDropdown);
//        3. selectBy...
        select.selectByVisibleText("Sheraton");
        hotelRoomPage.code.sendKeys("101");
        hotelRoomPage.name.sendKeys("Summer");
        hotelRoomPage.location.sendKeys("B BLOK");
        hotelRoomPage.description.sendKeys("This is the best price for special guests");
        hotelRoomPage.price.sendKeys("400");

        Select roomDropdown=new Select( hotelRoomPage.roomTypeDropdown);
        roomDropdown.selectByVisibleText("King");
        hotelRoomPage.maxAdultCount.sendKeys("2");
        hotelRoomPage.maxChildCount.sendKeys("3");
        hotelRoomPage.isApprovedCheckbox.click();
        hotelRoomPage.saveButton.click();


//Verify the message: HotelRoom was inserted successfully
//        1. HARD WAIT
//        Thread.sleep(1000);// not recommended

//       Assert.assertEquals(hotelRoomPage.popUp.getText(),"HotelRoom was inserted successfully");

//        2. USE EXPLICIT WAIT TO SOLVE THE WAIT ISSUE:
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        WebElement popupElement=wait.until(ExpectedConditions.visibilityOf(hotelRoomPage.popUp));
        Assert.assertEquals(popupElement.getText(),"HotelRoom was inserted successfully");
//Click OK
        hotelRoomPage.okButton.click();

    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

}
