package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		//Click Leads
		driver.findElement(By.linkText("Leads")).click();
		//Create Leads
		driver.findElement(By.partialLinkText("Create")).click();
		//Enter Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//Enter First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");
		//Enter Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mageshwaran");
		//Enter First name(Local)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("");
		//Enter Department name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		//Enter Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("");
		//Enter E-mail address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramyamagest@gmail.com");
		//Click on Create button
		driver.findElement(By.name("submitButton")).click();
		//To verify the page Loaded
		//To Print the title of  the page
		String title = driver.getTitle();  //Ctrl+2
		System.out.println(title);
		//Click on Duplicate Lead button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//Clear the CompanyName and Enter new CompanyName
	    driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafGround");
	    //Clear the FirstName and Enter the new FirstName
	    driver.findElement(By.id("createLeadForm_firstName")).clear();
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raman");
	    //Click on Create button
	  	driver.findElement(By.name("submitButton")).click();
	  	//To verify the page Loaded
	  	//To Print the title of  the page
	  	String currentPage = driver.getTitle();  //Ctrl+2
	  	System.out.println(currentPage);
	 
	  }
}
