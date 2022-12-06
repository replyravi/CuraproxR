package stepDefinations;



import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Duration;





//@RunWith(Cucumber.class)
public class Stepdefination extends Base{
	public AndroidDriver <AndroidElement>driver =capabilities();
	
	//DesiredCapabilities cap = new DesiredCapabilities();
	
	//AndroidDriver <AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.2:4723/wd/hub"),cap);
	public Stepdefination() throws MalformedURLException {}
	
	@Given("^Open the curaprox consumer application and  Select the country as South Africa$")
	 public void open_the_curaprox_consumer_application_and_select_the_country_as_south_africa() throws Throwable {
		 
   // AndroidDriver <AndroidElement>driver =capabilities();
    
    	//AndroidDriver <AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.2:4723/wd/hub"),cap);
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	
    	driver.findElementByAndroidUIAutomator("text(\"South Africa\")").click();
    	//driver.startActivity(new Activity("com.wt.apkinfo","com.wt.apkinfo.activities.StartActivity"));
    	//driver.activateApp("com.wt.apkinfo");
    	
    	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"myMail\"));");
    	//driver.findElementByAndroidUIAutomator("text(\"myMail\")").click();
    	//driver.findElement(By.xpath("//android.widget.ImageView[4]")).click();
    	
    		
    }

    @And("^Tab Next button$")
    public void tab_next_button() throws Throwable {
    	
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
    
    
    	
    } 

    @And("^Click on register new practice$")
    public void click_on_register_new_practice() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Register new practice\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"Allow only while using the app\")").click();
    }
    @Then("^type location in search location for Southafrica and select location$")
    public void type_location_in_search_location_for_southafrica_and_select_location() throws Throwable {
    	driver.findElementByAndroidUIAutomator("text(\"Search location\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"Search location\")").sendKeys("1676, south africa");
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"1676 South Africa Loop, Far East Bank, Sandton, South Africa\")").click();
  // driver.pressKey(new KeyEvent(AndroidKey.ENTER));
 
   
   // driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    
    	//driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    driver.findElement(By.xpath("//android.view.View[@content-desc='Google Map']")).getTagName();
   
    driver.findElement(By.xpath("//android.view.View[@content-desc='Google Map']")).click();
   
    	//driver.findElement(By.xpath("//android.view.View[0]")).click();
    	
    	

       
    	
    }

    @And("^Click conformation location$")
    public void click_conformation_location() throws Throwable {
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	 driver.findElementByAndroidUIAutomator("text(\"CONFIRM LOCATION\")").getText();
    	driver.findElementByAndroidUIAutomator("text(\"CONFIRM LOCATION\")").click();
    }

    @And("Enter signup details")
    public void enter_signup_details(io.cucumber.datatable.DataTable dataTable) {
    	
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	
    	/* Implements new code for random data */ 
    	driver.findElementByAndroidUIAutomator("text(\"Practice Name\")").sendKeys("demoravi");
    	Random randomEmail = new Random();
    	 int randomInt = randomEmail.nextInt(10000);
        driver.findElementByAndroidUIAutomator("text(\"Phone No.\")").sendKeys("1"+randomInt+"1");
    	
    	/* Implements new code for static data */ 
    	/*
    	 List<List<String>> obj=dataTable.asLists();
        driver.findElementByAndroidUIAutomator("text(\"Practice Name\")").sendKeys(obj.get(0).get(0));
        driver.findElementByAndroidUIAutomator("text(\"Phone No.\")").sendKeys(obj.get(0).get(1));
          */
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
        driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        //System.out.println(obj.get(0).get(0));
     
        //throw new io.cucumber.java.PendingException();
    }
    
    
    @Then("^Enter register your account details$")
    public void enter_register_your_account_details() throws Throwable  {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     
       driver.findElementByAndroidUIAutomator("text(\"First Name\")").sendKeys("demo");
       driver.findElementByAndroidUIAutomator("text(\"Last Name\")").sendKeys("test");
       
    }
    @And("^Click on I am a dental professional$")
    public void click_on_i_am_a_dental_professional() throws Throwable {
    	driver.findElementByAndroidUIAutomator("text(\"I am a dental professional\")").click();
    }

    @And("type details more for register your account details")
    public void type_details_more_for_register_your_account_details(io.cucumber.datatable.DataTable dataTable) throws Throwable {
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	 /* Implements new code for random data */ 
    	 Random randomEmail = new Random();
    	 int randomInt = randomEmail.nextInt(10000);
        driver.findElementByAndroidUIAutomator("text(\"Dental Professional No.\")").sendKeys("1"+randomInt+"1");
        /* Implements new code for static data */ 
        /*
    	List<List<String>> obj=dataTable.asLists();
    	driver.findElementByAndroidUIAutomator("text(\"Dental Professional No.\")").sendKeys(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(0));
    	*/
    }
    
    /* For Dynamic user id and password */
    

    @And("^type email and password with email and password$")
    public void type_email_and_password_with_email_and_password() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	Random randomEmail = new Random();
   	 int randomInt = randomEmail.nextInt(10000);
    	driver.findElementByAndroidUIAutomator("text(\"Email\")").sendKeys("curatest+rzsa"+randomInt+"@morphos.is");
    	driver.findElementByAndroidUIAutomator("text(\"Password\")").sendKeys("Ringzero123");
    }

