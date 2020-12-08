package com.BigFuture.step_definitions;

import com.BigFuture.pages.LoginPage;
import com.BigFuture.utilities.ConfigurationReader;
import com.BigFuture.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDef {
    private final LoginPage loginPage;
    public LoginStepDef(LoginPage loginPage){
        this.loginPage=loginPage;
    }

    @Given("the user is logged in as {string}")
    public void theUserIsLoggedInAs(String userType) {
        Driver.get().get(ConfigurationReader.get("url"));
        if (userType.equalsIgnoreCase("Student")) {
            loginPage.loginAsStudent();
        }else if (userType.equalsIgnoreCase("Librarian")){
            loginPage.loginAsLibrarian();
        }else {
            System.out.println("Wrong tyep User");
        }
    }


}
