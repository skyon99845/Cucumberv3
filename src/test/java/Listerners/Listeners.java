package Listerners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{

    @Override
    public void onFinish(ITestContext arg0) {
        System.out.println("Test Execution Finished ---------------------------------------->");

    }

    @Override
    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub
        System.out.println("Test Execution onStart ---------------------------------------->");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("Test Execution onTestFailedButWithinSuccessPercentage ---------------------------------------->");
    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("Test Execution onTestFailure ---------------------------------------->");
    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("Test Execution onTestSkipped ---------------------------------------->");
    }

    @Override
    public void onTestStart(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("Test Execution onTestStart ---------------------------------------->");
    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("Test Execution onTestSuccess ---------------------------------------->");
    }
}