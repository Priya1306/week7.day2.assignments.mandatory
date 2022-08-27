package hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import stepDefs.ProjectSpecificMethods;

public class HooksImpl extends ProjectSpecificMethods{

@AfterStep
public void takesnap() throws IOException {
	File source =driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./SalesforceSS/createDashboard/snap"+i+".png");
	FileUtils.copyFile(source, dest);
	i++;	
}
}

