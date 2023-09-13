package Selenium.Webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_WebDriver_Commands {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//maximize() - Used to maximize the current web page
		
		driver.manage().window().maximize();
		
		//get()- Used to open the specified URL's web page

		driver.get("http://omayo.blogspot.com/");
			
		
		driver.findElement(By.id("checkbox2")).click();
		
		driver.findElement(By.name("q")).sendKeys("Test");
		
		driver.findElement(By.className("dropdown")).click();
		
		driver.findElement(By.linkText("compendiumdev")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("input[title='search'][name='q']")).click();
		
		driver.findElement(By.xpath("//input[@id='radio1']")).click();
		
		//WebElement - Store the findElement() to reference variable of WebElement interface
		
		WebElement TextBox = driver.findElement(By.id("textbox1"));
		
		TextBox.clear();
		TextBox.sendKeys("Test1");
		TextBox.clear();
		TextBox.sendKeys("Test2");
		
		
		String Text = driver.findElement(By.id("pah")).getText();
		System.out.println(Text);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		
		//getAttribute()
		String ButtonLabel = driver.findElement(By.cssSelector("input[title='search'][type='Submit']")).getAttribute("value");
		System.out.println("Attribute value for button is = " + ButtonLabel);

		//getText()
		WebElement Button2 = driver.findElement(By.id("but2")); //Button
		System.out.println("Text value for button is = " + Button2.getText());
		
		//isDisplayed()
		boolean ButtonStatus2 = Button2.isDisplayed();
		System.out.println("Button is displayed " + ButtonStatus2);
		
		//isEnabled()
		boolean ButtonEnable = Button2.isEnabled();
		System.out.println("Button is enabled " + ButtonEnable);
		
		//isDisabled()
		WebElement Button1 = driver.findElement(By.id("but1"));
		boolean ButtonStatus1 = Button1.isEnabled();
		if (ButtonStatus1) {									/*True*/				
			
			System.out.println("Button is enabled ");
			
		} else {												/*False*/
			
			System.out.println("Button is disabled ");
		}
		
		
		//isSelected()
		boolean Checkbox = driver.findElement(By.id("checkbox1")).isSelected();
		System.out.println("Button is Selected " + Checkbox);
		
		//navigate()
		driver.navigate().to("http://selenium143.blogspot.com/");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		//getCSSValue()
		String CSS = driver.findElement(By.id("blogsmenu")).getCssValue("line-height");
		System.out.println("line-height is = " + CSS);
		
		//getSize() of given element
		Dimension Button3 = driver.findElement(By.id("but2")).getSize();
		System.out.println("Button height is = " + Button3.height);
		System.out.println("Button width is = " + Button3.width);
		
		
		//pageLoadTimeout() - Used to change the default time for loading web page
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		
		driver.quit();
	}

}
