package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DashboardPage extends ProjectSpecificMethods{
	@And("Click on New Dashboard option")
	public void clickNewDashboard() {
		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
	}
	
	@And("Click Done in dashboard page")
	public void clickDone() {
		driver.findElement(By.xpath("//button[text()='Done']")).click();
	}
	
	@And("Type the search box as (.*)$")
	public void typeSearchbox(String text) {
		driver.findElement(By.xpath("//input[@placeholder='Search recent dashboards...']")).sendKeys(text);
	}
	
	@Then("Verify the dashboard name as (.*)$")
	public void verifyDashboardname(String name) {
		System.out.println(name);
		String text=driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid_align-spread']//a)[1]")).getText();
		
		System.out.println(text);
		if(text.equals(name)) {
			System.out.println("Dashboard created");
		}
		else {
			System.out.println("Dashboard not created");
		}
	}
}
