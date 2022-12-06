package mainFunction;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import stepDefinations.Loginfunction;

public class CreateaPost extends Loginfunction {

	public CreateaPost() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
    @Given("^Login to Curaprox for create a post$")
    public void login_to_curaprox_for_create_a_post() throws Throwable {
    	super.loginfun();
		System.out.println("Hello test");
    }

    @Given("^Home Screen open and navigate to create a post click on it$")
    public void home_screen_open_and_navigate_to_create_a_post_click_on_it() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"CREATE A POST\").instance(0))");
    	driver.findElementByAndroidUIAutomator("text(\"CREATE A POST\")").getText();
    	driver.findElementByAndroidUIAutomator("text(\"CREATE A POST\")").click();
    }

    @Given("^Create new campaign page open and fill all the information$")
    public void create_new_campaign_page_open_and_fill_all_the_information() throws Throwable {
    	driver.findElementByAndroidUIAutomator("text(\"Max 25 characters\")").sendKeys("Demo");
    	driver.findElementByAndroidUIAutomator("text(\"Max 30 characters\")").sendKeys("Post");
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Add description here (Max 160 characters-spaces of the alphabet, number, punctunation all count toward a character limit)\")").sendKeys("Test description here");
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Max 90 characters\").instance(0))");
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Max 90 characters\")").sendKeys("CAMPAIGN Test");
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Add description here (Max 3,000 characters-spaces letters of the alphabet, number, and punctuation all count toward a character limit)\").instance(0))");
    	driver.findElementByAndroidUIAutomator("text(\"Add description here (Max 3,000 characters-spaces letters of the alphabet, number, and punctuation all count toward a character limit)\")").sendKeys("CAMPAIGN DESCRIPTION Test");
    	
    
    }

    @Given("^Navigate to publish section and click on it$")
    public void navigate_to_publish_section_and_click_on_it() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"PUBLISH\").instance(0))");
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	//TouchAction touchAction = new TouchAction(driver);
		//touchAction.tap(new PointOption().withCoordinates(457,1468)).perform();
    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[457,1468][624,1533]")).click();
    	try {
		    driver.findElement(MobileBy.AndroidUIAutomator(
		            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
		} catch (InvalidSelectorException e) {
		    // ignore
		}
    	driver.findElementByAndroidUIAutomator("text(\"PUBLISH\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"PUBLISH\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"PUBLISH\")").click();
    }

    @Then("^Click on my account option and log out for create post section$")
    public void click_on_my_account_option_and_log_out_for_create_post_section() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    
    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[943,1677][1001,1746]']")).click();
    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Log Out\").instance(0))");
    	driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
    }
}
