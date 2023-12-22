package com.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginStepDefinition  {

    @Given("When I Launch the application")
    public void when_i_launch_the_application() {
        System.out.println("test");

    }

    @Then("I enter the {string} and {string}")
    public void i_enter_the_and(String string, String string2) {
        System.out.println("test");
    }

    @Then("I click submit button")
    public void i_click_submit_button() {
        System.out.println("test");
    }

}
