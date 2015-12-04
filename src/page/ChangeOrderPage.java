package page;
/**
 * Description：改派原因页面
 * Date: 2015-12-4
 * @author 李怡萱
 * */
import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.ChangeOrderConstants;
import driverInterface.ParameterConfig;


public class ChangeOrderPage extends UiAutomatorTestCase implements ChangeOrderConstants,ParameterConfig{
	MainMethod changeorderpage= new MainMethod();
	
	//判断标题栏是否存在
	public Boolean titleExist(){
		return changeorderpage.isExist(TITLE);
	}
	//获取标题栏文本
	public String titleText(){
		return changeorderpage.getText(TITLE);
	}	
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return changeorderpage.isExist(BACKBTN);
	}
	//点击返回按钮
	public void backBtnClick(){		
		changeorderpage.clickObj(BACKBTN);
	}
	//判断提示语是否存在（“请真实填写申请改派的原因”）
	public Boolean markWordExist(){
		return changeorderpage.isExistFromClass(MARK_WORD_CLASS, MARK_WORD);
	}
	//判断改派原因是否存在
	public Boolean changeReasonExist(String text){
		return changeorderpage.isExistFromClass(CHANGE_REASON_CLASS, text);
	}
	//判断其它原因描述(输入框)是否存在
	public Boolean otherReasonDetailExist(){
		return changeorderpage.isExist(REASON_OTHER_DETAIL);
	}
	//获取其它原因描述内容
	public String otherReasonDetailText(){
		return changeorderpage.getText(REASON_OTHER_DETAIL);
	}
	//输入其它原因描述
	public void otherReasonDetailSetText(){
		changeorderpage.setxt(REASON_OTHER_DETAIL, OTHER_REASON_DETAIL);
	}
	//判断确定按钮是否存在
	public Boolean submitBtnExist(){
		return changeorderpage.isExist(SUBMIT_BTN);
	}
	//点击确定按钮
	public void submitBtnClick(){
		changeorderpage.clickObj(SUBMIT_BTN);
	}
	///////////////////////弹窗/////////////////////////////
	//判断弹窗是否存在
	public Boolean winExist(){
		return changeorderpage.isExist(POPUPWIN);
	}	
	//判断提示文字是否存在
	public Boolean confirmTextExist(){
		return changeorderpage.isExist(CONFIRM_TEXT);
	}
	//获取提示文字
	public String confirmTextText(){
	    return changeorderpage.getText(CONFIRM_TEXT);		
	}
	//判断取消按钮是否存在
	public Boolean closeBtnExist(){
		return changeorderpage.isExist(CLOSE_BTN);
	}
	//点击取消按钮
	public void closeBtnClick(){		
		changeorderpage.clickObj(CLOSE_BTN);
	}
	//判断确定按钮是否存在
	public Boolean okBtnExist(){
		return changeorderpage.isExist(OK_BTN);
	}
	//点击确定按钮
	public void okBtnClick(){		
		changeorderpage.clickObj(OK_BTN);
	}	
	//判断倒计时窗口是否存在
	public Boolean countDownWinExist(){
		return changeorderpage.isExist(COUNTDOWN_WIN);
	}
	//判断正在改派text是否存在
	public Boolean changingTextExist(){
		return changeorderpage.isExist(COUNTDOWN_WIN, CHANGING);
	}
	//判断倒计时是否存在
	public Boolean countDownExist(){
		return changeorderpage.isExist(COUNTDOWN);
	}
	//获取倒计时
	public String countDownText(){
		return changeorderpage.getText(COUNTDOWN);
	}
}