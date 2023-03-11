package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class LoginSteps extends DriverInit {
    @And("User click on the login button")
    public void userClickOnTheLoginButton() {
        driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
    }

    @When("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']//span[@class='mat-button-wrapper'][normalize-space()='Login']"))
                .click();
    }

    @Then("Login should be success")
    public void loginShouldBeSuccess() {
        WebElement userEle = driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[3]/span[1]"));
        String text = wait.until(ExpectedConditions.visibilityOf(userEle)).getText();
        System.out.println(text);

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



