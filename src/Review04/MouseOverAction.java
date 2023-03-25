package Review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
    public static void main(String[] args) throws InterruptedException {
        //   tell your project where the webdriver is located.
        //   for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

        // how right click here is the code
        driver.get("https://demo.opencart.com/");
        WebElement menuItem =driver.findElement(By.xpath("//a[text()='Components']"));

        Actions act = new Actions(driver);
        act.moveToElement(menuItem).perform();
        WebElement subMenuItem= driver.findElement(By.xpath("//a[contains(text(), 'Monitors')]"));
        act.moveToElement(subMenuItem).click().perform();


    }
}
