package windoMannagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2021/10/top-50-selenium-interview-questions.html");
		
		//minimize
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		//fullscreen
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		
		

	}

}
