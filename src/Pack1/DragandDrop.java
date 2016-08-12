package Pack1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	 
public class DragandDrop {
	 
	public static void main(String[] args) throws Exception {
	 

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	Thread.sleep(5000);

		Actions act=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
	 	
		WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));
	 
		act.dragAndDrop(drag, drop).build().perform();
	 
	}
}