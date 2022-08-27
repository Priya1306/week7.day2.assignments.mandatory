package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePage extends ProjectSpecificMethods{

	@Then("Verify whether home page is displayed")
	public void verifyHomepage() throws InterruptedException {
		Thread.sleep(3000);
		String title=driver.getTitle();
		if(title.contains("Home")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
	}

	@Given("Click toggle menu button from left corner")
	public void clickToggle() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@And("Click view all")
	public void clickViewAll() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}

	@And("Click Sales link")
	public void clickSales() {
		Actions builder=new Actions(driver);
		WebElement sales=driver.findElement(By.xpath("//p[text()='Sales']"));
		builder.scrollToElement(sales).perform();
		sales.click();
	}

	@And("Click on Individuals link")
	public void clickIndividuals() throws InterruptedException {
		Thread.sleep(3000);
		Actions builder=new Actions(driver);
		WebElement individuals=driver.findElement(By.xpath("//p[text()='Individuals']"));
		builder.scrollToElement(individuals).perform();
		individuals.click();
	}

	@And("Click on Dashboards link")
	public void clickDashboards() throws InterruptedException {
		Thread.sleep(3000);
		Actions builder=new Actions(driver);
		WebElement dashboards=driver.findElement(By.xpath("//p[text()='Dashboards']"));
		builder.scrollToElement(dashboards).perform();
		dashboards.click();
	}
}
