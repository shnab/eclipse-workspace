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

public class RoomReservationPozitifDataProviderWithExcelAbbas extends TestBase {

    RoomReservationPage roomReservationPage;
    DefaultPage defaultPage;
    LoginPage loginPage;

    @BeforeMethod
    public void defaultLogin(){
        loginPage= new LoginPage();
        loginPage.koalaResortLogin();
        //loginPage.managerLoginTest();

        defaultPage =new DefaultPage();
        defaultPage.hotelManagement.click();
        defaultPage.roomReservations.click();
        roomReservationPage = new RoomReservationPage(driver);
        roomReservationPage.addRoomReservationButton.click();
    }

    @Test(dataProvider = "getData")
    public void positieveRoomReservationCreate (String price,String dateStart,String dateEnd,String adultAmount,
                                                String childrenAmount,String contactNameSurname,String contactPhone,
                                                String contactEmail, String notes) throws InterruptedException {

        WebElement dropDownMenu = roomReservationPage.idUser;

        Select options = new Select(roomReservationPage.idUser);
        options.selectByIndex(1); //Option 1 manager
        System.out.println(options.getFirstSelectedOption().getText());

        Select options2 =new Select(roomReservationPage.idHotelRoom);
        options2.selectByVisibleText(ConfigReader.getProperty("roomreservationpage_select_hotel"));
//        Thread.sleep(1000);

        roomReservationPage.price.sendKeys(price);
        roomReservationPage.dateStart.sendKeys(dateStart);
        roomReservationPage.dateEnd.sendKeys(dateEnd);
        roomReservationPage.adultAmount.sendKeys(adultAmount);
        roomReservationPage.childrenAmount.sendKeys(childrenAmount);
        roomReservationPage.nameAndSurname.sendKeys(contactNameSurname);
        roomReservationPage.contactPhone.sendKeys(contactPhone);
        roomReservationPage.contactEmail.sendKeys(contactEmail);
        roomReservationPage.notes.sendKeys(notes);


        roomReservationPage.approved.click();
        roomReservationPage.isPaid.click();
        //Save button click
        roomReservationPage.saveButton.submit();

        //Explicitely Wait for succes message
        ReusableMethods.waitForVisibility(roomReservationPage.actualSuccessMessage,5 );
        //Ok button click
        roomReservationPage.okSuccesButton.click();

        //Assert
        String expectedSuccessMessage =ConfigReader.getProperty("roomreservationpage_expectedSuccessMessage");
        System.out.println(roomReservationPage.actualSuccessMessage.getText());
        System.out.println(ConfigReader.getProperty("roomreservationpage_expectedSuccessMessage"));
        Assert.assertEquals(roomReservationPage.actualSuccessMessage.getText(),expectedSuccessMessage );


        //remove buton click with JSExecutor
        //Some elements may not be visible or cannot be easily clicked using selenium click() method
        //remove buton click with JSExecutor
//        //Some elements may not be visible or cannot be easily clicked using selenium click() method
        WebElement clickRemoveButton= roomReservationPage.removeButtonRoomReservationPage;
        ReusableMethods.waitForVisibility(clickRemoveButton,5 );
        JSUtils.clickElementByJS(clickRemoveButton);

        //        clickRemoveButton.sendKeys(Keys.PAGE_UP);
//        clickRemoveButton.click();

    }

    @DataProvider
    public Object[][] getData(){
        String [][] managerProfile= {
                {"400","8/1/2021", "8/5/2021","2","3","Team One","(122)333-4444","abc@hotmail.com","There should be a microwave in the room"},
        };
        return managerProfile;
    }

    @Test //(dependsOnMethods = "positieveRoomReservationCreate" )
    public void positieveRoomReservationRemove()  throws InterruptedException {

        positieveRoomReservationCreate("400","8/1/2021", "8/5/2021","2","3",
                         "Team One","(122)333-4444","abc@hotmail.com",
                         "There should be a microwave in the room");


             //remove buton click with JSExecutor
        //Some elements may not be visible or cannot be easily clicked using selenium click() method
        //remove buton click with JSExecutor
//        //Some elements may not be visible or cannot be easily clicked using selenium click() method
        WebElement clickRemoveButton= roomReservationPage.removeButtonRoomReservationPage;
        ReusableMethods.waitForVisibility(clickRemoveButton,5 );
        JSUtils.clickElementByJS(clickRemoveButton);

//        clickRemoveButton.sendKeys(Keys.PAGE_UP);
//        clickRemoveButton.click();
    }




}

