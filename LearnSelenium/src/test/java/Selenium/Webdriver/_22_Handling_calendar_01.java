package Selenium.Webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class _22_Handling_calendar_01 {
	
	
		static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
	
		SelectDateCalender("25","November","2025");
		
	}
	
	
	
	public static void SelectDateCalender(String selectday,String selectmonth,String selectyear) {
		
		//Explicitly wait for 10 seconds for calender to appear
		
		String MonthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		
		System.out.println(MonthYear);
		
		//Split Month and Year with space seperated
						
		String month = MonthYear.split(" ")[0];
		String year = MonthYear.split(" ")[1];	
		
		
		while (!(month.equals(selectmonth) && year.equals(selectyear))) {
			
		driver.findElement(By.xpath("//a[@title='Next']")).click();
				
		MonthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
							
		month = MonthYear.split(" ")[0];
		year = MonthYear.split(" ")[1];
				
		}
			
		String xpath1 = "//td[@data-handler='selectDay']/a[text()='"+selectday+"']";
		
		System.out.println(xpath1);	
		
		driver.findElement(By.xpath(xpath1)).click();
	
}
	
	
}


