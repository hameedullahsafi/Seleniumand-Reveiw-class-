package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAnddrop {
    public static void main(String[] args) {
        //   tell your project where the webdriver is located.
        //   for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        // get the element which you want drag

        //        get the element which u want to drag
        WebElement draggable = driver.findElement(By.id("draggable"));

//        get the dropable element

        WebElement dropable = driver.findElement(By.id("droppable"));

// action class
        Actions action= new Actions(driver);
        action.dragAndDrop(draggable,dropable).perform();


    }
}
