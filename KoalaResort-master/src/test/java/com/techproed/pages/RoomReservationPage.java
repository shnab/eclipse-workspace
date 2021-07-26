package com.techproed.pages;

import com.techproed.utilities.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class RoomReservationPage  {

    //1.webdriver olustur
    WebDriver driver;

    //2.parametreli public constructor
    //parametre olarak Webdriver driver tyaz

    public RoomReservationPage (WebDriver driver){

        //3. parametre olarak verilen driver ile WebDriver driver; eslestir
        this.driver =driver;

        //4.page fabrikasina git ve
        PageFactory.initElements(driver, this);
    }
//    public RoomReservationPage(){
//        PageFactory.initElements(Driver.getDriver(),this);
//    }

    @FindBy(className = "hidden-480")
    public WebElement addRoomReservationButton;

    @FindBy(id = "IDUser")
    public WebElement idUser;

    @FindBy(id = "IDHotelRoom")
    public WebElement idHotelRoom;

    @FindBy(id = "Price")
    public WebElement price;

    @FindBy(id="DateStart")
    public WebElement dateStart;

    @FindBy(id="DateEnd")
    public WebElement dateEnd;

    @FindBy(id="AdultAmount")
    public WebElement adultAmount;

    @FindBy(id="ChildrenAmount")
    public WebElement childrenAmount;

    @FindBy(id="ContactNameSurname")
    public WebElement nameAndSurname;

    @FindBy(id="ContactPhone")
    public WebElement contactPhone;

    @FindBy(id="ContactEmail")
    public WebElement contactEmail;

    @FindBy(id="Notes")
    public WebElement notes;

    @FindBy(id="Approved")
    public WebElement approved;

    @FindBy(id="IsPaid")
    public WebElement isPaid;

    @FindBy(id="btnSubmit")
    public WebElement saveButton;

    @FindBy(className = "bootbox-body")
    public WebElement actualSuccessMessage;

    @FindBy(xpath = "(//button[@type='button'])[8]")
    public WebElement okSuccesButton;

    @FindBy(xpath = "//*[text()='OK']")
    public WebElement lastOKButon;

    @FindBy(xpath = "//a[@class='remove']")
    public WebElement removeButtonRoomReservationPage;

    @FindBy(xpath = "//div[@class='col-md-12']")
    public WebElement emptyPageAfterRemove;



//=======================================
//    Bundan sonrasini ben yazdim

    @FindBy(linkText = "Log in")
    public WebElement firstLoginLink;

    @FindBy(id ="UserName")
    public WebElement username;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(id="btnSubmit")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[text()='Try again please']")
    public WebElement girisYapilamadiElementi;

    @FindBy (xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy (partialLinkText = "Hotel List")
    public WebElement hotelList;

    @FindBy (xpath = "//*[text()='Add Hotel ']")
    public WebElement addHotel;

    @FindBy(id = "Code")
    public WebElement codeTextBox;

    @FindBy(id = "IDGroup")
    public WebElement acilirMenu;

    @FindBy(id = "btnSubmit")
    public WebElement saveButonu;

    @FindBy(xpath = "//div[text()='Hotel was inserted successfully']")
    public WebElement sonucYazisiElementi;

    @FindBy(xpath = "//*[text()='OK']")
    public WebElement sonOKButonu;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRooms;

    @FindBy(xpath = "//*[text()='Add Hotelroom ']")
    public WebElement addHotelRoom;

    @FindBy(id = "IDHotel")
    public WebElement idHotelDropdown;

    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement roomTextBox;

    @FindBy(linkText = "500")
    public WebElement fiyatBesYuzButonu;

    @FindBy(id = "Price")
    public WebElement priceTextBox;

    @FindBy(id = "IDGroupRoomType")
    public WebElement roomTypeDropdown;

    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdultCount;

    @FindBy(id = "MaxChildCount")
    public WebElement maxChildCount;

    @FindBy(xpath = "//*[text()='HotelRoom was inserted successfully']")
    public WebElement roomCreatedElementi;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement roomCreateSonOK;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRoomsButonu;

    @FindBy(xpath = "(//*[text()='List Of Hotelrooms'])[2]")
    public WebElement hotelRoomListYaziElementi;

    @FindBy(xpath = "//tbody//tr[1]//td")
    public List<WebElement> birinciSatirDatalar;

    @FindBy(xpath = "//thead//tr[1]//th")
    public List<WebElement> sutunBasliklari;

    @FindBy(xpath = "//tbody")
    public WebElement tbodyWebElement;

    @FindBy(xpath = "//tbody//td")
    public List<WebElement> bodydekiTumDataListesi;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> satirlarListesi;


    //her seferinde login ile ugrasmamak icin bu metodu yazdik
    public void koalaResortLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        firstLoginLink.click();
        username.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        password.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        loginButonu.click();
    }

}


