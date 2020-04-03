package final_project;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class FinalStepDef {
	WebDriver driver;
	FinalPf pf;

	@Given("^User go this Url$")
	public void User_go_this_Url() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//pf = PageFactory.initElements(driver, FinalPf.class);
		//pf.getSginin().click();
	}

	@Given("^go to sign in button and click it$")
	public void go_to_sign_in_button_and_click_it() throws Throwable {
		
		pf = PageFactory.initElements(driver, FinalPf.class);
		pf.getSginin().click();

	}

	@Given("^print website Tittle$")
	public void print_website_Tittle() throws Throwable {

		System.out.println(driver.getTitle());
	}

	@When("^put User name and password then click it$")
	public void put_User_name_and_password_then_click_it() throws Throwable {
		pf.getUs().sendKeys("apon8298@gmail.com");
		pf.getPass().sendKeys("239350");
		pf.getLogin_btn().click();
		System.out.println(driver.getTitle());
	}

	@When("^Click on upper left corner Dresses$")
	public void click_on_upper_left_corner_Dresses() throws Throwable {

		pf.getDress_btn().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	@When("^Print all dresses by Descending order$")
	public void print_all_dresses_by_Descending_order() throws Throwable {
		
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
		
		
	}

	@Then("^select the second dresses on that list$")
	public void select_the_second_dresses_on_that_list() throws Throwable {
		Actions action = new Actions(driver);
		WebElement dress = driver.findElement(By.xpath("(//*[@class = 'product-container'])[2]"));
		action.moveToElement(dress).perform();
		WebElement cert = driver.findElement(By.xpath("(//*[@class = 'button ajax_add_to_cart_button btn btn-default'])[2]"));
		cert.click();
		WebElement btn = driver.findElement(By.xpath("(//*[@class = 'icon-chevron-right right'])[2]"));
		// Explicit wait only for line 89 code under example of that...
		Thread.sleep(2500);
		btn.click();

	}

	@Then("^verify Total price including shipping charge$")
	public void verify_Total_price_including_shipping_charge() throws Throwable {

		WebElement total_price = driver.findElement(By.xpath("//*[@id = 'total_price']"));
		total_price.getText();
		// we use assertion for verification purpose, 1st we create String object for
		// the actual price then we create another expected price...
		System.out.println("Actual match with expected:");
		System.out.println(total_price.getText());
		
		String real = total_price.getText();
		String gussing = "$52.99";
		Assert.assertEquals(gussing, real);
	}
	
	@Then("^Logout and close the window$")
	public void logout_and_close_the_window() throws Throwable {
	   pf.getLogout().click();
	   driver.close();
	}

}
