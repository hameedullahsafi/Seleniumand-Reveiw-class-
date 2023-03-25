package Review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
    public static void main(String[] args) throws InterruptedException {
        //   tell your project where the webdriver is located.
        //   for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

        // how right click here is the code
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
      WebElement rightClickButton= driver.findElement(By.xpath("//span[text()='right click me']"));
      Actions act = new Actions(driver);
      act.contextClick(rightClickButton).perform();


        /*
        Actine class
        // to scroll , Drag and drop, double, hover
        // mouse Actions
           how to perform right click
           how to perfrom double click
           how to perform drag and drop
           how to perform Mouse hover
         */
    }
}
