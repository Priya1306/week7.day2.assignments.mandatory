package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefs.ProjectSpecificMethods;
@CucumberOptions(features="src/test/java/features/createDashboard.feature",
glue={"stepDefs","hooks"},
monochrome=true,
publish=true)
public class RunCucumberTests extends ProjectSpecificMethods{

}
