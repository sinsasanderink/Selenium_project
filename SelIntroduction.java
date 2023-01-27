import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WebDriver is an interface and interface methods are shared among all classes that belong to WebDriver (e.g. FirefoxDriver, ChromeDriver, etc)
		
		// Invoking Browser
		
		// chromedriver.exe-> Chrome browser
		// Thanks to a recent update, the following line became optional:
		// System.setProperty("webdriver.chrome.driver", "/Users/ursinasanderink/Downloads/chromedriver_mac64 (1)/chromedriver");
		
		
		
		// Firefox- FirefoxDriver -> Methods
		// Note that methods are the same among all classes (e.g. firefoxdriver, chromedriver, etc)
		// Chrome: ChromeDriver (class for Chrome) -> contains all methods for chrome browser
		// To access the methods of a class, create an object of a class (you have to import ChromeDriver)
		// ChromeDriver driver can use WebDriver methods + class methods, class methods are specific to ChromeDriver class and only work in the specific class
		
		// CHROME:
		System.setProperty("webdriver.chrome.driver", "/Users/ursinasanderink/Downloads/chromedriver_mac64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver(); // ChromeDriver is the class, new creates a new object, driver is the object name
		
		
		// The above line will have access to all webdriver methods, which are shared among all classes that belong to WebDriver (eg FireFoxDriver, ChromeDriver)
		// if you wrote the following instead: ChromeDriver driver = new ChromeDriver();, it would only have access to class methods of ChromeDriver
		
		// Firefox launch: needs geckodriver to launch
		//webdriver.gecko.driver
		
		// FIREFOX:
		System.setProperty("webdriver.gecko.driver", "/Users/ursinasanderink/Downloads/geckodriver");
		WebDriver driver1 = new FirefoxDriver();
		
		// MS EDGE:
		// System.setProperty("webdriver.edge.driver", "/Users/ursinasanderink/Downloads/edgedriver_win64/msedgedriver");
		WebDriver driver2 = new EdgeDriver();
		
		// open a specific website:
		//webdriver.chrome.driver->value of path
		driver2.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		// check if you are landing on the right page or if you get redirected:
		System.out.println(driver.getCurrentUrl());
		
		// to close the browser: 
		driver2.close();
		//drive.quit(); will close all associated windows, so if more than 1 window is opened during the process, all of them will be closed
		
		
		
		

	}

}
