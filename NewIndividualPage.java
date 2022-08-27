package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class NewIndividualPage extends ProjectSpecificMethods {
	@When("Type the Last name as (.*)$")
	public void typeLastname(String lastname) {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);		
	}

	@And("Click Save button in new individual page")
	public void clickSave(){
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	}
}
