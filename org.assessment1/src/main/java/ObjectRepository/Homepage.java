package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	@FindBy(xpath = "//a[text()='https://www.getcalley.com/']")
	private WebElement url;

	@FindBy(xpath = "//a[text()='https://www.getcalley.com/calley-lifetime-offer/']")
	private WebElement url1;

	@FindBy(xpath = "//a[text()='https://www.getcalley.com/calley-lifetime-offer/']")
	private WebElement url2;

	@FindBy(xpath = "//a[text()='https://www.getcalley.com/calley-teams-features/']")
	private WebElement url3;
	
	@FindBy(xpath = "//a[text()='https://www.getcalley.com/calley-pro-features/']")
	private WebElement url4;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement url() {
		return url1;
	}

	public WebElement url1() {
		return url2;
	}

	public WebElement url2() {
		return url3;
	}

	public WebElement url3() {
		return url3;
	}

	public WebElement url4() {
		return url4;
	}
	
	public void getUrl() {
		url.click();
	}

	public void getUrl1() {
		url1.click();
	}
	
	public void getUrl2() {
		url2.click();
	}
	
	public void getUrl3() {
		url3.click();
	}
	
	public void getUrl4() {
		url4.click();
	}
}
