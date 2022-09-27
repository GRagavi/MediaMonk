package Listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	public ExtentReports getReportObject() {
	 String path = System.getProperty("user.dir")+ "results\\index.html";
	 ExtentSparkReporter spark = new ExtentSparkReporter(path);
	 spark.config().setDocumentTitle("Automation Execution Report");
	 spark.config().setReportName("Execution Results");
	 
	 ExtentReports extent = new ExtentReports();
	 extent.attachReporter(spark);
	 extent.setSystemInfo("Executed By","Ragavi G");
	 extent.createTest(path);
	 return extent;
	 
	}
}
