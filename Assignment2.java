package assignment2;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Vishnu_Intellipaat\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://bhanusaii.wordpress.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[text()='SELENIUM QUIZ-1']")).click();
		Thread.sleep(5000);
		ArrayList <String> wins = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wins.get(1));
		title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(wins.get(0));
		title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
