package introduction;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class sslcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options= new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
	    options.setCapability("proxy", proxy);
	    Map<String, Object> prefs = new HashMap<String, Object>();
	    prefs.put("download.default_directory", "/directory/path");
	    options.setExperimentalOption("prefs", prefs);

		//FirefoxOptions options1 = new FirefoxOptions();
		//options1.setAcceptInsecureCerts(true);
	    
		//EdgeOptions options2 = new EdgeOptions();
	    //options2.setAcceptInsecureCerts(true);
		
		options.setAcceptInsecureCerts(true);     
	    WebDriver driver=new ChromeDriver(options);
		//WebDriver driver=new FirefoxDriver(options1);
		//WebDriver driver=new EdgeDriver(options2);
		 driver.get("https://expired.badssl.com/"); 
		 System.out.println(driver.getTitle());
	}

}
