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
	//判断意见反馈类型栏-文本是否存在
	public Boolean txtAdviceTypeExist(){
		return feedBackPage.isExist(TXT_ADVICE_TYPE);
	}
	//获取意见反馈类型栏-文本内容
	public String txtAdviceTypeText(){
		return feedBackPage.getText(TXT_ADVICE_TYPE);
	}
	//判断意见反馈－输入提示是否存在
	public Boolean etAdviceExist(){
		return feedBackPage.isExist(ET_ADVICE);
	}
	//获取意见反馈－输入提示内容
	public String etAdviceText(){
		return feedBackPage.getText(ET_ADVICE);
	}
	//判断字数限制是否存在
	public Boolean charNumExist(){
		return feedBackPage.isExist(TXT_CHAR_NUM);
	}
	//获取字数限制
	public String charNumText(){
		return feedBackPage.getText(TXT_CHAR_NUM);
	}
	//判断提交按钮是否存在
	public Boolean btnSubmitExist(){
		return feedBackPage.isExist(BTN_SUBMIT);
	}
	//判断提交按钮是否被激活
	public Boolean btnSubmitEnable(){
		return feedBackPage.objEnabled(BTN_SUBMIT);
	}
	//获取按钮文字
	public String btnSubmitText(){
		return feedBackPage.getText(BTN_SUBMIT);
	}
	//点击提交按钮
	public void btnSubmitClick(){
		feedBackPage.clickObj(BTN_SUBMIT);
	}
	//判断弹框－文本是否存在
	public Boolean confirmTextExist(){
		return feedBackPage.isExist(CONFIRM_TEXT);
	}
	//获取弹框－文本内容
	public String confirmTextText(){
		return feedBackPage.getText(CONFIRM_TEXT);
	}
	//获取弹框－确定　
	public String okBtnText(){
		return feedBackPage.getText(OK_BTN);
	}
	//点击弹框－确定
	public void okBtnClick(){
		feedBackPage.clickObj(OK_BTN);	
	}

}
