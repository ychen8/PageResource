package page;

import baseMethod.MainMethod;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.mainPageConstants;

public class MainPage extends UiAutomatorTestCase implements mainPageConstants{
	MainMethod mainpage= new MainMethod();
	//点击消息按钮
	public void msgClick(){
	
		try {
			mainpage.getObj(MSG).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断消息控件是否存在
	public Boolean msgExist(){
		return mainpage.isExist(MSG);
	}
	//获取消息数
	public String msgCountText(){
	      String text=mainpage.getText(MSGCOUNT);
		return text;
	}
	//判断消息数控件是否存在
	public Boolean msgCountExist(){
		return mainpage.isExist(MSGCOUNT);        
	}
	//获取测试环境
	public String testEnvText(){
		return mainpage.getText(TESTENVIRONMENT);
	}
	//判断测试环境控件是否存在
	public Boolean testEnvExist(){
		return mainpage.isExist(TESTENVIRONMENT);
	}
	//判断标题是否存在
	public Boolean titleExist(){
		return mainpage.isExist(TITLE);
	}
	//点击抽屉按钮
	public void personBtnClick(){
		
		try {
			mainpage.getObj(PERSONINFO).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断抽屉按钮是否存在
	public Boolean personBtnExist(){
		return mainpage.isExist(PERSONINFO);
	}
	//获取当前响应率
	public String CurrentResponseRateText(){
		return mainpage.getText(RESPONSERATE);
	}
	//判断当前响应率是否存在
	public  Boolean responseRateExist(){
	    return mainpage.isExist(RESPONSERATE);
	}
	//获取工作时长
	public String workTimeText(){
		return mainpage.getText(WORKTIME);
	}
	//判断工作时长是否存在
	public Boolean workTimeExist(){
		return mainpage.isExist(WORKTIME);
	}
	//获取完成单量
	public String finishOrderCountText(){
		return mainpage.getText(FINISHORDERCOUNT);
	}
	//判断完成单量是否存在
	public Boolean finishOrderCountExist(){
		return mainpage.isExist(FINISHORDERCOUNT);
	}
	//获取计将营业额
	public String turnoverAmountText(){
		return mainpage.getText(TURNOVERAMOUNT);
	}
	//判断计将营业额是否存在
	public Boolean turnoverAmountExist(){
		return mainpage.isExist(TURNOVERAMOUNT);
	}
	//获取代充金额
	public String rechargeAmountText(){
		return mainpage.getText(RECHARGEAMOUNT);
	}
	//
	

	
}
