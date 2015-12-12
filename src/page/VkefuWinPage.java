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
	//判断列表下的各孙子元素是否存在
	public Boolean grandChildExist(int childIndex,int grandIndex){
		return vkefuWinPage.isExistFromListGrand(LIST, childIndex, grandIndex);
	}
	//获取列表下的各孙子元素内容
	public String grandChildText(int childIndex,int grandIndex){
		return vkefuWinPage.getListGrandChildText(LIST, childIndex, grandIndex);
	}
	//判断列表下的各重孙子元素是否存在
	public Boolean reGrandChildExist(int childIndex,int grandIndex,int regrandIndex){
		return vkefuWinPage.isExistFromListRegrand(LIST, childIndex, grandIndex,regrandIndex);
	}
	//获取列表下的各重孙子元素内容
	public String reGrandChildText(int childIndex,int grandIndex,int regrandIndex){
		return vkefuWinPage.getListRegrandChildText(LIST, childIndex, grandIndex,regrandIndex);
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
