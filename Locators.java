import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// LOCATORS 
		// Go to page and auto-login
		
		// 1) open browser and enter URL 
		System.setProperty("webdriver.chrome.driver", "/Users/ursinasanderink/Downloads/chromedriver_mac64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// implicit wait - 2 seconds wait time in case something couldn't be found
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		// 2) find username element on page and enter username 
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		// 3) Do the same for password
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		
		// 4) click on sign-in button
		// if you see a space in class that means these are 2 classes referring to the same, only provide 1 word
		driver.findElement(By.className("signInBtn")).click();
		
		
		// refer to incorrect user name or password
		// to get css selector, you have to construct it: tagname.classname or tagname#id
		// example: <input type="text" placeholder="Username" id ="inputUserName" value= " ">
		// become input#inputUserName
		// if theres no class name or ID use the following: Tagname[attribute='value']
		// This: <input type="text" placeholder="Username" value= " "> would become input[placeholder='Username']
		// if you use any locators make sure they only exist once, you can do this by inspect > console > $('p.error') > enter
		// referring to incorrect username or password case, we could do: 
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // this will only work if we add implicit wait because it takes a few seconds until the error message will show up.
		
		// click on "forgot your password" using linkText:
		driver.findElement(By.linkText("Forgot your password?")).click();
		// to reset password after we entered username, pwd etc., we need to wait a second to catch the right screen. If we dont add a sleep statement here, the page may not have fully loaded so it wont find the element.
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		// to access elements with Xpath use this format: //Tagname[@attribute='value']
		// to find element by xcode in console use the following format: $x('//input[@placeholder="Name"]')
		// so to access the name field use //input[@placeholder='Name']
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		
		// enter email address, find element by cssSelector:
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		// clear the email entered in email input field:
		// note that you can also use indexes i case there are multiple occurances in xpath
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		// enter another email
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		// if you want to use the index in css selector write: input[type='text']:nth-child(3) - go to console and find out which index, indexes in xcode and css selectors differ
		
		// go to phone number field by using only tags and index and enter phone number:
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("4156509012");
		
		// click on reset password
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		// print text displayed upon clicking on reset pwd by css selector 
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); // for this to work you must implement a sleep statement earlier. The implicit wait wont work because the element is already shown but not in stable state yet, so not clickable. For it to get into stable state (i.e. to become clickable) we need to wait
		
		// Click on "go to login" button: 
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[1]")).click();
		
		// to avoid running into the interception problem, wait at least 1 second
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		// refill the form using username and the password that the previous output text provided
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); // the * in css will mean that it will check any word that contains pass
		driver.findElement(By.id("chkboxOne")).click(); // clicks on the first checkbox "remember my username
		
		// if you want to use the * method for SelectorsHub (contains in xpath, use the following format: //button[contains(@class,'submit')]
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();	

	}

}
