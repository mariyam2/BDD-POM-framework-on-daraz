package StepDefinition;

import static Pages.LoginPage.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginStepdefs {

    @Given("^User Logins with (.*) and (.*)$")
    public void userLoginsWithUsernameAndPassword(String uname, String pwd) throws InterruptedException {
        loginmethod(uname, pwd);

    }

    @Then("User is on Product Page")
    public void userIsOnProductPage() throws InterruptedException {
        verify_loginstatus();

    }
}