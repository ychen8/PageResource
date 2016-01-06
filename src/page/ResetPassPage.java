package page;

import baseMethod.MainMethod;


import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.ParameterConfigConstants;
import driverInterface.ResetPassConstants;

/**
 *创建日期:2015-12-2
 *作者： 陈玉婵
 */
public class ResetPassPage extends UiAutomatorTestCase implements ResetPassConstants,ParameterConfigConstants {
	MainMethod resetPassPage= new MainMethod();
	
	//判断返回icon是否存在
	public Boolean returnExist(){
		return resetPassPage.isExist(RETURNICON);
	}
	//点击返回
	public void returnClick(){
			resetPassPage.clickObj(RETURNICON);
	}
	//判断标题是否存在
	public Boolean titleExist(){
		return resetPassPage.isExist(PASSWORDTITLE);
	}
	//获取标题内容
	public String titleText(){
		return resetPassPage.getText(PASSWORDTITLE);
	}
	//判断手机号是否存在
	public Boolean phoneExist(){
		return resetPassPage.isExist(PPHONE);
	}
	//清空手机号
	public void clearPhone(){
			resetPassPage.cleartxt(PPHONE);
	}
	
	//输入手机号
	public void setPhone(String test_env){
			if(test_env=="test"){
				resetPassPage.setxt(PPHONE,PHONE_VALUE);
			}
			if(test_env=="test02"){
				resetPassPage.setxt(PPHONE,PHONE_VALUE2);
			}
			if(test_env=="pre"){
				resetPassPage.setxt(PPHONE,PHONE_VALUE_PRE);
			}

	}
	//输入不存在的手机号
	public void setWrongPhone(String test_env){
			if(test_env=="test"){
				resetPassPage.setxt(PPHONE,WRONG_PHONE_VALUE);
			}
			if(test_env=="test02"){
				resetPassPage.setxt(PPHONE,WRONG_PHONE_VALUE);
			}
			if(test_env=="pre"){
				resetPassPage.setxt(PPHONE,WRONG_PHONE_VALUE);
			}

	}
	//判断司机ＩＤ是否存在
	public Boolean driveridExist(){
		return resetPassPage.isExist(PDRIVERID);
	}
	//清空司机ＩＤ
	public void clearDriverid(){
			resetPassPage.cleartxt(PDRIVERID);
	}
	
	//输入司机ＩＤ
	public void setDriverid(String test_env){
			if(test_env=="test"){
				resetPassPage.setxt(PDRIVERID,DRIVERID_VALUE);
			}
			if(test_env=="test02"){
				resetPassPage.setxt(PDRIVERID,DRIVERID_VALUE2);
			}
			if(test_env=="pre"){
				resetPassPage.setxt(PDRIVERID,DRIVERID_VALUE_PRE);
			}
	}
	//输入错误司机ＩＤ
	public void setWrongDriverid(String test_env){
			if(test_env=="test"){
				resetPassPage.setxt(PDRIVERID,WRONG_DRIVERID_VALUE);
			}
			if(test_env=="test02"){
				resetPassPage.setxt(PDRIVERID,WRONG_DRIVERID_VALUE2);
			}
			if(test_env=="pre"){
				resetPassPage.setxt(PDRIVERID,WRONG_DRIVERID_VALUE_PRE);
			}
	}
	//清空验证码
	public void clearCode(){
			resetPassPage.cleartxt(AUTHCODE);
	}
	
	//输入验证码
	public void setCode(String test_env){

			if(test_env=="test"){
				resetPassPage.setxt(AUTHCODE,REPASS_CODE_VALUE);
			}
			if(test_env=="test02"){
				resetPassPage.setxt(AUTHCODE,REPASS_CODE_VALUE2);
			}
			if(test_env=="pre"){
				resetPassPage.setxt(AUTHCODE,REPASS_CODE_VALUE_PRE);
			}
	}
	//判断获取验证码是否存在
	public Boolean getCodeExist(){
		return resetPassPage.isExist(GETCODE);
	}
	//判断获取验证码是否可点击
	public Boolean getCodeClickable(){
		return resetPassPage.objClickable(GETCODE);
	}
	
