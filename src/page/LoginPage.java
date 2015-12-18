package page;

import baseMethod.MainMethod;


import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.LoginConstants;
import driverInterface.ParameterConfigConstants;

/**
 *创建日期:2015-12-2
 *作者： 陈玉婵
 */
public class LoginPage extends UiAutomatorTestCase implements LoginConstants,ParameterConfigConstants{
	MainMethod loginPage= new MainMethod();
	
	//判断测试版本与环境控件是否存在
	public Boolean testEnvExist(){
		return loginPage.isExist(VERSION_CUR);
	}
	//获取测试版本与环境
	public String testEnvText(){
		return loginPage.getText(VERSION_CUR);
	}
	public Boolean phoneExist(){
		return loginPage.isExist(PHONE);
	}
	//清空手机号
	public void clearPhone(){
			loginPage.cleartxt(PHONE);
	}
	
	//输入正确的手机号
	public void setPhone(String test_env){
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
	
	public Boolean driveridExist(){
		return loginPage.isExist(DRIVERID);
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
	public Boolean passwordExist(){
		return loginPage.isExist(PASSWORD);
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
		return loginPage.isExist(LOGINBUTTON);
	}
	//决断登录按钮是否被激活
	public Boolean loginClickable(){
		return loginPage.objClickable(LOGINBUTTON);
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
	//判断弹框信息内容是否存在
	public Boolean confirmTextExist(){
		return loginPage.isExist(CONFIRM_TEXT);
	}
	//获取弹框信息内容
	public String confirmTextText(){
		return loginPage.getText(CONFIRM_TEXT);
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
