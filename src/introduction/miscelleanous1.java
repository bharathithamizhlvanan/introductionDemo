package introduction;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class miscelleanous1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//WebDriver Manager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='q']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Searching Mutual Funds");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		List<WebElement>links=driver.findElements(By.xpath("//*[@id='res']//a/h3"));
		int count=links.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String linkname = driver.findElements(By.xpath("//*[@id='res']//a/h3")).get(i).getText();
			System.out.println(linkname);
		}
		getScreenshot();
		}
       public static void getScreenshot() throws IOException
       {
       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileHandler.copy(src, new File("C:\\google.png"));
       }
	
      }
