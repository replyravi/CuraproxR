package mainFunction;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import stepDefinations.Capab;

public class BuildInstal extends Capab{

	public BuildInstal() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^Open Browser$")
    public void open_browser() throws Throwable {
		driver.activateApp("com.android.chrome");

    }

    @Given("^Type build URL$")
    public void type_build_url() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Search or type web address\")").click();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Search or type web address\")").sendKeys("https://mqa.curaden.ch/cgi-bin/index.cgi");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		
    }

    @Then("^Click Curaprox Consumer Build Number$")
    public void click_curaprox_consumer_build_number() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	
    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[308,790][367,812]']")).click(); // Change which Build Number You Want to Install
    	
    	driver.activateApp("com.android.chrome");
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"File downloaded\")").getText();
    	driver.navigate().back();
    	
    }

    @Then("^Instal the build$")
    public void instal_the_build() throws Throwable {
    	
    	driver.activateApp("com.android.documentsui");// Folder Location
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"curaprox-app-affiliate-1.0.211.apk\")").click();// Change which Build Number You Want to Install
    	driver.findElementByAndroidUIAutomator("text(\"Continue\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"Install\")").click();
    }
}
