package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	@Test

public void TitleValidation() {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
driver.get("http:\\google.com");
String title=driver.getTitle();
Assert.assertEquals(title, "Google");
driver.quit();
	}
	}
