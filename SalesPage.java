package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SalesPage extends ProjectSpecificMethods{
	@When("Click on Opportunity tab")
	public void clickOpportunity() {
		WebElement opportunities=driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", opportunities);
	}
	
	@When("Click on Accounts tab")
	public void clickAccounts() {
		WebElement accounts=driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", accounts);
	}
	
	@When("Click on Dashboards tab")
	public void clickDashboards() {
		WebElement dashboards=driver.findElement(By.xpath("//span[text()='Dashboards']"));
		driver.executeScript("arguments[0].click();", dashboards);
	}
			
			 }
