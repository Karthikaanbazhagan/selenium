import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsExample {

    public static void main(String[] args) {
       
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");


        String currentWindowHandle = driver.getWindowHandle();

        
        WebElement link = driver.findElement(By.linkText("Open New Window"));
        link.click();
        Set<String> windowHandles = driver.getWindowHandles();

    
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        
        driver.switchTo().window(currentWindowHandle);

        
        driver.quit();
    }
}
