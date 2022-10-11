package pages;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebElementExtensions;

public class YourLogo {
	
	public WebDriver driver;
	By colorLabels = By.cssSelector("label.layered_color");
	By breadCrumb = By.cssSelector("h1.page-heading > span.cat-name");	
	 
	public By mainLabel(String mainLable) {
		return By.cssSelector("a[title='" + mainLable + "']");
	}
	
	public By menuOption(String option) {
		return By.cssSelector("li > ul > li > ul > li > a[title ='" + option + "']");
	}
	
	public WebElement colorLabelElement()
	{
		return driver.findElement(colorLabels);
	}
	
	public WebElement colorElement(String colorLabel) {
		return driver.findElement(By.xpath("//a[text()='" + colorLabel + "']"));
	}
	
	public WebElement sortElement() {
		return driver.findElement(By.cssSelector("select.selectProductSort"));
	}
	
	public YourLogo(WebDriver driver)
	{
		this.driver = driver;
	}	
	
	public void clickMainLabel(String mainLable)
	{
		WebElement Label = driver.findElement(mainLabel(mainLable));
		//WebDriverExtensions.WaitForPageLoad(driver, null, 60);
		WebElementExtensions.moveToElement(driver, Label);
	}
	
	public void clickMenuOptions(String options)
	{
		WebElement Label1 = driver.findElement(menuOption(options));
		Label1.click();
	}
	
	public void colorElementClick(String color)
	{
		colorElement(color).click();
	}
	
	public void clickSortingDropdown()
	{
		sortElement().click();
	}
	
	public void selectDropdownValue(String visibleText) {
		WebElementExtensions.selectElementFromDropdown(sortElement(),visibleText);
	}
	
	public WebElement returnBreadCrumb()
	{
		return driver.findElement(breadCrumb);
	}
	
	public String fetchBreadcrumb() {
		String breadCrumbText = returnBreadCrumb().getText();
		System.out.println(breadCrumbText);
		String splittedString[] =  WebElementExtensions.splitString(breadCrumbText, ">");
		System.out.println(splittedString[1]);
		return StringUtils.trim(splittedString[1]);
	}
	
	public List<WebElement> priceList() {
		List<WebElement> priceElements = driver.findElements(By.cssSelector("div.right-block > div.content_price > span[itemprop='price']"));
		return priceElements;
	}
	
	public void priceAscending() {
		int[] priceElements;
		for(WebElement pricelist : priceList() ) {
		String prices = pricelist.getText();
		//priceElements.add(Integer.parseInt(prices)); 
		System.out.println(prices);
		}
		
	}

}
