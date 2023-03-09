package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/features/"},
        dryRun = !true,
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        glue = "Steps",
        plugin = {"pretty", "html:CucumberReports", "json:reports/result.json", "junit:reports/result.xml"}

)
public class Runner extends AbstractTestNGCucumberTests {
}
