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
	
	
	@FindBy (how = How.XPATH,using = "//*[@class= 'logout']")
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


	public WebElement getLogout() {
		return logout;
	}


	public void setLogout(WebElement logout) {
		this.logout = logout;
	}

}
