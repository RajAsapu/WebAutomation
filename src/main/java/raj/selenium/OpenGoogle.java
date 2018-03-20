package raj.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
    public static void main(String[] args)throws Exception{
        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        Thread.sleep(10000);
        driver.close();
    }
}
