package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Signuptestslovenia.feature",
		glue="stepDefinations", tags= "@SignuptestSlovenia",
        plugin= {"pretty", "html:target/SignuptestNetherlands.html", "json:target/SignuptestNetherlands.json", "junit:target/SignuptestNetherlands.xml"})
public class TestRunnerSignuptestSlovenia {

}