package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobileTest.BaseTest;

public class HomePage extends BaseTest{
public HomePage(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

@AndroidFindBy(className ="android.widget.EditText")
public AndroidElement searchField;

public AndroidElement getSearchField() {
	return searchField;
}

}
