package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Browser
				//Chrome - ChromeDriver ->Methods close get
				//Firefox - FirefoxDriver ->Methods close get
				//Safari- SafariDriver ->Methods close get
				//WebDriver close get
				//WebDriver methods + class methods
				
				//chromedriver.exe-> chrome browser
				//webdriver.chrome.driver->value of path
				//WebDriver driver = new ChromeDriver();
				
				//Firefox Launch
				//geckodriver
				
				//webdriver.gecko.driver
				//WebDriver driver = new FirefoxDriver();
				
				//Microsoft Edge
				WebDriver driver = new EdgeDriver();
				
				driver.get("https://rahulshettyacademy.com");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
			    //driver.close();
			    //driver.quit();


	}

}
