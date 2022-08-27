package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class NewDashboardPage extends ProjectSpecificMethods{

	@When("Type the name as (.*)$")
	public void typename(String name) throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='dashboard']")));
		WebElement dashboardname=driver.findElement(By.xpath("(//input[@class='slds-input'])[1]"));
		driver.executeScript("arguments[0].click();", dashboardname);
		dashboardname.sendKeys(name);
		
	}
	
	@And("Click Create button in new dashboard page")
	public void clickCreate() {
		driver.findElement(By.xpath("//button[text()='Create']")).click();
	}

}
