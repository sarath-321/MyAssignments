package extentreport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		
		//Step:1 -->Path to the file and create a folder manually
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/result.html");
		
		//Step:2 -->to attach  the report in result.html
		ExtentReports extent=new ExtentReports();
		
		//To have the history of the report
		reporter.setAppendExisting(true);
		
		//Step:3-->physical report
		extent.attachReporter(reporter);
		
		//Step:4-->test details  ->author,catergory,testcase,test desc,status of the exe, snapshot
		ExtentTest test = extent.createTest("Login Funtionality","Login with Positive Functionality");
		test.assignCategory("Funtional");
		test.assignAuthor("Sarath");
		test.pass("Executed successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././Snap/snap.png").build());
		//test.fail("Execution is unsuccessful",MediaEntityBuilder.createScreenCaptureFromPath(".././Picture/snap1.png").build());
		
		
		//Mandatory line of code
		extent.flush();
		
		
		
		
		
	}

}
