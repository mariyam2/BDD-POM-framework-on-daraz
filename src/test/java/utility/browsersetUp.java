package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browsersetUp {
    public static WebDriver driver;
    public static ChromeOptions options;
    public browsersetUp(){
    	WebDriverManager.chromedriver().browserVersion("119.0.6045.105").setup();
        options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "src/main/java/chromedriver-win64/chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        this.driver = new ChromeDriver();
        driver.get("https://www.daraz.pk/");
        driver.manage().window().maximize();
        System.out.println("I am inside Before Step and opening the browser");
    }

    public void quit() {
//        System.setProperty("webdriver.chrome.logfile", "/path/to/chromedriver.log");
//        System.setProperty("webdriver.chrome.verboseLogging", "true");
        this.driver.quit();
    }
}

