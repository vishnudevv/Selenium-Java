package assignment4;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Vishnu_Intellipaat\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("(//a[text()='Know More'])[1]")).click();
		Thread.sleep(5000);
		ArrayList <String> wins = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wins.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(wins.get(0));
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
