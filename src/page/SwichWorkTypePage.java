/**
 * 创建日期2015年12月02日
 * 作者：郭艳松
 * */
package page;
import baseMethod.*;


import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.*;

public class SwichWorkTypePage extends UiAutomatorTestCase implements SwichWorkTypePageConstants{

	MainMethod swichpage= new MainMethod();
	//点击我要上班
	public void startWorkClick(){
		swichpage.clickObj(STARTWORK);
	}
	//判断我要上班是否存在
	public Boolean startWorkExist(){
		return swichpage.isExist(STARTWORK);
	}
	//获取我要上班文本
	public String startWorkText(){
	      String text=swichpage.getText(STARTWORK);
		return text;
	}
	//判断我要上班是否被选中
	public Boolean startWorkChecked(){
		return swichpage.objChecked(STARTWORK);
	}
	//点击我要交班
	public void alternateClick(){
		swichpage.clickObj(ALTERNATE);
	}
	//判断我要交班是否存在
	public Boolean alternateExist(){
		return swichpage.isExist(ALTERNATE);
	}
	//获取我要交班文本
	public String alternateText(){
	      String text=swichpage.getText(ALTERNATE);
		return text;
	}
	//判断我要交班是否被选中
	public Boolean alternateChecked(){
		return swichpage.objChecked(ALTERNATE);
	}
	//点击我要回家
	public void goHomeClick(){
		swichpage.clickObj(GOHOME);
	}
	//判断我要回家是否存在
	public Boolean goHomeExist(){
		return swichpage.isExist(GOHOME);
	}
	//获取我要回家文本
	public String goHomeText(){
	      String text=swichpage.getText(GOHOME);
		return text;
	}
	//判断我要回家是否被选中
	public Boolean goHomeChecked(){
		return swichpage.objChecked(GOHOME);
	}
	//判断我要回家是否存在
	public Boolean limitConfirmExist(){
		return swichpage.isExist(CONFIRM_TEXT);
	}
	//获取我要回家文本
	public String limitConfirmText(){
	      String text=swichpage.getText(CONFIRM_TEXT);
		return text;
	}

	//点击临时小休
	public void tempFinishClick(){
		swichpage.clickObj(TEMPFINISH);
	}
	//判断临时小休是否存在
	public Boolean tempFinishExist(){
		return swichpage.isExist(TEMPFINISH);
	}
	//获取临时小休文本
	public String tempFinishText(){
	      String text=swichpage.getText(TEMPFINISH);
		return text;
	}
	//判断临时小休是否被选中
	public Boolean tempFinishChecked(){
		return swichpage.objChecked(TEMPFINISH);
	}

	//点击我要下班
	public void finishWorkClick(){
		swichpage.clickObj(FINISHWORK);
	}
	//判断我要下班是否存在
	public Boolean finishWorkExist(){
		return swichpage.isExist(FINISHWORK);
	}
	//获取我要下班文本
	public String finishWorkText(){
	      String text=swichpage.getText(FINISHWORK);
		return text;
	}
	//判断我要下班是否被选中
	public Boolean finishWorkChecked(){
		return swichpage.objChecked(FINISHWORK);
	}

	//点击确定按钮
	public void okBtnClick(){
		swichpage.clickObj(OKBTN);
	}
	//判断确定按钮是否存在
	public Boolean okBtnExist(){
		return swichpage.isExist(OKBTN);
	}
	//获取确定按钮文本
	public String okBtnText(){
	      String text=swichpage.getText(OKBTN);
		return text;
	}

	//点击返回按钮
	public void cancelBtnClick(){
		swichpage.clickObj(CANCELBTN);
	}
	//判断返回按钮是否存在
	public Boolean cancelBtnExist(){
		return swichpage.isExist(CANCELBTN);
	}
	//获取返回按钮文本
	public String cancelBtnText(){
	      String text=swichpage.getText(CANCELBTN);
		return text;
	}
	
	
}
