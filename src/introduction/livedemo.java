package introduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class livedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on that column its sorted
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all the webelements into list
		List<WebElement> elementsList=driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all webelements into new orginal list
		List<String> orginallist=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort in the orginal list of step-3 new sorted list
		List<String> sortedList=orginallist.stream().sorted().collect(Collectors.toList());
		
		//compare orginal list vs sorted list
		Assert.assertTrue(orginallist.equals(sortedList));
		
		List<String> price;
	//scan the name column with get text ->beans -> print price of the rice
		do 
		{
			List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
		 price= rows.stream().filter(s->s.getText().contains("Rice")).
				map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		//pagenation
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}
		}while(price.size()<1);
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
