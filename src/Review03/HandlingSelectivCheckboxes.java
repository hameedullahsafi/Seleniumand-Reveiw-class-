package Review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingSelectivCheckboxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        List<WebElement> days = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
       // for (WebElement day:days)
       // if (day.getAttribute("id").equalsIgnoreCase("tuesday")||day.getAttribute("id").equalsIgnoreCase("thursday"))
    }

}
