package TestNG.Frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");
        driver.switchTo().frame(0);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-name-or-id");
        driver.switchTo().defaultContent();
        driver.quit();
    }
}