package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContacts {

	public static void main(String[] args) {
		// create the object for launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the URL http://leaftaps.com/opentaps/control/login
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the browser
		driver.manage().window().maximize();
		//Find the element username Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Find the element password Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();    
        //Click Create Contacts
		driver.findElement(By.partialLinkText("Create")).click();
		//Enter FirstName
		driver.findElement(By.id("firstNameField")).sendKeys("Ramya");
		//Enter LastName
		driver.findElement(By.id("lastNameField")).sendKeys("Mageshwaran");
		//Click Create Click Button
		driver.findElement(By.name("submitButton")).click();
		//Print the FirstName in View Contact Page
		String firstName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(firstName);
		//Print the current title
		String currentTitle = driver.getTitle();  
		System.out.println(currentTitle);
		
	}

}
