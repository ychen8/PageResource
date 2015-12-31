package testcase;

import baseMethod.Watcher;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.ParameterConfigConstants;
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
	/**
	//1、正常登录
	public void testloginSuceess(){
		watcher.watchPhone();
		watcher.watchNetwork();
		if(upgrad.upgradTitleExist()){
			upgrad.upgradLaterClick();
		}
		if(login.phoneExist()){
			login.clearPhone();
			login.setPhone(TEST_ENV);
		}
		if(login.driveridExist()){
			login.clearDriverid();
			login.setDriverid(TEST_ENV);
		}
		if(login.passwordExist()){
			login.clearPassword();
			login.setPassword(TEST_ENV);
		}
		if(login.loginExist()){
			if(login.loginClickable()){
				login.loginClick();
			}
		}
		assertTrue(main.stateBtnExist());
		
	}
	**/
	//１、登录成功
	public void testloginSuceess(){
		watcher.watchPhone();
		watcher.watchNetwork();
		//判断是否弹升级框，如果弹则按稍后升级
		if(upgrad.upgradTitleExist()){
			upgrad.upgradLaterClick();
		}
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
		
		assertTrue(login.loginClickable());//判断长级框是否可点击
		login.loginClick();//点击登录按钮
		assertTrue(main.stateBtnExist());//登录成功的话，判断首页的上班按钮是否存在
		
	}
	//2.手机号码不存在
	public void testNoPhone(){
		watcher.watchPhone();
		watcher.watchNetwork();
		if(upgrad.upgradTitleExist()){
			upgrad.upgradLaterClick();
		}
		if(login.phoneExist()){
			login.clearPhone();
			login.setWrongPhone(TEST_ENV);
		}
		if(login.driveridExist()){
			login.clearDriverid();
			login.setDriverid(TEST_ENV);
		}
		if(login.passwordExist()){
			login.clearPassword();
			login.setPassword(TEST_ENV);
		}
		if(login.loginExist()){
			if(login.loginClickable()){
				login.loginClick();
			}
		}
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
		if(login.phoneExist()){
			login.clearPhone();
			login.setPhone(TEST_ENV);
		}
		if(login.driveridExist()){
			login.clearDriverid();
			login.setWrongDriverid(TEST_ENV);
		}
		if(login.passwordExist()){
			login.clearPassword();
			login.setPassword(TEST_ENV);
		}
		if(login.loginExist()){
			if(login.loginClickable()){
				login.loginClick();
			}
		}
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
		if(login.phoneExist()){
			login.clearPhone();
			login.setPhone(TEST_ENV);
		}
		if(login.driveridExist()){
			login.clearDriverid();
			login.setDriverid(TEST_ENV);
		}
		if(login.passwordExist()){
			login.clearPassword();
			login.setWrongPassword(TEST_ENV);
		}
		if(login.loginExist()){
			if(login.loginClickable()){
				login.loginClick();
			}
		}
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
		if(login.phoneExist()){
			login.clearPhone();
			login.setExpirePhone(TEST_ENV);
		}
		if(login.driveridExist()){
			login.clearDriverid();
			login.setExpireDriverid(TEST_ENV);
		}
		if(login.passwordExist()){
			login.clearPassword();
			login.setExpirePassword(TEST_ENV);
		}
		if(login.loginExist()){
			if(login.loginClickable()){
				login.loginClick();
			}
		}
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
		if(login.forgetExist()){
			login.forgetPassClick();
		}
		if(resetPass.phoneExist()){
			resetPass.clearPhone();
			resetPass.setWrongPhone(TEST_ENV);		
		}
		if(resetPass.driveridExist()){
			resetPass.clearDriverid();
			resetPass.setDriverid(TEST_ENV);
		}
		if(resetPass.getCodeExist()){
			if(resetPass.getCodeClickable()){
				resetPass.getCodeClick();
			}
		}
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
		if(login.forgetExist()){
			login.forgetPassClick();
		}
		if(resetPass.phoneExist()){
			resetPass.clearPhone();
			resetPass.setPhone(TEST_ENV);		
		}
		if(resetPass.driveridExist()){
			resetPass.clearDriverid();
			resetPass.setWrongDriverid(TEST_ENV);
		}
		if(resetPass.getCodeExist()){
			if(resetPass.getCodeClickable()){
				resetPass.getCodeClick();
			}	
		}
		assertTrue(resetPass.reConfirmTextExist());
		assertEquals(resetPass.reConfirmTextText(),"司机ID有误");
	}

}
