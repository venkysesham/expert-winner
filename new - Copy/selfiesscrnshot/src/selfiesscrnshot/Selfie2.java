package selfiesscrnshot;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Selfie2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
  String link = driver.findElement(By.linkText("Customer Service")).getText();	
		System.out.println(link);
		System.out.println("-----------");
		
	List<WebElement> links = driver.findElements(By.tagName("a"));
	for(int i=0; i<links.size();i++)
	{
		System.out.println(links.get(i).getText());
		
	}
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(srcFile,new File("D:\\selfie1.png"));
	
		

		
	}

}
