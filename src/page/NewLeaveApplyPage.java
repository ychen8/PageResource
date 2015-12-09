package page;
/**
 * Description：新增请假申请页面
 * Date: 2015-12-9
 * @author 李怡萱
 * */
import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.NewLeaveApplyConstants;
import driverInterface.ParameterConfig;


public class NewLeaveApplyPage extends UiAutomatorTestCase implements NewLeaveApplyConstants,ParameterConfig{
	MainMethod newleaveapplypage = new MainMethod();

	//判断标题栏是否存在
	public Boolean titleExist(){
		return newleaveapplypage.isExist(TITLE);
	}
	//获取标题栏文字
	public String titleText(){
		return newleaveapplypage.getText(TITLE);		
	}
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return newleaveapplypage.isExist(BACKBTN);        
	}
	//点击返回按钮
	public void backBtnClick(){	
		newleaveapplypage.clickObj(TITLE);
	}
	//判断请假类型-文本是否存在
	public Boolean leaveTypeTextExist(){
		return newleaveapplypage.isExistFromClass(FRAME_LAYOUT, LEAVE_TYPE_TEXT_ID);
	}
	//获取请假类型-文本
	public String leaveTypeTextText(){
		return newleaveapplypage.getTextFromClass(FRAME_LAYOUT, LEAVE_TYPE_TEXT_ID);
	}
	//判断请假类型是否存在
	public Boolean leaveTypeExist(){
		return newleaveapplypage.isExist(LEAVE_TYPE);
	}
	//获取请假类型
	public String leaveTypeText(){
		return newleaveapplypage.getText(LEAVE_TYPE);
	}
	//选择请假类型
	public void leaveTypeClick(){
		newleaveapplypage.clickObj(LEAVE_TYPE);
	}
	//判断请假班次-文本是否存在
	public Boolean leaveClassTextExist(){
		return newleaveapplypage.isExistFromClass(FRAME_LAYOUT, LEAVE_CLASS_TEXT_ID);
	}
	//获取请假班次-文本
	public String leaveClassTextText(){
		return newleaveapplypage.getTextFromClass(FRAME_LAYOUT, LEAVE_CLASS_TEXT_ID);
	}
	//判断请假班次是否存在
	public Boolean leaveClassExist(){
		return newleaveapplypage.isExist(LEAVE_CLASS);
	}
	//获取请假班次
	public String leaveClassText(){
		return newleaveapplypage.getText(LEAVE_CLASS);
	}
	//选择请假班次
	public void leaveClassClick(){
		newleaveapplypage.clickObj(LEAVE_CLASS);
	}
	//判断请假班次数量-文本是否存在
	public Boolean leaveClassAmountTextExist(){
		return newleaveapplypage.isExistFromClass(FRAME_LAYOUT, LEAVE_CLASS_AMOUNT_TEXT_ID);
	}
	//获取请假班次数量-文本
	public String leaveClassAmountTextText(){
		return newleaveapplypage.getTextFromClass(FRAME_LAYOUT, LEAVE_CLASS_AMOUNT_TEXT_ID);
	}
	//判断请假班次数量是否存在
	public Boolean leaveClassAmountExist(){
		return newleaveapplypage.isExist(LEAVE_CLASS_AMOUNT);
	}
	//获取请假班次数量
	public String leaveClassAmountText(){
		return newleaveapplypage.getText(LEAVE_CLASS_AMOUNT);
	}
	//判断调休班次-文本是否存在
	public Boolean offClassTextExist(){
		return newleaveapplypage.isExistFromClass(FRAME_LAYOUT, OFF_CLASS_TEXT);
	}
	//判断调休班次是否存在
	public Boolean offClassExist(){
		return newleaveapplypage.isExist(OFF_CLASS);
	}
	//获取调休班次
	public String offClassText(){
		return newleaveapplypage.getText(OFF_CLASS);
	}
	//选择调休班次
	public void offClassClick(){
		newleaveapplypage.clickObj(OFF_CLASS);
	}
	//判断请假原因输入框是否存在
	public Boolean leaveCauseBoxExist(){
		return newleaveapplypage.isExist(LEAVE_CAUSE_BOX);
	}
	//判断请假原因是否存在
	public Boolean leaveCauseExist(){
		return newleaveapplypage.isExist(LEAVE_CAUSE);
	}
	//获取请假原因
	public String leaveCauseText(){
		return newleaveapplypage.getText(LEAVE_CAUSE);
	}
	//输入请假原因
	public void leaveCauseSetText(){
		newleaveapplypage.setxt(LEAVE_CAUSE, LEAVE_CAUSE_INPUT);
	}
	//判断字数限制是否存在
	public Boolean remainWordNumberExist(){
		return newleaveapplypage.isExist(REMAINING_WORD_NUMBER);
	}
	//获取字数限制
	public String remainWordNumberText(){
		return newleaveapplypage.getText(REMAINING_WORD_NUMBER);
	}
	//判断医院证明1是否存在
	public Boolean hospitalCertificate1Exist(){
		return newleaveapplypage.isExist(HOSPITAL_CERTIFICATE_ONE);
	}
	//点击医院证明1
	public void hospitalCertificate1Click(){
		newleaveapplypage.clickObj(HOSPITAL_CERTIFICATE_ONE);
	}
	//判断医院证明2是否存在
	public Boolean hospitalCertificate2Exist(){
		return newleaveapplypage.isExist(HOSPITAL_CERTIFICATE_TWO);
	}
	//点击医院证明2
	public void hospitalCertificate2Click(){
		newleaveapplypage.clickObj(HOSPITAL_CERTIFICATE_TWO);
	}
	//判断医院证明3是否存在
	public Boolean hospitalCertificate3Exist(){
		return newleaveapplypage.isExist(HOSPITAL_CERTIFICATE_THREE);
	}
	//点击医院证明3
	public void hospitalCertificate3Click(){
		newleaveapplypage.clickObj(HOSPITAL_CERTIFICATE_THREE);
	}
	//判断从相册选择是否存在
	public Boolean chooseFromAlbumExist(){
		return newleaveapplypage.isExist(CHOOSE_FROM_ALBUM);
	}
	//点击从相册选择
	public void chooseFromAlbumClick(){
		newleaveapplypage.clickObj(CHOOSE_FROM_ALBUM);
	}
	//点击相册
	public void chooseAlbumClick(){
		newleaveapplypage.clickObj(CHOOSE_ALBUM, MOBILE_ALBUM_ID);
	}
	//点击照片
	public void choosePhotoClick(){
		newleaveapplypage.clickPoint(PHOTO_X, PHOTO_Y);
	}
	//点击右上角对勾
	public void rightBtnClick(){
		newleaveapplypage.clickObj(RIGHT_BTN);
	}
	//判断保存按钮是否存在
	public Boolean saveBtnExist(){
		return newleaveapplypage.isExist(SAVE_BTN);
	}
	//判断保存按钮是否可点击
	public Boolean saveBtnClickable(){
		return newleaveapplypage.objClickable(SAVE_BTN);
	}
	//点击保存按钮
	public void saveBtnClick(){
		newleaveapplypage.clickObj(SAVE_BTN);
	}
	//////////////////////////////////////////////请假类型/请假班次弹窗/////////////////////////////////////////
	//判断弹窗标题是否存在
	public Boolean classTitleExist(){
		return newleaveapplypage.isExist(CLASS_TITLE);
	}
	//获取弹窗标题
	public String classTitleText(){
	    return newleaveapplypage.getText(CLASS_TITLE);		
	}
	//判断取消按钮是否存在
	public Boolean cancelBtnExist(){
		return newleaveapplypage.isExist(CANCEL_BTN);
	}
	//点击取消按钮
	public void cancelBtnClick(){		
		newleaveapplypage.clickObj(CANCEL_BTN);
	}
	//判断确定按钮是否存在
	public Boolean completeBtnExist(){
		return newleaveapplypage.isExist(COMPLETE_BTN);
	}
	//点击确定按钮
	public void completeBtnClick(){		
		newleaveapplypage.clickObj(COMPLETE_BTN);
	}	
	///////////////////////////////////////////无可选时间/提交成功/失败弹窗/////////////////////////////////////////////////
	//判断提示文字是否存在
	public Boolean confirmTextExist(){
		return newleaveapplypage.isExist(CONFIRM_TEXT);
	}
	//获取提示文字
	public String confirmTextText(){
	    return newleaveapplypage.getText(CONFIRM_TEXT);		
	}
	//判断确定按钮是否存在
	public Boolean okBtnExist(){
		return newleaveapplypage.isExist(OK_BTN);
	}
	//点击确定按钮
	public void okBtnClick(){		
		newleaveapplypage.clickObj(OK_BTN);
	}	
}