import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Dev/rest-testing-cucumber/src/test/resources/Feature/cucumber.feature:8"},
        plugin = {"json:C:/Dev/rest-testing-cucumber/target/cucumber-parallel/2.json"},
        monochrome = false,
        glue = {"com.baeldung.rest.cucumber"})
public class Parallel02IT {
}
