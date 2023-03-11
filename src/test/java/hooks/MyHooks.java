package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class MyHooks extends DriverInit{

    @After(value = "@cleanCart", order = 2)
    public void cleanUp() {
        System.out.println("happened");
        driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[1]/span[1]/mat-icon"))
                .click();
        driver.findElement(By.xpath("/html/body/app-root/div/app-shoppingcart/div/mat-card/table/tbody/tr/mat-card-content/td[6]/button"))
                .click();
        String text = driver.findElement(By.xpath("/html/body/app-root/div/app-shoppingcart/div/mat-card/mat-card-title")).getText();
        Assert.assertEquals(text, "Shopping cart is empty");
    }

    @Before(order = 1)
    public void beforeSenarioOne() {
        System.out.println("Im in before ScenariorOne");
    }
    @Before(order = 2)
    public void beforeScenario(Scenario scenario) {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://bookcart.azurewebsites.net/");
        WebDriver.Options manage = driver.manage();
        manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        manage.window().maximize();
        System.out.println(driver.getTitle());
    }

    @BeforeStep
    public void beforeStep(Scenario scenario) {
    }

    @After(order = 1)
    public void afterScenario(Scenario scenario) {
        boolean failed = scenario.isFailed();
        System.out.println("is Failed? "+ failed);
        if(failed) {
           byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
           scenario.embed(screenshotAs, "image/png");
        }

        driver.quit();
    }

    @AfterStep
    public void afterStep(Scenario scenario) {

    }
}