/* This code for static email and password*/
  /*  @And("^type email and password with (.+) and (.+)$")
    public void type_email_and_password_with_and(String email, String password) throws Throwable {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Email\")").sendKeys(email);
    	driver.findElementByAndroidUIAutomator("text(\"Password\")").sendKeys(password);
    	System.out.println(email);
    	
    }
*/
    @And("^Click next button$")
    public void click_next_button() throws Throwable {
    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
       
    }

    @And("^Accept the terms and condition$")
    public void accept_the_terms_and_condition() throws Throwable {
    	driver.findElementByAndroidUIAutomator("text(\"ACCEPT\")").click();
    	System.out.println("Done Second last"); 
    	//driver.resetApp(); // Reset the currently running app for this session
    	
    	
    }

    @And("^open gmail and conform the link$")
    public void open_gmail_and_conform_the_link() throws Throwable 
    { 
        	//AndroidDriver <AndroidElement>driver1 =gmailcapabilities();
    	//driver.startActivity(new Activity("com.my.mail","ru.mail.ui.writemail.FeedbackActivity"));
        	driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
    	driver.activateApp("com.my.mail");	
    	driver.manage().timeouts().implicitlyWait(950, TimeUnit.SECONDS);
        	driver.findElementByAndroidUIAutomator("text(\"Curaprox Pro app, Email Confirmation\")").click();
        	 driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        	 driver.findElementByAndroidUIAutomator("text(\"Confirm email\")").click();
        	// System.out.println("All test pass");
        	 //driver1.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
        	 //driver1.closeApp();
        	 driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
        	
        	//driver.startActivity(new Activity("ag.curaden.curaprox.affiliate","ag.curaden.curaprox.affiliate.MainActivity"));
        	// ((StartsActivity)driver).currentActivity();
        	 //driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        	 //driver.findElementByAndroidUIAutomator("text(\"No, I have not being referred by anyone\")").click();
    } 
    
    @Then("^Curaprox app open and click not referal option$")
    public void curaprox_app_open_and_click_not_referal_option() throws Throwable {
    	 
    	// ((StartsActivity)driver).currentActivity();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"No, I have not being referred by anyone\")").click();
    }
 
    @And("^Your account iscreated metion comes then click next$")
    public void your_account_iscreated_metion_comes_then_click_next() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	
    	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[486,1568][595,1633]']")).click();
    	// driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
    	//driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	// driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
    	 
    	/* AndroidElement element = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,‘NEXT’)]"));
    			 if (element != null) {
    			 element.click();
    			 } else {
    			 System.out.println("text not present");
    			 }*/
   // driver.findElement(By.xpath("//android.view.ViewGroup[@index='1']")).click();
    	
    	//AndroidElement elements = driver.findElement(By.className("android.widget.TextView"));
       
        
             
    }
    @And("^Click skip do later$")
    public void click_skip_do_later() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Skip or I'll do later\")").click();
    }
    
    @Then("^Click on practice open hours$")
    public void click_on_practice_open_hours() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Monday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Tuesday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Wednesday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Thursday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Friday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Saturday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Sunday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ADD OPEN HOURS\"));");
    	
    	driver.findElementByAndroidUIAutomator("text(\"ADD OPEN HOURS\")").click();
    }
    
    @Then("^Enter description and click confirm$")
    public void enter_description_and_click_confirm() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Add description here (optional)\")").sendKeys("Hello this is test description");
    	driver.findElementByAndroidUIAutomator("text(\"CONFIRM\")").click();
    	
    }
    
    @Then("^Select dental professional specialty$")
    public void select_dental_professional_specialty() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"General Dentist\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Oral Hygienist\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Dental Therapist\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Dental Nurse\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Orthodontist\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Implantologist\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Prostodontist\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
       	driver.findElementByAndroidUIAutomator("text(\"Periodontist\")").click();
       	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
       	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Endodontist\"));");
    	driver.findElementByAndroidUIAutomator("text(\"Endodontist\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"CONFIRM\"));");
    	
    	driver.findElementByAndroidUIAutomator("text(\"CONFIRM\")").click();
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Skip or I'll do later\"));");
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Skip or I'll do later\")").click();
    	
    }

    
    @And("^Select working hours$")
    public void select_working_hours() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Monday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Tuesday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Wednesday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Thursday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Friday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Saturday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Sunday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Sunday\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ADD WORKING HOURS\"));");
    	driver.findElementByAndroidUIAutomator("text(\"ADD WORKING HOURS\")").click();
    }

    
    @Then("^Click on chat settings$")
    public void click_on_chat_settings() throws Throwable {
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"CONFIRM\"));");
    	driver.findElementByAndroidUIAutomator("text(\"CONFIRM\")").click();
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
    }
    
    /* Signup Code for Slovenia */
    
    
    @Given("^Open the curaprox consumer application and  Select the country as Slovenia$")
	 public void open_the_curaprox_consumer_application_and_select_the_country_as_Slovenia() throws Throwable {
		 
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Slovenia\")").click();
   
   	
   		
   }

   @And("^Tab Next button Slovenia$")
   public void tab_next_button_Slovenia() throws Throwable {
   	
   	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
   	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
   	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
   
   
   	
   } 

   @And("^Click on register new practice Slovenia$")
   public void click_on_register_new_practice_Slovenia() throws Throwable {
   	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Registrirajte novo ordinacijo\")").click();
   	driver.findElementByAndroidUIAutomator("text(\"Allow only while using the app\")").click();
   }
   @Then("^type location in search location for Slovenia and select location Slovenia$")
   public void type_location_in_search_location_for_Slovenia_and_select_location_Slovenia() throws Throwable {
   	driver.findElementByAndroidUIAutomator("text(\"Iskanje lokacije\")").click();
   	driver.findElementByAndroidUIAutomator("text(\"Iskanje lokacije\")").sendKeys("Moto set, Dunajska cesta, Prevoje pri Šentvidu");
   	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Moto set, Dunajska cesta, Prevoje pri Šentvidu, Slovenia\")").click();
 
   driver.findElement(By.xpath("//android.view.View[@content-desc='Google Map']")).getTagName();
  
   driver.findElement(By.xpath("//android.view.View[@content-desc='Google Map']")).click();
   	
   }

   @And("^Click conformation location Slovenia$")
   public void click_conformation_location_Slovenia() throws Throwable {
   	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	 driver.findElementByAndroidUIAutomator("text(\"POTRDITE LOKACIJO\")").getText();
   	driver.findElementByAndroidUIAutomator("text(\"POTRDITE LOKACIJO\")").click();
   }

   @And("Enter signup details Slovenia")
   public void enter_signup_details_Slovenia(io.cucumber.datatable.DataTable dataTable) {
   	
   	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	
   	/* Implements new code for random data */ 
   	driver.findElementByAndroidUIAutomator("text(\"Ime prakse\")").sendKeys("demotest");
   	Random randomEmail = new Random();
   	 int randomInt = randomEmail.nextInt(10000);
       driver.findElementByAndroidUIAutomator("text(\"Telefonska št.\")").sendKeys("1"+randomInt+"1");
   	
   	/* Implements new code for static data */ 
   	/*
   	 List<List<String>> obj=dataTable.asLists();
       driver.findElementByAndroidUIAutomator("text(\"Practice Name\")").sendKeys(obj.get(0).get(0));
       driver.findElementByAndroidUIAutomator("text(\"Phone No.\")").sendKeys(obj.get(0).get(1));
         */
       driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
       driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
       //System.out.println(obj.get(0).get(0));
    
       //throw new io.cucumber.java.PendingException();
   }
   
   
   @Then("^Enter register your account details Slovenia$")
   public void enter_register_your_account_details_Slovenia() throws Throwable  {
   	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
      driver.findElementByAndroidUIAutomator("text(\"Ime\")").sendKeys("demo");
      driver.findElementByAndroidUIAutomator("text(\"Priimek\")").sendKeys("test");
      
   }
   @And("^Click on I am a dental professional Slovenia$")
   public void click_on_i_am_a_dental_professional_Slovenia() throws Throwable {
   	driver.findElementByAndroidUIAutomator("text(\"Sem zobozdravnik\")").click();
   }

   @And("type details more for register your account details Slovenia")
   public void type_details_more_for_register_your_account_details_Slovenia(io.cucumber.datatable.DataTable dataTable) throws Throwable {
   	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	 /* Implements new code for random data */ 
   	 Random randomEmail = new Random();
   	 int randomInt = randomEmail.nextInt(10000);
       driver.findElementByAndroidUIAutomator("text(\"Št. zobozdravnika\")").sendKeys("1"+randomInt+"1");
       /* Implements new code for static data */ 
       /*
   	List<List<String>> obj=dataTable.asLists();
   	driver.findElementByAndroidUIAutomator("text(\"Dental Professional No.\")").sendKeys(obj.get(0).get(0));
   	System.out.println(obj.get(0).get(0));
   	*/
   }
   
   /* For Dynamic user id and password */
   

   @And("^type email and password with email and password Slovenia$")
   public void type_email_and_password_with_email_and_password_Slovenia() throws Throwable {
   	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	Random randomEmail = new Random();
  	 int randomInt = randomEmail.nextInt(10000);
   	driver.findElementByAndroidUIAutomator("text(\"E-pošta\")").sendKeys("curatest+rzsa"+randomInt+"@morphos.is");
   	driver.findElementByAndroidUIAutomator("text(\"Geslo\")").sendKeys("Ringzero123");
   }

