package lessonComplete;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDefinations.Capab;
import stepDefinations.Loginfunction;

public class ProductPurchase extends Loginfunction {

	
	
	public ProductPurchase() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	 @When("^Login to Curoprox Pro application$")
	    public void login_to_curoprox_pro_application() throws Throwable {
	       super.loginfun();
	    }
	 @Given("^Click on shop option in below menu bar$")
	    public void click_on_shop_option_in_below_menu_bar() throws Throwable {
		 driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
		 driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[727,1677][785,1746]']")).click();
	    }
	 @Then("^Click on search box and search product Brush and select and product and click on it$")
	    public void click_on_search_box_and_search_product_brush_and_select_and_product_and_click_on_it() throws Throwable {
		 driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("text(\"Product name\")").click();
		 driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Product name\")").sendKeys("brush");
		// driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		 driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("text(\"CS 708 implant toothbrush\")").click();
	    }

	    @Then("^Click on buy now button$")
	    public void click_on_buy_now_button() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"BUY NOW\")").click();
	    }

	    @Then("^Click on buy now button with quantity$")
	    public void click_on_buy_now_button_with_quantity() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"BUY NOW\"));");
	    	//driver.findElementByAndroidUIAutomator("text(\"BUY NOW\")").click();
	    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[434,1695][646,1760]']")).click();
	    }

	    @Then("^Scroll down till Place Order button shown the click on it$")
	    public void scroll_down_till_place_order_button_shown_the_click_on_it() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PLACE ORDER\"));");
	    	driver.findElementByAndroidUIAutomator("text(\"PLACE ORDER\")").click();
	        
	    }
	   /*  This code no need because it's only go to payment link page
	      @Given("^Click on card payment details$")
	    
	    public void click_on_card_payment_details() throws Throwable {
	    	
	        
	    }
	    @Then("^Enter all payment details and click on paynow button$")
	    public void enter_all_payment_details_and_click_on_paynow_button() throws Throwable {
	        
	    }

	    @Then("^Click on continue shopping$")
	    public void click_on_continue_shopping() throws Throwable {
	       
	    }

	    @Then("^Logout to Curoprox Pro application$")
	    public void logout_to_curoprox_pro_application() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	//driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
	    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[943,1677][1001,1746]']")).click();
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Log Out\").instance(0))");
	    	driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
	    }
	   */ 
	}	

