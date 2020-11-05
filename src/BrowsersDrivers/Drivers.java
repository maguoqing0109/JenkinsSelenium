package BrowsersDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
	
	public static WebDriver driver;
	
	private final String dirverPath = System.getProperty("user.dir");
	
	public Drivers(BrowsersType browsersType) {
		switch (browsersType) {
		case chrome:
			System.setProperty("webdriver.chrome.driver", dirverPath + "\\lib\\chromedriver.exe");
			/*
			 * ChromeOptions options = new ChromeOptions(); options.addArguments("");
			 */
			driver = new ChromeDriver();
			break;
		
		case firefox:
			System.setProperty("webdriver.firefox.bin", dirverPath + "\\lib\\chromedriver.exe");
	
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Input String Driver Error!!!");
			break;
		}
		
	}
}
