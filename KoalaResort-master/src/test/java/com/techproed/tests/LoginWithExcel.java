package com.techproed.tests;

import com.techproed.pages.DefaultPage;
import com.techproed.pages.LoginPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.ExcelUtil;
import com.techproed.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class LoginWithExcel extends TestBase {

    ////=======EXCEL ILE LOGIN YAPMAYA calisma farkli kombinasyonlarla=====//

        //    Creating ExcelUtil object
        ExcelUtil excelUtil;
        //    We will get test data (username,pasword) key value list as LIST OF MAP OF STRING
        List<Map<String , String>> testData;

        LoginPage loginPage;
        DefaultPage defaultPage;
        //    To login the application
        public void setUp(){
            loginPage= new LoginPage();
            Driver.getDriver().get(ConfigReader.getProperty("application_login_url"));
            //We are on the LoginPage
        }

        @Test
        public void adminLoginTest(){
            excelUtil=new ExcelUtil("./src/test/java/resources/smoketestdata.xlsx","admin_login_info");
            testData=excelUtil.getDataList();
            for(Map<String,String> each: testData) {
                setUp();
//            System.out.println(each);
//           Map get method accepts a key and returns the value.
                loginPage.username.sendKeys(each.get("username"));//admin
                loginPage.password.sendKeys(each.get("password"));//Techproed123!
                loginPage.loginButton.click();
                defaultPage = new DefaultPage();
                Assert.assertEquals(defaultPage.userID.getText(), each.get("username"));
            }
        }

        @Test
        public void managerLoginTest(){
//      Calling ExcelUtil to set the path and sheet name
            excelUtil=new ExcelUtil("./src/test/java/resources/smoketestdata.xlsx","manager_login_info");
            testData=excelUtil.getDataList();
            for(Map<String,String> each: testData) {
                setUp(); //burada kullanirsak her seferinde tekrar giris yapmaya calisir
//            System.out.println(each);
//           Map get method accepts a key and returns the value.
                loginPage.username.sendKeys(each.get("username"));
                loginPage.password.sendKeys(each.get("password"));
                loginPage.loginButton.click();
                defaultPage = new DefaultPage();
                Assert.assertEquals(defaultPage.userID.getText(), each.get("username"));
            }
        }
        @AfterMethod
        public void tearDown(){
            Driver.closeDriver();
        }
    }


