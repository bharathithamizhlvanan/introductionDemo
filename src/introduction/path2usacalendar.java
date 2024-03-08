package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class path2usacalendar {
	
	static String url="https://www.path2usa.com/travel-companion/";
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(30000);
		
		//scroll the page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
		
		//click on the date field
		Thread.sleep(3000);
		WebElement Date= driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']"));
		//js.executeScript("arguments[0].scrollintoView(true);",Date);
		Date.click();
		
		//clink on the month
		WebElement month = driver.findElement(By.xpath("//div[@class='flatpickr-month']"));
		while(!driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().contains("August"))
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
			
		}		
		//click on that specific date
		int count= driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).size();
		for(int i=0;i<count;i++)
		{
			 Thread.sleep(2000);
		     String text=driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).getText();
		     if(text.equalsIgnoreCase("26"))
		     { 		    	
				driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).click();
			    System.out.println("The select day is:"+text);
			    break;
		     }
		 }
		 String date = driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).getAttribute("value");
		 System.out.println("The select date is:"+date);
		
		
		
		
		
		
	}

}
