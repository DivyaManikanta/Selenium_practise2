package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(drop);
		s.selectByIndex(14);
		s.selectByValue("search-alias=luggage-intl-ship");
		s.selectByVisibleText("Pet Supplies");
		
		List<WebElement> allopt =s.getOptions();
		System.out.println(allopt.size());
		
		for(WebElement b:allopt) {
			System.out.println(b.getText());
		}
		driver.close();

}
}
