package searchpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageElements {
    public WebDriver driver;

    public SearchPageElements(WebDriver driver ){
        this.driver = driver;
    }

 public WebElement SearchInputField(WebDriver driver) {

     return driver.findElement(By.xpath("//input[@type='search']"));
 }


    public WebElement TopSearch(WebDriver driver)
    {
          return driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[2]/div/ul/li[1]/div/a/div"));

    }

    public WebElement Singleclic(WebDriver driver)
     {
         return driver.findElement(By.xpath("//a[@href='https://www.facebook.com/SingleClicLtd/']"));
     }








}
