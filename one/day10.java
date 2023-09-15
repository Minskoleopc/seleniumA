package one;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://www.webdriveruniversity.com/");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.findElement(By.cssSelector("#contact-us")).click();
		
		Set <String> windows = driver.getWindowHandles();
		for(String window:windows) {
			if(! window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
		
		System.out.println(driver.getCurrentUrl());
		WebElement first_name =	driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement last_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email_address = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement submit_button =driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
		
		first_name.sendKeys("chinmay");
		last_name.sendKeys("deshpande");
		email_address.sendKeys("chinmaydeshpande010@gmail.com");
		message.sendKeys("I am learning selenium");
		submit_button.click();		
		

		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
		
		
		

		
		
		
		
		
		
		
		
	
		
		
	}

}
