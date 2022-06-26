package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    //Create constructor
    //Initialize the driver instance and this class' instance using PageFactory.initElements
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //We can start locating web elements using @FindBy annotation

    @FindBy (xpath = "//div[.='I agree']")
    public WebElement cookiesAgreeButton;

    @FindBy (xpath = "//button[@id='L2AGLb']//div[@class='QS5gu sy4vM']")
    public WebElement cookiesAcceptAllButton;

    @FindBy(name="q")
    public WebElement searchBox;



}
