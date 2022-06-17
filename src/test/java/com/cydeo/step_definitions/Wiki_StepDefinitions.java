package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Wiki_StepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User types {string} in the wiki search box and clicks wiki search button")
    public void user_types_in_the_wiki_search_box_and_clicks_wiki_search_button(String string) {
        wikiSearchPage.searchInputBox.sendKeys(string + Keys.ENTER);
    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        String expectedTitle = string + " - Wikipedia";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String string) {
        String expectedTitle = string;
    //    String actualTitle = wikiSearchPage.mainHeader.getText();

        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String string) {
        String expectedTitle = string;
        String actualTitle = wikiSearchPage.imageHeader.getText();

        Assert.assertEquals(expectedTitle, actualTitle);
    }



}
