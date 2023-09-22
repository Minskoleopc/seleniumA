package one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		String path = "C:\\Users\\ankurjain\\Desktop\\eclispe-workspace2\\SeleniumQ\\src\\one\\config.properties";

		try {

			FileInputStream fileInput = new FileInputStream(path);
			prop.load(fileInput);
			String url = prop.getProperty("baseUrl");
			String browser = prop.getProperty("browser");
			String un = prop.getProperty("username");
			String pd = prop.getProperty("password");

			// writing to the file
			prop.put("city", "pune");
			FileOutputStream outputStrem = new FileOutputStream(path);
			// Storing the properties file
			prop.store(outputStrem, "This is a sample properties file");
		


			if (browser.equals("chrome")) {
				// code to setup browser
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get(url);
				driver.findElement(By.cssSelector("#user-name")).sendKeys(un);
				driver.findElement(By.cssSelector("#password")).sendKeys(pd);
				driver.findElement(By.cssSelector("#login-button")).click();

				if (driver.getCurrentUrl().contains("inventory")) {
					System.out.println("Testcase pass");
				} else {
					System.out.println("Test case fail");
				}

			} else if (browser.equals("firefox")) {
				// code to setup firefox

			} else if (browser.equals("edge")) {
				// code to edge
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
