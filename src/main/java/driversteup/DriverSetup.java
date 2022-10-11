package driversteup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {

		public static WebDriver driver;
		public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
			
		public static WebDriver initialization(String browser) {
				if(browser.equals("chrome")) {
					WebDriverManager.chromedriver().setup();
					ChromeOptions choptions = new ChromeOptions();
					choptions.addArguments("incognito");
					tldriver.set(new ChromeDriver(choptions));		
				}
				
				else if(browser.equals("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					FirefoxOptions ffoptions = new FirefoxOptions();
					ffoptions.addArguments("incognito");
					tldriver.set(new FirefoxDriver(ffoptions));
				}
				
				else {
					System.out.println("Please pass the correct browser name");
				}
				driver=tldriver.get();
				
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				return driver;
			}
}
