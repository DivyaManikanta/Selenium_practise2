package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L1 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("dbmsza");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
	}

}