	//点击获取验证码
	public void getCodeClick(){
			resetPassPage.clickObj(GETCODE);
	}
	//判断下一步是否存在
	public Boolean nextExist(){
		return resetPassPage.isExist(NEXT);
	}
	//点击下一步
	public void nextClick(){
			resetPassPage.clickObj(NEXT);
	}
	//判断连续发送验证码是否存在
	public Boolean tipExist(){
		return resetPassPage.isExist(TIP);
	}
	//获取连续发送验证码提示内容
	public String tipText(){
		return resetPassPage.getText(TIP);
	}
	//判断手机号未注册是否存在
	public Boolean reConfirmTextExist(){
		return resetPassPage.isExist(CONFIRM_TEXT);
	}
	//获取手机号未注册提示内容
	public String reConfirmTextText(){
		return resetPassPage.getText(CONFIRM_TEXT);
	}
	//判断验证码有误是否存在
	public Boolean wrongCodeExist(){
		return resetPassPage.isExist(WRONGCODE);
	}
	//获取验证码有误提示内容
	public String wrongCodeText(){
		return resetPassPage.getText(WRONGCODE);
	}	
	
	//判断返回icon是否存在－重设密码第二步页面
	public Boolean return2Exist(){
		return resetPassPage.isExist(RETURNICON);
	}
	//点击返回－重设密码第二步页面
	public void return2Click(){
			resetPassPage.clickObj(RETURNICON);
	}
	//判断标题是否存在－重设密码第二步页面
	public Boolean title2Exist(){
		return resetPassPage.isExist(PASSWORDTITLE);
	}
	//获取标题内容－重设密码第二步页面
	public String title2Text(){
		return resetPassPage.getText(PASSWORDTITLE);
	}
	
	//清空新密码
	public void clearNewPass(){
			resetPassPage.cleartxt(NEW_PASS);
	}
	
	//输入新密码
	public void setNewPass(String test_env){
			if(test_env=="test"){
				resetPassPage.setxt(NEW_PASS,REPASS_NEW_PASS_VALUE);
			}
			if(test_env=="test02"){
				resetPassPage.setxt(NEW_PASS,REPASS_NEW_PASS_VALUE2);
			}
			if(test_env=="pre"){
				resetPassPage.setxt(NEW_PASS,REPASS_NEW_PASS_VALUE_PRE);
			}
	}
	
	//清空确认新密码
	public void clearRenewPass(){
			resetPassPage.cleartxt(CONFIRM_NEW_PASS);
	}
	
	//输入确认新密码
	public void setRenewPass(String test_env){
			if(test_env=="test"){
				resetPassPage.setxt(CONFIRM_NEW_PASS,REPASS_RENEW_PASS_VALUE);
			}
			if(test_env=="test02"){
				resetPassPage.setxt(CONFIRM_NEW_PASS,REPASS_RENEW_PASS_VALUE2);
			}
			if(test_env=="pre"){
				resetPassPage.setxt(CONFIRM_NEW_PASS,REPASS_RENEW_PASS_VALUE_PRE);
			}
	}
	
	//判断重设密码的限制提示是否存在－重设密码第二步页面
	public Boolean passLimitTipExist(){
		return resetPassPage.isExist(RESET_PASS_TIP);
	}
	//获取重设密码的限制提示内容－重设密码第二步页面
	public String passLimitTipText(){
		return resetPassPage.getText(RESET_PASS_TIP);
	}
	//判断确定按钮是否存在
	public Boolean btnConfirmExist(){
		return resetPassPage.isExist(BTN_CONFIRM);
	}
	//点击确定按钮
	public void btnConfirmClick(){
			resetPassPage.clickObj(BTN_CONFIRM);
	}
	//点击第一步弹框确定按钮
	public void btnOkClick(){
			resetPassPage.clickObj(BTN_OK);
	}

}
