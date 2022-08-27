package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewOpportunityPage extends ProjectSpecificMethods{
@When("Type the Opportunity name as (.*)$")
public void typeOpportunityName(String opportunityname) {
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(opportunityname);
}

@And("Choose the close date as today")
public void selectDate() {
	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	driver.findElement(By.xpath("//td[@data-value='2022-08-23']//span[1]")).click();
}


@And("Select the stage as Need Analysis")
public void selectStage() {
	Actions builder=new Actions(driver);
	WebElement stage=driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]"));
	builder.scrollToElement(stage).perform();
	stage.click();
	driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
}


@And("Click Save button in new opportunity page")
public void clickSave() {
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
}

@Then("Verify the alert message displayed for name as (.*)$")
public void verifyNameAlertMessage(String message) {
	String text=driver.findElement(By.xpath("(//div[@class='slds-form-element__help'])[1]")).getText();
	if(text.equals(message)) {
		System.out.println("Alert message is displayed for name field");
	}
	else {
		System.out.println("Alert message is not displayed for name field");
	}
}

@Then("Verify the alert message displayed for stage as (.*)$")
public void verifyStageAlertMessage(String message) {
	String text1=driver.findElement(By.xpath("(//div[@class='slds-form-element__help'])[2]")).getText();
	if(text1.equals(message)) {
		System.out.println("Alert message is displayed for stage field");
	}
	else {
		System.out.println("Alert message is not displayed for stage field");
	}
}




}
