package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;

    @Given("User navigates to the BookCart application login")
    public void userNavigatesToTheBookCartApplicationLogin() {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://bookcart.azurewebsites.net/");
        WebDriver.Options manage = driver.manage();
        manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        manage.window().maximize();
        System.out.println(driver.getTitle());
    }

    @And("User click on the login button")
    public void userClickOnTheLoginButton() {
        driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
    }

//    @And("User enters the username as akperrine")
//    public void userEntersTheUsernameAs() {
//        driver.findElement(By.xpath("//input[@id='mat-input-0']"))
//                .sendKeys("akperrine");
//    }
//
//    @And("User enters the password as Practice1234")
//    public void userEntersThePasswordAs() {
//        driver.findElement(By.xpath("//input[@id='mat-input-1']"))
//                .sendKeys("Practice123");
//    }

    @When("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']//span[@class='mat-button-wrapper'][normalize-space()='Login']"))
                .click();
    }

    @Then("Login should be success")
    public void loginShouldBeSuccess() {
        String text = driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[3]/span[1]"))
                .getText();
        System.out.println(text);

        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
        }
        driver.quit();
    }

//    @Given("User enters the username as ak")
//    public void userEntersTheUsernameAsAk() {
//        driver.findElement(By.xpath("//input[@id='mat-input-0']"))
//                .sendKeys("ak");
//    }
//
//    @Given("User enters the password as 123")
//    public void userEntersThePasswordAs123() {
//        driver.findElement(By.xpath("//input[@id='mat-input-1']"))
//                .sendKeys("123");
//    }

    @Then("Login should fail")
    public void loginShouldFail() {
        String text = driver.findElement(By.xpath("//*[@id=\"mat-error-0\"]"))
                .getText();
        System.out.println(text);
        Assert.assertEquals(text.trim(), "Username or Password is incorrect." );
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
        }
        driver.quit();
    }

    @Given("User enters the username as {string}")
    public void userEntersTheUsernameAs(String username) {
        driver.findElement(By.xpath("//input[@id='mat-input-0']"))
                .sendKeys(username);
    }

    @Given("User enters the password as {string}")
    public void userEntersThePasswordAs(String password) {
        driver.findElement(By.xpath("//input[@id='mat-input-1']"))
                .sendKeys(password);
    }
    }



