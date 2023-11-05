package listeners;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobileTest.BaseTest;
import utilis.CommonUtilis;

public class Listeners extends BaseTest implements ITestListener{
		
		@Override
		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			Reporter.log(result.getName()+" has started");
			
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			Reporter.log(result.getName()+" has PASSED");
			
			
		}

		@Override
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			
			
			Reporter.log(result.getName()+" has FAILED");
			
			//screenshot
			String s=result.getName();
			try {
				BaseTest.addScreenCaptureFromPath(CommonUtilis.getScreenShot(AppiumDriver<MobileElement> driver));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			Reporter.log(result.getName()+" has been SKIPPED");
			
		}
}
