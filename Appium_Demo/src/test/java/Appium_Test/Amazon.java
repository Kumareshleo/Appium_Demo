package Appium_Test;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;

import org.testng.annotations.Test;

import BaseClass.Demo;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Amazon extends Demo {
	
	@Test
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub


		AndroidDriver driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementById("com.google.android.apps.nexuslauncher:id/all_apps_handle").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.google.android.apps.nexuslauncher:id/search_box_input").sendKeys("Cale");
		driver.findElementById("com.google.android.apps.nexuslauncher:id/icon").click();
		driver.findElementById("com.google.android.calendar:id/floating_action_button").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Reminder']").click();
		driver.findElementByXPath("//android.widget.EditText[@text='Remind me to�']").sendKeys("Time to go for a walk");
		driver.findElementByXPath("//android.widget.Button[@text='DONE']").click();
		driver.findElementById("com.google.android.calendar:id/all_day_switch").click();
		driver.findElementByXPath("//android.widget.Button[@text='SAVE']").click();
		Thread.sleep(1000);
		
		try {
			Robot robot = new Robot();

			Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
			File file = new File("CapturedCalendarReminder.png");
			boolean status = ImageIO.write(bufferedImage, "png", file);
			System.out.println("Screen Captured : " + status + " File Path:- " + file.getAbsolutePath());

		} catch (AWTException | IOException ex) {
			System.err.println(ex);
		}

		driver.findElementByXPath("//android.view.View[@index=1]").click();
		driver.findElementById("com.google.android.calendar:id/info_action_overflow").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Delete']").click();
		driver.findElementById("android:id/button1").click();
		Thread.sleep(3000);
		
		try {
			Robot robot1 = new Robot();

			Rectangle rectangle1 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage bufferedImage = robot1.createScreenCapture(rectangle1);
			File file = new File("DeletedCalendarReminder.png");
			boolean status = ImageIO.write(bufferedImage, "png", file);
			System.out.println("Screen Captured : " + status + " File Path:- " + file.getAbsolutePath());

		} catch (AWTException | IOException ex) {
			System.err.println(ex);
		}

		driver.closeApp();

		/*String s = "Hello, How are you ? I am fine. Hope your fine. Lets meet at 6 pm in Marina Beach."; 
		driver.findElementById("com.google.android.apps.nexuslauncher:id/all_apps_handle").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.google.android.apps.nexuslauncher:id/search_box_input").sendKeys("Mess");
		driver.findElementById("com.google.android.apps.nexuslauncher:id/icon").click();
		driver.findElementById("com.google.android.apps.messaging:id/start_new_conversation_button").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Kumaresh R']").click();
		driver.findElementByXPath("//android.widget.EditText[@text='Type an SMS message']").sendKeys(s);
		driver.findElementById("com.google.android.apps.messaging:id/send_message_button_container").click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String message = driver.findElementById("com.google.android.apps.messaging:id/message_text").getText();
		System.out.println("Message : " + message );
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			Robot robot = new Robot();

			Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
			File file = new File("CapturedImage.png");
			boolean status = ImageIO.write(bufferedImage, "png", file);
			System.out.println("Screen Captured : " + status + " File Path:- " + file.getAbsolutePath());

		} catch (AWTException | IOException ex) {
			System.err.println(ex);
		}

		driver.findElementByXPath("//android.widget.ImageView[@index=1]").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Delete']").click();
		driver.findElementById("android:id/button1").click();
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		//WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		try {
			Robot robot1 = new Robot();

			Rectangle rectangle1 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage bufferedImage = robot1.createScreenCapture(rectangle1);
			File file = new File("CapturedDeletedImage.png");
			boolean status = ImageIO.write(bufferedImage, "png", file);
			System.out.println("Screen Captured : " + status + " File Path:- " + file.getAbsolutePath());

		} catch (AWTException | IOException ex) {
			System.err.println(ex);
		}*/

	}

}
