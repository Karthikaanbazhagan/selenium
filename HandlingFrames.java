package TestNG.Frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingExample {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "https://www.codido.co/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");

        
        WebElement iframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);

        
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("Hello, world!");

        
        driver.switchTo().defaultContent();

       
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        
        driver.quit();
    }

}


   
