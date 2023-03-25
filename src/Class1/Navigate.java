package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        // connect to webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
       // initate the instance of WebDriver
        WebDriver driver=new ChromeDriver();
       // open google.com
        driver.get("https://google.com");
       // slow down
        Thread.sleep(2000);
        // now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        // go back
        driver.navigate().back();
        Thread.sleep(2000);

        //go to facebook
        driver.navigate().forward();
       // refresh the page
        driver.navigate().refresh();
        driver.close();



    }
}
