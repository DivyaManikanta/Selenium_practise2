package autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement st=driver.findElement(By.id("twotabsearchtextbox"));
		st.sendKeys("phone");
	Thread.sleep(3000);
	List<WebElement> el= driver.findElements(By.xpath("//div[@role='button']"));
	
	System.out.println(el.size());
	for(WebElement b:el) {
		System.out.println(b.getText());
	}
	driver.close();
	
	}

}
