package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IndividualsPage extends ProjectSpecificMethods{
@When("Click on the dropdown on Individuals tab")
public void clickDropdown() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']")).click();
}
@And("Click on New Individual")
public void clickNewIndividual() {
	WebElement newindividual=driver.findElement(By.xpath("//span[text()='New Individual']"));
	driver.executeScript("arguments[0].click();", newindividual);
}

@Then("Verify the Individual name is updated as (.*)$")
public void verifyIndividualName(String individualname) {
	String text=driver.findElement(By.xpath("(//span[@class='uiOutputText'])[1]")).getText();
	if(text.equals(individualname)) {
		System.out.println("Individual created");
	}
	else {
		System.out.println("Individual not created");
	}
}
}
