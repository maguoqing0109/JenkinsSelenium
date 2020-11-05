package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseFuncMethod.PageUtils;
import BrowsersDrivers.BrowsersType;
import BrowsersDrivers.Drivers;
import CaseBasePage.BaiduPageCase;
import CommonDataResource.TestEnv;

public class BaiduLoginA {
	private WebDriver driver;
	private String URL = TestEnv.url;
	private BaiduPageCase BaiduPageCase = new BaiduPageCase();
	private String userAcount = TestEnv.userName;
	private String userPwd = TestEnv.pwd;
	
	@BeforeClass
	public void methodA() {
		Drivers drivers = new Drivers(BrowsersType.chrome);
		driver = drivers.driver;
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@Test
	public void methodB() throws InterruptedException {
		System.out.println("º¯ÊýÖ´ÐÐÌå");
		BaiduPageCase.BaiduLogin(userAcount, userPwd);
//		Assert.assertTrue(BaiduPageCase.assertUserLoginSucceed());
	}
	
	@AfterMethod
	public void methodC() throws InterruptedException {
		PageUtils.waitTime(5);
		driver.quit();
	}
}
