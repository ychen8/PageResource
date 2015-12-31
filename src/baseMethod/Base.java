package baseMethod;

import page.DrawerPage;
import page.LoginPage;
import page.MainPage;
import page.PersonSetPage;
import page.ResetPassPage;
import page.UpgradPage;
import android.view.KeyEvent;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.ParameterConfigConstants;

/**
 *创建日期:2015-12-31
 *作者： 陈玉婵
 */
public class Base extends UiAutomatorTestCase implements ParameterConfigConstants {
	LoginPage login=new LoginPage();
	MainPage main=new MainPage();
	UpgradPage upgrad=new UpgradPage();
	DrawerPage draw=new DrawerPage();
	PersonSetPage perset=new PersonSetPage();
	Watcher watcher=new Watcher();

    public void launchApp() {
    	pressKeyCode(KeyEvent.KEYCODE_BACK, 4);
    	pressKeyCode(KeyEvent.KEYCODE_HOME, 1);
    	try{
    		new UiObject(new UiSelector().text(APP_NAME)).clickAndWaitForNewWindow();
    	}catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}
    
    public void login(){
		watcher.watchPhone();
		watcher.watchNetwork();
		sleep(1000);
		//判断是否弹升级框，如果弹则按稍后升级
		if(upgrad.upgradTitleExist()){
			upgrad.upgradLaterClick();
		}
		//判断登录页面的各控件是否存在
		/*assertTrue(login.phoneExist());
		assertTrue(login.driveridExist());
		assertTrue(login.passwordExist());
		assertTrue(login.loginExist());
	*/
		login.clearPhone();//清空手机号输入框
		login.setPhone(TEST_ENV);//输入手机号
		
		login.clearDriverid();//清空司机ＩＤ输入框
		login.setDriverid(TEST_ENV);//输入司机ＩＤ
	
		login.clearPassword();//清空密码输入框
		login.setPassword(TEST_ENV);//输入密码
		
		UiDevice.getInstance().pressBack();
		
		assertTrue(login.loginClickable());//判断登录按钮是否可点击
		login.loginClick();//点击登录按钮
		sleep(1000);
		assertTrue(main.stateBtnExist());//登录成功的话，判断首页的上班按钮是否存在
	
    }
    
	public  void exit(){
		pressKeyCode(KeyEvent.KEYCODE_BACK, 4);
	       //回到登录后首页面，点击左上角的我的图标
		if(main.personBtnExist()){
			main.personBtnClick();
		}
		//点击设置
		if(draw.settingExist()){
			draw.settingClick();
		}  
	    //点击退出登录按钮
		if(perset.logoutExist()){
			perset.logoutClick();
		}
		assertTrue(perset.closeBtnExist());
		perset.closeBtnClick();
		sleep(500);
		pressKeyCode(KeyEvent.KEYCODE_HOME, 1);

    }
	
	public static void pressKeyCode(int keyCode,int time){
    	for(int i=0;i<time;i++){
    	UiDevice.getInstance().pressKeyCode(keyCode);
    	}
    }

}
