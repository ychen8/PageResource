package testcase;

import page.DriverDistriPage;
import page.MainPage;
import page.SwichWorkTypePage;

import baseMethod.Base;
import baseMethod.Watcher;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 创建日期:2015-12-18 作者： 陈玉婵
 * 修改日期:2016-01-05 作者： 李怡萱
 * 备注：增加司机分布按钮用例
 */
public class SwichWorkTypeCase extends UiAutomatorTestCase {
	SwichWorkTypePage swtype = new SwichWorkTypePage();
	MainPage main = new MainPage();
	DriverDistriPage driverdistri = new DriverDistriPage();
	LoginCase login = new LoginCase();
	Base base = new Base();
	Watcher watcher = new Watcher();
	//用例上班中、回家中、交班中、临时小休、我要上班
	public void testSwichWork() {
		watcher.watchPhone();
		watcher.watchNetwork();
		// 1.司机A登录
		base.login();
	
		///////用例－上班中///////////
		// 2.司机A点击“我要上班”
		while(!main.stateBtnExist()){
			sleep(1000);
		}
		assertTrue(main.stateBtnExist());
		System.out.println("是我要上班么:" + main.stateBtnText());
		System.out.println(main.stateBtnText().equals("我要上班"));
		if (main.stateBtnText().equals("我要上班")) {
			assertEquals("司机"+"\n"+"分布",main.changeBtnText());
			main.changeBtnClick();
			System.out.println("点击司机分布");
			sleep(3000);
			driverDistriCase();
			
			
			
			main.stateBtnClick();
		}
		sleep(1000);
		// 如果输入里程弹框存在，则输入正确的里程数，点击确定上班
		if (main.kiloEditExist()) {
			main.kiloSetText();
			main.workBtnClick();
			sleep(5000);
		}
		//上班成功，上班状态显示上班中
		assertEquals(main.stateBtnText(),"上班中");
		main.stateBtnClick();
		sleep(3000);
		driverDistriCase();

		//assertTrue(main.setBtnExist());
		
		while(!main.setBtnExist()){
			sleep(1000);
			System.out.println(main.setBtnExist());
		}
		System.out.println("接单设置是么:"+main.setBtnText());
		String text="接单"+"\n"+"设置";
		//显示接单设置按钮
		assertEquals(main.setBtnText(),text);
		//assertEquals(main.setBtnText(),)
		//assertEquals(main.setBtnText(),"接单设置");
		sleep(1000);
		assertTrue(main.changeBtnExist());
		sleep(1000);
		String text2="状态"+"\n"+"切换";
		//显示状态切换按钮
		assertEquals(main.changeBtnText(),text2);
		System.out.println(main.changeBtnText());
		
		////////用例＝回家中///////
		//改变上班状态为回家中
		main.changeBtnClick();
		while(!swtype.goHomeExist()){
			sleep(1000);
		}
		do{
			swtype.goHomeClick();
		}while(!swtype.goHomeChecked());
		swtype.okBtnClick();
		sleep(2000);
		if(swtype.limitConfirmExist()){
			swtype.okBtnClick();
			swtype.cancelBtnClick();

			assertEquals(main.stateBtnText(),"上班中");
		}
		else{
			//判断上班状态是否变为回家中
			assertEquals(main.stateBtnText(),"回家中");
			main.stateBtnClick();
			sleep(3000);
			driverDistriCase();

		}

		
		////////用例－交班中///////
		main.changeBtnClick();
		while(!swtype.alternateExist()){
			sleep(1000);
		}
		do{
			swtype.alternateClick();
		}while(!swtype.alternateChecked());
		swtype.okBtnClick();
		sleep(2000);
		if(swtype.limitConfirmExist()){
			swtype.okBtnClick();
			swtype.cancelBtnClick();

			assertEquals(main.stateBtnText(),"上班中");
		}
		else{
			assertEquals(main.stateBtnText(),"交班中");
			main.stateBtnClick();
			sleep(3000);
			driverDistriCase();

			
		}
		
		
		/////临时小休//////
		main.changeBtnClick();
		while(!swtype.tempFinishExist()){
			sleep(1000);
		}
		do{
			swtype.tempFinishClick();
		}while(!swtype.tempFinishChecked());
		swtype.okBtnClick();
		sleep(2000);
		assertEquals(main.stateBtnText(),"临时小休");
		main.stateBtnClick();
		sleep(3000);
		driverDistriCase();

		
		
		//////正常下班//////
		main.changeBtnClick();
		while(!swtype.finishWorkExist()){
			sleep(1000);
		}
		do{
			swtype.finishWorkClick();
		}while(!swtype.finishWorkChecked());
		swtype.okBtnClick();
		sleep(2000);
		assertEquals(main.stateBtnText(),"我要上班");
		
		
				
	}
	

	private void driverDistriCase() {
		
		System.out.println("测试司机分布");
		driverdistri.returnClick();
		sleep(3000);
	}
	
}
