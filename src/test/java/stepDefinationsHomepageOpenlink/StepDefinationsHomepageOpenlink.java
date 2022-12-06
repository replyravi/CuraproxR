package stepDefinationsHomepageOpenlink;




import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Duration;




public class StepDefinationsHomepageOpenlink extends Base {
	
	
	public AndroidDriver <AndroidElement>driver =capabilities();
	public StepDefinationsHomepageOpenlink() throws MalformedURLException {}
	
	 @Given("^Select South Africa$")
	    public void select_south_africa() throws Throwable {
		 driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("text(\"South Africa\")").click();
	    }

	    @Given("^Tab Next button$")
	    public void tab_next_button() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
	    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
	    
	    }

	    @Given("^Click on Sign In$")
	    public void click_on_sign_in() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click();
	    	
	    }
	    @And("^type email and password with (.+) and (.+)$")
	    public void type_email_and_password_with_and(String email, String password) throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"Email\")").sendKeys(email);
	    	driver.findElementByAndroidUIAutomator("text(\"Password\")").sendKeys(password);
	    	System.out.println(email);
}
	    

	    @Then("^Click on Login$")
	    public void click_on_login() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	//driver.findElementByAndroidUIAutomator("text(\"LOGIN\")").click();
	    	//driver.findElement(By.xpath("//android.view.ViewGroup[9]")).click();
	    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[470,877][610,942]']")).click();
	    } 
	    

	    @Given("^Click on Education$")
	    public void Click_on_Education() throws Throwable {
	        
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"Education\")").click();
	    }

	    @Given("^Click on PatientCenter$")
	    public void Click_on_PatientCenter() throws Throwable {
	    	
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"PatientCenter\")").click();
	    }

	    @Given("^Click on Shop$")
	    public void Click_on_Shop() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"Shop\")").click();
	    	//driver.findElementByAndroidUIAutomator("text(\"Home\")").click();
	    }

	    @Then("^Click on My Account option for logout$")
	    public void Click_on_My_Account_option_for_logout() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"My Account\"));");
	    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
	    	driver.findElementByAndroidUIAutomator("text(\"My Profile\")");
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	new TouchAction(driver).press(PointOption.point(550, 640)).waitAction().moveTo(PointOption.point(550, 0)).release().perform();
	    	driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
	    }
	    
}