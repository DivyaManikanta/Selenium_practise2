package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement sech=driver.findElement(By.name("q"));
		if(sech.isDisplayed()) {
			System.out.println("pass ele is displayed");
			sech.sendKeys("selenium");
		}
		else
		{
			System.out.println("fail ele is not displayed");
		}
		//driver.close();
		
	}
}
