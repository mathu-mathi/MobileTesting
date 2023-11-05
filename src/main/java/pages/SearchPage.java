package pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobileTest.BaseTest;

public class SearchPage extends BaseTest{
public SearchPage(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

@AndroidFindBy(id ="com.amazon.mShop.android.shopping:id/list_product_linear_layout")
public List<AndroidElement> productList;
@AndroidFindBy(id ="com.amazon.mShop.android.shopping:id/item_title")
private AndroidElement productNameElement;
@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/item_title")
public productName;

public List<AndroidElement> getProductList() {
	return productList;
}

public AndroidElement getProductNameElement() {
	return productNameElement;
}
    public String fetchProductName(AndroidElement element) {
	String productName.getText();
	return productName;
         }
    public String fetchProductPrice(AndroidElement element) {
		  List<MobileElement> list=element.findElements(By.xpath("//android.widget.TextView[@index='0']")); 
    }


}
