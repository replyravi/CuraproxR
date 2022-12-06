package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/LessonComplete.feature",
		glue="lessonComplete", tags= "@lessonComplete",
        plugin= {"pretty", "html:target/LessonComplete.html", "json:target/LessonComplete.json", "junit:target/LessonComplete.xml"})
public class TestRunnerLessonComplete {

}
