package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Notificationssee.feature",
		glue="mainFunction", tags= "@notifications",
        plugin= {"pretty", "html:target/Notificationssee.html", "json:target/Notificationssee.json", "junit:target/Notificationssee.xml"})
public class TestRunnerAllnotification {

}
