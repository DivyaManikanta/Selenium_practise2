package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2021/10/top-50-selenium-interview-questions.html");
		
		//back
		Thread.sleep(3000);
		driver.navigate().back();
		
		//forward
		Thread.sleep(3000);
		driver.navigate().forward();
		
		//refersh
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//navigateto
		Thread.sleep(3000);
		driver.navigate().to("https://www.naukri.com/mnjuser/homepage");

	}

}
