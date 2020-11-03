package com.BigFuture.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "navbarDropdown")
    public WebElement userButton;

    @FindBy(xpath= "//a[@class='dropdown-item']")
    public WebElement logoutButton;

}
