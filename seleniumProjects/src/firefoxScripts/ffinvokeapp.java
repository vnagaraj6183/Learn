package firefoxScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ffinvokeapp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/venkatbandaru/Downloads/JarFiles/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
	
		driver.quit();

	}

}
