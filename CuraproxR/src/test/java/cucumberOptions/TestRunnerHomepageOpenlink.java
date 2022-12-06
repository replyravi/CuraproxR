package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Homepageopenlink.feature",
				
		glue="stepDefinationsHomepageOpenlink", tags= "@HomepageOpenlink",
        plugin= {"pretty", "html:target/HomepageOpenlink.html", "json:target/HomepageOpenlink.json", "junit:target/HomepageOpenlink.xml"})
public class TestRunnerHomepageOpenlink {

}
