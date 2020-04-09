package final_project;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;


public class FinalProject {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// Initialize browser
		WebDriver driver = new ChromeDriver();

		// Open automation practice
		driver.get("http://automationpractice.com/index.php");

		// Maximize browser
		driver.manage().window().maximize();

		// go to sign in button and click it
		WebElement sginin = driver.findElement(By.xpath("//*[@class ='login']"));
		sginin.click();

		// print_website_Tittle
		System.out.println(driver.getTitle());

		// put User name and password then click it
		WebElement us = driver.findElement(By.name("email"));
		us.sendKeys("apon8298@gmail.com");
		// put User password then click it
		WebElement pass = driver.findElement(By.name("passwd"));
		pass.sendKeys("239350");
		//click login button
		WebElement login_btn = driver.findElement(By.xpath("(//*[@class = 'icon-lock left'])[1]"));
		login_btn.click();

		// Print_website_Tittle
		System.out.println(driver.getTitle());

		// Click on upper left corner (Dresses) link, bellow displayed( showing 1-5 of 5
		// items)
		WebElement dress_btn = driver.findElement(By.xpath("(//*[@class = 'sf-with-ul'])[4]"));
		dress_btn.click();

		// javascriptexecutor scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");

		// Descending order help by Shamim bhai...
		WebElement price1 = driver.findElement(By.xpath("(//*[@itemprop = 'price'])[2]"));
		WebElement price2 = driver.findElement(By.xpath("(//*[@itemprop = 'price'])[4]"));
		WebElement price3 = driver.findElement(By.xpath("(//*[@itemprop = 'price'])[6]"));
		WebElement price4 = driver.findElement(By.xpath("(//*[@itemprop = 'price'])[8]"));
		WebElement price5 = driver.findElement(By.xpath("(//*[@itemprop = 'price'])[10]"));

		ArrayList<String> prices = new ArrayList<String>();
		prices.add(price1.getText());
		prices.add(price2.getText());
		prices.add(price3.getText());
		prices.add(price4.getText());
		prices.add(price5.getText());

		// Unsorted List: ArrayList Content before sorting
		System.out.println("before Sorting:");
		for (String str : prices) {
			System.out.println(str);
		}

		// Sorting in descending order
		Collections.sort(prices, Collections.reverseOrder());

		// sorted list in reverse order
		System.out.println("PriceList in Descending order:");
		for (String str : prices) {
			System.out.println(str);
		}
		// select the 2nd dresses

		Actions action = new Actions(driver);
		WebElement dress = driver.findElement(By.xpath("(//*[@class = 'product-container'])[2]"));
		action.moveToElement(dress).perform();
		WebElement cert = driver.findElement(By.xpath("(//*[@class = 'button ajax_add_to_cart_button btn btn-default'])[2]"));
		cert.click();
		WebElement btn = driver.findElement(By.xpath("(//*[@class = 'icon-chevron-right right'])[2]"));
		// Explicit wait only for line 89 code under example of that...
		
		Thread.sleep(3000);
		btn.click();

		// verify Total_price//
		WebElement total_price = driver.findElement(By.xpath("//*[@id = 'total_price']"));
		total_price.getText();
		// we use assertion for verification purpose, 1st we create String object for
		// the actual price then we create another expected price...
		System.out.println("Actual match with expected:");
		System.out.println(total_price.getText());
		
		String real = total_price.getText();
		String gussing = "$52.99";
		Assert.assertEquals(gussing, real);
		//Assert.assertTrue("The price does not match", real.equals(gussing));
		// logout account
		WebElement logout = driver.findElement(By.xpath("//*[@class= 'logout']"));
		// Thread.sleep(2000);
		logout.click();
		// Close Browser
		// Thread.sleep(4000);
		// Thread.sleep(4000);
		//driver.close();

	}
}
