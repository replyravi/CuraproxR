package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/LoginM.feature",
		glue="stepDefinationsLogin", tags= "@Login",
        plugin= {"pretty", "html:target/CuraproxProLoginAfrica.html", "json:target/CuraproxProLoginAfrica.json", "junit:target/CuraproxProLoginAfrica.xml"})
public class TestRunnerLoginSouthAfrica {

}
    