package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1 {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("nav-link-accountList")).click();
	driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	
	
}
}
