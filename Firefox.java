import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Sina";
		// copy cody from locators:
		System.setProperty("webdriver.gecko.driver", "/Users/ursinasanderink/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// call getPassword method:
		String password = getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		
		
		// we need the waiting period To get the right results
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		// The following line will get text from p and then compare it with expected ("you are successfully..."). If they are the same, the test will pass, if not, test will fail.
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
		
		// click on log out: 
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		// close browse: 
		driver.close();

	}
	
	// method that will get the password
	public static String getPassword(WebDriver driver) // use static for the method to be accessible from main class
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		// Please use temporary password 'rahulshettyacademy' for Login.
		String[] passwordArray = passwordText.split("'");
		// 0th index: Please use temporary password, 1st index: rahulshettyacademy' for Login.
		String password = passwordArray[1].split("'")[0];
		return password; 
		
		
	}
	

}
