package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.VkefuWindowConstants;

/**
 *创建日期:2015-12-11
 *作者： 陈玉婵
 */
public class VkefuWinPage extends UiAutomatorTestCase implements
		VkefuWindowConstants {
	MainMethod vkefuWinPage=new MainMethod();
	//判断返回icon是否存在
	public Boolean returnExist(){
		return vkefuWinPage.isExist(BACK);
	}
	//点击返回
	public void returnClick(){
		vkefuWinPage.clickObj(BACK);
	}
	//判断标题是否存在
	public Boolean titleExist(){
		return vkefuWinPage.isExist(TITLE);
	}
	//获取标题内容
	public String titleText(){
		return vkefuWinPage.getText(TITLE);
	}
	//判断时间是否存在
	public Boolean timeStampExist(){
		return vkefuWinPage.isExist(TIMESTAMP);
	}
	//获取时间内容
	public String timeStampText(){
		return vkefuWinPage.getText(TIMESTAMP);
	}
	//判断订单列表是否存在
	public Boolean tvChatContentExist(){
		return vkefuWinPage.isExist(TV_CHATCONTENT);
	}
	//获取订单列表内容
	public String tvChatContentText(){
		return vkefuWinPage.getText(TV_CHATCONTENT);
	}
	//判断用户头像是否存在
	public Boolean ivUserheadExist(){
		return vkefuWinPage.isExist(IV_USERHEAD);
	}
	//判断问题列表的问题序号是否存在
	public Boolean tvExist(int index){
		return vkefuWinPage.isExistFromClass(CLASS_LINEARLAYOUT, index);
	}
	public String tvText(int index){
		return vkefuWinPage.getText(CLASS_LINEARLAYOUT, index);
	}
	//判断问题列表的问题1是否存在
	public Boolean tvQuestion1Exist(){
		return vkefuWinPage.isExistFromList(LIST, INDEX_QS_LINEARLAYOUT,QUESTION1);
	}
	//判断问题列表的问题2是否存在
	public Boolean tvQuestion2Exist(){
		return vkefuWinPage.isExistFromList(LIST, INDEX_QS_LINEARLAYOUT,QUESTION2);
	}
	//判断问题列表的问题3是否存在
	public Boolean tvQuestion3Exist(){
		return vkefuWinPage.isExistFromList(LIST, INDEX_QS_LINEARLAYOUT,QUESTION3);
	}
	//判断问题列表的问题4是否存在
	public Boolean tvQuestion4Exist(){
		return vkefuWinPage.isExistFromList(LIST, INDEX_QS_LINEARLAYOUT,QUESTION4);
	}
	//判断语音icon是否存在
	public Boolean btnSetVoiceExist(){
		return vkefuWinPage.isExist(BTN_SET_MODE_VOICE);
	}
	//点击语音
	public void btnSetVoiceClick(){
		vkefuWinPage.clickObj(BTN_SET_MODE_VOICE);
	}
	//判断发送消息icon是否存在
	public Boolean etSendMessExist(){
		return vkefuWinPage.isExist(ET_SENDMESSAGE);
	}
	//点击发送消息
	public void etSendMessClick(){
		vkefuWinPage.clickObj(ET_SENDMESSAGE);
	}
	//判断表情con是否存在
	public Boolean rlFaceExist(){
		return vkefuWinPage.isExist(RL_FACE);
	}
	//点击表情
	public void rlFaceClick(){
		vkefuWinPage.clickObj(RL_FACE);
	}
	//判断更多icon是否存在
	public Boolean btnMoreExist(){
		return vkefuWinPage.isExist(BTN_MORE);
	}
	//点击更多
	public void btnMoreClick(){
		vkefuWinPage.clickObj(BTN_MORE);
	}

}
