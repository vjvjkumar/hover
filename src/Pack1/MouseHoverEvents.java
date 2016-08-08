package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHoverEvents {
	@Test
	public void test() throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.marutisuzuki.com/");
		Thread.sleep(2000);
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(".//*[@id='aa_baseHtml1']/header/div/div/div[2]/ul[1]/li[1]/div[1]/a")));
		driver.findElement(By.linkText(".//*[@id='aa_baseHtml1']/header/div/div/div[2]/ul[1]/li[1]/div[1]/a")).click(); */ 
		
		
		WebElement MouseHover=driver.findElement(By.linkText("SHOWROOM"));
		
		//create object for actions
		Actions act = new Actions(driver);
		act.moveToElement(MouseHover).build().perform();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//*[@id='see_all']/ul/li[7]/a/span[1]/img")).click(); 
	}
}
