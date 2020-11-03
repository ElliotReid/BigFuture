package com.BigFuture.step_definitions;

import com.BigFuture.pages.BooksPage;
import com.BigFuture.pages.DashboardPage;
import com.BigFuture.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BooksStepDef {
    BooksPage booksPage = new BooksPage();
    DashboardPage dashboard = new DashboardPage();

    @Then("the user navigates to {string}")
    public void theUserNavigatesTo(String to) {
        dashboard.navigateToModule(to);
    }



    @And("the default records should be {string}")
    public void theDefaultRecordsShouldBe(String number) {
        BrowserUtils.waitForVisibility(booksPage.showRecords,5);
        Select select = new Select(booksPage.showRecords);
        System.out.println(select.getFirstSelectedOption().getText());
        Assert.assertEquals(number,select.getFirstSelectedOption().getText());
    }

    @Then("the user should see Show records for {string} options")
    public void theUserShouldSeeShowRecordsForOptions(String option) {
        BrowserUtils.waitForVisibility(booksPage.showRecords,5);
        Select select = new Select(booksPage.showRecords);
        List<String>list = BrowserUtils.getElementsText(select.getOptions());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
