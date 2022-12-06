package stepDefinationsLogin;




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




public class Loginstepdefinations extends Base {
	
	
	public AndroidDriver <AndroidElement>driver =capabilities();
	public Loginstepdefinations() throws MalformedURLException {}
	
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

	    @Then("^Click on three line top left side of the app$")
	    public void click_on_three_line_top_left_side_of_the_app() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
	    	// driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).click();
	    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[969,126][1038,250]']")).click();
	   
	    }

	    @Then("^Click on Logout$")
	    public void click_on_logout() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"My Profile\")").getTagName();
	    	 //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Log Out\"));");
	    	new TouchAction(driver).press(PointOption.point(550, 640)).waitAction().moveTo(PointOption.point(550, 0)).release().perform();
	    	driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
	    }
	    
	    
/* Login Code for Slovenia */	    
	    
	    @Given("^Select Slovenia$")
	    public void select_Slovenia() throws Throwable {
		 driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("text(\"Slovenia\")").click();
	    }

	    @Given("^Tab Next button Slovenia$")
	    public void tab_next_button_Slovenia() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
	    	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
	    
	    }

	    @Given("^Click on Sign In Slovenia$")
	    public void click_on_sign_in_Slovenia() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"Vpišite se\")").click();
	    	
	    }
	    @And("^Slovenia type email and password with (.+) and (.+)$")
	    public void Slovenia_type_email_and_password_with_and(String email, String password) throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"E-pošta\")").sendKeys(email);
	    	driver.findElementByAndroidUIAutomator("text(\"Geslo\")").sendKeys(password);
	    	System.out.println(email);
}
	    

	    @Then("^Click on Login Slovenia$")
	    public void click_on_login_Slovenia() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	//driver.findElementByAndroidUIAutomator("text(\"LOGIN\")").click();
	    	//driver.findElement(By.xpath("//android.view.ViewGroup[9]")).click();
	    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[459,877][622,942]']")).click();
	    }

	    @Then("^Click on my account in app Slovenia$")
	    public void click_on_three_line_top_left_side_of_the_app_Slovenia() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	//driver.findElementByAndroidUIAutomator("text(\".\")").click();
	    	// driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).click();
	    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[969,126][1038,250]']")).click();
	    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
	 
	    }

	    @Then("^Click on Logout Slovenia$")
	    public void click_on_logout_Slovenia() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"My Profile\")").getTagName();
	    	 //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Find us on Social Media\"));");
	    	new TouchAction(driver).press(PointOption.point(550, 640)).waitAction().moveTo(PointOption.point(550, 0)).release().perform();
	        driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
	    
	    }
	    
	    
	    
	    /* Login Code for Netherlands */	  
	    
	    
	    @Given("^Select Netherlands$")
	    public void select_Netherlands() throws Throwable {
		 driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("text(\"Netherlands\")").click();
	    }

	    @Given("^Tab Next button Netherlands$")
	    public void tab_next_button_Netherlands() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
	    	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
	    
	    }

	    @Given("^Click on Sign In Netherlands$")
	    public void click_on_sign_in_Netherlands() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"Inloggen\")").click();
	    	
	    }
	    @And("^Netherlands type email and password with (.+) and (.+)$")
	    public void Netherlands_type_email_and_password_with_and(String email, String password) throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"E-mail\")").sendKeys(email);
	    	driver.findElementByAndroidUIAutomator("text(\"Wachtwoord\")").sendKeys(password);
	    	System.out.println(email);
}
	    

	    @Then("^Click on Login Netherlands$")
	    public void click_on_login_Netherlands() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	//driver.findElementByAndroidUIAutomator("text(\"LOGIN\")").click();
	    	//driver.findElement(By.xpath("//android.view.ViewGroup[9]")).click();
	    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[422,877][658,942]']")).click();
	    }

	    @Then("^Click on my account in app Netherlands$")
	    public void click_on_three_line_top_left_side_of_the_app_Netherlands() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	//driver.findElementByAndroidUIAutomator("text(\".\")").click();
	    	// driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).click();
	    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[969,126][1038,250]']")).click();
	    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
	 
	    }

	    @Then("^Click on Logout Netherlands$")
	    public void click_on_logout_Netherlands() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"My Profile\")").getTagName();
	    	 //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Find us on Social Media\"));");
	    	new TouchAction(driver).press(PointOption.point(550, 640)).waitAction().moveTo(PointOption.point(550, 0)).release().perform();
	        driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
	    
	    }
	    
	    
	    /* Same mail deletion 
	    
	    
	    @Given("^Open mymail application$")
	    public void open_mymail_application() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
	    	driver.activateApp("com.my.mail");	
	    	driver.manage().timeouts().implicitlyWait(950, TimeUnit.SECONDS);
	    	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"no-reply@surgeonmate.com\"));");
	    }

	    @Given("^Select all same name mail$")
	    public void select_all_same_name_mail() throws Throwable {
	    	List<AndroidElement> dd = driver.findElementsByAndroidUIAutomator("text(\"no-reply@surgeonmate.com\")");
	    
	    	 for(AndroidElement emailsub : dd){
		    	    if(emailsub.getText().equals("no-reply@surgeonmate.com") == true){

		    	    	System.out.println("I am tester");
		    	    	System.out.println(dd.size());
		    	    	
		    	 
		    	    	
		    	           break;
		    	        }
		    	    }  
	    	 */
	    /*	
	      for(int i=0; i<dd.size(); i++)
	    	{
	             dd.get(i);
	             
	    		System.out.println(dd.get(i));
	    		System.out.println(dd.get(i).getText().toString());
	    	}
	      
	      
	      List<WebElement> customer_name= ds.findElements(By.id(ivs.customer_list_name));
	      <br/> for(int i=0;i<customer_name.size();i++) <br/>{<br/> <br/>System.out.println(customer_name.get(i).getText().toString()); <br/>}
	      
	      
	     
	    	    
	    	    */
	    

	    
	 
}