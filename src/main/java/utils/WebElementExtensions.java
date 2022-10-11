package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebElementExtensions {
	public static void moveToElement(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	public static void scrollToElement(WebDriver driver, WebElement element)
    {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
	
	public static void selectElementFromDropdown(WebElement element, String visibleText) {
	Select s = new Select(element);
	s.selectByVisibleText(visibleText);
	}
	
	public static String[] splitString(String textToSplit, String delimiter)
	{
		String[] sentences = textToSplit.split(delimiter);
		return sentences;
	}
}
