/**
 * 创建日期2015年12月02日
 * 作者：郭艳松
 * */
package page;

import baseMethod.MainMethod;


import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.MainPageConstants;
import driverInterface.ParameterConfigConstants;

public class MainPage extends UiAutomatorTestCase implements MainPageConstants,ParameterConfigConstants{
	MainMethod mainpage= new MainMethod();
	//点击消息按钮
	public void msgClick(){
      
		mainpage.clickObj(MSG);
	}
	//判断消息控件是否存在
	public Boolean msgExist(){
		return mainpage.isExist(MSG);
	}
	//获取消息数
	public String msgCountText(){
	      String text=mainpage.getText(MSGCOUNT);
		return text;
	}
	//判断消息数控件是否存在
	public Boolean msgCountExist(){
		return mainpage.isExist(MSGCOUNT);        
	}
	//获取测试环境
	public String testEnvText(){
		return mainpage.getText(TESTENVIRONMENT);
	}
	//判断测试环境控件是否存在
	public Boolean testEnvExist(){
		return mainpage.isExist(TESTENVIRONMENT);
	}
	//判断标题是否存在
	public Boolean titleExist(){
		return mainpage.isExist(TITLE);
	}
	//点击抽屉按钮
	public void personBtnClick(){
		mainpage.clickObj(PERSONINFO);
	}
	//判断抽屉按钮是否存在
	public Boolean personBtnExist(){
		return mainpage.isExist(PERSONINFO);
	}
	//获取当前响应率
	public String CurrentResponseRateText(){
		return mainpage.getText(RESPONSERATE);
	}
	//判断当前响应率是否存在
	public  Boolean responseRateExist(){
	    return mainpage.isExist(RESPONSERATE);
	}
	//获取工作时长
	public String workTimeText(){
		return mainpage.getText(WORKTIME);
	}
	//判断工作时长是否存在
	public Boolean workTimeExist(){
		return mainpage.isExist(WORKTIME);
	}
	//获取完成单量
	public String finishOrderCountText(){
		return mainpage.getText(FINISHORDERCOUNT);
	}
	//判断完成单量是否存在
	public Boolean finishOrderCountExist(){
		return mainpage.isExist(FINISHORDERCOUNT);
	}
	//获取计将营业额
	public String turnoverAmountText(){
		return mainpage.getText(TURNOVERAMOUNT);
	}
	//判断计将营业额是否存在
	public Boolean turnoverAmountExist(){
		return mainpage.isExist(TURNOVERAMOUNT);
	}
	//获取代充金额
	public String rechargeAmountText(){
		return mainpage.getText(RECHARGEAMOUNT);
	}
	//判断代充金额是否存在
	public Boolean rechargeAmountExist(){
		return mainpage.isExist(RECHARGEAMOUNT);
	}
	//点击我的订单
	public void myOrderClick(){
		mainpage.clickObj(MYORDER);
	}
	//获取我的订单文本
	public String myOrderText(){
		return mainpage.getText(MYORDER);
	}
	//判断我的订单是否存在
	public Boolean myOrderExist(){
		return mainpage.isExist(MYORDER);
	}
	//点击工作状态按钮
	public void stateBtnClick(){
		mainpage.clickObj(STATEBTN);
	}
	//获取当前工作状态
	public String stateBtnText(){
		return mainpage.getText(STATEBTN);
	}
    //判断当前工作状态是否存在
	public Boolean stateBtnExist(){
		return mainpage.isExist(STATEBTN);		
	}
	//点击接单设置按钮
	public void setBtnClick(){
		mainpage.clickObj(SETBTN);
	}
	//获取接单设置文本
	public String setBtnText(){
		return mainpage.getText(SETBTN);
	}
    //判断接单设置是否存在
	public Boolean setBtnExist(){
		return mainpage.isExist(SETBTN);		
	}
	//点击切换状态按钮
	public void changeBtnClick(){
		mainpage.clickObj(CHANGEBTN);
	}
	//获取切换状态文本
	public String changeBtnText(){
		return mainpage.getText(CHANGEBTN);
	}
    //判断切换状态是否存在
	public Boolean changeBtnExist(){
		return mainpage.isExist(CHANGEBTN);		
	}
	
