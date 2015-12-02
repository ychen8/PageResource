package page;
import baseMethod.*;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.*;

public class CheckBill extends UiAutomatorTestCase implements CheckBillConstants,ParameterConfig{

	MainMethod checkbill= new MainMethod();
	
	//判断标题栏是否存在
	public Boolean titleExist(){
		return checkbill.isExist(TITLE);
	}
	//获取标题栏文本
	public String titleText(){
	      String text=checkbill.getText(TITLE);
		return text;
	}	
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return checkbill.isExist(BACKBTN);
	}
	//点击返回按钮
	public void backBtnClick(){		
		try {
			checkbill.getObj(BACKBTN).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断本次服务里程-文本是否存在
	public Boolean killoTitleExist(){
		return checkbill.isExist(KILLOTITLE);
	}
	//获取本次服务里程-文本
	public String killoTitleText(){
	      String text=checkbill.getText(KILLOTITLE);
		return text;
	}
	//判断里程输入框是否存在
	public Boolean killoValueExist(){
		return checkbill.isExist(KILLOVALUE);
	}
	//获取里程输入框文本
	public String killoValueText(){
	    String text=checkbill.getText(KILLOVALUE);
		return text;
	}
	//在里程框内输入
	public void killoValueSetText(){
		try {
			checkbill.getObj(BACKBTN).setText(KILLO);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断公里-文本是否存在
	public Boolean killoTextExist(){
		return checkbill.isExist(KILLOTEXT);
	}
	//获取公里-文本
	public String killoTextText(){
	      String text=checkbill.getText(KILLOTEXT);
		return text;
	}
	
	//判断附加费用-文本是否存在
	public Boolean costNameExist(int index){
		return checkbill.isExist(COSTNAME,index);
	}
	//获取附加费用-文本
	public String costNameText(int index){
	    String text=checkbill.getText(COSTNAME,index);
		return text;
	}
	//判断附加费用-输入框是否存在
	public Boolean costValueExist(int index){
		return checkbill.isExist(COSTVALUE,index);
	}
	//获取附加费用-输入框
	public String costValueText(int index){
	    String text=checkbill.getText(COSTVALUE,index);
		return text;
	}
	//输入附加费用
	public void costValueSetText(int index, String amount){
		try {
			checkbill.getObj(COSTVALUE, index).setText(amount);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	//判断元-文本是否存在
	public Boolean yuanExist(int index){
		return checkbill.isExist(COSTNAME,index);
	}
	//获取元-文本
	public String yuanText(int index){
	    String text=checkbill.getText(COSTNAME,index);
		return text;
	}
	//判断确认按钮是否存在
	public Boolean chargeCommitExist(){
		return checkbill.isExist(CHARGECOMMIT);        
	}
	//点击确认按钮
	public void chargeCommitClick(){	
		try {
			checkbill.getObj(CHARGECOMMIT).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
