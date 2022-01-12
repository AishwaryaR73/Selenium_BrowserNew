package nopUtility;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


	public class TestMessage extends TestListenerAdapter{
		public void onTestStart(ITestResult result)
		{
			System.out.println("***** Test Started *****");
		}
		public void onTestSuccess(ITestResult tr)
		{
			System.out.println("***** Test is Passed *****");
		}
		
		public void onTestFailure(ITestResult tr)
		{
			System.out.println("***** Test is Failed *****");
		}
		public void onTestSkipped(ITestResult tr)
		{
			System.out.println("***** Test is Skipped *****");
		}
		public void onFinish(ITestContext testContext)
		{
			System.out.println("***** Test Finished *****");
		}
	}


