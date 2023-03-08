package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/features/addToCart.feature"},
        dryRun = !true,
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        glue = "Steps"

)
public class Runner extends AbstractTestNGCucumberTests {
}
