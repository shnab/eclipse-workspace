package com.techproed.tests;



import com.techproed.pages.DefaultPage;
import com.techproed.pages.LoginPage;
import com.techproed.pages.RoomReservationPage;
import com.techproed.utilities.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoomReservationPozitif_Abbas extends TestBase {

    RoomReservationPage roomReservationPage;
    DefaultPage defaultPage;
    LoginPage loginPage;


    @BeforeMethod
    public void defaultLogin(){
        loginPage= new LoginPage();
        loginPage.koalaResortLogin();

        defaultPage =new DefaultPage();
        defaultPage.hotelManagement.click();
        defaultPage.roomReservations.click();
        roomReservationPage = new RoomReservationPage(driver);
        roomReservationPage.addRoomReservationButton.click();
    }

    @Test
    public void positieveRoomReservationCreate() throws InterruptedException {
//        loginPage= new LoginPage();
//        loginPage.koalaResortLogin();
//
//        defaultPage =new DefaultPage();
//        defaultPage.hotelManagement.click();
//        defaultPage.roomReservations.click();
//
//        roomReservationPage = new RoomReservationPage(driver);
//        roomReservationPage.addRoomReservationButton.click();

        //1. asama ==>
       WebElement dropDownMenu = roomReservationPage.idUser;

       Select options = new Select(roomReservationPage.idUser);
       options.selectByIndex(1); //Option 1 manager
        System.out.println(options.getFirstSelectedOption().getText());//sadece sectigimiz optionu yazdirir
        //System.out.println(dropDownMenu.getText()); //tum dropdownu yazdirir

        Select options2 =new Select(roomReservationPage.idHotelRoom);
        options2.selectByVisibleText(ConfigReader.getProperty("roomreservationpage_select_hotel"));
        Thread.sleep(3000);

        Actions actions = new Actions(driver);

        actions
                .click(roomReservationPage.price)
                .pause(2)
                .sendKeys(ConfigReader.getProperty("roomreservationpage_price"))
                .pause(2)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("roomreservationpage_dateStart"))
                .pause(2)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("roomreservationpage_dateEnd"))
                .pause(2)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("roomreservationpage_adultAmount"))
                .pause(2)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("roomreservationpage_childrenAmount"))
                .pause(2)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("roomreservationpage_contactNameSurname"))
                .pause(2)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("roomreservationpage_contactPhone") )
                .pause(2)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("roomreservationpage_contactEmail"))
                .pause(2)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("roomreservationpage_notes"))
                .sendKeys(Keys.TAB)
                .perform();

        //Radio Button click
        // Then click on checkbox1 if box is NOT selected
        if (!roomReservationPage.approved.isSelected()){//if checkbox1 is NOT selected
            roomReservationPage.approved.click();       //Then click on it
        }

        if (!roomReservationPage.isPaid.isSelected()){//if checkbox1 is NOT selected
            roomReservationPage.isPaid.click();       //Then click on it
        }

        //Save button click
        roomReservationPage.saveButton.submit();

        //Ok button click
        //explicit wait
        ReusableMethods.waitForVisibility(roomReservationPage.actualSuccessMessage,5 );
        roomReservationPage.okSuccesButton.click();

        //remove buton click with JSExecutor
        //Some elements may not be visible or cannot be easily clicked using selenium click() method
//        WebElement clickRemoveButton= roomReservationPage.removeButtonRoomReservationPage;
//        JSUtils.clickElementByJS(clickRemoveButton);

        //Assert
        String expectedSuccessMessage =ConfigReader.getProperty("roomreservationpage_expectedSuccessMessage");
       System.out.println(roomReservationPage.actualSuccessMessage.getText());
       System.out.println(ConfigReader.getProperty("roomreservationpage_expectedSuccessMessage"));
       Assert.assertEquals(roomReservationPage.actualSuccessMessage.getText(),expectedSuccessMessage );

    }

    @Test
    public void positieveRoomReservationRemove()  {

        //burada positieveRoomReservationCreate() methodunu yukaridan cagirdim ve burada tekrarsiz olarak kullandim.

        try {
            positieveRoomReservationCreate();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //remove buton click with JSExecutor
        //Some elements may not be visible or cannot be easily clicked using selenium click() method
        WebElement clickRemoveButton= roomReservationPage.removeButtonRoomReservationPage;
        ReusableMethods.waitForVisibility(clickRemoveButton,5 );
        JSUtils.clickElementByJS(clickRemoveButton);
        //Assert.assertFalse(roomReservationPage.saveButton.isDisplayed());

    }

}
