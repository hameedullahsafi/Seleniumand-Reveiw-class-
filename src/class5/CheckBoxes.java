package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        //        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

//        goto syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        // iterate through the list
        for (int i = 0; i <checkBoxes.size(); i++) {
            String value = checkBoxes.get(i).getAttribute("value");
            /*
            check if this is the desired one
            if yes cleck it
            if no continue toiterate
             */
            if (value.equalsIgnoreCase("Option-2")){
                checkBoxes.get(i).click();;

        }

        }

    }
}
