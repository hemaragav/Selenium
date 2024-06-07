package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("capgemini");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("hema");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("latha");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		System.out.println(title);
		driver.close();

	}

}
