package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class EditLead {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();				
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("citruscorp");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Citrus");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Corp");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Cit");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Civil");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Verifying the description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("preethi19ravi@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Verifying important note");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();	
		System.out.println("The title is " + driver.getTitle());
	}

}
