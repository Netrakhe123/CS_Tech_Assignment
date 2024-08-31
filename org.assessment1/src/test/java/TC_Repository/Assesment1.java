package TC_Repository;

import GenericUtility.Baseclass;
import GenericUtility.Screenshotutility;
import ObjectRepository.Homepage;
import genericLibOrUtility.SeleniumUtility;

public class Assesment1 extends Baseclass
{
	@Test
	public void ass1() throws Exception {
		SeleniumUtility SUTIL = new SeleniumUtility();
		Homepage hp = new Homepage(driver);
		hp.getUrl();
		Screenshotutility.captureScreenshot(driver, "url");
		SUTIL.navigateBack(driver);
		hp.getUrl1();
		Screenshotutility.captureScreenshot(driver, "url1");
		SUTIL.navigateBack(driver);
		hp.getUrl2();
		Screenshotutility.captureScreenshot(driver, "url2");
		SUTIL.navigateBack(driver);
		hp.getUrl3();
		Screenshotutility.captureScreenshot(driver, "url3");
		SUTIL.navigateBack(driver);
		hp.getUrl4();
		Screenshotutility.captureScreenshot(driver, "url4");
		SUTIL.navigateBack(driver);
	}
	
}

