package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class MyHooks {
    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("Scenario name - Before Scenario");
        System.out.println(scenario.getName());
    }

    @BeforeStep
    public void beforeStep(Scenario scenario) {
        System.out.println("Scenario name - Before Scenario");
        System.out.println(scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        boolean failed = scenario.isFailed();
        System.out.println("is Failed? "+failed);
    }

    @AfterStep
    public void afterStep(Scenario scenario) {

    }
}
