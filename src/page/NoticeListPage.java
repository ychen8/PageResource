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

	
}
