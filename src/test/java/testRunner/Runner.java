package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/features/"},
        dryRun = !true,
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        glue = {"Steps", "hooks"},
        plugin = {"pretty", "html:CucumberReports", "json:reports/result.json", "junit:reports/result.xml"},
        tags = {"@one"}
//        tags = {"@smoke"}
//        tags = {"not @smoke"} executes all but @smoke
//        tags = {"@reg"} executes all scenarios with reg
//        tags = {"@smoke and @reg"} executes scenarios with only both
)
public class Runner extends AbstractTestNGCucumberTests {
}
