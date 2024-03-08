package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class relativelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	//nameeditbox(above)
	WebElement nameeditBox=driver.findElement(By.cssSelector("[name='name']"));
    System.out.println(driver.findElement(with(By.tagName("label")).above(nameeditBox)).getText());
    
    //dateofbirth(below)
    WebElement dateofBirth= driver.findElement(By.cssSelector("[for='dateofBirth']"));
    driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
    
    //checkbox(to left of)
    WebElement IceCreamslabel=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
    driver.findElement(with(By.tagName("input")).toLeftOf(IceCreamslabel)).click();
    
    //radiobutton(to right of)
    WebElement rdb=driver.findElement(By.id("inlineRadio1"));
    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
    
	}

}
