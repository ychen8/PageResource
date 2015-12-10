package page;
/**
 * Description：查询订单页
 * Date: 2015-12-10
 * @author 李怡萱
 * */
import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.OrderQueryConstants;


public class OrderQueryPage extends UiAutomatorTestCase implements OrderQueryConstants{
	MainMethod orderquerypage = new MainMethod();

	//判断标题栏是否存在
	public Boolean titleExist(){
		return orderquerypage.isExist(TITLE);
	}
	//获取标题栏文字
	public String titleText(){
		return orderquerypage.getText(TITLE);		
	}
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return orderquerypage.isExist(BACKBTN);        
	}
	//点击返回按钮
	public void backBtnClick(){	
		orderquerypage.clickObj(BACKBTN);
	}	
	//判断按日查询tab是否存在
	public Boolean validTabExist(){
		return orderquerypage.isExistFromId(TAB_BAR, DAILY_QUERY);
	}
	//获取按日查询text
	public String validTabText(){
		return orderquerypage.getTextFromId(TAB_BAR, DAILY_QUERY);
	}
	//点击按日查询tab
	public void validTabClick(){
		orderquerypage.clickObjFromId(TAB_BAR, DAILY_QUERY);
	}
	//判断按月查询tab是否存在
	public Boolean invalidTabExist(){
		return orderquerypage.isExistFromId(TAB_BAR, MONTHLY_QUERY);
	}
	//获取按月查询text
	public String invalidTabText(){
		return orderquerypage.getTextFromId(TAB_BAR, MONTHLY_QUERY);
	}
	//点击按月查询tab
	public void invalidTabClick(){
		orderquerypage.clickObjFromId(TAB_BAR, MONTHLY_QUERY);
	}
	//判断日历-上月按钮是否存在
	public Boolean preMonthBtnExist(){
		return orderquerypage.isExist(PRE_MONTH_BTN);
	}
	//点击日历-上月按钮
	public void preMonthBtnClick(){
		orderquerypage.clickObj(PRE_MONTH_BTN);
	}
	//判断月份是否存在
	public Boolean monthNameExist(){
		return orderquerypage.isExist(MONTH_NAME);
	}
	//获取月份text
	public String monthNameText(){
		return orderquerypage.getText(MONTH_NAME);
	}
	//判断周日-文本是否存在
	public Boolean sundayExist(){
		return orderquerypage.isExistFromId(TABLE_VIEW,SUNDAY_ID);
	}
	//获取周日-文本
	public String sundayText(){
		return orderquerypage.getTextFromId(TABLE_VIEW,SUNDAY_ID);
	}
	//判断周一-文本是否存在
	public Boolean mondayExist(){
		return orderquerypage.isExistFromId(TABLE_VIEW,MONDAY_ID);
	}
	//获取周一-文本
	public String mondayText(){
		return orderquerypage.getTextFromId(TABLE_VIEW,MONDAY_ID);
	}
	//判断周二-文本是否存在
	public Boolean tuesdayExist(){
		return orderquerypage.isExistFromId(TABLE_VIEW,TUESDAY_ID);
	}
	//获取周二-文本
	public String tuesdayText(){
		return orderquerypage.getTextFromId(TABLE_VIEW,TUESDAY_ID);
	}
	//判断周三-文本是否存在
	public Boolean wednesdayExist(){
		return orderquerypage.isExistFromId(TABLE_VIEW,WEDNESDAY_ID);
	}
	//获取周三-文本
	public String wednesdayText(){
		return orderquerypage.getTextFromId(TABLE_VIEW,WEDNESDAY_ID);
	}
	//判断周四-文本是否存在
	public Boolean thursdayExist(){
		return orderquerypage.isExistFromId(TABLE_VIEW,THURSDAY_ID);
	}
	//获取周四-文本
	public String thursdayText(){
		return orderquerypage.getTextFromId(TABLE_VIEW,THURSDAY_ID);
	}
	//判断周五-文本是否存在
	public Boolean fridayExist(){
		return orderquerypage.isExistFromId(TABLE_VIEW,FRIDAY_ID);
	}
	//获取周五-文本
	public String fridayText(){
		return orderquerypage.getTextFromId(TABLE_VIEW,FRIDAY_ID);
	}
	//判断周六-文本是否存在
	public Boolean saturdayExist(){
		return orderquerypage.isExistFromId(TABLE_VIEW,SATURDAY_ID);
	}
	//获取周六-文本
	public String saturdayText(){
		return orderquerypage.getTextFromId(TABLE_VIEW,SATURDAY_ID);
	}
	//判断查询按钮是否存在
	public Boolean queryBtnExist(){
		return orderquerypage.isExist(QUERY_BTN);
	}
	//点击查询按钮
	public void queryBtnClick(){
		orderquerypage.clickObj(QUERY_BTN);
	}
}




