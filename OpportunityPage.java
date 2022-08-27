package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class OpportunityPage extends ProjectSpecificMethods{
	@And("Click on New in opportunity")
	public void clickNew() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@Then("Verify the opportunity name is updated as (.*)$")
	public void verifyOpportunityName(String opportunityname) {
		String title=driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		if(title.equals(opportunityname)) {
			System.out.println("Opportunity created");
		}
		else {
			System.out.println("Opportunity not created");
		}
	}
}
