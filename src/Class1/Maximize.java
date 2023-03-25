package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
public static void main(String[] args) {
        // connect to the webdriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // use driver to navigate the ("URL")
        driver.get("https://google.com");
        // maximize the window
        driver.manage().window().maximize();
        //full screen
        driver.manage().window().fullscreen();
        //class
        driver.close();
        }
        }
