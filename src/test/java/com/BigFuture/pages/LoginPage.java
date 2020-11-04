package com.BigFuture.pages;
import com.BigFuture.utilities.ConfigurationReader;
import com.BigFuture.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath="//button[@type='submit']")
    public WebElement signinButton;

    @FindBy(id="inputEmail")
    public WebElement userEmail;


    @FindBy(id="inputPassword")
    public WebElement userPassword;


    @FindBy(id = "navbarDropdown")
    public WebElement userButton;

    @FindBy(xpath= "//a[@class='dropdown-item']")
    public WebElement logoutButton;



    public void login(String userNameStr, String passwordStr) {
        userEmail.sendKeys(userNameStr);
        userPassword.sendKeys(passwordStr);
        signinButton.click();
    }
    public void loginAsStudent() {
        String username = ConfigurationReader.get("student_username");
        String password = ConfigurationReader.get("student_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }
    public void loginAsLibrarian() {
        String username = ConfigurationReader.get("librarian_username");
        String password = ConfigurationReader.get("librarian_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }


}
