package page;
/**
 * Date: 2015-12-2
 * @author 李怡萱
 * */
import baseMethod.MainMethod;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.OrderBalanceConstants;
import driverInterface.ParameterConfig;

public class OrderBalancePage extends UiAutomatorTestCase implements OrderBalanceConstants,ParameterConfig{
	MainMethod orderbalancepage= new MainMethod();

	//判断标题栏是否存在
	public Boolean titleExist(){
		return orderbalancepage.isExist(TITLE);
	}
	//获取标题栏文字
	public String titleText(){
	      String text=orderbalancepage.getText(TITLE);
		return text;
	}
	//判断订单号-文本是否存在
	public Boolean orderNoTextExist(){
		return orderbalancepage.isExist(ORDER_NO_TEXT);        
	}
	//获取订单号-文本
	public String orderNoTextText(){
	      String text=orderbalancepage.getText(ORDER_NO_TEXT);
		return text;
	}	
	//判断订单号是否存在
	public Boolean orderNoExist(){
		return orderbalancepage.isExist(ORDER_NO);        
	}
	//获取订单号
	public String orderNoText(){
	      String text=orderbalancepage.getText(ORDER_NO);
		return text;
	}
	//判断订单金额是否存在
	public Boolean moneyAmountExist(){
		return orderbalancepage.isExist(MONEY_AMOUNT);        
	}
	//获取订单金额
	public String moneyAmountText(){
	      String text=orderbalancepage.getText(MONEY_AMOUNT);
		return text;
	}
	//判断订单金额-元是否存在
	public Boolean moneyYuanExist(){
		return orderbalancepage.isExist(YUAN);        
	}
	//获取订单金额-元
	public String moneyYuanText(){
	      String text=orderbalancepage.getText(YUAN);
		return text;
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
		String x = null;
		try {
			x = orderbalancepage.getObj(FEE_ITEM,text).getFromParent(new UiSelector().resourceId("com.szzc.ucar.driver:id/item_value")).getText();
			
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	//判断替用户充值按钮是否存在
	public Boolean rechargeBtnExist(){
		return orderbalancepage.isExist(RECHARGE_BTN);
	}
    //点击替用户充值按钮
	public void rechargeBtnClick(){		
		try {
			orderbalancepage.getObj(RECHARGE_BTN).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断修改附加费用按钮是否存在
	public Boolean editFeeBtnExist(){
		return orderbalancepage.isExist(EDIT_FEE_BTN);
	}
    //点击修改附加费用按钮
	public void editFeeBtnClick(){		
		try {
			orderbalancepage.getObj(EDIT_FEE_BTN).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断提交并结束按钮是否存在
	public Boolean orderCommitBtnExist(){
		return orderbalancepage.isExist(ORDER_COMMIT_BTN);
	}
    //点击提交并结束按钮
	public void orderCommitBtnClick(){		
		try {
			orderbalancepage.getObj(ORDER_COMMIT_BTN).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

