package testcase;

import android.util.Log;
import baseMethod.Base;
import baseMethod.Watcher;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.ParameterConfigConstants;
import execute.UiAutomatorHelper;
import page.LoginPage;
import page.MainPage;
import page.ResetPassPage;
import page.UpgradPage;

/**
 *创建日期:2015-12-18
 *作者： 陈玉婵
 */
public class LoginCase extends UiAutomatorTestCase implements ParameterConfigConstants {
	LoginPage login=new LoginPage();
	MainPage main=new MainPage();
	UpgradPage upgrad=new UpgradPage();
	ResetPassPage resetPass=new ResetPassPage();
	Watcher watcher=new Watcher();
	Base base=new Base();
	//１、登录成功
	public void testloginSuceess(){
		watcher.watchPhone();
		watcher.watchNetwork();
		//判断是否弹升级框，如果弹则按稍后升级
		if(upgrad.upgradTitleExist()){
			upgrad.upgradLaterClick();
		}
		sleep(2000);
		//判断登录页面的各控件是否存在
		assertTrue(login.phoneExist());
		assertTrue(login.driveridExist());
		assertTrue(login.passwordExist());
		assertTrue(login.loginExist());
	
		login.clearPhone();//清空手机号输入框
		login.setPhone(TEST_ENV);//输入手机号
		
		login.clearDriverid();//清空司机ＩＤ输入框
		login.setDriverid(TEST_ENV);//输入司机ＩＤ
	
		login.clearPassword();//清空密码输入框
		login.setPassword(TEST_ENV);//输入密码
		UiDevice.getInstance().pressBack();
		
		assertTrue(login.loginClickable());//判断登录按钮是否可点击
		login.loginClick();//点击登录按钮
		sleep(5000);
		assertTrue(main.stateBtnExist());//登录成功的话，判断首页的上班按钮是否存在
		
	}
	//2.手机号码不存在
	public void testNoPhone(){
		watcher.watchPhone();
		watcher.watchNetwork();
		//判断是否弹升级框，如果弹则按稍后升级
		if(upgrad.upgradTitleExist()){
			upgrad.upgradLaterClick();
		}
		sleep(2000);
		//判断登录页面的各控件是否存在
		assertTrue(login.phoneExist());
		assertTrue(login.driveridExist());
		assertTrue(login.passwordExist());
		assertTrue(login.loginExist());
		
		login.clearPhone();//清空手机号输入框
		login.setWrongPhone(TEST_ENV);//输入手机号
	
		login.clearDriverid();//清空司机ＩＤ输入框
		login.setDriverid(TEST_ENV);//输入司机ＩＤ
	
		login.clearPassword();//清空密码输入框
		login.setPassword(TEST_ENV);//输入密码
		UiDevice.getInstance().pressBack();
	
		assertTrue(login.loginClickable());//判断登录按钮是否可点击
		login.loginClick();//点击登录按钮
		
		sleep(5000);
		assertTrue(login.confirmTextExist());
		assertEquals(login.confirmTextText(),"手机号码不存在");

		
	}
	//3.司机ＩＤ错误
	public void testWrongDriverID(){
		watcher.watchPhone();
		watcher.watchNetwork();
		if(upgrad.upgradTitleExist()){
			upgrad.upgradLaterClick();
		}
		sleep(2000);
		//判断登录页面的各控件是否存在
		assertTrue(login.phoneExist());
		assertTrue(login.driveridExist());
		assertTrue(login.passwordExist());
		assertTrue(login.loginExist());

		login.clearPhone();
		login.setPhone(TEST_ENV);

		login.clearDriverid();
		login.setWrongDriverid(TEST_ENV);

		login.clearPassword();
		login.setPassword(TEST_ENV);
		UiDevice.getInstance().pressBack();

		assertTrue(login.loginClickable());//判断登录按钮是否可点击
		login.loginClick();//点击登录按钮
		sleep(5000);
		assertTrue(login.confirmTextExist());
		assertEquals(login.confirmTextText(),"司机ID有误");
		
	}
	//4.密码错误
	public void testWrongPassword(){
		watcher.watchPhone();
		watcher.watchNetwork();
		if(upgrad.upgradTitleExist()){
			upgrad.upgradLaterClick();
		}
		sleep(2000);
		//判断登录页面的各控件是否存在
		assertTrue(login.phoneExist());
		assertTrue(login.driveridExist());
		assertTrue(login.passwordExist());
		assertTrue(login.loginExist());

		login.clearPhone();
		login.setPhone(TEST_ENV);

		login.clearDriverid();
		login.setDriverid(TEST_ENV);

		login.clearPassword();
		login.setWrongPassword(TEST_ENV);
		UiDevice.getInstance().pressBack();

		assertTrue(login.loginClickable());//判断登录按钮是否可点击
		login.loginClick();//点击登录按钮
		sleep(5000);	
		assertTrue(login.confirmTextExist());
		assertEquals(login.confirmTextText(),"密码不正确");
		
	}
	//5.驾照将到期
	//6.驾照已过期
	public void testExpire(){
		watcher.watchPhone();
		watcher.watchNetwork();
		if(upgrad.upgradTitleExist()){
			upgrad.upgradLaterClick();
		}
		sleep(2000);
		//判断登录页面的各控件是否存在
		assertTrue(login.phoneExist());
		assertTrue(login.driveridExist());
		assertTrue(login.passwordExist());
		assertTrue(login.loginExist());

		login.clearPhone();
		login.setExpirePhone(TEST_ENV);

		login.clearDriverid();
		login.setExpireDriverid(TEST_ENV);

		login.clearPassword();
		login.setExpirePassword(TEST_ENV);
		UiDevice.getInstance().pressBack();

		assertTrue(login.loginClickable());//判断登录按钮是否可点击
		login.loginClick();//点击登录按钮
		sleep(5000);
		assertTrue(login.confirmTextExist());
		assertEquals(login.confirmTextText(),"驾驶证已到期，换证更新信息后方可登录");
	}
	//7。重设密码-获取验证码-手机号未注册
	public void testReWrongPhone(){
		watcher.watchPhone();
		watcher.watchNetwork();
		if(upgrad.upgradTitleExist()){
			upgrad.upgradLaterClick();
		}
		sleep(2000);
		//判断各控件是否存在
		assertTrue(login.forgetExist());
		login.forgetPassClick();
		sleep(1000);
		assertTrue(resetPass.phoneExist());
		assertTrue(resetPass.driveridExist());
		assertTrue(resetPass.getCodeExist());

		resetPass.clearPhone();
		resetPass.setWrongPhone(TEST_ENV);		

		resetPass.clearDriverid();
		resetPass.setDriverid(TEST_ENV);

		assertTrue(resetPass.getCodeClickable());
		resetPass.getCodeClick();
		sleep(5000);

		assertTrue(resetPass.reConfirmTextExist());
		assertEquals(resetPass.reConfirmTextText(),"该手机号尚未注册");
	}
	//8.重设密码-获取验证码-司机ID有误
	public void testReWrongDriverid(){
		watcher.watchPhone();
		watcher.watchNetwork();
		if(upgrad.upgradTitleExist()){
			upgrad.upgradLaterClick();
		}
		sleep(2000);
		//判断各控件是否存在
		assertTrue(login.forgetExist());	

		login.forgetPassClick();
		sleep(1000);
		assertTrue(resetPass.phoneExist());
		assertTrue(resetPass.driveridExist());
		assertTrue(resetPass.getCodeExist());

		resetPass.clearPhone();
		resetPass.setPhone(TEST_ENV);		

		resetPass.clearDriverid();
		resetPass.setWrongDriverid(TEST_ENV);

		assertTrue(resetPass.getCodeClickable());
		resetPass.getCodeClick();
		sleep(5000);
		assertTrue(resetPass.reConfirmTextExist());
		assertEquals(resetPass.reConfirmTextText(),"司机ID有误");
	}
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		base.launchApp();	
	}
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();	
		base.exit();
	}

}
