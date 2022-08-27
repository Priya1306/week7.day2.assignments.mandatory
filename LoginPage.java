package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods {
	@Given("Enter username as {string}")
	public void typeUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@And("Enter password as {string}")
	public void typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);	
	}


	@When("Click on the login button")
	public void clickLoginbutton() {
		driver.findElement(By.id("Login")).click();
	}
}
