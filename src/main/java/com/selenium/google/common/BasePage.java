package com.selenium.google.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * The Class BasePage.
 * 
 * @author Murali
 * 
 */
public class BasePage {

	/** The driver. */
	protected WebDriver driver;

    /**
     * Fill in.
     *
     * @param element the element
     * @param text the text
     */
    public void fillIn(WebElement element,String text){
        element.sendKeys(text);
    }

    /**
     * Click.
     *
     * @param element the element
     */
    public void click(WebElement element){
        element.click();
    }

    /**
     * Gets the text.
     *
     * @param webElement the web element
     * @return the text
     */
    public String getText(WebElement webElement){
        return webElement.getText();
    }

    /**
     * Open url.
     *
     * @param url the url
     */
    public void openUrl(String url){
        driver.get(url);
    }

}
