package genericutility;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LsitenerUtility extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			wUtil.getPhoto(driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
