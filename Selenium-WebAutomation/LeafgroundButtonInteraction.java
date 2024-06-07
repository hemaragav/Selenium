package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[.='Click']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		boolean isenabled = driver.findElement(By.xpath("//button[contains(@class,'ui-state-disabled')]")).isEnabled();
		System.out.println(isenabled);
		WebElement position = driver.findElement(By.xpath("//span[.='Submit']"));
		Point location = position.getLocation();
		System.out.println("Location of the button is: " + location);
		WebElement button = driver.findElement(By.xpath("//span[.='Save']"));
		String color = button.getCssValue("color");
		System.out.println("The Save button color is: " + color);
		WebElement button1 = driver
				.findElement(By.xpath("//h5[.='Find the height and width of this button']/following::button[1]"));
		Dimension dimension = button1.getSize();

		int height = dimension.getHeight();
		int width = dimension.getWidth();
		System.out.println("Button Height: " + height);
		System.out.println("Button Width: " + width);

		driver.close();

	}

}
