package listners;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentExample extends TestListenerAdapter{

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	static ExcelUtils excelUtils = new ExcelUtils();
	

	public void onStart(ITestContext testContext) {
		String dateName = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa").format(new Date());
		String reportDestination = System.getProperty("user.dir") + ".//NopReports//LT_NOPComm_ExtentReport//"
				+ dateName + ".html";

		// String reportDestination1 = Constants.mainFile + Constants.test_path +
		// Constants.ExtentFile_path + dateName+ ".html";

		htmlReporter = new ExtentHtmlReporter(reportDestination);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "Localhost");
		extent.setSystemInfo("Environment", "Production");
		extent.setSystemInfo("User Name", "Aishwarya");
		htmlReporter.config().setReportName("Regression Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
	}

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName()); // create new entry in the report
		test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
		test.info("************passed ********************");
	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName()); // create new entry in the report
		test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
		test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent
										
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName()); // create new entry in th report
		test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
	}

	public void onFinish(ITestContext testContext) {
		extent.flush();
	}
}
