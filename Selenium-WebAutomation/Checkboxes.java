package week2.Assignments;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//div[.='Basic']")).click();
		driver.findElement(By.xpath("//div[.='Ajax']")).click();
		WebElement notificationmsg= driver.findElement(By.xpath("//div[.='Checked']"));
	    System.out.println(notificationmsg.getText());
		driver.findElement(By.xpath("//label[.='Java']")).click();
		driver.findElement(By.xpath("//h5[.='Tri State Checkbox']/following::div[3]")).click();
		WebElement tristatevalue = driver.findElement(By.xpath("//div[@class='ui-growl-message']/following::p"));
		System.out.println(tristatevalue.getText());
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Boolean isselected= driver.findElement(By.xpath("//span[.='Disabled']")).isSelected();
		System.out.println(isselected);
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-multiple')]")).click();
		List<WebElement>countrylist = driver.findElements(By.xpath("//li[contains(@class,'ui-selectcheckboxmenu-item')]"));
		
		for (WebElement country : countrylist) {
			
		if(country.getText().contains("Paris"))
		{
			country.click();
		}
			
		}
		driver.close();
		
	}

}
