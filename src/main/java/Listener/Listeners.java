package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener{
	ExtentTest test;
	ExtentReporterNG extentobj = new ExtentReporterNG();
	@Override
	public void onTestStart(ITestResult result) {	
		System.out.println("Test Started : " + result.getName());
		 test = extentobj.getReportObject().createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Got Successful : " + result.getName());
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Got Failed : " + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,"Test Got Skipped : " + result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//test.log(Status.,
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extentobj.getReportObject().flush();
		
	}

}
