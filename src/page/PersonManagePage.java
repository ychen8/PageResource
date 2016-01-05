package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;


import driverInterface.ParameterConfigConstants;
import driverInterface.PersonManageConstants;

/**
 *创建日期:2015-12-8
 *作者： 陈玉婵
 */
public class PersonManagePage extends UiAutomatorTestCase implements PersonManageConstants,ParameterConfigConstants{
	MainMethod personManagepage= new MainMethod();
	//判断返回icon是否存在
	public Boolean returnExist(){
		return personManagepage.isExist(BACK);
	}
	//点击返回
	public void returnClick(){
		personManagepage.clickObj(BACK);
	}
	//判断标题是否存在
	public Boolean titleExist(){
		return personManagepage.isExist(TITLE);
	}
	//获取标题内容
	public String titleText(){
		return personManagepage.getText(TITLE);
	}
	//判断查看基本信息栏是否存在
	public Boolean llBaseInfoExist(){
		return personManagepage.isExist(LL_BASE_INFO);
	}
	//点击查看基本信息栏
	public void llBaseInfoClick(){
		personManagepage.clickObj(LL_BASE_INFO);
	}	
	//判断查看基本信息是否存在
	public Boolean baseInfoExist(){
		return personManagepage.isExist(TXT_BASE_INFO);
	}
	//获取查看基本信息
	public String baseInfoText(){
		return personManagepage.getText(TXT_BASE_INFO);
	}
	//判断基本信息内容－司机姓名是否存在
	public Boolean driverNameExist(){
		return personManagepage.isExistFromId(LL_BASE_INFO, INDEX_TXT_DRIVER_NAME);
	}
	//获取基本信息内容－司机姓名
	public String driverNameText(){
		return personManagepage.getTextFromId(LL_BASE_INFO, INDEX_TXT_DRIVER_NAME);
	}
	//判断私人电话栏是否存在
	public Boolean llPrivatePhoneExist(){
		return personManagepage.isExist(LL_PRIVATE_PHONE);
	}
	//点击私人电话栏
	public void llPrivatePhoneClick(){
		personManagepage.clickObj(LL_PRIVATE_PHONE);
	}
	//判断私人电话是否存在
	public Boolean privatePhoneExist(){
		return personManagepage.isExistFromId(LL_PRIVATE_PHONE, INDEX_PRIVATE_PHONE);
	}
	//获取私人电话
	public String privatePhoneText(){
		return personManagepage.getTextFromId(LL_PRIVATE_PHONE, INDEX_PRIVATE_PHONE);
	}
	//判断私人电话文本值是否存在
	public Boolean txtPrivatePhoneExist(){
		return personManagepage.isExistFromId(LL_PRIVATE_PHONE, INDEX_TXT_PRIVATE_PHONE);
	}
	//获取私人电话文本值
	public String txtPrivatePhoneText(){
		return personManagepage.getTextFromId(LL_PRIVATE_PHONE, INDEX_TXT_PRIVATE_PHONE);
	}
	//判断家庭地址是否存在
	public Boolean familyAddrExist(){
		return personManagepage.isExistFromId(LL_FAMIFY_ADDR, INDEX_FAMILY_ADDR);
	}
	//获取家庭地址
	public String familyAddrText(){
		return personManagepage.getTextFromId(LL_FAMIFY_ADDR, INDEX_FAMILY_ADDR);
	}
	//判断家庭地址文本值是否存在
	public Boolean txtFamilyAddrExist(){
		return personManagepage.isExistFromId(LL_FAMIFY_ADDR, INDEX_TXT_FAMILY_ADDR);
	}
	//获取家庭地址文本值
	public String txtFamilyAddrText(){
		return personManagepage.getTextFromId(LL_FAMIFY_ADDR, INDEX_TXT_FAMILY_ADDR);
	}
	//判断箭头入口是否存在
	public Boolean editHomeAddrExist(){
		return personManagepage.isExistFromId(LL_FAMIFY_ADDR, INDEX_EDIT_FAMILY_ADDR);
	}
	//点击家庭地址栏
	public void llFamilyAddrClick(){
		personManagepage.clickObj(LL_FAMIFY_ADDR);
	}
	//判断交班地址栏是否存在
	public Boolean llTransClassAddrExist(){
		return personManagepage.isExist(LL_TRANSFER_CLASS_ADDR);
	}
	//判断交班地址是否存在
	public Boolean transClassAddrExist(){
		return personManagepage.isExistFromId(LL_TRANSFER_CLASS_ADDR, INDEX_TRANSFER_CLASS_ADDR);
	}
	//获取交班地址
	public String transClassAddrText(){
		return personManagepage.getTextFromId(LL_TRANSFER_CLASS_ADDR, INDEX_TRANSFER_CLASS_ADDR);
	}
	//判断交班地址文本值是否存在
	public Boolean txtTransClassAddrExist(){
		return personManagepage.isExistFromId(LL_TRANSFER_CLASS_ADDR, INDEX_TXT_TRANSFER_CLASS_ADDR);
	}
	//获取交班地址文本值
	public String txtTransClassAddrText(){
		return personManagepage.getTextFromId(LL_TRANSFER_CLASS_ADDR, INDEX_TXT_TRANSFER_CLASS_ADDR);
	}
	//判断箭头入口是否存在
	public Boolean editTransClassAddrExist(){
		return personManagepage.isExistFromId(LL_FAMIFY_ADDR, INDEX_EDIT_TRANSFER_CLASS_ADDR);
	}
	//点击交班地址栏
	public void llTransClassAddrClick(){
		personManagepage.clickObj(LL_TRANSFER_CLASS_ADDR);
	}	
	//判断本月排班表是否存在
	public Boolean txtMonthClassExist(){
		return personManagepage.isExist(TXT_MONTH_CLASSES);
	}
	//获取本月排班表
	public String txtMonthClassText(){
		return personManagepage.getText(TXT_MONTH_CLASSES);
	}
	//点击本月排班表
	public void txtMonthClassClick(){
		personManagepage.clickObj(TXT_MONTH_CLASSES);
	}	
	//判断请假申请是否存在
	public Boolean txtMyLeaveExist(){
		return personManagepage.isExist(TXT_MY_LEAVE);
	}
	//获取我的请假申请
	public String txtMyLeaveText(){
		return personManagepage.getText(TXT_MY_LEAVE);
	}
	//点击我的请假申请
	public void txtMyLeaveClick(){
		personManagepage.clickObj(TXT_MY_LEAVE);
	}
	//判断我的换班申请是否存在
	public Boolean myChangeClassesExist(){
		return personManagepage.isExist(TXT_MY_CHANGE_CLASSES);
	}
	//获取我的换班申请
	public String myChangeClassesText(){
		return personManagepage.getText(TXT_MY_CHANGE_CLASSES);
	}
	//点击我的换班申请
	public void myChangeClassesClick(){
		personManagepage.clickObj(TXT_MY_CHANGE_CLASSES);
	}
	//判断对换班申请是否存在
	public Boolean txtChangeClassesExist(){
		return personManagepage.isExist(TXT_CHANGE_CLASSES);
	}
	//获取对换班申请
	public String txtChangeClassesText(){
		return personManagepage.getText(TXT_CHANGE_CLASSES);
	}
	//点击对换班申请
	public void txtChangeClassesClick(){
		personManagepage.clickObj(TXT_CHANGE_CLASSES);
	}
	
	
	
	
}
