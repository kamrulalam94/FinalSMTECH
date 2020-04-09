package final_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FinalPf {
	
	WebDriver driver;

	public FinalPf(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (how = How.XPATH,using = "//*[@class ='login']")
	private WebElement sginin;
	
	@FindBy (how = How.NAME,using = "email")
	private WebElement us;
	
	@FindBy (how = How.NAME,using = "passwd")
	private WebElement pass;
	
	@FindBy (how = How.XPATH,using = "(//*[@class = 'icon-lock left'])[1]")
	private WebElement login_btn;
	
	@FindBy (how = How.XPATH,using = "(//*[@class = 'sf-with-ul'])[4]")
	private WebElement dress_btn;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[2]")
	private WebElement price1;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[4]")
	private WebElement price2;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[6]")
	private WebElement price3;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[8]")
	private WebElement price4;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[10]")
	private WebElement price5;
	
	@FindBy(how=How.XPATH, using="(//*[@class='right-block'])[2]")
	private WebElement right_block;
	
	@FindBy(how=How.XPATH, using="(//*[@title='Add to cart'])[2]")
	private WebElement add_cart;
	
	@FindBy(how=How.XPATH, using="(//*[@class='icon-chevron-right right'])[2]")
	private WebElement checkout;
	
	@FindBy(how=How.XPATH, using="//*[@id='total_price']")
	private WebElement verify_total_price;
	
	@FindBy(how=How.XPATH, using="//*[@title='Log me out']")
	private WebElement logout;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSginin() {
		return sginin;
	}

	public void setSginin(WebElement sginin) {
		this.sginin = sginin;
	}

	public WebElement getUs() {
		return us;
	}

	public void setUs(WebElement us) {
		this.us = us;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	public void setLogin_btn(WebElement login_btn) {
		this.login_btn = login_btn;
	}

	public WebElement getDress_btn() {
		return dress_btn;
	}

	public void setDress_btn(WebElement dress_btn) {
		this.dress_btn = dress_btn;
	}

	public WebElement getPrice1() {
		return price1;
	}

	public void setPrice1(WebElement price1) {
		this.price1 = price1;
	}

	public WebElement getPrice2() {
		return price2;
	}

	public void setPrice2(WebElement price2) {
		this.price2 = price2;
	}

	public WebElement getPrice3() {
		return price3;
	}

	public void setPrice3(WebElement price3) {
		this.price3 = price3;
	}

	public WebElement getPrice4() {
		return price4;
	}

	public void setPrice4(WebElement price4) {
		this.price4 = price4;
	}

	public WebElement getPrice5() {
		return price5;
	}

	public void setPrice5(WebElement price5) {
		this.price5 = price5;
	}

	public WebElement getRight_block() {
		return right_block;
	}

	public void setRight_block(WebElement right_block) {
		this.right_block = right_block;
	}

	public WebElement getAdd_cart() {
		return add_cart;
	}

	public void setAdd_cart(WebElement add_cart) {
		this.add_cart = add_cart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}

	public WebElement getVerify_total_price() {
		return verify_total_price;
	}

	public void setVerify_total_price(WebElement verify_total_price) {
		this.verify_total_price = verify_total_price;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	
	

	
}
