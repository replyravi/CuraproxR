package stepDefinations;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Capab extends Base {

	public AndroidDriver <AndroidElement>driver =capabilities();
	public Capab() throws MalformedURLException {}
}
