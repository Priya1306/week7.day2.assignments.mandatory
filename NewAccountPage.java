package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class NewAccountPage extends ProjectSpecificMethods{
	@When("Type the Account name as (.*)$")
	public void typeAccountName(String accountname) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(accountname);
	}
	@And("Select Ownership as Public")
	public void selectOwnership() throws InterruptedException {
		Thread.sleep(3000);
		Actions builder=new Actions(driver);
		WebElement ownership=driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux')])[3]"));
		builder.scrollToElement(ownership).perform();
		driver.executeScript("arguments[0].click();", ownership);
		driver.findElement(By.xpath("(//span[text()='Public'])[1]")).click();
	}

	@And("Click Save button in new Account page")
	public void clickSave() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
}
