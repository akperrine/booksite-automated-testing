package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AddToCartSteps {

    WebDriver driver;

    @Given("User navigates to the BookCart application")
    public void userNavigatesToTheBookCartApplication() {
//        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://bookcart.azurewebsites.net/");
        WebDriver.Options manage = driver.manage();
        manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        manage.window().maximize();
        System.out.println(driver.getTitle());
    }
    @Given("user login into the application with {string} {string}")
    public void userLoginIntoTheApplicationWith(String uname, String pword) {
        driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//input[@id='mat-input-0']"))
                .sendKeys(uname);
        driver.findElement(By.xpath("//input[@id='mat-input-1']"))
                .sendKeys(pword);

    }

    @Given("user searches for a book {string}")
    public void userSearchesForABook(String bookname) {
        driver.findElement(By.xpath("//input[@placeholder='Search books or authors']")).sendKeys(bookname);
        driver.findElement(By.xpath("//span[@class='mat-option-text']")).click();
    }

    @When("user adds the book to the cart")
    public void userAddsTheBookToTheCart() throws InterruptedException {
       driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div/app-book-card/mat-card/mat-card-content[2]/app-addtocart/button"))
               .click();
           Thread.sleep(2000);

    }

    @Then("the cart badge should get updated")
    public void theCartBadgeShouldGetUpdated() {
        String text = driver.findElement(By.xpath("//*[@id=\"mat-badge-content-0\"]"))
                .getText();
        Assert.assertEquals(Integer.parseInt(text) > 0, true);

        driver.quit();
    }

}
