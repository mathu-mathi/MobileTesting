package utilis;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import constant.FileConstant;
import constant.WaitConstant;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class CommonUtilis {



	    public static boolean waitForElement(AppiumDriver<MobileElement> driver, MobileElement element) {
	        boolean isElementClickable = false;
	        WebDriverWait wait = new WebDriverWait(driver, WaitConstant.WAIT_FOR_ELEMENT);
	        try {
	            wait.until(ExpectedConditions.elementToBeClickable(element));
	            isElementClickable = true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return isElementClickable;
	    }

	    public static boolean waitForElementToDisappear(AppiumDriver<MobileElement> driver, MobileElement element) {
	        boolean isElementFound = false;
	        WebDriverWait wait = new WebDriverWait(driver, WaitConstant.WAIT_FOR_ELEMENT_TO_DISAPPEAR);
	        try {
	            wait.until(ExpectedConditions.invisibilityOf(element));
	            isElementFound = true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return isElementFound;
	    }

	    public static MobileElement fluentWaitforElement(AppiumDriver<MobileElement> driver, MobileElement element, int timeoutSec, int pollingSec) {

	        FluentWait<AppiumDriver<MobileElement>> fWait = new FluentWait<>(driver)
	                .withTimeout(Duration.ofSeconds(timeoutSec))
	                .pollingEvery(Duration.ofSeconds(pollingSec))
	                .ignoring(NoSuchElementException.class, TimeoutException.class);

	        for (int i = 0; i < 2; i++) {
	            try {
	                fWait.until(ExpectedConditions.visibilityOf(element));
	                fWait.until(ExpectedConditions.elementToBeClickable(element));
	            } catch (Exception e) {
	                System.out.println("Element not found, trying again - " + element.toString());
	                e.printStackTrace();
	            }
	        }

	        return element;
	    }

	    public static void moveToElement(AppiumDriver<MobileElement> driver, MobileElement element) {
	        TouchAction action = new TouchAction(driver);
	        action.moveTo(element).release().perform();
	    }

	    public static String getDateAndTimeStamp() {
	        String value = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	        return value;
	    }

	    public static String getScreenShot(AppiumDriver<MobileElement> driver) throws IOException {
	        String path = FileConstant.SCREENSHOT_FOLDER_PATH;
	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        File dst = new File(path);
	        FileUtilis.copyFile(src, dst);
	        return path;
	    }
	}

