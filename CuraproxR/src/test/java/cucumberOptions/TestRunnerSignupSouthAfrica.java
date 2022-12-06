package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/SignupSouthafrica.feature",
		glue="stepDefinations", tags= "@SignupSouthAfrica",
        plugin= {"pretty", "html:target/SignupSouthAfrica.html", "json:target/SignupSouthAfrica.json", "junit:target/SignupSouthAfrica.xml"})
public class TestRunnerSignupSouthAfrica {

}