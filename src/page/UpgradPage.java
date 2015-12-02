package page;

import baseMethod.MainMethod;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.UpgradConstants;

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
		try {
			upgradPage.getObj(UPGRADLATER).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断立即升级是否存在
	public Boolean upgradExist(){
		return upgradPage.isExist(UPGRADIMMEDIATE);
	}
	//点击立即升级
	public void upgradClick(){
		try {
			upgradPage.getObj(UPGRADIMMEDIATE).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
