package BaseFuncMethod;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import BrowsersDrivers.Drivers;

public class RecentTaskWait {
	
	public static void recentTask(String xpath) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(Drivers.driver).
				withTimeout(300, TimeUnit.SECONDS).
				pollingEvery(1, TimeUnit.SECONDS).
				ignoring(NoSuchFieldException.class).
				withMessage("º”‘ÿ≥…π¶");
		
		wait.until(new Function<WebDriver, WebElement> () {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath(xpath));
			}
		});
	}
	
	
}
