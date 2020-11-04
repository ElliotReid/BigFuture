package com.BigFuture.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BooksPage extends BasePage {

    @FindBy(name = "tbl_books_length")
    public WebElement showRecords;


}
