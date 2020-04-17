package assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Vishnu_Intellipaat\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		driver.navigate().to("https://bhanusaii.wordpress.com/");
		Thread.sleep(5000);
		curl = driver.getCurrentUrl();
		System.out.println(curl);
		driver.navigate().back();
		Thread.sleep(5000);
		curl = driver.getCurrentUrl();
		System.out.println(curl);
		driver.navigate().forward();
		Thread.sleep(5000);
		curl = driver.getCurrentUrl();
		System.out.println(curl);
		driver.navigate().refresh();
		Thread.sleep(5000);
		curl = driver.getCurrentUrl();
		System.out.println(curl);
		Thread.sleep(2000);
		driver.close();
	}

}
