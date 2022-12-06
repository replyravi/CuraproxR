package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/LoginSlov.feature",
		glue="stepDefinationsLogin", tags= "@LoginSlovenia",
        plugin= {"pretty", "html:target/cucumberLogin.html", "json:target/cucumberLogin.json", "junit:target/cukesLogin.xml"})
public class TestRunnerLogin {

}
    