package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[text()='Electronics']"));
		WebElement el=driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(el).perform();
		
		driver.findElement(By.xpath("//a[text()='Honor']"));
				
				
		
	}

}
