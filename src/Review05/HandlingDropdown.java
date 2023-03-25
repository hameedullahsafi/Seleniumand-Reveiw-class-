package Review05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {
    public static void main(String[] args) {
        //   tell your project where the webdriver is located.
        //   for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
         driver.get("https://www.orangehrm.com/contact-sales/");
         driver.manage().window().maximize();
         WebElement countryDdl = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
         Select country = new Select(countryDdl);
        //country.selectByIndex(12);// select by index
        //country.selectByValue("India");// selext by Voule
        country.selectByVisibleText("Brazil");// select by visableText


    }
}