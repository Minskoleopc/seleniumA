package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WebElement methods
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		// sendKeys();
		// program 1
//		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
//		WebElement first_name=	driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
//		first_name.sendKeys("chinmay");
		
		// click()		
//		WebElement first_name =	driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
//		WebElement last_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
//		WebElement email_address = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
//		WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
//		WebElement reset_button =driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
//		

//		first_name.sendKeys("chinmay");
//		last_name.sendKeys("deshpande");
//		email_address.sendKeys("chinmaydeshpande010@gmail.com");
//		message.sendKeys("I am learning js");
//		reset_button.click();
//		
		// clear()
		
//		WebElement first_name =	driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
//		first_name.sendKeys("chinmay");
//		first_name.clear();
	
	
		// text()
		// <h2 name="contactme" class="section_header">CONTACT US</h2>		
//		WebElement  heading =driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
//		String text = heading.getText();
//		System.out.println(text);
//		
		
		
		// Program 2
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
	
		// is_displayed()
		// q1 ----- true
		WebElement header =driver.findElement(By.cssSelector("h1"));
		boolean q1 = header.isDisplayed();
		System.out.println(q1);
		
		// is_enabled()
		// q2 ------true
		
		WebElement enabled_radioB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(1)"));
		boolean q2 = enabled_radioB.isEnabled();
		System.out.println(q2);
		
		// q3 --- false
		WebElement disabled_radioB  = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(3)"));
		boolean q3 = disabled_radioB.isEnabled();
		System.out.println(q3);
	
		
		// is_selected()
		// q4 --- true
		WebElement isSelected_radioB  = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(5)"));
		boolean q4 = isSelected_radioB.isSelected();
		System.out.println(q4);
		
		
		// submit()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
