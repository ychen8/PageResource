package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.LoginConstants;
import driverInterface.ParameterConfig;
import driverInterface.PersonManageConstants;

/**
 *创建日期:2015-12-8
 *作者： 陈玉婵
 */
public class PersonManagePage extends UiAutomatorTestCase implements PersonManageConstants,ParameterConfig{
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
	//获取查看基本信息内容
	public String baseInfoText(){
		return personManagepage.getText(TXT_BASE_INFO);
	}
	//判断私人电话栏是否存在
	public Boolean llPrivatePhoneExist(){
		return personManagepage.isExist(LL_PRIVATE_PHONE);
	}
	//点击私人电话
	public void llPrivatePhoneClick(){
		personManagepage.clickObj(LL_PRIVATE_PHONE);
	}
	//判断私人电话是否存在
	public Boolean privatePhoneExist(){
		return personManagepage.isExist(LL_PRIVATE_PHONE, INDEX_PRIVATE_PHONE);
	}
}
