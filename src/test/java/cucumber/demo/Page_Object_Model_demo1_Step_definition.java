package cucumber.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Page_Object_Model_demo1_Step_definition {
	WebDriver driver;
	@Given("^Open Browser$")
	public void open_Browser() throws Throwable {
		driver = UtilityClass.startBrowser("chrome", "http://newtours.demoaut.com/");
	}

	@When("^login using valid login credentials$")
	public void login_using_valid_login_credentials() throws Throwable {
		page_object_model_demo1_page page= new page_object_model_demo1_page(driver);
		page.do_login("tutorial", "tutorial");
	}

	@Then("^Assert and close the browser$")
	public void assert_and_close_the_browser() throws Throwable {
		WebDriverWait wait= new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("tripType")));
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		System.out.println("Logged in Successfully !!");
		driver.close();
	}


}
