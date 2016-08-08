package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTests {
	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser(){
		driver=new FirefoxDriver();		
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void CloseBrowser(){
		driver.close();
	}
	
	@Test
	public void google(){		
		driver.get("http://google.com");		
	}
	
	@Test(dependsOnMethods="google")
	public void quikr(){		
		driver.get("http://quikr.com");	
	}
	
	@Test(dependsOnMethods="quikr")
	public void gmail(){		
		driver.get("http://gmail.com");
	}
	@Test(dependsOnMethods="gmail")
	public void carwale(){		
		driver.get("http://carwale.com");		
	}

}
