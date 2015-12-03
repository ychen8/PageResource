/**
 * 创建日期2015年12月02日
 * 作者：郭艳松
 * */
package page;

import baseMethod.MainMethod;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.SetPageConstants;

public class SetPage extends UiAutomatorTestCase implements SetPageConstants{

	MainMethod setpage= new MainMethod();
	//点击自动开启导航
	public void autoNavClick(){
		try {
			setpage.getObj(AUTONAV).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断自动开启导航是否存在
	public Boolean autoNavExist(){
		return setpage.isExist(AUTONAV);
	}
	//获取自动开启导航文本
	public String autoNavText(){
	      String text=setpage.getText(AUTONAV);
		return text;
	}
	//判断自动开启导航是否被选中
	public Boolean autoNavChecked(){
		try {
			return setpage.getObj(AUTONAV).isChecked();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//判断自动开启导航是否可点击
	public Boolean autoNavClickable(){
		try {
			return setpage.getObj(AUTONAV).isClickable();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	//点击使用高德导航
	public void useGaoDeClick(){
		try {
			setpage.getObj(USEGAODE).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断使用高德导航是否存在
	public Boolean useGaoDeExist(){
		return setpage.isExist(USEGAODE);
	}
	//获取使用高德导航文本
	public String useGaoDeText(){
	      String text=setpage.getText(USEGAODE);
		return text;
	}
	//判断使用高德导航是否被选中
	public Boolean useGaoDeChecked(){
		try {
			return setpage.getObj(USEGAODE).isChecked();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//判断使用高德导航是否可点击
	public Boolean useGaoDeClickable(){
		try {
			return setpage.getObj(USEGAODE).isClickable();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//点击橙色订单自动接单
	public void autoAgainstOrgClick(){
		try {
			setpage.getObj(AUTOAGAINSTORG).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断橙色订单自动接单是否存在
	public Boolean autoAgainstOrgExist(){
		return setpage.isExist(AUTOAGAINSTORG);
	}
	//获取橙色订单自动接单文本
	public String autoAgainstOrgText(){
	      String text=setpage.getText(AUTOAGAINSTORG);
		return text;
	}
	//判断橙色订单自动接单是否被选中
	public Boolean autoAgainstOrgChecked(){
		try {
			return setpage.getObj(AUTOAGAINSTORG).isChecked();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//判断橙色订单自动接单是否可点击
	public Boolean autoAgainstOrgClickable(){
		try {
			return setpage.getObj(AUTOAGAINSTORG).isClickable();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//点击是否接受蓝色订单
	public void acceptBlueClick(){
		try {
			setpage.getObj(ACCEPTBLUE).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断是否接受蓝色订单是否存在
	public Boolean acceptBlueExist(){
		return setpage.isExist(ACCEPTBLUE);
	}
	//获取是否接受蓝色订单文本
	public String acceptBlueText(){
	      String text=setpage.getText(ACCEPTBLUE);
		return text;
	}
	//判断是否接受蓝色订单是否被选中
	public Boolean acceptBlueChecked(){
		try {
			return setpage.getObj(ACCEPTBLUE).isChecked();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//判断是否接受蓝色订单是否可点击
	public Boolean acceptBlueClickable(){
		try {
			return setpage.getObj(ACCEPTBLUE).isClickable();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//点击增大开始时间
	public void incremStartClick(){
		try {
			setpage.getObj(INCREM, INCERM_START_INDEX).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断增大开始时间是否存在
	public Boolean incremStartExist(){
		return setpage.isExist(INCREM, INCERM_START_INDEX);
	}
	//点击减小开始时间
	public void decremStartClick(){
		try {
			setpage.getObj(DECREM, DECERM_START_INDEX).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断减小开始时间是否存在
	public Boolean decremStartExist(){
		return setpage.isExist(DECREM, DECERM_START_INDEX);
	}
	//点击增大结束时间
	public void incremStopClick(){
		try {
			setpage.getObj(INCREM, INCERM_STOP_INDEX).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断增大结束时间是否存在
	public Boolean incremStopExist(){
		return setpage.isExist(INCREM, INCERM_STOP_INDEX);
	}
	//点击减小结束时间
	public void decremStopClick(){
		try {
			setpage.getObj(DECREM, DECERM_STOP_INDEX).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断减小结束时间是否存在
	public Boolean decremStopExist(){
		return setpage.isExist(DECREM, DECERM_STOP_INDEX);
	}


	//判断开始时间是否存在
	public Boolean startTimeExist(){
		return setpage.isExist(TIME, TIME_START_INDEX);
	}
	//获取开始时间文本
	public String startTimeText(){
	      String text=setpage.getText(TIME, TIME_START_INDEX);
		return text;
	}
	//判断结束时间是否存在
	public Boolean stopTimeExist(){
		return setpage.isExist(TIME, TIME_STOP_INDEX);
	}
	//获取结束时间文本
	public String stopTimeText(){
	      String text=setpage.getText(TIME, TIME_STOP_INDEX);
		return text;
	}
	//点击确定按钮
	public void okBtnClick(){
		try {
			setpage.getObj(OKBTN).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断确定按钮是否存在
	public Boolean okBtnExist(){
		return setpage.isExist(OKBTN);
	}
	//获取确定按钮文本
	public String okBtnText(){
	      String text=setpage.getText(OKBTN);
		return text;
	}	
}