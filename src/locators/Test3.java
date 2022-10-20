package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Forgotten password?")).click();
		 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("8550034965");
		 driver.findElement(By.cssSelector("button[id='did_submit']")).click();
		 driver.findElement(By.cssSelector("input[id='send_email']")).click();
}
}