package page;
/**
 * Date: 2015-12-2
 * @author 李怡萱
 * */
import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import driverInterface.OrderBalanceConstants;

public class OrderBalancePage extends UiAutomatorTestCase implements OrderBalanceConstants{
	MainMethod orderbalancepage= new MainMethod();

	//判断标题栏是否存在
	public Boolean titleExist(){
		return orderbalancepage.isExist(TITLE);
	}
	//获取标题栏文字
	public String titleText(){
	    return orderbalancepage.getText(TITLE);
	}
	//判断订单号-文本是否存在
	public Boolean orderNoTextExist(){
		return orderbalancepage.isExist(ORDER_NO_TEXT);        
	}
	//获取订单号-文本
	public String orderNoTextText(){
		return orderbalancepage.getText(ORDER_NO_TEXT);		
	}	
	//判断订单号是否存在
	public Boolean orderNoExist(){
		return orderbalancepage.isExist(ORDER_NO);        
	}
	//获取订单号
	public String orderNoText(){
		return orderbalancepage.getText(ORDER_NO);		
	}
	//判断订单金额是否存在
	public Boolean moneyAmountExist(){
		return orderbalancepage.isExist(MONEY_AMOUNT);        
	}
	//获取订单金额
	public String moneyAmountText(){
		return orderbalancepage.getText(MONEY_AMOUNT);		
	}
	//判断订单金额-元是否存在
	public Boolean moneyYuanExist(){
		return orderbalancepage.isExist(YUAN);        
	}
	//获取订单金额-元
	public String moneyYuanText(){
		return  orderbalancepage.getText(YUAN);
	}
	//判断费用明细列表是否存在
	public Boolean listTotalFeeExist(){
		return orderbalancepage.isExist(LIST_TOTAL_FEE);
	}	
	//判断费用项名称是否存在
	public Boolean feeItemTextExist(String text){
		return orderbalancepage.isExist(FEE_ITEM,text);
	}
	//获取费用项数值
	public String feeItemValueText(String text){		
		return orderbalancepage.getOtherChild(FEE_ITEM, text, FEE_ITEM_VALUE);
	}
	//判断替用户充值按钮是否存在
	public Boolean rechargeBtnExist(){
		return orderbalancepage.isExist(RECHARGE_BTN);
	}
    //点击替用户充值按钮
	public void rechargeBtnClick(){		
		orderbalancepage.clickObj(RECHARGE_BTN);
	}
	//判断修改附加费用按钮是否存在
	public Boolean editFeeBtnExist(){
		return orderbalancepage.isExist(EDIT_FEE_BTN);
	}
    //点击修改附加费用按钮
	public void editFeeBtnClick(){		
		orderbalancepage.clickObj(EDIT_FEE_BTN);
	}
	//判断提交并结束按钮是否存在
	public Boolean orderCommitBtnExist(){
		return orderbalancepage.isExist(ORDER_COMMIT_BTN);
	}
    //点击提交并结束按钮
	public void orderCommitBtnClick(){		
		orderbalancepage.clickObj(ORDER_COMMIT_BTN);
	}
	////////////////////////////弹窗/////////////////////////////
	//判断弹窗是否存在
	public Boolean winExist(){
		return orderbalancepage.isExist(POPUPWIN);
	}	
	//判断提示文字是否存在
	public Boolean confirmTextExist(){
		return orderbalancepage.isExist(CONFIRM_TEXT);
	}
	//获取提示文字
	public String confirmTextText(){
		return orderbalancepage.getText(CONFIRM_TEXT);
	}
	//判断取消按钮是否存在
	public Boolean closeBtnExist(){
		return orderbalancepage.isExist(CLOSE_BTN);
	}
	//点击取消按钮
	public void closeBtnClick(){		
		orderbalancepage.clickObj(CLOSE_BTN);
	}
	//判断确定按钮是否存在
	public Boolean okBtnExist(){
		return orderbalancepage.isExist(OK_BTN);
	}
	//点击确定按钮
	public void okBtnClick(){		
		orderbalancepage.clickObj(OK_BTN);
	}
}

