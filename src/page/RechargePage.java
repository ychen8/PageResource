package page;
/**
 * Description：
 * Date: 2015-12-4
 * @author 李怡萱
 * */
import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.ParameterConfig;
import driverInterface.RechargeConstants;

public class RechargePage extends UiAutomatorTestCase implements RechargeConstants,ParameterConfig{
	
	MainMethod rechargepage= new MainMethod();
	
	//判断标题栏是否存在
	public Boolean titleExist(){
		return rechargepage.isExist(TITLE);
	}
	//获取标题栏文本
	public String titleText(){
		return rechargepage.getText(TITLE);
	}	
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return rechargepage.isExist(BACKBTN);
	}
	//点击返回按钮
	public void backBtnClick(){		
		rechargepage.clickObj(BACKBTN);
	}
	//判断充值金额-文本是否存在
	public Boolean RechargeTextExist(){
		return rechargepage.isExistFromClass(RECHARGE_CLASS, RECHARGE_TEXT);
	}
	//判断充值金额输入框是否存在
	public Boolean RechargeInputExist(){
		return rechargepage.isExist(RECHARGE_INPUT);
	}
	//获取充值金额输入框内文本
	public String RechargeInputText(){
		return rechargepage.getText(RECHARGE_INPUT);
	}
	//输入充值金额
	public void RechargeValueSetText(){
		rechargepage.setxt(RECHARGE_INPUT, RECHARGE_VALUE);
	}
	//判断元-文本是否存在
	public Boolean yuanExist(){
		return rechargepage.isExist(YUAN);
	}
	//获取元-文本
	public String yuanText(){
		return rechargepage.getText(YUAN);
	}
	//判断提交按钮是否存在
	public Boolean commitBtnExist(){
		return rechargepage.isExist(COMMIT_BTN);
	}
	//点击提交按钮
	public void commitBtnClick(){
		rechargepage.clickObj(COMMIT_BTN);
	}
	///////////////////////弹窗/////////////////////////////
	//判断弹窗是否存在
	public Boolean winExist(){
		return rechargepage.isExist(POPUPWIN);
	}	
	//判断提示文字是否存在
	public Boolean confirmTextExist(){
		return rechargepage.isExist(CONFIRM_TEXT);
	}
	//获取提示文字
	public String confirmTextText(){
	    return rechargepage.getText(CONFIRM_TEXT);		
	}
	//判断取消按钮是否存在
	public Boolean closeBtnExist(){
		return rechargepage.isExist(CLOSE_BTN);
	}
	//点击取消按钮
	public void closeBtnClick(){		
		rechargepage.clickObj(CLOSE_BTN);
	}
	//判断确定按钮是否存在
	public Boolean okBtnExist(){
		return rechargepage.isExist(OK_BTN);
	}
	//点击确定按钮
	public void okBtnClick(){		
		rechargepage.clickObj(OK_BTN);
	}	
}
