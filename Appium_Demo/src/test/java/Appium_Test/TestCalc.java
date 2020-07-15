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
import BaseClass.*;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestCalc extends Demo {
	
	@Test
	public static void main(String args[]) throws MalformedURLException, InterruptedException {

		AndroidDriver driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String h = "Hello";
		driver.findElementById("com.google.android.gm:id/welcome_tour_got_it").click();
		driver.findElementById("com.google.android.gm:id/action_done").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.google.android.gm:id/compose_button").click();
		driver.findElementById("com.google.android.gm:id/to").sendKeys("kumleo1230@gmail.com");
		driver.findElementById("com.google.android.gm:id/subject").sendKeys(h);
		driver.findElementById("com.google.android.gm:id/send").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageButton[@index=0]").click();
		driver.findElementByXPath("//android.widget.LinearLayout[@index=8]").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.view.View[@index=1]").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.google.android.gm:id/send_date").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String fromDetails = driver.findElementById("com.google.android.gm:id/from_details").getText();
		System.out.println("From : " +fromDetails);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String toDetails = driver.findElementById("com.google.android.gm:id/to_details").getText();
		System.out.println("To : " +toDetails);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String dateDetails = driver.findElementById("com.google.android.gm:id/date_details").getText();
		System.out.println("Date : " +dateDetails);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		if(toDetails.equals("kumleo1230@gmail.com")|fromDetails.equals("Jaffar Ali jaff.1.2.3.4.ali@gmail.com"))
		{
			System.out.println("Test Passed...");
		}
		else 
		{
			System.out.println("Test Failed...");
		}

		/*driver.findElementById("com.android.contacts:id/floating_action_button").click();

		driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys("Kumaresh");
		driver.findElementByXPath("//android.widget.EditText[@text='Last name']").sendKeys("R");
		driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("9454567656");
		driver.findElementByXPath("//android.widget.EditText[@text='Email']").sendKeys("kumaresh@novaturebusiness.com");
		driver.findElementById("com.android.contacts:id/editor_menu_save_button").click();
		String result = driver.findElementByXPath("//android.widget.TextView[@text='Kumaresh R']").getText();
		System.out.println("First Name:" +result);

		if(result.equals("Kumaresh R"))
		{
			System.out.println("Test Passed...");
		}
		else
		{
			System.out.println("Test Failed...");
		}*/

		/*driver.findElementById("com.android.calculator2:id/digit_9").click();
		driver.findElementById("com.android.calculator2:id/digit_8").click();
		driver.findElementById("com.android.calculator2:id/op_mul").click();
		driver.findElementById("com.android.calculator2:id/digit_6").click();
		driver.findElementById("com.android.calculator2:id/digit_3").click();
		driver.findElementById("com.android.calculator2:id/eq").click();
		Thread.sleep(4000);
		String result = driver.findElementById("com.android.calculator2:id/result").getText();
		System.out.println("Result is..." +result);

		if(result.equals("6,174"))
		{
			System.out.println("Test Passed...");
		}
		else
		{
			System.out.println("Test Failed...");
		}*/

		Thread.sleep(3000);

		try {
			Robot robot = new Robot();

			Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
			File file = new File("screen-capture.png");
			boolean status = ImageIO.write(bufferedImage, "png", file);
			System.out.println("Screen Captured : " + status + " File Path:- " + file.getAbsolutePath());

		} catch (AWTException | IOException ex) {
			System.err.println(ex);
		}

	}

}
