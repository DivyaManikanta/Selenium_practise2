package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement sech=driver.findElement(By.id("twotabsearchtextbox"));
		if(sech.isDisplayed()) {
			System.out.println("pass ele is displayed");
			sech.sendKeys("phone");
		}
		else
		{
			System.out.println("fail ele is not displayed");
		}
		driver.close();
		
	}
			
		
		
	}
	

