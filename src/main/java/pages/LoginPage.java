package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobileTest.BaseTest;

public class LoginPage extends BaseTest{
	public LoginPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//methods
	@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/sign_in_button")
	private AndroidElement signInBtn;
	public  AndroidElement getSignInBtn() {
		return signInBtn;
	}
	@AndroidFindBy(id="ap_email_login")
	private AndroidElement enterUserId;
	public  AndroidElement getEnterUserId() {
		return enterUserId;
	}
	@AndroidFindBy(id="continue")
	private AndroidElement continueBtn;
	public  AndroidElement getContinueBtn() {
		return continueBtn;
	}
	@AndroidFindBy(id="ap_password")
	private AndroidElement enterPassword;
	public  AndroidElement getEnterPassword() {
		return enterPassword;
	}	
	@AndroidFindBy(id="signInSubmit")
	private AndroidElement logInBtn;
	public  AndroidElement getLogInBtn() {
		return logInBtn;
	}
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/chrome_action_bar_burger_icon")
	private AndroidElement sideBar;
	public  AndroidElement getSideBar() {
	return sideBar;
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Settings']")
	private AndroidElement settings;
	public AndroidElement  getSettings() {
		return settings;
	}
	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Sign out\")")
	private AndroidElement signOutBtn;
	public  AndroidElement getSignOutBtn() {
		return signOutBtn;
	}
	@AndroidFindBy(id="android:id/button2")
	private AndroidElement confirmBtn;
	public  AndroidElement getConfirmBtn() {
		return confirmBtn;
	}
}
	

