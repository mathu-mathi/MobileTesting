package ecommerce;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class demo {
	public static void main(String[] args)
	{
		DesiredCapabilities dc=new DesiredCapabilities(); 
	    dc.setCapability("platform","Android");
	    dc.setCapability("platformVersion","4");
	    dc.setCapability("deviceName","Samsung");
	    dc.setCapability("platform","com.amazon");
	    dc.setCapability("appActivity","");
	    //to unlock the phone
	    dc.setCapability("unlocktype", "pin");
	    dc.setCapability("unlockpin", "12234");
	    //to unlock pattern
	    dc.setCapability("unlocktype", "pattern");
	    dc.setCapability("unlockpin", "2369");
	   AndroidDriver driver=new AndroidDriver(new url("http://0.0.0.0:4723/wd/hub"),dc);
	   //Left swipe action
	    TouchAction swipeAction=new TouchAction<>(driver);
	    swipeAction.press(PointOption.point(655, 866)).waitAction().moveTo(PointOption.point(50,866)).release().perform();
	    //Right swipe action
	    swipeAction.press(PointOption.point(50, 866)).waitAction().moveTo(PointOption.point(655,866)).release().perform();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.DAYS.SECONDS);
	    //profile option
	    driver.findElement(By.id("com.solodroid.solomerce:id/nav_profile")).click();
	    //search button
	    driver.findElement(By.id("com.solodroid.solomerce:id/search")).click();
	    driver.findElement(By.id("com.solodroid.solomerce:id/search")).sendKeys("phone");
	    driver.hideKeyboard(); 
	    //background the app
	    driver.runAppInBackground(Duration.ofSeconds(10));
	    //lock device
	    driver.lockDevice();
	    //unlock devices
	    driver.unlockDevice();
	     System.out.println("Finished");
	    Thread.sleep(3000);
	} 
}