/* This code for static email and password*/
 /*  @And("^type email and password with (.+) and (.+)$")
   public void type_email_and_password_with_and(String email, String password) throws Throwable {
   	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Email\")").sendKeys(email);
   	driver.findElementByAndroidUIAutomator("text(\"Password\")").sendKeys(password);
   	System.out.println(email);
   	
   }
*/
   @And("^Click next button Slovenia$")
   public void click_next_button_Slovenia() throws Throwable {
   	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
   	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
      
   }

   @And("^Accept the terms and condition Slovenia$")
   public void accept_the_terms_and_condition_Slovenia() throws Throwable {
   	driver.findElementByAndroidUIAutomator("text(\"SPREJMI\")").click();
   	System.out.println("Done Second last"); 
   	//driver.resetApp(); // Reset the currently running app for this session
   	
   	
   }

   @And("^open gmail and conform the link Slovenia$")
   public void open_gmail_and_conform_the_link_Slovenia() throws Throwable 
   { 
   
       	driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
   	driver.activateApp("com.my.mail");	
   	driver.manage().timeouts().implicitlyWait(1050, TimeUnit.SECONDS);
       	driver.findElementByAndroidUIAutomator("text(\"Curaprox Pro app, Email Confirmation\")").click();
       	 driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
       	 driver.findElementByAndroidUIAutomator("text(\"Confirm email\")").click();
    
       	 driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
       	
       	
   } 
   
   @Then("^Curaprox app open and click not referal option Slovenia$")
   public void curaprox_app_open_and_click_not_referal_option_Slovenia() throws Throwable {
   	 
   	// ((StartsActivity)driver).currentActivity();
   	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Ne, nihče ni me napotil\")").click();
   }

   @And("^Your account iscreated metion comes then click next Slovenia$")
   public void your_account_iscreated_metion_comes_then_click_next_Slovenia() throws Throwable {
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	
   	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
   driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[424,1568][656,1633]']")).click();
   	
            
   }
   @And("^Click skip do later Slovenia$")
   public void click_skip_do_later_Slovenia() throws Throwable {
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Preskoči ali opravi pozneje\")").click();
   }
   
   @Then("^Click on practice open hours Slovenia$")
   public void click_on_practice_open_hours_Slovenia() throws Throwable {
   	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Ponedeljek\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Torek\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Sreda\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Četrtek\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Petek\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Sobota\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Nedelja\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"DODAJTE DELOVNI ČAS\"));");
   	
   	driver.findElementByAndroidUIAutomator("text(\"DODAJTE DELOVNI ČAS\")").click();
   }
   
   @Then("^Enter description and click confirm Slovenia$")
   public void enter_description_and_click_confirm_Slovenia() throws Throwable {
   	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Dodajte opis tukaj (po želji)\")").sendKeys("Hello this is test description");
   	driver.findElementByAndroidUIAutomator("text(\"POTRDI\")").click();
   	
   }
   
   @Then("^Select dental professional specialty Slovenia$")
   public void select_dental_professional_specialty_Slovenia() throws Throwable {
   	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Splošni zobozdravnik\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Ustni higienik\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Zobozdravstveni terapevt\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Zobozdravstvena medicinska sestra\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Ortodont\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Implantolog\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Zobni protetik\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
      	driver.findElementByAndroidUIAutomator("text(\"Parodontolog\")").click();
      	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
      	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Endodontolog\"));");
   	driver.findElementByAndroidUIAutomator("text(\"Endodontolog\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"POTRDI\"));");
   	
   	driver.findElementByAndroidUIAutomator("text(\"POTRDI\")").click();
   	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Preskoči ali opravi pozneje\"));");
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Preskoči ali opravi pozneje\")").click();
   	
   }

   
   @And("^Select working hours Slovenia$")
   public void select_working_hours_Slovenia() throws Throwable {
   	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Ponedeljek\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Torek\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Sreda\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Četrtek\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Petek\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Sobota\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"Nedelja\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	//driver.findElementByAndroidUIAutomator("text(\"Sunday\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"DODAJTE DELOVNI ČAS\"));");
   	driver.findElementByAndroidUIAutomator("text(\"DODAJTE DELOVNI ČAS\")").click();
   }

   
   @Then("^Click on chat settings Slovenia$")
   public void click_on_chat_settings_Slovenia() throws Throwable {
   	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"POTRDI\"));");
   	driver.findElementByAndroidUIAutomator("text(\"POTRDI\")").click();
   	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
   	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
   	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
   	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
   	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
   }
   
   
   
   /* Signup Code for Netherlands */
   
   @Given("^Open the curaprox consumer application and  Select the country as Netherlands$")
	 public void open_the_curaprox_consumer_application_and_select_the_country_as_Netherlands() throws Throwable {
		 
  	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
      driver.findElementByAndroidUIAutomator("text(\"Netherlands\")").click();
 
 	
 		
 }

 @And("^Tab Next button Netherlands$")
 public void tab_next_button_Netherlands() throws Throwable {
 	
 	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
 	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
 	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
 
 
 	
 } 

 @And("^Click on register new practice Netherlands$")
 public void click_on_register_new_practice_Netherlands() throws Throwable {
 	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Registreer nieuwe praktijk\")").click();
 	driver.findElementByAndroidUIAutomator("text(\"Allow only while using the app\")").click();
 }
 @Then("^type location in search location for Netherlands and select location Netherlands$")
 public void type_location_in_search_location_for_Netherlands_and_select_location_Netherlands() throws Throwable {
 	driver.findElementByAndroidUIAutomator("text(\"Zoek op locatie\")").click();
 	driver.findElementByAndroidUIAutomator("text(\"Zoek op locatie\")").sendKeys("Nachtwachtlaan 70");
 	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Nachtwachtlaan 70, Amsterdam, Netherlands\")").click();

 driver.findElement(By.xpath("//android.view.View[@content-desc='Google Map']")).getTagName();

 driver.findElement(By.xpath("//android.view.View[@content-desc='Google Map']")).click();
 	
 }

 @And("^Click conformation location Netherlands$")
 public void click_conformation_location_Netherlands() throws Throwable {
 	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	 driver.findElementByAndroidUIAutomator("text(\"BEVESTIG LOCATIE\")").getText();
 	driver.findElementByAndroidUIAutomator("text(\"BEVESTIG LOCATIE\")").click();
 }

 @And("Enter signup details Netherlands")
 public void enter_signup_details_Netherlands(io.cucumber.datatable.DataTable dataTable) {
 	
 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	
 	/* Implements new code for random data */ 
 	driver.findElementByAndroidUIAutomator("text(\"Praktijknaam\")").sendKeys("demotest");
 	Random randomEmail = new Random();
 	 int randomInt = randomEmail.nextInt(10000);
     driver.findElementByAndroidUIAutomator("text(\"Telefoonnummer\")").sendKeys("1"+randomInt+"1");
 	
 	/* Implements new code for static data */ 
 	/*
 	 List<List<String>> obj=dataTable.asLists();
     driver.findElementByAndroidUIAutomator("text(\"Practice Name\")").sendKeys(obj.get(0).get(0));
     driver.findElementByAndroidUIAutomator("text(\"Phone No.\")").sendKeys(obj.get(0).get(1));
       */
     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
     driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     
     //System.out.println(obj.get(0).get(0));
  
     //throw new io.cucumber.java.PendingException();
 }
 
 
 @Then("^Enter register your account details Netherlands$")
 public void enter_register_your_account_details_Netherlands() throws Throwable  {
 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
    driver.findElementByAndroidUIAutomator("text(\"Voornaam\")").sendKeys("demo");
    driver.findElementByAndroidUIAutomator("text(\"Achternaam\")").sendKeys("test");
    
 }
 @And("^Click on I am a dental professional Netherlands$")
 public void click_on_i_am_a_dental_professional_Netherlands() throws Throwable {
 	driver.findElementByAndroidUIAutomator("text(\"Ik ben een dental professional\")").click();
 }

 @And("type details more for register your account details Netherlands")
 public void type_details_more_for_register_your_account_details_Netherlands(io.cucumber.datatable.DataTable dataTable) throws Throwable {
 	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	 /* Implements new code for random data */ 
 	 Random randomEmail = new Random();
 	 int randomInt = randomEmail.nextInt(10000);
     driver.findElementByAndroidUIAutomator("text(\"BIG-nummer (optioneel)\")").sendKeys("1"+randomInt+"1");
     /* Implements new code for static data */ 
     /*
 	List<List<String>> obj=dataTable.asLists();
 	driver.findElementByAndroidUIAutomator("text(\"Dental Professional No.\")").sendKeys(obj.get(0).get(0));
 	System.out.println(obj.get(0).get(0));
 	*/
 }
 
 /* For Dynamic user id and password */
 

 @And("^type email and password with email and password Netherlands$")
 public void type_email_and_password_with_email_and_password_Netherlands() throws Throwable {
 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	Random randomEmail = new Random();
	 int randomInt = randomEmail.nextInt(10000);
 	driver.findElementByAndroidUIAutomator("text(\"E-mail\")").sendKeys("curatest+rzsa"+randomInt+"@morphos.is");
 	driver.findElementByAndroidUIAutomator("text(\"Wachtwoord\")").sendKeys("Ringzero123");
 }

