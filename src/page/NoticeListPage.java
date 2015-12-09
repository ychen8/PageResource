/**
 *创建日期:2015-12-8
 *作者： 郭艳松
 */


package page;

import baseMethod.MainMethod;

import com.android.uiautomator.core.UiObjectNotFoundException;
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
	//获取标题内容(通过index)
	public String noticeTitleTxt(int index){
		return noticelistpage.getText(LISTVIEW, index,MSGTITLE);
	}
	//判断标题内容是否存在（通过index）
	public Boolean noticeTitleExist(int index){
		return noticelistpage.isExist(LISTVIEW, index, MSGTITLE);
	}
	//点击标题内容（通过index）
	public void noticeTitleClick(int index){
		noticelistpage.clickObj(LISTVIEW, index, MSGTITLE);
	}
	//获取消息时间（通过index）
	public String noticeTimeTxt(int index){
		return noticelistpage.getText(LISTVIEW, index, MSGTIME);
	}
	//判断消息事件是否存在（通过index）
	public Boolean noticeTimeExist(int index){
		return noticelistpage.isExist(LISTVIEW, index, MSGTIME);
	}
	//点击消息时间（通过index）
	public void noticeTimeClick(int index){
		noticelistpage.clickObj(LISTVIEW, index, MSGTIME);
	}
	//获取消息内容（通过index）
	public String noticeContenTxt(int index){
		return noticelistpage.getText(LISTVIEW,index,MSGCONTENT);
	}
	//判断消息内容是否存在（通过index）
	public Boolean noticeContentExist(int index){
		return noticelistpage.isExist(MSGCONTENT, index, MSGCONTENT);
	}
	//点击消息内容（通过index）
	public void noticeContentClick(int index){
		noticelistpage.clickObj(MSGCONTENT, index, MSGCONTENT);
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
