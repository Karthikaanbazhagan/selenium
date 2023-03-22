import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsExample {

    public static void main(String[] args) {
        // set system property for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // create ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // navigate to website with multiple windows
        driver.get("https://www.example.com");

        // get window handle of current window
        String currentWindowHandle = driver.getWindowHandle();

        // locate link that opens new window
        WebElement link = driver.findElement(By.linkText("Open New Window"));

        // click link to open new window
        link.click();

        // get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // loop through all window handles and switch to new window
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // do some actions on new window
        // ...

        // switch back to original window
        driver.switchTo().window(currentWindowHandle);

        // close driver instance
        driver.quit();
    }
}
