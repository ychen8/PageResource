package page;

import baseMethod.MainMethod;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.LoginConstants;
import driverInterface.LoginValue;

public class LoginPage extends UiAutomatorTestCase implements LoginConstants,LoginValue{
	private static final String PHONE = null;
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
	public void testClearPhone(){
		try {
			loginPage.getObj(PHONE).clearTextField();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//输入手机号
	public void testSetPhone(){
		try {
			loginPage.getObj(PHONE).setText(phone_value);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//清空司机ＩＤ
	public void testClearDriverid(){
		try {
			loginPage.getObj(DRIVERID).clearTextField();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//输入司机ＩＤ
	public void testSetDriverid(){
		try {
			loginPage.getObj(DRIVERID).setText(driverid_value);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//清空密码
	public void testClearPassword(){
		try {
			loginPage.getObj(PASSWORD).clearTextField();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//输入密码
	public void testSetPassword(){
		try {
			loginPage.getObj(PASSWORD).setText(password_value);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//决断登录按钮是否存在
	public Boolean testLoginExist(){
		return loginPage.isExist(VERSION_CUR);
	}
	
	//点击登录按钮
	public void testClickLogin(){
		try {
			loginPage.getObj(LOGINBUTTON).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	//判断忘记密码是否存在
	public Boolean testForgetExist(){
		return loginPage.isExist(FORGETPASSWORD);
	}
	//点击忘记密码
	public void testClickForgetPass(){
		try {
			loginPage.getObj(FORGETPASSWORD).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	
	//判断手机号码不存在是否存在
	public Boolean testNophoneExist(){
		return loginPage.isExist(NOPHONE);
	}
	//获取弹框信息内容－手机号码不存在
	public String testNophoneText(){
		return loginPage.getText(NOPHONE);
	}
	//判断司机ＩＤ有误是否存在
	public Boolean testDriveridExist(){
		return loginPage.isExist(WRONGDRIVERID);
	}
	//获取弹框信息内容－司机ＩＤ有误
	public String testDriveridText(){
		return loginPage.getText(WRONGDRIVERID);
	}	
	//判断密码错误是否存在
	public Boolean testWrongPassExist(){
		return loginPage.isExist(WRONGPASSWORD);
	}
	//获取弹框信息内容－密码错误
	public String testWrongPassText(){
		return loginPage.getText(WRONGPASSWORD);
	}
	//判断驾驶证到期是否存在
	public Boolean testLicenExpiredExist(){
		return loginPage.isExist(LICENSEEXPIRESED);
	}
	//获取弹框信息内容－驾驶证到期
	public String testLicenExpiredText(){
		return loginPage.getText(LICENSEEXPIRESED);
	}
	//判断驾驶证快到期是否存在
	public Boolean testLicenExpirExist(){
		return loginPage.isExist(LICENSEEXPIRES);
	}
	//获取弹框信息内容－驾驶证快到期
	public String testLicenExpirText(){
		return loginPage.getText(LICENSEEXPIRES);
	}
	
	//判断登录司机无效是否存在
	public Boolean testInvaledDriverExist(){
		return loginPage.isExist(INVALIDDRIVER);
	}
	//获取弹框信息内容－登录司机无效
	public String testInvaledDriverText(){
		return loginPage.getText(INVALIDDRIVER);
	}
	
	//决断弹框确定按钮是否存在
	public Boolean testOkButtonExist(){
		return loginPage.isExist(OKBUTTON);
	}
	
	//点击弹框的确定按钮
	public void testOkButtonLogin(){
		try {
			loginPage.getObj(OKBUTTON).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
}
