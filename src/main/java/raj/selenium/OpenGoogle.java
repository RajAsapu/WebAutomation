package raj.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
    public static void main(String[] args)throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\asapu\\OneDrive\\Pictures\\Test Automation\\WebAutomation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        /*
         * Identifiers(8)
         * ---------------------
         * name
         * className
         * id
         * linkText
         * partialLinkText
         *
         * xpath
         * cssSelector
         * tagName
         */
        driver.findElement(By.className("gsfi")).sendKeys("Minnesota");
        driver.findElement(By.className("gsfi")).submit();
        driver.findElement(By.partialLinkText("Wikipedia")).click();
        driver.findElement(By.linkText("state")).click();
        Thread.sleep(10000);
        driver.close();
    }
}
