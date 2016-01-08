package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.ChangePasswordConstants;

/**
 *创建日期:2015-12-11
 *作者： 陈玉婵
 */
public class ChangePasswordPage extends UiAutomatorTestCase implements
		ChangePasswordConstants {
	MainMethod changePassPage=new MainMethod();
	//判断返回icon是否存在
	public Boolean returnExist(){
		return changePassPage.isExist(BACK);
	}
	//点击返回
	public void returnClick(){
		changePassPage.clickObj(BACK);
	}
	//判断标题是否存在
	public Boolean titleExist(){
		return changePassPage.isExist(TITLE);
	}
	//获取标题内容
	public String titleText(){
		return changePassPage.getText(TITLE);
	}
	//判断当前密码是否存在
	public Boolean pwCurExist(){
		return changePassPage.isExist(PW_CUR);
	}
	//获取当前密码内容
	public String pwCurText(){
		return changePassPage.getText(PW_CUR);
	}
	//清空当前密码
	public void pwCurClear(){
		changePassPage.cleartxt(PW_CUR);
	}
	//输入当前密码值
	public void pwCurSet(){
		changePassPage.setxt(PW_CUR, PW_CUR_VALUE);	
	}
	//输入错误的当前密码值
	public void pwCurWrongSet(){
		changePassPage.setxt(PW_CUR, PW_CUR_WRONG_VALUE);	
	}
	//输入19位密码
	public void pwCur19Set(){
		changePassPage.setxt(PW_CUR, PW_19_NUM);	
	}
	//输入5位密码
	public void pwCur5Set(){
		changePassPage.setxt(PW_CUR, PW_5_NUM);	
	}
	//判断新密码是否存在
	public Boolean pwNewExist(){
		return changePassPage.isExist(PW_NEW);
	}
	//获取新密码内容
	public String pwNewText(){
		return changePassPage.getText(PW_NEW);
	}
	//清空新密码
	public void pwNewClear(){
		changePassPage.cleartxt(PW_NEW);
	}
	//输入新密码值
	public void pwNewSet(){
		changePassPage.setxt(PW_NEW, PW_NEW_VALUE);
		
	}
	//输入19位新密码
	public void pwNew19Set(){
		changePassPage.setxt(PW_NEW, PW_19_NUM);
		
	}
	//输入5位密码
	public void pwNew5Set(){
		changePassPage.setxt(PW_NEW, PW_5_NUM);
		
	}
	public void pwCurClear1(){
		changePassPage.clearText(PW_CUR);
	}
	public void pwNewClear1(){
		changePassPage.clearText(PW_NEW);
	}
	//把密码改回来
	public void pwCur1Set(){
		changePassPage.setxt(PW_CUR, PW_NEW_VALUE);	
	}
	public void pwNew1Set(){
		changePassPage.setxt(PW_NEW, PW_CUR_VALUE);	
	}
	//判断密码限制提示是否存在
	public Boolean tipExist(){
		return changePassPage.isExist(TIP);
	}
	//获取密码限制提示内容
	public String tipText(){
		return changePassPage.getText(TIP);
	}
	//判断显示密码是否存在
	public Boolean showCkExist(){
		return changePassPage.isExist(SHOW_CK);
	}
	//获取显示密码内容
	public String showCkText(){
		return changePassPage.getText(SHOW_CK);
	}
	//判断显示密码是否被选中
	public Boolean showCkChecked(){
		return changePassPage.objChecked(SHOW_CK);
	}
	//点击显示密码
	public void showCkClick(){
		changePassPage.clickObj(SHOW_CK);
	}
	//判断确定按钮是否存在
	public Boolean pwModfiyExist(){
		return changePassPage.isExist(PW_MODFIY_OK);
	}
	//判断确定按钮是否被激活
	public Boolean pwModifyEnable(){
		return changePassPage.objEnabled(PW_MODFIY_OK);
	}
	//获取确定按钮文字
	public String pwModifyText(){
		return changePassPage.getText(PW_MODFIY_OK);
	}
	//点击确定按钮
	public void pwModfiyClick(){
		changePassPage.clickObj(PW_MODFIY_OK);
	}
	//判断密码修改成功弹框-文本标题是否存在
	public Boolean confirmTextExist(){
		return changePassPage.isExist(CONFIRM_TEXT);
	}
	//获取密码修改成功弹框-文本标题内容
	public String confirmTextText(){
		return changePassPage.getText(CONFIRM_TEXT);
	}
	//判断确定按钮是否存在
	public Boolean okBtnExist(){
		return changePassPage.isExist(OK_BTN);
	}
	//获取弹框－确定　
	public String okBtnText(){
		return changePassPage.getText(OK_BTN);
	}
	//点击弹框－确定
	public void okBtnClick(){
		changePassPage.clickObj(OK_BTN);	
	}

}
