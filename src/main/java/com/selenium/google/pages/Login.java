package com.selenium.google.pages;

import com.selenium.google.common.BasePage;

import com.selenium.google.pageobjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * The Class Login.
 * 
 *  @author Murali
 *  
 */
public class Login extends BasePage {

    /** The home page. */
    HomePage homePage;

    /**
     * Instantiates a new login.
     *
     * @param driver the driver
     */
    public Login(WebDriver driver){
        this.driver = driver;
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    /**
     * Perform.
     *
     * @param username the username
     * @param password the password
     */
    public void perform(String username,String password){
        openUrl("https://gmail.com");
        fillIn(homePage.txtEmail, username);
        fillIn(homePage.txtPassword, password);
        click(homePage.btnLogin);
	}

    /**
     * Gets the error msg.
     *
     * @return the error msg
     */
    public String getErrorMsg(){
        return getText(homePage.lblLoginErrorMsg);
    }
}
