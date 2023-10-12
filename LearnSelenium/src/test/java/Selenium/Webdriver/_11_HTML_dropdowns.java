package Selenium.Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _11_HTML_dropdowns {

	public static void main(String[] args) {
		
		/* HTML Drop-down fields */
		// In displayed HTML code if displayed select tag then it's HTML dropdown field.
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement dropdown1 = driver.findElement(By.id("drop1"));
		
		
		Select select = new Select(dropdown1);
		
		System.out.println("Can select mutiple option " + select.isMultiple());
		
		/* Select commands */
		
		select.selectByVisibleText("doc 2");
		
		//select.selectByIndex(1);
		
		//select.selectByValue("jkl");
		
		List<WebElement> option = select.getOptions();
		
		for (WebElement alloption : option) {
			
			System.out.println(alloption.getText());
			
		}
		
		
		//Multi-selection dropdown
		
		WebElement dropdown2 = driver.findElement(By.id("multiselect1"));
		
		Select selectdropdown = new Select(dropdown2);
		System.out.println("Can select mutiple option " + selectdropdown.isMultiple());
		
		selectdropdown.isMultiple();
		
		selectdropdown.selectByVisibleText("Hyundai");
		selectdropdown.selectByIndex(0);
		selectdropdown.selectByValue("audix");
		
		
		
		
			
		
	}
		
}


