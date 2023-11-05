package mobileTest;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.testng.annotations.BeforeTest;

import ecommerce.url;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import jdk.internal.org.jline.utils.Log;
public class BaseTest {
	private static final Logger logger = Logger.getLogger(BaseTest.class);
	@BeforeTest
	public void test()
	{
		Log.debug("This is default message");
		DesiredCapabilities dc=new DesiredCapabilities(); 
		Log.info("Intiliazing capabilities");
	    dc.setCapability("platform","Android");
	    Log.info("platform");
	    dc.setCapability("platformVersion","12");
	    Log.info("platform version");
	    dc.setCapability("deviceName","Samsung");
	    dc.setCapability("platform","com.ecommerce");
	    AndroidDriver driver=new AndroidDriver(new HttpCommandExecutor("http://0.0.0.0:4723/wd/hub"),dc);
	    Log.info("Initializing Android ");
	    AppiumDriver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	   Log.info("waiting to load url");
	   dc.setCapability("unlocktype", "pin");
	    dc.setCapability("unlockpin", "12234");
	    Log.info("Locktype");
	}
	

}
