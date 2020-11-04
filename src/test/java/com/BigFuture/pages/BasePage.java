package com.BigFuture.pages;

import com.BigFuture.utilities.BrowserUtils;
import com.BigFuture.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(xpath = "//span[@xpath]")
    public WebElement userName;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement logOut;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle(String pageName) {
        String linkText=Driver.get().findElement(By.linkText(pageName)).getText();
        return linkText;
    }


    public String getUserName(){
        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForVisibility(userName, 5);
        return userName.getText();
    }




    public void logOut(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(userName);
        BrowserUtils.clickWithJS(logOut);
    }

    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     */

    public void navigateToModule(String tab) {
        String tabLocator = "//span[normalize-space(text())='"+tab+"']";

        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }

        }
    }

