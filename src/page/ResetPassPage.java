package page;

import baseMethod.MainMethod;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.ResetPassConstants;
import driverInterface.ResetPassValue;

public class ResetPassPage extends UiAutomatorTestCase implements ResetPassConstants,ResetPassValue {
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
	public Boolean upgradContentExist(){
		return resetPassPage.isExist(PASSWORDTITLE);
	}
	//获取标题内容
	public String upgradContentText(){
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
	public void setPhone(){
		try {
			resetPassPage.getObj(PPHONE).setText(phone_value);
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
	public void setDriverid(){
		try {
			resetPassPage.getObj(PDRIVERID).setText(driverid_value);
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
	public void setCode(){
		try {
			resetPassPage.getObj(AUTHCODE).setText(code_value);
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
}
