package BaseClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import com.sun.glass.ui.View.Capability;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo {
	
	@BeforeTest
	public static AndroidDriver capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		//cap.setCapability("deviceName", "Demo");
		//cap.setCapability("platformName", "Android");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10);
		//cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		//cap.setCapability(CapabilityType.VERSION, "8.1.0");
		
		// Contacts App --->
 		// cap.setCapability("appPackage", "com.android.contacts");
		// cap.setCapability("appActivity", ".activities.PeopleActivity");
		
		// Gmail App --->
		// cap.setCapability("appPackage", "com.google.android.gm");
		// cap.setCapability("appActivity", ".ConversationListActivityGmail");
		
		// Messaging App --->
		cap.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
		cap.setCapability("appActivity", ".NexusLauncherActivity");
			
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
	}

}
