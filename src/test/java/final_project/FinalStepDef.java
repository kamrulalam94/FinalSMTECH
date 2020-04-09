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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class FinalStepDef {
	//static JavascriptExecutor js;
	WebDriver driver;
	static FinalPf pf;// have to create in order to call from PageFactory page
	ArrayList tabs;
	static Actions mouseover;
	static WebDriverWait explicit;

	@Given("^User go this Url$")
	public void User_go_this_Url() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		mouseover = new Actions(driver);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		explicit = new WebDriverWait(driver, 20);
		// pf = PageFactory.initElements(driver, FinalPf.class);
		// pf.getSginin().click();
		// pf.getSginin().click();
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

		ArrayList<String> prices = new ArrayList<String>();
		// explicit.until(ExpectedConditions.visibilityOf(pf.getPrice1()));
		prices.add(pf.getPrice1().getText());
		prices.add(pf.getPrice2().getText());
		prices.add(pf.getPrice3().getText());
		prices.add(pf.getPrice4().getText());
		prices.add(pf.getPrice5().getText());

		for (String str : prices) {

			System.out.println(str);

		}

		Collections.sort(prices, Collections.reverseOrder());

		System.out.println("ArrayList in descending order:");
		for (String str : prices) {
			System.out.println(str);
		}

	}


	@Then("^select the second dresses on that list$")
	public void select_the_second_dresses_on_that_list() throws Throwable {

		mouseover.moveToElement(pf.getRight_block()).perform();
		pf.getAdd_cart().click();
		explicit.until(ExpectedConditions.elementToBeClickable(pf.getCheckout()));
		pf.getCheckout().click();


	}

	@Then("^verify Total price including shipping charge$")
	public void verify_Total_price_including_shipping_charge() throws Throwable {

		//js.executeScript("window.scrollBy(0, 500)");
		//explicit.until(ExpectedConditions.visibilityOf(pf.getVerify_total_price()));
		String totalprice = pf.getVerify_total_price().getText();

		System.out.println("Verifying total price: " + totalprice);

		// String totalexpectedprice = "$50.09";

		String totalexpectedprice = "$52.99";

		Assert.assertEquals(totalexpectedprice, totalprice);

	}

	@Then("^Logout and close the window$")
	public void logout_and_close_the_window() throws Throwable {
		pf.getLogout().click();
		driver.close();
	}

}