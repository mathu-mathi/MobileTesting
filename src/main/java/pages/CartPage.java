package pages;

import static mobileTest.BaseTest.driver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import mobileTest.BaseTest;

public class CartPage extends BaseTest
{
public CartPage(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}


//methods
@AndroidFindBy(id ="com.amazon.mShop.android.shopping:id/chrome_action_bar_cart")
public AndroidElement cartBtn;
@AndroidFindBy(id ="sc-active-cart")
public List<AndroidElement> cartList;
@AndroidFindBy(className ="android.widget.Image")
public List<AndroidElement> productList;
@AndroidFindBy(className ="android.view.View")
public List<AndroidElement> productPrice;
@AndriodFindBy(xpath="//*[contains(@text,'Headphones')]")
public AndroidElement Headphones;
@AndriodFindBy(xpath="//*[contains(@text,'Bose SoundSport, Wireless Earbuds, (Sweatproof Bluetooth Headphones for Running and Sports), Aqua')]")
public AndroidElement fhead;
return productList;
}

public List<AndroidElement> getProductPrice() {
return productList;
}

public  String getProductNameFromCart() {
return productList.get(1).getText();
}


public boolean getCartBtn() {
	
	return cartBtn.isDisplayed();
}

public List<AndroidElement> getCartList() {
	
	return  cartList;
}
public void addFirstHeadphonesListing() {

    fhead.click();

}

	

	      
