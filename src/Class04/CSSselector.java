package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {



//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

//        create an instance of WebDriver
            WebDriver driver = new ChromeDriver();

//       open the Website facebook.com
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            WebElement createNewButton = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
           createNewButton.click();


          Thread.sleep(1000);

            WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
            firstName.sendKeys("abracadabra");
        }
    }


