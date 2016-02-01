package testcase;

import page.RechargePage;

import baseMethod.Base;
import baseMethod.Watcher;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 *创建日期:2016-1-6
 *作者： 陈玉婵
 */
public class RechargeCase extends UiAutomatorTestCase{
	RechargePage reCharge=new RechargePage();
	Base base=new Base();
	Watcher watcher=new Watcher();
	public void testRechare(){
		watcher.watchPhone();
		watcher.watchNetwork();
		watcher.watchOrderPush();
		System.out.println("替用户充值页面");
		assertTrue(reCharge.titleExist());
		assertEquals("替用户充值",reCharge.titleText());
		assertTrue(reCharge.backBtnExist());
		//assertTrue(reCharge.RechargeTextExist());
		assertTrue(reCharge.RechargeInputExist());
		assertTrue(reCharge.yuanExist());
		assertEquals("元",reCharge.yuanText());
		//输入超过2000的金额
		do{
			reCharge.RechargeInputClear();
		}while(!reCharge.RechargeInputText().equals("请输入正整数"));
		reCharge.RechargeValueSetMaxText();
		UiDevice.getInstance().pressBack();
		reCharge.commitBtnClick();
		while(reCharge.confirmTextExist()){
			reCharge.okBtnClick();
			do{
				sleep(1000);
			}while(base.loadingImgExist());
			assertEquals("充值金额不能大于2000元",reCharge.confirmTextText());

			reCharge.okBtnClick();
		}
		//输入小于2000金额
		RechargeNormalSet();
		System.out.println(reCharge.confirmTextText());
		if(reCharge.confirmTextText().equals("查询订单是否被充值过-远程失败")){
			reCharge.okBtnClick();
			reCharge.backBtnClick();
		}
		else{
			assertEquals("充值成功",reCharge.confirmTextText());
			reCharge.okBtnClick();
			
			//第二次充值时，提示只能充一次
			RechargeNormalSet();
			System.out.println(reCharge.confirmTextText());
			assertEquals("只能为该订单客户充值1次",reCharge.confirmTextText());
			reCharge.okBtnClick();
			reCharge.backBtnClick();
		}

		}
		
	public void RechargeNormalSet(){
		do{
			reCharge.RechargeInputClear();
		}while(!reCharge.RechargeInputText().equals("请输入正整数"));
		reCharge.RechargeValueSetText();
		UiDevice.getInstance().pressBack();
		reCharge.commitBtnClick();
		do{
			sleep(1000);
		}while(base.loadingImgExist());
		reCharge.okBtnClick();
		do{
			sleep(1000);
		}while(base.loadingImgExist());
	}
	
	


}
