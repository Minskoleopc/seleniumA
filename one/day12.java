package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Testcase 1
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// visiting the url
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		
		WebElement ele = driver.findElement(By.id("result"));
//		// finding the element and clicking on it 
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
//		//switching to alert and getText
//		String alertString = driver.switchTo().alert().getText();
//		if(alertString.equals("I am a JS Alert")) {
//			System.out.println("Testcase pass");
//		}
//		driver.switchTo().alert().accept();
//		if(ele.getText().equals("You successfully clicked an alert")) {
//			System.out.println("Testcase ");
//		}
//		

		// Testcase 2

//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
//		String text = driver.switchTo().alert().getText();
//		if(text.equals("I am a JS Confirm")) {
//			System.out.println("Test case for text pass");
//		}
//		 driver.switchTo().alert().accept();
//		 System.out.println(ele.getText());
//		 if(ele.getText().equals("You clicked: Ok")) {
//			 System.out.println("Test case for element text pass");
//		 }

		
		// Testcase 3
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
//		String text2 = driver.switchTo().alert().getText();
//		if (text2.equals("I am a JS Confirm")) {
//			System.out.println("Test case for text pass");
//		}
//		driver.switchTo().alert().dismiss();
//		System.out.println(ele.getText());
//		if (ele.getText().equals("You clicked: Cancel")) {
//			System.out.println("Test case for element text pass");
//		}
//
		// Test case 4
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
//		String text = driver.switchTo().alert().getText();
//		if(text.equals("I am a JS prompt")) {
//			System.out.println("Testcase pass");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}
//		driver.switchTo().alert().sendKeys("text");
//		driver.switchTo().alert().accept();
//		if(ele.getText().equals("You entered: text")) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
//	
		
		
		// Testcase 5
//		
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
//		String text = driver.switchTo().alert().getText();
//		if(text.equals("I am a JS prompt")) {
//			System.out.println("Testcase pass");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}
//		driver.switchTo().alert().sendKeys("text");
//		driver.switchTo().alert().dismiss();
//		if(ele.getText().equals("You entered: null")) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
		
		
		// Modal Popup as homework 
		// http://www.webdriveruniversity.com/Popup-Alerts/index.html
		
		
		
		
		
		
		
	
		
		driver.close();
	
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
