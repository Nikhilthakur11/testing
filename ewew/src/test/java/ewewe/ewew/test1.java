package ewewe.ewew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	public static void main(String args[]){
//test
	System.setProperty(
			"webdriver.chrome.driver",
			"\\"
					+ "F:\\selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.gmail.com");
	System.out.println("test");

}
}