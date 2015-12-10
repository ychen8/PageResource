package page;

import baseMethod.MainMethod;


import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.LoginConstants;
import driverInterface.ParameterConfig;

/**
 *创建日期:2015-12-2
 *作者： 陈玉婵
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
			loginPage.cleartxt(PHONE);
	}
	
	//输入正确的手机号
	public void setRightPhone(String test_env){
			if(test_env=="test"){
				loginPage.setxt(PHONE,PHONE_VALUE);
			}
			
			if(test_env=="test02"){
				loginPage.setxt(PHONE,PHONE_VALUE2);
			}
			if(test_env=="pre"){
				loginPage.setxt(PHONE,PHONE_VALUE_PRE);
			}
	}
	
	//输入不存在的手机号
	public void setWrongPhone(String test_env){
			if(test_env=="test"){
				loginPage.setxt(PHONE,WRONG_PHONE_VALUE);
			}
			if(test_env=="test02"){
				loginPage.setxt(PHONE,WRONG_PHONE_VALUE2);
			}
			if(test_env=="pre"){
				loginPage.setxt(PHONE,WRONG_PHONE_VALUE_PRE);
			}
	}
	
	//输入驾驶证过期的手机号
	public void setExpirePhone(String test_env){
			if(test_env=="test"){
				loginPage.setxt(PHONE,EXPIRE_PHONE_VALUE);
			}
			if(test_env=="test02"){
				loginPage.setxt(PHONE,EXPIRE_PHONE_VALUE2);
			}
			if(test_env=="pre"){
				loginPage.setxt(PHONE,EXPIRE_PHONE_VALUE_PRE);
			}
			
	}
	
	//清空司机ＩＤ
	public void clearDriverid(){
			loginPage.cleartxt(DRIVERID);
	}
	
	//输入正确的司机ＩＤ
	public void setDriverid(String test_env){
			if(test_env=="test"){
				loginPage.setxt(DRIVERID,DRIVERID_VALUE);
			}
			if(test_env=="test02"){
				loginPage.setxt(DRIVERID,DRIVERID_VALUE2);
			}
			if(test_env=="pre"){
				loginPage.setxt(DRIVERID,DRIVERID_VALUE_PRE);
			}

	}
	
	//输入错误的司机ＩＤ
	public void setWrongDriverid(String test_env){
			if(test_env=="test"){
				loginPage.setxt(DRIVERID,WRONG_DRIVERID_VALUE);
			}
			if(test_env=="test02"){
				loginPage.setxt(DRIVERID,WRONG_DRIVERID_VALUE2);
			}
			if(test_env=="pre"){
				loginPage.setxt(DRIVERID,WRONG_DRIVERID_VALUE_PRE);
			}
	}
	
	//输入驾驶证过期的司机ＩＤ
	public void setExpireDriverid(String test_env){
			if(test_env=="test"){
				loginPage.setxt(DRIVERID,EXPIRE_DRIVERID_VALUE);
			}
			if(test_env=="test02"){
				loginPage.setxt(DRIVERID,EXPIRE_DRIVERID_VALUE2);
			}
			if(test_env=="pre"){
				loginPage.setxt(DRIVERID,EXPIRE_DRIVERID_VALUE_PRE);
			}

	}
	//清空密码
	public void clearPassword(){
			loginPage.cleartxt(PASSWORD);
	}
	
	//输入正确的密码
	public void setPassword(String test_env){
			if(test_env=="test"){
				loginPage.setxt(PASSWORD,PASSWORD_VALUE);
			}
			if(test_env=="test02"){
				loginPage.setxt(PASSWORD,PASSWORD_VALUE2);
			}
			if(test_env=="pre"){
				loginPage.setxt(PASSWORD,PASSWORD_VALUE_PRE);
			}
	}
	//输入错误的密码
	public void setWrongPassword(String test_env){

			if(test_env=="test"){
				loginPage.setxt(PASSWORD,WRONG_PASSWORD_VALUE);
			}
			if(test_env=="test02"){
				loginPage.setxt(PASSWORD,WRONG_PASSWORD_VALUE2);
			}
			if(test_env=="pre"){
				loginPage.setxt(PASSWORD,WRONG_PASSWORD_VALUE_PRE);
			}

	}
	
	//输入驾驶证过期的密码
	public void setExpirePassword(String test_env){
			if(test_env=="test"){
				loginPage.setxt(PASSWORD,EXPIRE_PASSWORD_VALUE);
			}
			if(test_env=="test02"){
				loginPage.setxt(PASSWORD,EXPIRE_PASSWORD_VALUE2);
			}
			if(test_env=="pre"){
				loginPage.setxt(PASSWORD,EXPIRE_PASSWORD_VALUE_PRE);
			}
	}
	
	//决断登录按钮是否存在
	public Boolean loginExist(){
		return loginPage.isExist(VERSION_CUR);
	}
	
	//点击登录按钮
	public void loginClick(){
			loginPage.clickObj(LOGINBUTTON);	
	}
	//判断忘记密码是否存在
	public Boolean forgetExist(){
		return loginPage.isExist(FORGETPASSWORD);
	}
	//点击忘记密码
	public void forgetPassClick(){
			loginPage.clickObj(FORGETPASSWORD);
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
			loginPage.clickObj(OKBUTTON);
	}
	
}
