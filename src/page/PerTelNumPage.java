package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.PerTelNumConstants;

public class PerTelNumPage extends UiAutomatorTestCase implements PerTelNumConstants{
	
	MainMethod pertelnum= new MainMethod();
	//判断标题是否存在
	public boolean perTelNumExist(){
		return pertelnum.isExist(PERTELTITLE);
	}
	//获取标题文本
	public String perTelNumText(){
		return pertelnum.getText(PERTELTITLE);
	}
	//判断返回按钮是否存在
	public boolean backBtnExist(){
		return pertelnum.isExist(BACKBTN);
	}
	//点击返回按钮
	public void backBtnClick(){
		pertelnum.clickObj(BACKBTN);
	}
	//判断电话号码输入框是否存在
	public boolean telNumInputBlankExist(){
		return pertelnum.isExist(NUMINPUTBLANK);
	}
	//获取电话号码
	public String telNumInputBlankText(){
		return pertelnum.getText(NUMINPUTBLANK);
	}
	//输入电话号码
	public boolean inputNum(String number){
		return pertelnum.setxt(NUMINPUTBLANK, number);
	}
	//清除电话号码
	public void clearNum(){
		pertelnum.cleartxt(NUMINPUTBLANK);
	}
	//判断提示信息是否存在
	public boolean tipInfoExist(){
		return pertelnum.isExist(TIPINFO);
	}
	//获取提示信息文本
	public String tipInfoText(){
		return pertelnum.getText(TIPINFO);
	}
	//判断保存按钮是否存在
	public boolean saveBtnExist(){
		return pertelnum.isExist(SAVEBTN);
	}
	//点击保存按钮
	public void saveBtnClick(){
		pertelnum.clickObj(SAVEBTN);
	}
	//判断保存按钮是否被激活
	public boolean saveBtnEnable(){
		return pertelnum.objEnabled(SAVEBTN);
	}
	//判断错误提示信息是否存在
	public boolean errInfoExist(){
		return pertelnum.isExist(ERRINFO);
	}
	//获取错误提示信息文本
	public String errInfoText(){
		return pertelnum.getText(ERRINFO);
	}
	//判断错误提示页确定按钮是否存在
	public boolean okBtnExist(){
		return pertelnum.isExist(OKBTN);
	}
	//点击错误提示页确定按钮
	public void okBtnClick(){
		pertelnum.clickObj(OKBTN);
	}
}
