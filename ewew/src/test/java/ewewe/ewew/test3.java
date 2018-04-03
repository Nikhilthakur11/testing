package ewewe.ewew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test3 {
	@Test
	public void test3(){

		System.setProperty(
				"webdriver.chrome.driver",
				"\\"
						+ "E:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		System.out.println("amazon");
	}


}
