package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basedriver {

    public void loginToAppluication(){
        WebDriver driver =new ChromeDriver();
        driver.get("https://chat.openai.com/auth/login");
    }
}
