package testcase;

import page.RechargePage;

import baseMethod.Base;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 *创建日期:2016-1-6
 *作者： 陈玉婵
 */
public class RechargeCase extends UiAutomatorTestCase{
	RechargePage reCharge=new RechargePage();
	Base base=new Base();
	public void testRechare(){
		System.out.println("替用户充值页面");
		assertTrue(reCharge.titleExist());
		assertEquals("替用户充值",reCharge.titleText());
		assertTrue(reCharge.backBtnExist());
		assertTrue(reCharge.RechargeTextExist());
		assertTrue(reCharge.RechargeInputExist());
		assertTrue(reCharge.yuanExist());
		assertEquals("元",reCharge.yuanText());
		//输入超过2000的金额
		do{
			reCharge.RechargeInputClear();
		}while(!reCharge.RechargeInputText().equals("请输入正敕数"));
		reCharge.RechargeValueSetMaxText();
		UiDevice.getInstance().pressBack();
		reCharge.commitBtnClick();
		while(reCharge.confirmTextExist()){
			reCharge.okBtnClick();
			do{
				sleep(1000);
			}while(base.loadingImgExist());
			assertEquals("充值金额不能大于2000",reCharge.confirmTextText());
			reCharge.okBtnClick();
		}
		//输入小于2000金额
		do{
			reCharge.RechargeInputClear();
		}while(!reCharge.RechargeInputText().equals("请输入正敕数"));
		reCharge.RechargeValueSetText();
		UiDevice.getInstance().pressBack();
		reCharge.commitBtnClick();
		while(reCharge.confirmTextExist()){
			reCharge.okBtnClick();
			do{
				sleep(1000);
			}while(base.loadingImgExist());
			assertEquals("充值成功",reCharge.confirmTextText());
			reCharge.okBtnClick();
		}
		
		
	}
	
	


}
