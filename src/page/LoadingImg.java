package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * Description：
 * Date: 2016-1-6
 * @author 李怡萱
 * */
public class LoadingImg extends UiAutomatorTestCase {

	MainMethod loadingimg = new MainMethod();
	
	public Boolean loadingImgExist() {
		return loadingimg.isExistFromText("加载中...");
	}
	
//	public Boolean networkErrorExist(){
		
//	}

}
