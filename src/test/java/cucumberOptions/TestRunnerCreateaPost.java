package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/CreateAPost.feature",
				
		glue="mainFunction", tags= "@createpost",
        plugin= {"pretty", "html:target/CreateAPost.html", "json:target/CreateAPost.json", "junit:target/CreateAPost.xml"})
public class TestRunnerCreateaPost {

}
