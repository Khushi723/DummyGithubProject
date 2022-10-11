package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverExtensions {
	public static WebElement ElementIsVisible(WebDriver driver, By locator, Duration timeOutInSec)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSec);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;
    }
	
	public static WebElement ElementToBeClickable(WebDriver driver, WebElement element, Duration timeOutInSec)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSec);
        WebElement elemnt = wait.until(ExpectedConditions.elementToBeClickable(element));
        return elemnt;
    }
}
