package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(" ");
		
		WebElement ele = driver.findElement(By.xpath("locate the xpath/Dynamic-xpath"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		//Now I want to locate the number of anchor-links, by using element locator and anchor-links "size loop" 
		List<WebElement> links=driver.findElements(By.xpath("locate the xpath/Dynamic-xpath")); 
		
		//let me check how many links are there now
		int Count = links.size();
		
		for (int i=0; i < Count; i++) 
		{
			WebElement element = links.get(i);
			String text = element.getAttribute("innerHTML"); // by this, i want to the attribute of the innerHtml in the form of String-Text.
			
			boolean status = element.isEnabled(); // now, i want to print the status of each link or url 
			
			System.out.println("Links name is "+ text + "and the link status is "+ status);
			
			if (text.equalsIgnoreCase("Appium"))
			{
				element.click();
				break;
			}
}
}
}
