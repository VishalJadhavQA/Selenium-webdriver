package Selenium.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _12_Generic_function_dropdowns {
	
	//Declaring driver globally
	static WebDriver driver;

	public static void main(String[] args) {
		
		//Generic Function to handle HTML dropdown fields in Selenium
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/dropdowns");
		
		By fruit = By.id("fruits");
		By language = By.id("lang");
		
		dropdownoption(fruit, "Mango");	
		dropdownoption(language,"Python");
						
		}
	
	//Xpath to webelement conversion
	public static WebElement getwebelement(By field) {
		
		return driver.findElement(field);
				
	}
	
	
	//select value using text
	  public static void dropdownoption(By field,String option) {
	  
	  Select select = new Select(getwebelement(field));
	  select.selectByVisibleText(option);
	  
	  }
	 

}
