package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AddToCartSteps extends DriverInit {

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
        WebElement searchOption = driver.findElement(By.xpath("//span[@class='mat-option-text']"));
        WebElement options = wait.until(ExpectedConditions.visibilityOf(searchOption));
        options.click();
    }

    @When("user adds the book to the cart")
    public void userAddsTheBookToTheCart() throws InterruptedException {
       driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div/app-book-card/mat-card/mat-card-content[2]/app-addtocart/button"))
               .click();
           Thread.sleep(2000);

    }

    @Then("the cart badge should get updated")
    public void theCartBadgeShouldGetUpdated() {
        WebElement snackbar = driver.findElement(By.tagName("snack-bar-container"));
        wait.until(ExpectedConditions.visibilityOf(snackbar));
        wait.until(ExpectedConditions.invisibilityOf(snackbar));
        String text = driver.findElement(By.xpath("//*[@id=\"mat-badge-content-0\"]"))
                .getText();
        System.out.println("No. of books in cart: " + text);
        Assert.assertEquals(Integer.parseInt(text) > 0, true);
    }

}
