package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/ProductPurchase.feature",
		glue="lessonComplete", tags= "@Productpurchase",
        plugin= {"pretty", "html:target/ProductPurchase.html", "json:target/ProductPurchase.json", "junit:target/ProductPurchase.xml"})
public class TestRunnerProductPurchase {

}
