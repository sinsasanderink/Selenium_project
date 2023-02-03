import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ursinasanderink/Downloads/chromedriver_mac64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// traverse from sibling to parent and sibling to sibling
		// to get from sibling to another sibling starting from the parent you have to use the following xPath:
		// //header/div/button[1]/following-sibling::button[1] > this will go to the first sibling button after button[1]
		// use only 1 / in the beginning if you want to start at the root
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		// how to move from child to parent
		// //header/div/button[1]/parent::div/button[2]
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

	}

}
