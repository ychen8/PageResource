package baseMethod;

import page.DrawerPage;
import page.LoginPage;
import page.MainPage;
import page.PersonSetPage;
import page.UpgradPage;
import android.view.KeyEvent;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.ParameterConfigConstants;

/**
 * 创建日期:2015-12-31 作者： 陈玉婵
 */
public class Base extends UiAutomatorTestCase implements
		ParameterConfigConstants {
	LoginPage login = new LoginPage();
	MainPage main = new MainPage();
	UpgradPage upgrad = new UpgradPage();
	DrawerPage draw = new DrawerPage();
	PersonSetPage perset = new PersonSetPage();
	Watcher watcher = new Watcher();

	public void launchApp() {
		exit();
		try {
			new UiObject(new UiSelector().text(APP_NAME))
					.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sleep(2000);

	}

	public void login() {
		watcher.watchPhone();
		watcher.watchNetwork();
		sleep(1000);
		// 判断是否弹升级框，如果弹则按稍后升级
		if (upgrad.upgradTitleExist()) {
			upgrad.upgradLaterClick();
		}

		if (login.phoneExist()) {
			login.clearPhone();// 清空手机号输入框
			login.setPhone(TEST_ENV);// 输入手机号
		}

		if (login.driveridExist()) {
			login.clearDriverid();// 清空司机ＩＤ输入框
			login.setDriverid(TEST_ENV);// 输入司机ＩＤ
		}

		if (login.passwordExist()) {
			login.clearPassword();// 清空密码输入框
			login.setPassword(TEST_ENV);// 输入密码
			UiDevice.getInstance().pressBack();
		}

		if (login.loginExist()) {
			if (login.loginClickable()) {
				login.loginClick();// 点击登录按钮
				sleep(5000);
			}
		}

	}

	public void exit() {
		pressKeyCode(KeyEvent.KEYCODE_BACK, 4);
		// 回到登录后首页面，点击左上角的我的图标
		if (main.personBtnExist()) {
			main.personBtnClick();
		}
		// 点击设置
		if (draw.settingExist()) {
			draw.settingClick();
		}
		// 点击退出登录按钮
		if (perset.logoutExist()) {
			perset.logoutClick();
		}
		if (perset.okBtnExist()) {
			perset.okBtnClick();
		}

		sleep(500);
		pressKeyCode(KeyEvent.KEYCODE_HOME, 1);

	}

	public static void pressKeyCode(int keyCode, int time) {
		for (int i = 0; i < time; i++) {
			UiDevice.getInstance().pressKeyCode(keyCode);
		}
	}

}
