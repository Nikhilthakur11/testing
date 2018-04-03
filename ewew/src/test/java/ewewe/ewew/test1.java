package ewewe.ewew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void test1(){
//test
	System.setProperty(
			"webdriver.chrome.driver",
			"\\"
					+ "E:\\selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.gmail.com");
	System.out.println("gmail");

}
}