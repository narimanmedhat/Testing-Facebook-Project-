package searchpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class Login {
public WebDriver driver ;

public Login(WebDriver driver ){
    this.driver = driver;
}

    public  WebElement username(WebDriver driver)
    {
        return driver.findElement(By.id("email"));
    }
    public WebElement Password(WebDriver driver)
    {
        return driver.findElement(By.id("pass"));
    }
    public WebElement LoginButton(WebDriver driver)
    {
        return driver.findElement(By.name("login"));
    }



}
