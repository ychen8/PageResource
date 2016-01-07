package execute;

import baseMethod.Base;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 创建日期:2015-12-31 作者： 陈玉婵
 */
public class Execute extends UiAutomatorTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jarName = "a";
		String testClass = "testcase.SerOrderCase";
		String testName = "";
		String androidId = "17";
		new UiAutomatorHelper(jarName, testClass, testName, androidId);

	}

}
