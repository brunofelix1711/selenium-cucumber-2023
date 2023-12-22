package com.stepdefinition;

import Base.Basedriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition  extends  Basedriver{
;


    @Given("When I Launch the application")
    public void when_i_launch_the_application() {

        WebDriver driver=new ChromeDriver();
        driver.get("https://chat.openai.com/auth/login");
    }
    @Then("I enter the {string} and {string}")
    public void i_enter_the_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I click submit button")
    public void i_click_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
