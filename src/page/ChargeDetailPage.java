package page;
/**
 * Description：收费明细页面
 * Date: 2015-12-7
 * @author 李怡萱
 * */
import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.ChargeDetailConstants;

public class ChargeDetailPage extends UiAutomatorTestCase implements ChargeDetailConstants{
	MainMethod chargedetailpage = new MainMethod();

	//判断标题栏是否存在
	public Boolean titleExist(){
		return chargedetailpage.isExist(TITLE);
	}
	//获取标题栏文字
	public String titleText(){
	    return chargedetailpage.getText(TITLE);
	}
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return chargedetailpage.isExist(BACKBTN);
	}
	//点击返回按钮
	public void backBtnClick(){		
		chargedetailpage.clickObj(BACKBTN);
	}
	//判断支付状态-文本是否存在
	public Boolean payStatusTextExist(){
		return chargedetailpage.isExist(VIEW_CLASS, PAY_STATUS_TEXT_ID);
	}
	//获取支付状态-文本
	public String payStatusTextText(){
	    return chargedetailpage.getText(VIEW_CLASS, PAY_STATUS_TEXT_ID);
	}
	//判断支付状态是否存在
	public Boolean payStatusExist(){
		return chargedetailpage.isExist(VIEW_CLASS, PAY_STATUS_ID);
	}
	//获取支付状态-文本
	public String payStatusText(){
	    return chargedetailpage.getText(VIEW_CLASS, PAY_STATUS_ID);
	}
	//判断总金额是否存在
	public Boolean moneyAmountExist(){
		return chargedetailpage.isExist(MONEY_AMOUNT);
	}
	//获取总金额
	public String moneyAmountText(){
	    return chargedetailpage.getText(MONEY_AMOUNT);
	}
	//判断元-文本是否存在
	public Boolean yuanExist(){
		return chargedetailpage.isExist(VIEW_CLASS,YUAN_ID);
	}
	//获取元-文本
	public String yuanText(){
	    return chargedetailpage.getText(VIEW_CLASS,YUAN_ID);
	}
	//判断明细列表是否存在
	public Boolean costListExist(){
		return chargedetailpage.isExist(COST_LIST);
	}
	//获取费用项数目
	public int costItemCount(){
		return chargedetailpage.getChildCount(COST_LIST);
	}
	//判断费用项名称是否存在(index为偶数)
	public Boolean costNameExist(int index){
		return chargedetailpage.isExist(COST_LIST, index);
	}
	//获取费用项名称
	public String costNameText(int index){
		return chargedetailpage.getText(COST_LIST, index);
	}
	//判断费用项数值是否存在(index为奇数)
	public Boolean costValueExist(int index){
		return chargedetailpage.isExist(COST_LIST, index);
	}
	//获取费用项数值
	public String costValueText(int index){
		return chargedetailpage.getText(COST_LIST, index);
	}
	
}