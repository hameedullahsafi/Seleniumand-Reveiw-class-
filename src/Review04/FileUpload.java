package Review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        //   tell your project where the webdriver is located.
        //   for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@multiple]")).sendKeys("C:\\Users\\tee\\Desktop\\New Text Document.txt");
        /*
        Note: this will work only for those file upload button for which the taq name is input and type is file
        sendKeys use
        1; entering values in the text boxes
        2 uploading the file
        3 for performing the keyboard interactions


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
