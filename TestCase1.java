package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {

		/*
		 * Open the browser Load the URL Maximize the browser Enter UserName Enter
		 * Password Click Login Click CRM/SFA Click Contacts Tab Click Create Contact//
		 * Type First Name Type Last Name Click Create Contact Button Print the first
		 * name and browser title Close the browser
		 */

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Karthika");
		driver.findElement(By.id("lastNameField")).sendKeys("Sindhu");
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();
	}

}
