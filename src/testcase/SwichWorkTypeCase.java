package testcase;

import page.MainPage;
import page.SwichWorkTypePage;

import baseMethod.Base;
import baseMethod.Watcher;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 创建日期:2015-12-18 作者： 陈玉婵
 */
public class SwichWorkTypeCase extends UiAutomatorTestCase {
	SwichWorkTypePage swtype = new SwichWorkTypePage();
	MainPage main = new MainPage();
	LoginCase login = new LoginCase();
	Base base = new Base();
	Watcher watcher = new Watcher();
	//１.我要上班
	public void testStartWork() {
		watcher.watchPhone();
		watcher.watchNetwork();
		// 1.司机A登录
		base.login();
		sleep(2000);
		// 2.司机A点击“我要上班”
		assertTrue(main.stateBtnExist());
		System.out.println("是我要上班么:" + main.stateBtnText());
		System.out.println(main.stateBtnText().equals("我要上班"));
		if (main.stateBtnText().equals("我要上班")) {
			main.stateBtnClick();
		}
		sleep(1000);
		// 如果输入里程弹框存在，则输入正确的里程数，点击确定上班
		if (main.kiloEditExist()) {
			main.kiloSetText();
			main.workBtnClick();
			sleep(5000);
		}
		assertEquals(main.stateBtnText(),"上班中");
		sleep(2000);
		assertTrue(main.setBtnExist());
		sleep(1000);
		assertEquals(main.setBtnText(),"接单设置");
		sleep(1000);
		assertTrue(main.changeBtnExist());
		sleep(1000);
		assertEquals(main.changeBtnText(),"状态切换");
		main.changeBtnClick();
		
	}
	
	public void testGoHome(){
		
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
