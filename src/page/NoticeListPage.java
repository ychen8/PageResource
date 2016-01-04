/**
 *创建日期:2015-12-8
 *作者： 郭艳松
 */


package page;

import baseMethod.MainMethod;


import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.NoticeListConstants;

public class NoticeListPage extends UiAutomatorTestCase implements NoticeListConstants {
	MainMethod noticelistpage= new MainMethod();
	
	
	//获取消息列表页标题
	public String noticeListTitleTxt(){
		return noticelistpage.getText(NOTICEPAGETITLE);
	}
	//判断消息列表页标题是否存在
	public Boolean noticeListTitleExist(){
		return noticelistpage.isExist(NOTICEPAGETITLE);
	}
	//获取消息数量
	public int noticeAmount(){
		return noticelistpage.getChildCount(LISTVIEW);
	}
	//判断标题/时间/内容是否存在
	public Boolean[] noticeExist(int index){
		return noticelistpage.isExistForMsg(LISTVIEW, index, MSG);
	}
	//获取消息(通过index)
	public String[] noticeTxt(int index){
		return noticelistpage.getTextForMsg(LISTVIEW, index,MSG);
	}
	//点击消息（通过index）
	public void noticeClick(int index){
		noticelistpage.clickObj(LISTVIEW, index);
	}
	//点击返回按钮
	public void backBtnClick(){
		noticelistpage.clickObj(BACKICON);
	}
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return noticelistpage.isExist(BACKICON);
	}

	
}
