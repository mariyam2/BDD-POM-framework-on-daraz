package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static browsersetUp driver;
    public static ChromeOptions options;
    @Before
    public void setUp(){
        driver = new browsersetUp();
    }
    @After
    public void tearDown() {
        driver.quit();
        System.out.println("I am inside After Step and Closing the browser");
    }

}
