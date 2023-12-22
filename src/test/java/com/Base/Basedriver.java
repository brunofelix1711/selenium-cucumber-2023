package com.Base;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Basedriver {

    public static WebDriver driver;

    @Before
    public void beforescenario() {

        try {
            if(driver==null);
            loginToAppluication();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loginToAppluication() {

        try {
            switch ("chrome") {
                case "chrome":
                    driver = new ChromeDriver();
                    driver.get("https://chat.openai.com/auth/login");
                    break;
                case "firefox":

                    break;

                case "IE":

                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}