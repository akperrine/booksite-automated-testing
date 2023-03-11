package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MyHooks extends DriverInit{


    @Before
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

    @After
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
