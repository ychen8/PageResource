package page;

import baseMethod.MainMethod;


import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.UpgradConstants;

/**
 *创建日期:2015-12-2
 *作者： 陈玉婵
 */
public class UpgradPage extends UiAutomatorTestCase implements UpgradConstants{
	MainMethod upgradPage= new MainMethod();
	
	//判断升级标题是否存在
	public Boolean upgradTitleExist(){
		return upgradPage.isExist(UPGRADTITLE);
	}
	//获取升级标题
	public String upgradTitleText(){
		return upgradPage.getText(UPGRADTITLE);
	}
	//判断升级提示内容是否存在
	public Boolean upgradContentExist(){
		return upgradPage.isExist(UPGRADCONTENT);
	}
	//获取升级提示内容
	public String upgradContentText(){
		return upgradPage.getText(UPGRADCONTENT);
	}
	//判断稍后升级是否存在
	public Boolean upgradLaterExist(){
		return upgradPage.isExist(UPGRADLATER);
	}
	//点击稍后升级内容
	public void upgradLaterClick(){
			upgradPage.clickObj(UPGRADLATER);
	}
	//判断立即升级是否存在
	public Boolean upgradExist(){
		return upgradPage.isExist(UPGRADIMMEDIATE);
	}
	//点击立即升级
	public void upgradClick(){
			upgradPage.clickObj(UPGRADIMMEDIATE);
	}
	
}
