package page;
/**
 * Description：核实账单页
 * Date: 2015-12-2
 * @author 李怡萱
 * */
import baseMethod.*;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import driverInterface.*;

public class CheckBillPage extends UiAutomatorTestCase implements CheckBillConstants,ParameterConfigConstants{

	MainMethod checkbill= new MainMethod();
	
	//判断标题栏是否存在
	public Boolean titleExist(){
		return checkbill.isExist(TITLE);
	}
	//获取标题栏文本
	public String titleText(){
		return checkbill.getText(TITLE);
	}	
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return checkbill.isExist(BACKBTN);
	}
	//点击返回按钮
	public void backBtnClick(){		
		checkbill.clickObj(BACKBTN);
	}
	//判断本次服务里程-文本是否存在
	public Boolean killoTitleExist(){
		return checkbill.isExist(KILLOTITLE);
	}
	//获取本次服务里程-文本
	public String killoTitleText(){
		return checkbill.getText(KILLOTITLE);
	}
	//判断里程输入框是否存在
	public Boolean killoValueExist(){
		return checkbill.isExist(KILLOVALUE);
	}
	//获取里程输入框文本
	public String killoValueText(){
		return checkbill.getText(KILLOVALUE);
	}
	//在里程框内输入
	public void killoValueSetText(){
		checkbill.setxt(BACKBTN, KILLO);
	}
	//判断公里-文本是否存在
	public Boolean killoTextExist(){
		return checkbill.isExist(KILLOTEXT);
	}
	//获取公里-文本
	public String killoTextText(){
		return checkbill.getText(KILLOTEXT);
	}
	//判断附加费用-文本是否存在
	public Boolean costNameExist(int index){
		return checkbill.isExist(COSTNAME,index);
	}
	//判断附加费用-文本是否存在2
	public Boolean costName2Exist(int childindex,int grandindex){
		return checkbill.isExistFromListGrand(EXTRAFEELL, childindex, grandindex);
	}
	//获取附加费用-文本
	public String costNameText(int index){
		return checkbill.getText(COSTNAME,index);
	}
		//获取附加费用-文本2
	public String costName2Text(int childindex,int grandindex){
		return checkbill.getListGrandChildText(EXTRAFEELL, childindex, grandindex);
	}
	//判断附加费用-输入框是否存在
	public Boolean costValueExist(int index){
		return checkbill.isExist(COSTVALUE,index);
	}
	//判断附加费用-输入框是否存在2
	public Boolean costValue2Exist(int childindex,int grandindex){
		return checkbill.isExistFromListGrand(EXTRAFEELL, childindex, grandindex);
	}
	//获取附加费用-输入框
	public String costValueText(int index){
		return checkbill.getText(COSTVALUE,index);
	}
		//获取附加费用-输入框2
	public String costValue2Text(int childindex,int grandindex){
		return checkbill.getListGrandChildText(EXTRAFEELL, childindex, grandindex);
	}
	//输入附加费用
	public void costValueSetText(int index, String amount){
		checkbill.setxt(COSTVALUE, amount, index);
	}	
		//输入附加费用-2
	public void costValueSetText2(int childindex,int grandindex){
		checkbill.setxtFromGrand(EXTRAFEELL, childindex, grandindex);
	}	
	//判断元-文本是否存在
	public Boolean yuanExist(int index){
		return checkbill.isExist(COSTNAME,index);
	}
	//获取元-文本
	public String yuanText(int index){
		return checkbill.getText(COSTNAME,index);
	}
	//判断确认按钮是否存在
	public Boolean chargeCommitExist(){
		return checkbill.isExist(CHARGECOMMIT);        
	}
	//点击确认按钮
	public void chargeCommitClick(){	
		checkbill.clickObj(CHARGECOMMIT);
	}
}
