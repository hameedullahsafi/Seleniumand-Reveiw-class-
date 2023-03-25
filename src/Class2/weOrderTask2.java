package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class weOrderTask2 {
    public static void main(String[] args) {
        /**
         * Task
         * Class1.Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
         * Login
         * Get title and verify it is correct
         * logout
         * close the browser
         */
        //        create an instance of WebDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // open up the website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        // maximize the screen
        driver.manage().window().maximize();
        // send the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // send the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        // click on the login button
        driver.findElement(By.className("button")).click();

//        verify that the title is "Web Orders"
        String title = driver.getTitle();

        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("the title is correct");
        }
        else {
            System.out.println("the title is incorrect");
        }

//        logout
        driver.findElement(By.linkText("Logout")).click();

//        close the browser
       // driver.quit();

    }
}


