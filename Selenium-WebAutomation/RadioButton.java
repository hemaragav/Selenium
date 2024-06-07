package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//label[@for='j_idt87:console1:1']")).click();

		driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).click();
		driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).click();
		boolean isseletedlocation = driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).isSelected();
		System.out.println(isseletedlocation);
		boolean isseleted = driver.findElement(By.xpath(
				"//h5[.='Find the default select radio button']/following::div[contains(@class,'ui-state-active')][1]"))
				.isSelected();
		System.out.println(isseleted);
		boolean age = driver.findElement(By.xpath(
				"//h5[.='Select the age group (only if not selected)']/following::div[contains(@class,'ui-state-active')][1]"))
				.isSelected();
		System.out.println(age);
		driver.close();
	}

}
