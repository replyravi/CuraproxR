package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/ReadDailyArticle.feature",
		glue="mainFunction", tags= "@DailyRead",
        plugin= {"pretty", "html:target/ReadDailyArticle.html", "json:target/ReadDailyArticle.json", "junit:target/ReadDailyArticle.xml"})
public class TestRunnerdDilyreadArticle {

}
