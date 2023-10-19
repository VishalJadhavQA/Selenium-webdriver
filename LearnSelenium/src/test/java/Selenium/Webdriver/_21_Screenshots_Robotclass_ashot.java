package Selenium.Webdriver;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _21_Screenshots_Robotclass_ashot {

	public static void main(String[] args) throws AWTException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		/*Taking Screenshots using Robot Class */
		
		driver.get("https://omayo.blogspot.com/");
		
		Robot robot = new Robot();
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect = new Rectangle(dimension);
		
		BufferedImage bufferedImage = robot.createScreenCapture(rect);
		
		String screenshotPath = System.getProperty("user.dir")+"//Screenshots//robot.png";
		
		ImageIO.write(bufferedImage,"png",new File(screenshotPath));
		
		
		


	}

}
