package Selenum;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo21 {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("https://www.amazon.in/");
	Thread.sleep(2000);
	TakesScreenshot ts=(TakesScreenshot)D;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst=new File("C:\\Users\\HP\\Desktop\\Html\\p.jpeg");
	FileUtils.copyFile(src, dst);
	
	}

}
