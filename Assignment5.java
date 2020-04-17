package assignmen5;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Vishnu_Intellipaat\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.switchTo().frame("login_page");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='Know More'])[1]")).click();
		Thread.sleep(5000);
		ArrayList <String> wins = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wins.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(wins.get(0));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(wins.get(1));
		driver.close();

	}

}
