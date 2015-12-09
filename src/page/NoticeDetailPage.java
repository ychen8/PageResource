/**
 *创建日期:2015-12-8
 *作者： 郭艳松
 */


package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.NoticeDetailConstants;

public class NoticeDetailPage extends UiAutomatorTestCase implements NoticeDetailConstants{
	
	MainMethod noticedetailpage= new MainMethod();
	
//	//获取消息列表页标题
//		public String noticeListTitleTxt(){
//			return noticelistpage.getText(NOTICEPAGETITLE);
//		}
//		//判断消息列表页标题是否存在
//		public Boolean noticeListTitleExist(){
//			return noticelistpage.isExist(NOTICEPAGETITLE);
//		}
//		//获取标题内容(通过index)
//		public String noticeTitleTxt(int index){
//			return noticelistpage.getText(LISTVIEW, index,MSGTITLE);
//		}
//		//判断标题内容是否存在（通过index）
//		public Boolean noticeTitleExist(int index){
//			return noticelistpage.isExist(LISTVIEW, index, MSGTITLE);
//		}
//		//点击标题内容（通过index）
//		public void noticeTitleClick(int index){
//			noticelistpage.clickObj(LISTVIEW, index, MSGTITLE);
//		}
//		//获取消息时间（通过index）
//		public String noticeTimeTxt(int index){
//			return noticelistpage.getText(LISTVIEW, index, MSGTIME);
//		}
//		//判断消息事件是否存在（通过index）
//		public Boolean noticeTimeExist(int index){
//			return noticelistpage.isExist(LISTVIEW, index, MSGTIME);
//		}
	//获取消息详情页标题文本
	public String noticeDetailPageTitleTxt(){
		return noticedetailpage.getText(NOTICEDETAILTITLE);
	}
	//判断消息详情页标题是否存在
	public Boolean noticeDetailPageTitleExist(){
		return noticedetailpage.isExist(NOTICEDETAILTITLE);
	}
	//获取消息标题文本
	public String noticeDetailMsgTitleTxt(){
		return noticedetailpage.getText(MESSAGETITLE);
	}
	//判断消息标题是否存在
	public Boolean noticeDetailMsgTitleExist(){
		return noticedetailpage.isExist(MESSAGETITLE);
	}
	//获取消息时间文本
	public String noticeDetailMsgTimeTxt(){
		return noticedetailpage.getText(MESSAGETIME);
	}
	//判断消息时间是否存在
	public Boolean noticeDetailMsgTimeExist(){
		return noticedetailpage.isExist(MESSAGETIME);
	}
	//获取消息内容文本
	public String noticeDetailMsgContentTxt(){
		return noticedetailpage.getText(MESSAGECONTENT);
	}
	//判断消息内容是否存在
	public Boolean noticeDetailMsgContentExist(){
		return noticedetailpage.isExist(MESSAGECONTENT);
	}
	//点击返回按钮
	public void backBtnClick(){
		noticedetailpage.clickObj(BACKICON);
	}
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return noticedetailpage.isExist(BACKICON);
	}
}
