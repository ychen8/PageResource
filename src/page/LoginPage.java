package page;

import baseMethod.MainMethod;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.LoginConstants;
import driverInterface.ParameterConfig;

/**
 *@version 创建日期:2015-12-2
 *@author 陈玉婵
 */
public class LoginPage extends UiAutomatorTestCase implements LoginConstants,ParameterConfig{
	MainMethod loginPage= new MainMethod();
	
	//判断测试版本与环境控件是否存在
	public Boolean testEnvExist(){
		return loginPage.isExist(VERSION_CUR);
	}
	//获取测试版本与环境
	public String testEnvText(){
		return loginPage.getText(VERSION_CUR);
	}
	
	//清空手机号
	public void clearPhone(){
		try {
			loginPage.getObj(PHONE).clearTextField();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//输入正确的手机号
	public void setRightPhone(){
		try {
			loginPage.getObj(PHONE).setText(PHONE_VALUE);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//输入不存在的手机号
	public void setWrongPhone(){
		try {
			loginPage.getObj(PHONE).setText(WRONG_PHONE_VALUE);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//清空司机ＩＤ
	public void clearDriverid(){
		try {
			loginPage.getObj(DRIVERID).clearTextField();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//输入正确的司机ＩＤ
	public void setDriverid(){
		try {
			loginPage.getObj(DRIVERID).setText(DRIVERID_VALUE);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//输入错误的司机ＩＤ
	public void setWrongDriverid(){
		try {
			loginPage.getObj(DRIVERID).setText(WRONG_DRIVERID_VALUE);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//清空密码
	public void clearPassword(){
		try {
			loginPage.getObj(PASSWORD).clearTextField();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//输入正确的密码
	public void setPassword(){
		try {
			loginPage.getObj(PASSWORD).setText(PASSWORD_VALUE);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//输入错误的密码
	public void setWrongPassword(){
		try {
			loginPage.getObj(PASSWORD).setText(WRONG_PASSWORD_VALUE);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//决断登录按钮是否存在
	public Boolean loginExist(){
		return loginPage.isExist(VERSION_CUR);
	}
	
	//点击登录按钮
	public void loginClick(){
		try {
			loginPage.getObj(LOGINBUTTON).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	//判断忘记密码是否存在
	public Boolean forgetExist(){
		return loginPage.isExist(FORGETPASSWORD);
	}
	//点击忘记密码
	public void forgetPassClick(){
		try {
			loginPage.getObj(FORGETPASSWORD).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	
	//判断手机号码不存在是否存在
	public Boolean nophoneExist(){
		return loginPage.isExist(NOPHONE);
	}
	//获取弹框信息内容－手机号码不存在
	public String nophoneText(){
		return loginPage.getText(NOPHONE);
	}
	//判断司机ＩＤ有误是否存在
	public Boolean driveridExist(){
		return loginPage.isExist(WRONGDRIVERID);
	}
	//获取弹框信息内容－司机ＩＤ有误
	public String driveridText(){
		return loginPage.getText(WRONGDRIVERID);
	}	
	//判断密码错误是否存在
	public Boolean wrongPassExist(){
		return loginPage.isExist(WRONGPASSWORD);
	}
	//获取弹框信息内容－密码错误
	public String wrongPassText(){
		return loginPage.getText(WRONGPASSWORD);
	}
	//判断驾驶证到期是否存在
	public Boolean testLicenExpiredExist(){
		return loginPage.isExist(LICENSEEXPIRESED);
	}
	//获取弹框信息内容－驾驶证到期
	public String licenExpiredText(){
		return loginPage.getText(LICENSEEXPIRESED);
	}
	//判断驾驶证快到期是否存在
	public Boolean licenExpirExist(){
		return loginPage.isExist(LICENSEEXPIRES);
	}
	//获取弹框信息内容－驾驶证快到期
	public String licenExpirText(){
		return loginPage.getText(LICENSEEXPIRES);
	}
	
	//判断登录司机无效是否存在
	public Boolean invaledDriverExist(){
		return loginPage.isExist(INVALIDDRIVER);
	}
	//获取弹框信息内容－登录司机无效
	public String invaledDriverText(){
		return loginPage.getText(INVALIDDRIVER);
	}
	
	//决断弹框确定按钮是否存在
	public Boolean okButtonExist(){
		return loginPage.isExist(OKBUTTON);
	}
	
	//点击弹框的确定按钮
	public void okButtonClick(){
		try {
			loginPage.getObj(OKBUTTON).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
}
