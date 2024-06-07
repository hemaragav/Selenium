package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
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
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("hemalatha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ragavan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hema");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Bsc");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("SeleniumWebAutomation");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hemaraghavan.hema@gmail.com");
		WebElement ele= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(ele);
		state.selectByVisibleText("New York");
        driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[3]")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Selenium WebAutomation");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title= driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		System.out.println(title);
		driver.close();
		}

}
