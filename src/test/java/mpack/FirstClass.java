package mpack;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstClass {


    @Test
    public void OpenBrowser()  {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
         options.addArguments("headless");
         options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }


}
