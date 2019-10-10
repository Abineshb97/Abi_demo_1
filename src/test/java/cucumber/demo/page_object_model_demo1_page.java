package cucumber.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page_object_model_demo1_page {
	WebDriver driver;
	By username = By.name("userName");
	By password = By.name("password");
	By loginbutton = By.name("login");

	public page_object_model_demo1_page(WebDriver driver) {
		this.driver = driver;
	}

	public void do_login(String uid, String pass) {
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginbutton).click();

	}

}