	//点击未完成订单数
	public void unFinishCountClick(){
		mainpage.clickObj(UNFINISHCOUNT);
	}
	//获取未完成订单数文本
	public String unFinishCountText(){
		return mainpage.getText(UNFINISHCOUNT);
	}
	   //判断未完成订单数是否存在
	public Boolean unFinishCountExist(){
		return mainpage.isExist(UNFINISHCOUNT);		
	}
	//点击订单类型
	public void orderTypeClick(){
		mainpage.clickObj(ORDERTYPE);
	}
	//获取订单类型文本
	public String orderTypeText(){
	     return mainpage.getText(ORDERTYPE);
	}
	//判断订单类型是否存在
	public Boolean orderTypeExist(){
		return mainpage.isExist(ORDERTYPE);		
	}
	//点击航班号
	public void flightNoClick(){
		mainpage.clickObj(FLIGHTNO);
	}
	//获取航班号文本
	public String flightNoText(){
	    return mainpage.getText(FLIGHTNO);
	}
	//判断航班号是否存在
	public Boolean flightNoExist(){
		return mainpage.isExist(FLIGHTNO);		
	}	
	//点击订单状态
	public void orderStatusClick(){
		mainpage.clickObj(ORDERSTATUS);
	}
	//获取订单状态文本
	public String orderStatusText(){
	    return mainpage.getText(ORDERSTATUS);
	}
	//判断订单状态是否存在
	public Boolean orderStatusExist(){
		return mainpage.isExist(ORDERSTATUS);		
	}	
	//点击使用日期
	public void useDateClick(){
		mainpage.clickObj(USEDATE);
	}
	//获取使用日期文本
	public String useDateText(){
	    return mainpage.getText(USEDATE);
	}
	//判断使用日期是否存在
	public Boolean useDateExist(){
		return mainpage.isExist(USEDATE);		
	}
	//点击改派按钮
	public void changeOrderBtnClick(){
		mainpage.clickObj(CHANGEORDERBTN);
	}
	//获取改派按钮文本
	public String changeOrderBtnText(){
	    return mainpage.getText(CHANGEORDERBTN);
	}
	//判断改派按钮是否存在
	public Boolean changeOrderBtnExist(){
		return mainpage.isExist(CHANGEORDERBTN);		
	}
	//点击上车地点
	public void upLocationClick(){
		mainpage.clickObj(UPLOCATION);
	}
	//获取上车地点文本
	public String upLocationText(){
	    return mainpage.getText(UPLOCATION);
	}
	//判断上车地点是否存在
	public Boolean upLocationExist(){
		return mainpage.isExist(UPLOCATION);		
	}
	/*
	 * 请先输入交班地址弹出框
	 * 
	 * */

	//判断请先录入交班地址是否存在
	public Boolean warningExist(){
		return mainpage.isExist(WARNING);
	}
	//获取请先录入交班地址文本
	public String warningText(){
	      String text=mainpage.getText(WARNING);
		return text;
	}
	//点击确定按钮
	public void okBtnClick(){
		mainpage.clickObj(OKBTN);
	}
	//判断确定按钮是否存在
	public Boolean okBtnExist(){
		return mainpage.isExist(OKBTN);
	}
	//获取确定按钮文本
	public String okBtnText(){
	      String text=mainpage.getText(OKBTN);
		return text;
	}
	//点击返回按钮
	public void cancelBtnClick(){
		mainpage.clickObj(CANCELBTN);
	}
	//判断返回按钮是否存在
	public Boolean cancelBtnExist(){
		return mainpage.isExist(CANCELBTN);
	}
	//获取返回按钮文本
	public String cancelBtnText(){
	      String text=mainpage.getText(CANCELBTN);
		return text;
	}
	/*
	 * 输入里程弹出框
	 * */
	//获取里程框数字
	public int kiloText(){
		String s=mainpage.getText(KILOTXT);
		int kilo=Integer.valueOf(s).intValue();
		return kilo;
	}
	//判断里程框中是否有内容
	public Boolean kiloTextExist(){
		return mainpage.getText(KILOTXT).isEmpty();
	}
	//判断里程框是否存在
	public Boolean kiloEditExist(){
		return mainpage.isExist(KILOTXT);
	}
	public void kiloSetText(){
		mainpage.setxt(KILOTXT, Integer.toString(KILO));	
	}
	public void kiloSetMAXText(){
		mainpage.setxt(KILOTXT, Integer.toString(MAXKILO));	
	}
	public void kiloTextClear(){
		mainpage.cleartxt(KILOTXT);
	}
	//获取错误信息
	public String errInfoKiloText(){
		return mainpage.getText(ERRTXT);
	}
	//判断错误信息是否存在
	public Boolean errInfoKiloExist(){
		return mainpage.isExist(ERRTXT);
	}
	//点击确定上班按钮
	public void workBtnClick(){
		mainpage.clickObj(WORKBTN);
	}
	//判断确定上班按钮是否存在
	public Boolean workBtnExist(){
		return mainpage.isExist(WORKBTN);
	}
	//判断确定上班按钮是否可点击
	public Boolean workBtnEnable(){
		return mainpage.objEnabled(WORKBTN);
	}
	
}
