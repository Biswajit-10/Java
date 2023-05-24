package testingInJava;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;

public class DemoT {
	
	public static void main(String[] args) throws Exception{
		DemoT d=new DemoT();
		ChromeDriver driver = d.initDriver();
		d.testImplicitWait(driver);
		d.closeDriver(driver);
	}
	
	private ChromeDriver initDriver() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
		return driver;
	}
	private void closeDriver(WebDriver driver) {
		driver.close();
	}
	private void testImplicitWait(WebDriver driver) throws Exception{
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Downloads")).click();
//		minimize the application
		Thread.sleep(5000);
		driver.findElement(By.linkText("documentation")).click();
		
		Logs logs = driver.manage().logs();
		LogEntries logEntries = logs.get(LogType.BROWSER);
		List<LogEntry> allLogEntry = logEntries.getAll();
		
		for (LogEntry logEntry : allLogEntry) {
			System.out.println(logEntry.toString());
			Map<String, Object> json = logEntry.toJson();
			System.out.println(json.keySet());
		}
	}
	
}
