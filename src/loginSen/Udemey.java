package loginSen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Udemey {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/join/login-popup/");
		//driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.name("email")).sendKeys("qwertyuio");
		driver.findElement(By.name("password")).sendKeys("123456rdyg");
		driver.findElement(By.name("submit")).click();
		
		String actualtile=driver.getTitle();
		System.out.println(actualtile);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(actualtile.contains("  Login | Udemy")) {
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		

	}

}
