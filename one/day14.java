package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setting up the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// visiting the url
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		
		// Iframe
//		WebElement ele = driver.findElement(By.cssSelector("#frame"));
//		driver.switchTo().frame(ele);
		
		// Switch to iframe by index
		driver.switchTo().frame(0);
		WebElement ele2 = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a"));		
		System.out.println(ele2.isDisplayed());
		
		
		// Switching back to main content
		driver.switchTo().defaultContent();
		// finding element in main content
		driver.findElement(By.cssSelector("#nav-title")).isDisplayed();
		
		
		// validaing the title of main content
		if(driver.getTitle().equals("WebDriver | IFrame")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
			
		// closing the browser
		driver.close();
		// iframe // shadow DOM
		

	}

}
