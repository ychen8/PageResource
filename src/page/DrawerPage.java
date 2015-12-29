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
	//点击联系客服
	public void customServiceClick(){
			drawerPage.clickObj(CUSTOM_SERVICE);	
	}

}
