package ewewe.ewew;

import javax.swing.SortingFocusTraversalPolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test2 {
	@Test
	public void test2(){

		System.setProperty(
				"webdriver.chrome.driver",
				"\\"
						+ "E:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		System.out.println("fb");

	}


}
