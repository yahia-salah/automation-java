package resources;

import base.BasePage;
import base.ExtentManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends BasePage implements ITestListener {
    public Listeners() throws IOException {
    }

    public synchronized void onStart(ITestContext context){
        ExtentManager.getReport();
        ExtentManager.createTest(context.getName(),context.getName());
    }

    public synchronized void onFinish(ITestContext context){
        ExtentManager.flushReport();
    }

    public synchronized void onTestFailure(ITestResult result){
        ExtentManager.fail(result.getThrowable().toString());
        try{
            System.out.println("Test failed: "+result.getName());
            takeSnapShot(result.getMethod().getMethodName());
            ExtentManager.attachImage();
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    }
}
