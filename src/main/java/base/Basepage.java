package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basepage {
	public static WebDriver driver;
	public Basepage(){	
	}
	
	public static void launchbrowser(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Monicca2502\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}
