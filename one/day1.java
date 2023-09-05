package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cntrl + shift + o
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");

		// local dev staging canary production
		// local test test4 test6 production

		// Arrange
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Actions

		// Selecting the element
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
		
		// Dash board element
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		

		// Assertion
		WebElement heading = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));
		if(heading.isDisplayed()) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		
	}

}