/* This code for static email and password*/
/*  @And("^type email and password with (.+) and (.+)$")
 public void type_email_and_password_with_and(String email, String password) throws Throwable {
 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Email\")").sendKeys(email);
 	driver.findElementByAndroidUIAutomator("text(\"Password\")").sendKeys(password);
 	System.out.println(email);
 	
 }
*/
 @And("^Click next button Netherlands$")
 public void click_next_button_Netherlands() throws Throwable {
 	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
 	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
    
 }

 @And("^Accept the terms and condition Netherlands$")
 public void accept_the_terms_and_condition_Netherlands() throws Throwable {
 	driver.findElementByAndroidUIAutomator("text(\"ACCEPTEREN\")").click();
 	System.out.println("Done Second last"); 
 	//driver.resetApp(); // Reset the currently running app for this session
 	
 	
 }

 @And("^open gmail and conform the link Netherlands$")
 public void open_gmail_and_conform_the_link_Netherlands() throws Throwable 
 { 
 
     	driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
 	driver.activateApp("com.my.mail");	
 	driver.manage().timeouts().implicitlyWait(1050, TimeUnit.SECONDS);
     	driver.findElementByAndroidUIAutomator("text(\"Curaprox Pro app, Email Confirmation\")").click();
     	 driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
     	 driver.findElementByAndroidUIAutomator("text(\"Confirm email\")").click();
  
     	 driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
     	
     	
 } 
 
 @Then("^Curaprox app open and click not referal option Netherlands$")
 public void curaprox_app_open_and_click_not_referal_option_Netherlands() throws Throwable {
 	 
 	// ((StartsActivity)driver).currentActivity();
 	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Nee, ik heb geen verwijzingscode\")").click();
 }

 @And("^Your account iscreated metion comes then click next Netherlands$")
 public void your_account_iscreated_metion_comes_then_click_next_Netherlands() throws Throwable {
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	
 	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
 driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[424,1568][657,1633]']")).click();
 	
          
 }
 @And("^Click skip do later Netherlands$")
 public void click_skip_do_later_Netherlands() throws Throwable {
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Overslaan of later doen\")").click();
 }
 
 @Then("^Click on practice open hours Netherlands$")
 public void click_on_practice_open_hours_Netherlands() throws Throwable {
 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Maandag\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Dinsdag\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Woensdag\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Donderdag\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Vrijdag\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Zaterdag\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Zondag\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOEG OPENINGSTIJDEN TOE\"));");
 	
 	driver.findElementByAndroidUIAutomator("text(\"VOEG OPENINGSTIJDEN TOE\")").click();
 }
 
 @Then("^Enter description and click confirm Netherlands$")
 public void enter_description_and_click_confirm_Netherlands() throws Throwable {
 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Voeg hier omschrijving toe (optioneel)\")").sendKeys("Hello this is test description");
 	driver.findElementByAndroidUIAutomator("text(\"BEVESTIG\")").click();
 	
 }
 
 @Then("^Select dental professional specialty Netherlands$")
 public void select_dental_professional_specialty_Netherlands() throws Throwable {
 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Algemene tandarts\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Mondhygiënist\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Tandspecialist\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Tandartsassistente\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Orthodontist\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Implantoloog\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Protheticus\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Parodontoloog\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Endodontist\"));");
 	driver.findElementByAndroidUIAutomator("text(\"Endodontist\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"BEVESTIG\"));");
 	
 	driver.findElementByAndroidUIAutomator("text(\"BEVESTIG\")").click();
 	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Overslaan of later doen\"));");
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Overslaan of later doen\")").click();
 	
 }

 
 @And("^Select working hours Netherlands$")
 public void select_working_hours_Netherlands() throws Throwable {
 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Maandag\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Dinsdag\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Woensdag\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Donderdag\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Vrijdag\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Zaterdag\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"Zondag\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	//driver.findElementByAndroidUIAutomator("text(\"Sunday\")").click();
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOEG WERKTIJDEN TOE\"));");
 	driver.findElementByAndroidUIAutomator("text(\"VOEG WERKTIJDEN TOE\")").click();
 }

 
 @Then("^Click on chat settings Netherlands$")
 public void click_on_chat_settings_Netherlands() throws Throwable {
 	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"BEVESTIG\"));");
 	driver.findElementByAndroidUIAutomator("text(\"BEVESTIG\")").click();
 	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
 	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
 	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
 	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
 	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
 	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
 	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
 }
 
}