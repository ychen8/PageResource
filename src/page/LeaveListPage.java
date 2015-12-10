package page;
/**
 * Description：
 * Date: 2015-12-8
 * @author 李怡萱
 * */
import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import driverInterface.LeaveListConstants;
public class LeaveListPage extends UiAutomatorTestCase implements LeaveListConstants{
	MainMethod leavelistpage = new MainMethod();

	//判断标题栏是否存在
	public Boolean titleExist(){
		return leavelistpage.isExist(TITLE);
	}
	//获取标题栏文字
	public String titleText(){
		return leavelistpage.getText(TITLE);		
	}
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return leavelistpage.isExist(BACKBTN);        
	}
	//点击返回按钮
	public void backBtnClick(){	
		leavelistpage.clickObj(BACKBTN);
	}	
	//判断进行中tab是否存在
	public Boolean validTabExist(){
		return leavelistpage.isExistFromId(TAB_BAR, VALID_TAB);
	}
	//获取进行中text
	public String validTabText(){
		return leavelistpage.getTextFromId(TAB_BAR, VALID_TAB);
	}
	//点击进行中tab
	public void validTabClick(){
		leavelistpage.clickObjFromId(TAB_BAR, VALID_TAB);
	}
	//判断过期/无效tab是否存在
	public Boolean invalidTabExist(){
		return leavelistpage.isExistFromId(TAB_BAR, INVALID_TAB);
	}
	//获取过期/无效text
	public String invalidTabText(){
		return leavelistpage.getTextFromId(TAB_BAR, INVALID_TAB);
	}
	//点击过期/无效tab
	public void invalidTabClick(){
		leavelistpage.clickObjFromId(TAB_BAR, INVALID_TAB);
	}
	//判断无申请提示语是否存在
	public Boolean noApplyTextExist(){
		return leavelistpage.isExistFromId(TAB_VIEW,NO_APPLY_ID);
	}
	//获取无申请提示语
	public String noApplyTextText(){
		return leavelistpage.getTextFromId(TAB_VIEW, NO_APPLY_ID);
	}
	//判断是否存在请假申请
	public Boolean leaveListExist(){
		return leavelistpage.isExist(LEAVE_LIST);
	}
	//获取请假申请数量
	public int getLeaveAmount(){
		return leavelistpage.getChildCount(LEAVE_LIST);
	}
	//判断申请时间-文本是否存在
	public Boolean applyTimeTextExist(int index){
		return leavelistpage.isExistFromList(LEAVE_LIST, index, APPLY_TIME_TEXT);
	}
	//获取申请时间-文本
	public String applyTimeTextText(int index){
		return leavelistpage.getListText(LEAVE_LIST, index, APPLY_TIME_TEXT);
	}
	//判断申请时间是否存在
	public Boolean applyTimeExist(int index){
		return leavelistpage.isExistFromList(LEAVE_LIST, index, APPLY_TIME);
	}
	//获取申请时间
	public String applyTimeText(int index){
		return leavelistpage.getListText(LEAVE_LIST, index, APPLY_TIME);
	}
	//判断请假类型-文本是否存在
	public Boolean applyTypeTextExist(int index){
		return leavelistpage.isExistFromList(LEAVE_LIST, index, APPLY_TYPE_TEXT);
	}
	//获取请假类型-文本
	public String applyTypeTextText(int index){
		return leavelistpage.getListText(LEAVE_LIST, index, APPLY_TYPE_TEXT);
	}
	//判断请假类型是否存在
	public Boolean applyTypeExist(int index){
		return leavelistpage.isExistFromList(LEAVE_LIST, index, APPLY_TYPE);
	}
	//获取请假类型
	public String applyTypeText(int index){
		return leavelistpage.getListText(LEAVE_LIST, index, APPLY_TYPE);
	}
	//判断请假班次-文本是否存在
	public Boolean applyClassTextExist(int index){
		return leavelistpage.isExistFromList(LEAVE_LIST, index, APPLY_CLASS_TEXT);
	}
	//获取请假班次-文本
	public String applyClassTextText(int index){
		return leavelistpage.getListText(LEAVE_LIST, index, APPLY_CLASS_TEXT);
	}
	//判断请假班次是否存在
	public Boolean applyClassExist(int index){
		return leavelistpage.isExistFromList(LEAVE_LIST, index, APPLY_CLASS);
	}
	//获取请假班次
	public String applyClassText(int index){
		return leavelistpage.getListText(LEAVE_LIST, index, APPLY_CLASS);
	}
	//判断调休班次-文本是否存在
	public Boolean offClassTextExist(int index){
		return leavelistpage.isExistFromList(LEAVE_LIST, index, OFF_CLASS_TEXT);
	}
	//获取调休班次-文本
	public String offClassTextText(int index){
		return leavelistpage.getListText(LEAVE_LIST, index, OFF_CLASS_TEXT);
	}
	//判断调休班次是否存在
	public Boolean offClassExist(int index){
		return leavelistpage.isExistFromList(LEAVE_LIST, index, OFF_CLASS);
	}
	//获取调休班次
	public String offClassText(int index){
		return leavelistpage.getListText(LEAVE_LIST, index, OFF_CLASS);
	}
	//判断申请状态-文本是否存在
	public Boolean applyStatusTextExist(int index){
		return leavelistpage.isExistFromList(LEAVE_LIST, index, APPLY_STATUS_TEXT);
	}
	//获取申请状态-文本
	public String applyStatusTextText(int index){
		return leavelistpage.getListText(LEAVE_LIST, index, APPLY_STATUS_TEXT);
	}
	//判断申请状态是否存在
	public Boolean applyStatusExist(int index){
		return leavelistpage.isExistFromList(LEAVE_LIST, index, APPLY_STATUS);
	}
	//获取申请状态
	public String applyStatusText(int index){
		return leavelistpage.getListText(LEAVE_LIST, index, APPLY_STATUS);
	}
	//判断取消申请按钮是否存在
	public Boolean cancelBtnExist(int index){
		return leavelistpage.isExistFromList(LEAVE_LIST, index, CANCEL_BTN);
	}
	//点击取消申请按钮
	public void cancelBtnClick(int index){
		leavelistpage.clickObjFromList(LEAVE_LIST, index, CANCEL_BTN);
	}
	//判断添加新申请按钮是否存在
	public Boolean addApplyBtnExist(){
		return leavelistpage.isExist(ADD_APPLY_BTN);
	}
	//点击添加新申请按钮
	public void addApplyBtnClick(){
		leavelistpage.clickObj(ADD_APPLY_BTN);
	}
	///////////////////////弹窗/////////////////////////////
	//判断弹窗是否存在
	public Boolean winExist(){
		return leavelistpage.isExist(POPUPWIN);
	}	
	//判断提示文字是否存在
	public Boolean confirmTextExist(){
		return leavelistpage.isExist(CONFIRM_TEXT);
	}
	//获取提示文字
	public String confirmTextText(){
	    return leavelistpage.getText(CONFIRM_TEXT);		
	}
	//判断取消按钮是否存在
	public Boolean closeBtnExist(){
		return leavelistpage.isExist(CLOSE_BTN);
	}
	//点击取消按钮
	public void closeBtnClick(){		
		leavelistpage.clickObj(CLOSE_BTN);
	}
	//判断确定按钮是否存在
	public Boolean okBtnExist(){
		return leavelistpage.isExist(OK_BTN);
	}
	//点击确定按钮
	public void okBtnClick(){		
		leavelistpage.clickObj(OK_BTN);
	}	
}