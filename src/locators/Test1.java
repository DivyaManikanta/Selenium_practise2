package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Forgotten password?")).click();
		 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		 driver.findElement(By.cssSelector("button[id='did_submit']")).click();
		 
	}

}
