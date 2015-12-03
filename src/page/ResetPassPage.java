package page;

import baseMethod.MainMethod;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.ParameterConfig;
import driverInterface.ResetPassConstants;

/**
 *创建日期:2015-12-2
 *作者： 陈玉婵
 */
public class ResetPassPage extends UiAutomatorTestCase implements ResetPassConstants,ParameterConfig {
	MainMethod resetPassPage= new MainMethod();
	
	//判断返回icon是否存在
	public Boolean returnExist(){
		return resetPassPage.isExist(RETURNICON);
	}
	//点击返回
	public void returnClick(){
		try {
			resetPassPage.getObj(RETURNICON).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断标题是否存在
	public Boolean titleExist(){
		return resetPassPage.isExist(PASSWORDTITLE);
	}
	//获取标题内容
	public String titleText(){
		return resetPassPage.getText(PASSWORDTITLE);
	}
	
	//清空手机号
	public void clearPhone(){
		try {
			resetPassPage.getObj(PPHONE).clearTextField();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//输入手机号
	public void setPhone(String test_env){
		try {
			if(test_env=="test"){
				resetPassPage.getObj(PPHONE).setText(REPASS_PHONE_VALUE);
			}
			if(test_env=="test02"){
				resetPassPage.getObj(PPHONE).setText(REPASS_PHONE_VALUE2);
			}
			if(test_env=="test"){
				resetPassPage.getObj(PPHONE).setText(REPASS_PHONE_VALUE_PRE);
			}

		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//清空司机ＩＤ
	public void clearDriverid(){
		try {
			resetPassPage.getObj(PDRIVERID).clearTextField();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//输入司机ＩＤ
	public void setDriverid(String test_env){
		try {
			if(test_env=="test"){
				resetPassPage.getObj(PPHONE).setText(REPASS_DRIVERID_VALUE);
			}
			if(test_env=="test02"){
				resetPassPage.getObj(PPHONE).setText(REPASS_DRIVERID_VALUE2);
			}
			if(test_env=="test"){
				resetPassPage.getObj(PPHONE).setText(REPASS_DRIVERID_VALUE_PRE);
			}

		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//清空验证码
	public void clearCode(){
		try {
			resetPassPage.getObj(AUTHCODE).clearTextField();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//输入验证码
	public void setCode(String test_env){
		try {
			if(test_env=="test"){
				resetPassPage.getObj(PPHONE).setText(REPASS_CODE_VALUE);
			}
			if(test_env=="test02"){
				resetPassPage.getObj(PPHONE).setText(REPASS_CODE_VALUE2);
			}
			if(test_env=="test"){
				resetPassPage.getObj(PPHONE).setText(REPASS_CODE_VALUE_PRE);
			}

		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断获取验证码是否存在
	public Boolean getCodeExist(){
		return resetPassPage.isExist(GETCODE);
	}
	//点击获取验证码
	public void getCodeClick(){
		try {
			resetPassPage.getObj(GETCODE).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断下一步是否存在
	public Boolean nextExist(){
		return resetPassPage.isExist(NEXT);
	}
	//点击下一步
	public void nextClick(){
		try {
			resetPassPage.getObj(NEXT).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	public Boolean noPhoneExist(){
		return resetPassPage.isExist(PNOPHONE);
	}
	//获取手机号未注册提示内容
	public String noPhoneText(){
		return resetPassPage.getText(PNOPHONE);
	}
	//判断司机ＩＤ有误是否存在
	public Boolean wrongDriveridExist(){
		return resetPassPage.isExist(PWRONGDRIVERID);
	}
	//获取司机ＩＤ有误提示内容
	public String wrongDriveridText(){
		return resetPassPage.getText(PWRONGDRIVERID);
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
		try {
			resetPassPage.getObj(RETURNICON).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		try {
			resetPassPage.getObj(NEW_PASS).clearTextField();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//输入新密码
	public void setNewPass(String test_env){
		try {
			if(test_env=="test"){
				resetPassPage.getObj(PPHONE).setText(REPASS_NEW_PASS_VALUE);
			}
			if(test_env=="test02"){
				resetPassPage.getObj(PPHONE).setText(REPASS_NEW_PASS_VALUE2);
			}
			if(test_env=="test"){
				resetPassPage.getObj(PPHONE).setText(REPASS_NEW_PASS_VALUE_PRE);
			}
			
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//清空确认新密码
	public void clearRenewPass(){
		try {
			resetPassPage.getObj(CONFIRM_NEW_PASS).clearTextField();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//输入确认新密码
	public void setRenewPass(String test_env){
		try {
			if(test_env=="test"){
				resetPassPage.getObj(PPHONE).setText(REPASS_RENEW_PASS_VALUE);
			}
			if(test_env=="test02"){
				resetPassPage.getObj(PPHONE).setText(REPASS_RENEW_PASS_VALUE2);
			}
			if(test_env=="test"){
				resetPassPage.getObj(PPHONE).setText(REPASS_RENEW_PASS_VALUE_PRE);
			}

		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		try {
			resetPassPage.getObj(BTN_CONFIRM).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
