import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ursinasanderink/Downloads/chromedriver_mac64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// run browser in maximized mode
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com"); // navigate method will not wait until page is fully loaded, use get or implicit wait if you want to wait until page is fully loaded
		driver.navigate().back(); // this will take you back to previous page, i.e. google
		driver.navigate().forward();
		

	}

}
