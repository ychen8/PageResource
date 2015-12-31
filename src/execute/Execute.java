package execute;

import baseMethod.Base;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 *创建日期:2015-12-31
 *作者： 陈玉婵
 */
public class Execute extends UiAutomatorTestCase{
	Base base=new Base();
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		base.launchApp();
		base.login();
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		base.exit();
		super.tearDown();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String jarName="demo";
		   String testClass="";
		   String testName="";
		   String androidId="";
		   new UiAutomatorHelper(jarName, testClass, testName, androidId);

	}

}
