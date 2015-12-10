package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.Vkefu;

/**
 *创建日期:2015-12-10
 *作者： 陈玉婵
 */
public class VkefuPage extends UiAutomatorTestCase implements Vkefu {
	MainMethod vKeFuPage= new MainMethod();
	//判断返回icon是否存在
	public Boolean returnExist(){
		return vKeFuPage.isExist(BACK);
	}
	//点击返回
	public void returnClick(){
		vKeFuPage.clickObj(BACK);
	}
	//判断标题是否存在
	public Boolean titleExist(){
		return vKeFuPage.isExist(TITLE);
	}
	//获取标题内容
	public String titleText(){
		return vKeFuPage.getText(TITLE);
	}
	//判断订单处理栏是否存在
	public Boolean llOrderExist(){
		return vKeFuPage.isExist(LL_ORDER);
	}
	//点击订单处理栏
	public void llOrderClick(){
		vKeFuPage.clickObj(LL_ORDER);
	}
	//判断订单处理栏文本是否存在
	public Boolean orderExist(){
		return vKeFuPage.isExistFromId(LL_ORDER, INDEX_LL_ORDER);
	}
	//获取订单处理栏文本内容
	public String orderText(){
		return vKeFuPage.getTextFromId(LL_ORDER, INDEX_LL_ORDER);
	}
	//判断司机端操作与指标栏是否存在
	public Boolean llGuideExist(){
		return vKeFuPage.isExist(LL_GUIDE);
	}
	//点击司机端操作与指标栏
	public void llGuideClick(){
		vKeFuPage.clickObj(LL_GUIDE);
	}
	//判断司机端操作与指标栏文本是否存在
	public Boolean guideExist(){
		return vKeFuPage.isExistFromId(LL_GUIDE,INDEX_LL_GUIDE);
	}
	//获取司机端操作与指标栏文本内容
	public String guideText(){
		return vKeFuPage.getTextFromId(LL_GUIDE, INDEX_LL_GUIDE);
	}
	//判断财务与钱款栏是否存在
	public Boolean llCashExist(){
		return vKeFuPage.isExist(LL_CASH);
	}
	//点击财务与钱款栏
	public void llCashClick(){
		vKeFuPage.clickObj(LL_CASH);
	}
	//判断财务与钱款栏文本是否存在
	public Boolean cashExist(){
		return vKeFuPage.isExistFromId(LL_CASH,INDEX_LL_CASH);
	}
	//获取财务与钱款栏文本内容
	public String cashText(){
		return vKeFuPage.getTextFromId(LL_CASH, INDEX_LL_CASH);
	}
	//判断代客充值栏是否存在
	public Boolean llRechargeExist(){
		return vKeFuPage.isExist(LL_RECHARGE);
	}
	//点击代客充值栏
	public void llRechargeClick(){
		vKeFuPage.clickObj(LL_RECHARGE);
	}
	//判断代客充值栏文本是否存在
	public Boolean rechargeExist(){
		return vKeFuPage.isExistFromId(LL_RECHARGE,INDEX_LL_RECHARGE);
	}
	//获取代客充值栏文本内容
	public String rechargeText(){
		return vKeFuPage.getTextFromId(LL_RECHARGE, INDEX_LL_RECHARGE);
	}
	//判断其它栏是否存在
	public Boolean llOtherExist(){
		return vKeFuPage.isExist(LL_OTHER);
	}
	//点击其它栏
	public void llOtherClick(){
		vKeFuPage.clickObj(LL_OTHER);
	}
	//判断其它栏文本是否存在
	public Boolean otherExist(){
		return vKeFuPage.isExistFromId(LL_OTHER,INDEX_LL_OTHER);
	}
	//获取其它栏文本内容
	public String otherText(){
		return vKeFuPage.getTextFromId(LL_OTHER, INDEX_LL_OTHER);
	}
	//判断自助查询栏是否存在
	public Boolean llAutoqueryExist(){
		return vKeFuPage.isExist(LL_AUTOQUERY);
	}
	//点击自助查询栏
	public void llAutoqueryClick(){
		vKeFuPage.clickObj(LL_AUTOQUERY);
	}
	//判断自助查询栏文本是否存在
	public Boolean autoqueryExist(){
		return vKeFuPage.isExistFromId(LL_AUTOQUERY,INDEX_LL_AUTOQUERY);
	}
	//获取自助查询栏文本内容
	public String autoqueryText(){
		return vKeFuPage.getTextFromId(LL_AUTOQUERY, INDEX_LL_AUTOQUERY);
	}

}
