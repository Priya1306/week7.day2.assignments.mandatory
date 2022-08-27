package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AccountsPage extends ProjectSpecificMethods{
	@And("Click on New in Accounts")
	public void clickNew() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}
	
	@Then("Verify the Account name is updated as (.*)$")
	public void verifyOpportunityName(String accountname) {
		String text=driver.findElement(By.xpath("//lightning-formatted-text[@class='custom-truncate']")).getText();
		if(text.equals(accountname)) {
			System.out.println("Account created");
		}
		else {
			System.out.println("Account not created");
		}
	}
}
