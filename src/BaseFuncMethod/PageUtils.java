package BaseFuncMethod;

import java.util.List;

import org.apache.regexp.recompile;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BrowsersDrivers.Drivers;
import CommonDataResource.TestEnv;

public class PageUtils {
	
	public WebElement getElement(String xpath) {
		return Drivers.driver.findElement(By.xpath(xpath));
	}
	
	public List<WebElement> getElements(String xpath) {
		return Drivers.driver.findElements(By.xpath(xpath));
	}
	
	// Actions
	public void moveToElement(WebElement element) {
		Actions actions = new Actions(Drivers.driver);
		actions.moveToElement(element).perform();
	}
	
	public void longClick(WebElement elementA, WebElement elementB) {
		Actions actions = new Actions(Drivers.driver);
		actions.clickAndHold(elementA).
		click(elementB).
		release(elementA).build().perform();
	}
	
	public void selectElement(List<WebElement> list, int startI, int endI) {
		Actions actions = new Actions(Drivers.driver);
		actions.keyDown(Keys.CONTROL).
		click(list.get(startI)).
		click(list.get(endI)).
		keyUp(Keys.CONTROL).build().perform();
	}
	
	public void inputText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	public void clickElement(WebElement element) {
		element.click();
	}
	
	public void waitElement(String xpath) {
		WebDriverWait wait = new WebDriverWait(Drivers.driver, TestEnv.timeOuts);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}
	
	public static void waitTime(int i) throws InterruptedException {
		Thread.sleep(i * 1000);
	}
	
	// select
	public void selectElementIndex(WebElement element, int i) {
		Select select = new Select(element);
		select.selectByIndex(i);
	}
	
	public void selectElementText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void selectElementValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public boolean isElementDisplayed(String xpath) {
		boolean isResult = false;
		try {
			if (Drivers.driver.findElement(By.xpath(xpath)).isDisplayed()) {
				isResult=true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return isResult;
	}
	
	public boolean isElements(String xpath) {
		boolean isResult = false;
		try {
			if (!Drivers.driver.findElements(By.xpath(xpath)).isEmpty()) {
				isResult=true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return isResult;
	}
}
