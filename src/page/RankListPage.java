package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.RankListConstants;

/**
 *创建日期:2015-12-9
 *作者： 陈玉婵
 */
public class RankListPage extends UiAutomatorTestCase implements RankListConstants {
	MainMethod rankListPage= new MainMethod();
	//判断返回icon是否存在
	public Boolean returnExist(){
		return rankListPage.isExist(BACK);
	}
	//点击返回
	public void returnClick(){
		rankListPage.clickObj(BACK);
	}
	//判断标题是否存在
	public Boolean titleExist(){
		return rankListPage.isExist(TITLE);
	}
	//获取标题内容
	public String titleText(){
		return rankListPage.getText(TITLE);
	}
	//判断充值金额栏是否存在
	public Boolean llRechargeAmountExist(){
		return rankListPage.isExist(LL_RECHARGE_AMOUNT);
	}
	//点击充值金额栏
	public void llRechargeAmountClick(){
		rankListPage.clickObj(LL_RECHARGE_AMOUNT);
	}
	//判断充值金额否存在
	public Boolean rechargeAmountExist(){
		return rankListPage.isExistFromId(LL_RECHARGE_AMOUNT,INDEX_RECHARGE_AMOUNT);
	}
	//获取充值金额文本
	public String rechargeAmountText(){
		return rankListPage.getTextFromId(LL_RECHARGE_AMOUNT, INDEX_RECHARGE_AMOUNT);
	}
	//判断订单完成栏是否存在
	public Boolean llFinishOrderExist(){
		return rankListPage.isExist(LL_FINISHED_ORDER);
	}
	//点击订单完成栏
	public void llFinishOrderClick(){
		rankListPage.clickObj(LL_FINISHED_ORDER);
	}
	//判断订单完成否存在
	public Boolean finishOrderExist(){
		return rankListPage.isExistFromId(LL_FINISHED_ORDER,INDEX_FINISHED_ORDER);
	}
	//获取订单完成文本
	public String finishOrderText(){
		return rankListPage.getTextFromId(LL_FINISHED_ORDER,INDEX_FINISHED_ORDER);
	}
	
	
}
