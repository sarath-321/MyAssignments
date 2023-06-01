package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//to run multiple feature files use 
/*@CucumberOptions(features = "src/test/java/features",
                 glue = "steps",
                 monochrome = true,
                 publish = true)        or        */  


/*@CucumberOptions(features = {"src/test/java/features/Login.feature","src/test/java/CreateLead.feature"},
                 glue = "steps",
                 monochrome = true,
                 publish = true
                 )
 or  */


/*@CucumberOptions(features = "src/test/java/features/CreateLead.feature",
glue = "steps",
monochrome = true,
publish = true)        or        */ 


/*@CucumberOptions(features = "src/test/java/features/CreateLead.feature",//----> mentioning feature file loc
glue = "steps",//---> mentioning package name for mapping feature file with step definition 
monochrome = true,//----> remove unwanted char from console
publish = true,//---> generating report
snippets = SnippetType.CAMELCASE,//---> default methods user_name to userName
dryRun = true,//--->to check mapping
plugin = {"pretty",
                		    "html:reports",
                		    "json:reports/result.json",
                		    "junit:reports/result.xml"}, //---> to generate reports
tags = "@smoke" //---> to group tests              		    
                		    
                		    



)        or        */

                 
                 
@CucumberOptions(features = "src/test/java/features",
                 glue = "steps",
                 monochrome = true,
                 publish = true,
                 tags = "@smoke"
                 )
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
