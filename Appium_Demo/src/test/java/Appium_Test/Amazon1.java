package Appium_Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import BaseClass.*;

import io.appium.java_client.android.AndroidDriver;

public class Amazon1 extends Demo {
	
	@Test
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("com.google.android.apps.nexuslauncher:id/all_apps_handle").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.google.android.apps.nexuslauncher:id/search_box_input").sendKeys("Chro");
		driver.findElementById("com.google.android.apps.nexuslauncher:id/icon").click();
		
		

	}

}
