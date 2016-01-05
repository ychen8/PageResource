package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.PersonSetConstants;

/**
 *创建日期:2015-12-10
 *作者： 陈玉婵
 */
public class PersonSetPage extends UiAutomatorTestCase implements
		PersonSetConstants {
	MainMethod personSetPage= new MainMethod();
	//判断返回icon是否存在
	public Boolean returnExist(){
		return personSetPage.isExist(BACK);
	}
	//点击返回
	public void returnClick(){
		personSetPage.clickObj(BACK);
	}
	//判断标题是否存在
	public Boolean titleExist(){
		return personSetPage.isExist(TITLE);
	}
	//获取标题内容
	public String titleText(){
		return personSetPage.getText(TITLE);
	}
	//判断修改密码是否存在
	public Boolean llModifyPassExist(){
		return personSetPage.isExist(LL_MODIFY_PASS);
	}
	//判断修改密码文本是否存在
	public Boolean modifyPassExist(){
		return personSetPage.isExistFromId(LL_MODIFY_PASS,INDEX_LL_MODIFY_PASS);
	}
	//获取修改密码文本内容
	public String modifyPassText(){
		return personSetPage.getTextFromId(LL_MODIFY_PASS,INDEX_LL_MODIFY_PASS);
	}
	//点击修改密码
	public void llModifyPassClick(){
		personSetPage.clickObj(LL_MODIFY_PASS);
	}
	//判断导航下载栏是否存在
	public Boolean llOffLineExist(){
		return personSetPage.isExist(LL_OFFLINE_MAP);
	}
	//点击导航下载栏
	public void llOffLineClick(){
		personSetPage.clickObj(LL_OFFLINE_MAP);
	}
	//判断导航下载栏文本是否存在
	public Boolean offLineExist(){
		return personSetPage.isExistFromId(LL_OFFLINE_MAP,INDEX_LL_OFFLINE_MAP);
	}
	//获取断导航下载栏文本内容
	public String offLineText(){
		return personSetPage.getTextFromId(LL_OFFLINE_MAP,INDEX_LL_OFFLINE_MAP);
	}
	//判断意见反馈栏是否存在
	public Boolean llFeedbackeExist(){
		return personSetPage.isExist(LL_FEEDBACK);
	}
	//点击意见反馈栏
	public void llFeedbackClick(){
		personSetPage.clickObj(LL_FEEDBACK);
	}
	//判断意见反馈栏文本是否存在
	public Boolean feedbackExist(){
		return personSetPage.isExistFromId(LL_FEEDBACK,INDEX_LL_FEEDBACK);
	}
	//获取意见反馈栏文本内容
	public String feedbackText(){
		return personSetPage.getTextFromId(LL_FEEDBACK,INDEX_LL_FEEDBACK);
	}
	//判断使用指南栏是否存在
	public Boolean llUseGuidExist(){
		return personSetPage.isExist(LL_USE_GUIDE);
	}
	//点击使用指南栏
	public void llUseGuidClick(){
		personSetPage.clickObj(LL_USE_GUIDE);
	}
	//判断使用指南栏文本是否存在
	public Boolean useGuidExist(){
		return personSetPage.isExistFromId(LL_USE_GUIDE,INDEX_LL_USE_GUIDE);
	}
	//获取使用指南栏文本内容
	public String useGuidText(){
		return personSetPage.getTextFromId(LL_USE_GUIDE,INDEX_LL_USE_GUIDE);
	}
	//判断检测新版本栏是否存在
	public Boolean llCheckUpdateExist(){
		return personSetPage.isExist(LL_CHECK_UPDATE);
	}
	//判断检测新版本栏是否可点击
	public Boolean llCheckUpdateClickable(){
		return personSetPage.objClickable(LL_CHECK_UPDATE);
	}
	//点击检测新版本栏
	public void llCheckUpdateClick(){
		personSetPage.clickObj(LL_CHECK_UPDATE);
	}
	//判断检测新版本栏文本是否存在
	public Boolean checkUpdateExist(){
		return personSetPage.isExistFromId(LL_CHECK_UPDATE,INDEX_CHECK_UPDATE);
	}
	//获取检测新版本栏文本内容
	public String checkUpdateText(){
		return personSetPage.getTextFromId(LL_CHECK_UPDATE,INDEX_CHECK_UPDATE);
	}
	//判断检测新版本栏值是否存在
	public Boolean checkUpdateValueExist(){
		return personSetPage.isExistFromId(LL_CHECK_UPDATE,INDEX_CHECK_UPDATE_VALUE);
	}
	//获取检测新版本栏值内容
	public String checkUpdateValueText(){
		return personSetPage.getTextFromId(LL_CHECK_UPDATE,INDEX_CHECK_UPDATE_VALUE);
	}
	//判断退出登录是否存在
	public Boolean logoutExist(){
		return personSetPage.isExist(BTN_LOGOUT);
	}
	//获取退出登录内容
	public String logoutText(){
		return personSetPage.getText(BTN_LOGOUT);
	}
	//点击退出登录
	public void logoutClick(){
		personSetPage.clickObj(BTN_LOGOUT);
	}
	//判断退出登录弹框-文本标题是否存在
	public Boolean confirmTextExist(){
		return personSetPage.isExist(CONFIRM_TEXT);
	}
	//获取退出登录弹框-文本标题内容
	public String confirmTextText(){
		return personSetPage.getText(CONFIRM_TEXT);
	}
	//判断退出登录弹框-是否退出登录是否存在
	public Boolean confirmDescExist(){
		return personSetPage.isExist(CONFIRM_DESC);
	}
	//获取退出登录弹框-是否退出登录内容
	public String confirmDescText(){
		return personSetPage.getText(CONFIRM_DESC);
	}
	//判断退出登录弹框－取消是否存在
	public Boolean closeBtnExist(){
		return personSetPage.isExist(CLOSE_BTN);
	}
	//获取退出登录弹框－取消　　
	public String closeBtnText(){
		return personSetPage.getText(CLOSE_BTN);
	}
	//点击退出登录弹框－取消
	public void closeBtnClick(){
		personSetPage.clickObj(CLOSE_BTN);	
	}
	//判断退出登录弹框－确定是否存在
	public Boolean okBtnExist(){
		return personSetPage.isExist(OK_BTN);
	}
	//获取退出登录弹框－确定　
	public String okBtnText(){
		return personSetPage.getText(OK_BTN);
	}
	//点击退出登录弹框－确定
	public void okBtnClick(){
		personSetPage.clickObj(OK_BTN);	
	}

}
