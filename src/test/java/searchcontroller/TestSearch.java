package searchcontroller;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.NoInjection;
import org.testng.annotations.Test;
import searchpage.Login;
import searchpage.SearchPageElements;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;


public class TestSearch {
    public String FacebookUrl= "https://www.facebook.com/";
    //public SearchPageElements SearchElements= new SearchPageElements();
    //public Login login= new Login();

    public WebDriver driver;


    @BeforeTest
    public void Setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(FacebookUrl);

    }




    @Test(priority = 1)
    public void Login() throws InterruptedException {
        Login login= new Login(driver);
        login.username(driver).sendKeys("naremanmedhat168@gmail.com");
    login.Password(driver).sendKeys("23601216");
    login.LoginButton(driver).click();
    Thread.sleep(2000);

    }





    @Test(priority = 2)
    public void SearchFacebook() throws InterruptedException {

        Thread.sleep(2000);

        SearchPageElements SearchElements= new SearchPageElements(driver);
        SearchElements.SearchInputField(driver).sendKeys("Singleclic");

        SearchElements.TopSearch(driver).click();

        Thread.sleep(2000);
        assertEquals("5",SearchElements.Singleclic(driver).getText());
        SearchElements.Singleclic(driver).click();





    }


}
