package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.FeedBackConstants;

/**
 *创建日期:2015-12-11
 *作者： 陈玉婵
 */
public class FeedBackPage extends UiAutomatorTestCase implements
		FeedBackConstants {
	MainMethod feedBackPage=new MainMethod();
	//判断返回icon是否存在
	public Boolean returnExist(){
		return feedBackPage.isExist(BACK);
	}
	//点击返回
	public void returnClick(){
		feedBackPage.clickObj(BACK);
	}
	//判断标题是否存在
	public Boolean titleExist(){
		return feedBackPage.isExist(TITLE);
	}
	//获取标题内容
	public String titleText(){
		return feedBackPage.getText(TITLE);
	}
	//判断意见反馈类型栏是否存在
	public Boolean llAdviceTypeExist(){
		return feedBackPage.isExist(LL_ADVICE_TYPE);
	}
	//点击意见反馈类型栏
	public void llAdviceTypeClick(){
		feedBackPage.clickObj(LL_ADVICE_TYPE);
	}
	
	

}
