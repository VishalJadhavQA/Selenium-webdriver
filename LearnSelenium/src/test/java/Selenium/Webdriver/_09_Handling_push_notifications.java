package Selenium.Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _09_Handling_push_notifications {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.homedepot.com/");

	}

}
