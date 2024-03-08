package introduction;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dynamicdropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//OriginStation
	driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	driver.findElement(By.cssSelector("a[value='DEL']")).click();
	//Destination
	driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
	driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
			                               
	}
	}