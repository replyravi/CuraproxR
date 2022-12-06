package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/BuildInstallation.feature",
		glue="mainFunction", tags= "@build",
        plugin= {"pretty", "html:target/BuildInstallation.html", "json:target/BuildInstallation.json", "junit:target/BuildInstallation.xml"})
public class TestRunnerBuildInstallation {

}
