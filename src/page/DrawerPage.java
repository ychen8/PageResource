package page;

import baseMethod.MainMethod;


import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.DrawerConstants;

/**
 *创建日期:2015-12-3
 *作者： 陈玉婵
 */
public class DrawerPage extends UiAutomatorTestCase implements DrawerConstants{
	MainMethod drawerPage= new MainMethod();
	
	//判断司机姓名是否存在
	public Boolean driverNameExist(){
		return drawerPage.isExist(DRIVER_NAME);
	}
	//获取司机姓名
	public String driverNameText(){
		return drawerPage.getText(DRIVER_NAME);
	}
	//点击司机姓名
	public void driverNameClick(){
			drawerPage.clickObj(DRIVER_NAME);
	}
	//判断车辆型号是否存在
	public Boolean vhicleNumExist(){
		return drawerPage.isExist(VHICLE_NUM);
	}
	//获取车辆型号
	public String vhicleNumText(){
		return drawerPage.getText(VHICLE_NUM);
	}
	//点击车辆型号
	public void vhicleNumClick(){
			drawerPage.clickObj(VHICLE_NUM);	
	}
	//判断今日排班是否存在
	public Boolean classesExist(){
		return drawerPage.isExist(CLASSES);
	}
	//获取今日排班
	public String classesText(){
		return drawerPage.getText(CLASSES);
	}
	//点击今日排班
	public void classesClick(){
			drawerPage.clickObj(CLASSES);
	}
	//判断我的订单是否存在
	public Boolean myOrderExist(){
		return drawerPage.isExist(MY_ORDER);
	}
	//获取我的订单
	public String myOrderText(){
		return drawerPage.getText(MY_ORDER);
	}
	//点击我的订单
	public void myOrderClick(){
			drawerPage.clickObj(MY_ORDER);
	}
	//判断我的绩效是否存在
	public Boolean myPerformanceExist(){
		return drawerPage.isExist(MY_PERFORMANCE);
	}
	//获取我的绩效　
	public String myPerformanceText(){
		return drawerPage.getText(MY_PERFORMANCE);
	}
	//点击我的绩效　
	public void myPerformanceClick(){
			drawerPage.clickObj(MY_PERFORMANCE);	
	}
	//判断我的钱包　是否存在
	public Boolean myWalletExist(){
		return drawerPage.isExist(MY_WALLET);
	}
	//获取我的钱包　
	public String myWalletText(){
		return drawerPage.getText(MY_WALLET);
	}
	//点击我的钱包　
	public void myWalletClick(){
			drawerPage.clickObj(MY_WALLET);
	}
	//判断排行榜是否存在
	public Boolean rankExist(){
		return drawerPage.isExist(RANK);
	}
	//获取排行榜
	public String rankText(){
		return drawerPage.getText(RANK);
	}
	//点击排行榜
	public void rankClick(){
			drawerPage.clickObj(RANK);
	}
	//判断微客服是否存在
	public Boolean vkefuExist(){
		return drawerPage.isExist(VKEFU);
	}
	//获取微客服
	public String vkefuText(){
		return drawerPage.getText(VKEFU);
	}
	//点击微客服
	public void vkefuClick(){
			drawerPage.clickObj(VKEFU);	
	}
	//判断设置是否存在
	public Boolean settingExist(){
		return drawerPage.isExist(SETTINGS);
	}
	//获取设置
	public String settingText(){
		return drawerPage.getText(SETTINGS);
	}
	//点击设置
	public void settingClick(){
			drawerPage.clickObj(SETTINGS);	
	}
	//判断司机分布是否存在
	public Boolean driverDistributionExist(){
		return drawerPage.isExist(DRIVERDISTRIBUTION);
	}
	//获取司机分布
	public String driverDistributionText(){
		return drawerPage.getText(DRIVERDISTRIBUTION);
	}
	//点击司机分布
	public void driverDistributionClick(){
			drawerPage.clickObj(DRIVERDISTRIBUTION);
	}
	//判断联系客服是否存在
	public Boolean customServiceExist(){
		return drawerPage.isExist(CUSTOM_SERVICE);
	}
	//获取联系客服　　　　
	public String customServiceText(){
		return drawerPage.getText(CUSTOM_SERVICE);
	}
	//点击联系客服
	public void customServiceClick(){
			drawerPage.clickObj(CUSTOM_SERVICE);	
	}
	//判断联系客服弹框是否存在
	public Boolean customConfirmtExist(){
		return drawerPage.isExist(CUSTOM_CONFIRM_TEXT);
	}
	//获取联系客服弹框文本　　　　
	public String customConfirmtText(){
		return drawerPage.getText(CUSTOM_CONFIRM_TEXT);
	}
	//判断拨打电话是否存在
	public Boolean phoneCallExist(){
		return drawerPage.isExist(PHONE_CALL);
	}
	//获取拨打电话　　　
	public String phoneCallText(){
		return drawerPage.getText(PHONE_CALL);
	}
	//点击拨打电话
	public void phoneCallClick(){
			drawerPage.clickObj(PHONE_CALL);	
	}
	//判断联系客服弹框－取消是否存在
	public Boolean closeBtnExist(){
		return drawerPage.isExist(CLOSE_BTN);
	}
	//获取联系客服弹框－取消　　
	public String closeBtnText(){
		return drawerPage.getText(CLOSE_BTN);
	}
	//点击联系客服弹框－取消
	public void closeBtnClick(){
			drawerPage.clickObj(CLOSE_BTN);	
	}

}
