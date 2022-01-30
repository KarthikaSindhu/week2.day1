package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();

		
		// Contact Information

		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("420");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("11");
		driver.findElement(By.name("primaryPhoneExtension")).sendKeys("102");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("karthika@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("789654123");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://www.gmail.com");

		// Primary Address

		driver.findElement(By.name("generalToName")).sendKeys("Karthika Sindhu");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Arun Kumar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Velachery");
		driver.findElement(By.name("generalStateProvinceGeoId")).sendKeys("Indiana");
		driver.findElement(By.name("generalAddress1")).sendKeys("No. 3 arjun salai");
		driver.findElement(By.name("generalCity")).sendKeys("Chennai");

		driver.findElement(By.className("smallSubmit")).click();

	}

}
