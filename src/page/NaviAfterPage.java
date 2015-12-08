package page;
/**
 * Description：导航页面
 * Date: 2015-12-8
 * @author 李怡萱
 * */
import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.NaviAfterConstants;

public class NaviAfterPage extends UiAutomatorTestCase implements NaviAfterConstants{

	MainMethod naviafterpage = new MainMethod();
	
	//判断标题栏是否存在
	public Boolean titleExist(){
		return naviafterpage.isExist(TITLE);
	}
	//获取标题栏文本
	public String titleText(){
		return naviafterpage.getText(TITLE);
	}
	//判断关闭按钮是否存在
	public Boolean closeBtn1Exist(){
		return naviafterpage.isExist(CLOSE_BTN1);
	}
	//点击关闭按钮
	public void closeBtn1Click(){
		naviafterpage.clickObj(CLOSE_BTN1);
	}
	//判断左下关闭按钮是否存在
	public Boolean closeBtn2Exist(){
		return naviafterpage.isExistFromClass(FRAME_CLASS, CLOSE_BTN2_ID);
	}
	//点击左下关闭按钮
	public void closeBtn2Click(){
		naviafterpage.clickObjFromClass(FRAME_CLASS, CLOSE_BTN2_ID);
	}
	//判断总公里数是否存在
	public Boolean naviKilloExist(){
		return naviafterpage.isExistFromClass(FRAME_CLASS, NAVI_KILLO_ID);
	}
	//获取总公里数
	public String naviKilloText(){
		return naviafterpage.getTextFromClass(FRAME_CLASS, NAVI_KILLO_ID);
	}
	//判断时间是否存在
	public Boolean naviTimeExist(){
		return naviafterpage.isExistFromClass(FRAME_CLASS, NAVI_TIME_ID);
	}
	//获取时间
	public String naviTimeText(){
		return naviafterpage.getTextFromClass(FRAME_CLASS, NAVI_TIME_ID);
	}
	//判断行驶方向是否存在
	public Boolean naviDirectionExist(){
		return naviafterpage.isExistFromClass(FRAME_CLASS, NAVI_DIRECTION_ID);
	}
	//判断路段剩余距离是否存在
	public Boolean naviDistanceExist(){
		return naviafterpage.isExistFromClass(FRAME_CLASS, NAVI_DISTANCE_ID);
	}
	//获取路段剩余距离
	public String naviDistanceText(){
		return naviafterpage.getTextFromClass(FRAME_CLASS, NAVI_DISTANCE_ID);
	}
	//判断路名是否存在
	public Boolean naviRoadExist(){
		return naviafterpage.isExistFromClass(FRAME_CLASS, NAVI_ROAD_ID);
	}
	//获取路名
	public String naviRoadText(){
		return naviafterpage.getTextFromClass(FRAME_CLASS, NAVI_ROAD_ID);
	}
	//判断路况按钮是否存在
	public Boolean roadConditionExist(){
		return naviafterpage.isExistFromClass(FRAME_CLASS, ROAD_CONDITION_ID);
	}
	//点击路况按钮
	public void roadConditionClick(){
		naviafterpage.clickObjFromClass(FRAME_CLASS, ROAD_CONDITION_ID);
	}
	//判断到达上车地点按钮是否存在
	public Boolean arriveBtnExist(){
		return naviafterpage.isExist(ARRIVE_BTN);
	}
	//点击到达上车地点按钮
	public void arriveBtnClick(){
		naviafterpage.clickObj(ARRIVE_BTN);
	}
	//判断结束服务按钮是否存在
	public Boolean stopBtnExist(){
		return naviafterpage.isExist(STOP_BTN);
	}
	//点击结束服务按钮
	public void stopBtnClick(){
		naviafterpage.clickObj(STOP_BTN);
	}
	///////////////////////弹窗/////////////////////////////
	//判断弹窗是否存在
	public Boolean winExist(){
		return naviafterpage.isExist(POPUPWIN);
	}	
	//判断提示文字是否存在
	public Boolean confirmTextExist(){
		return naviafterpage.isExist(CONFIRM_TEXT);
	}
	//获取提示文字
	public String confirmTextText(){
	    return naviafterpage.getText(CONFIRM_TEXT);		
	}
	//判断取消按钮是否存在
	public Boolean closeBtnExist(){
		return naviafterpage.isExist(CLOSE_BTN);
	}
	//点击取消按钮
	public void closeBtnClick(){		
		naviafterpage.clickObj(CLOSE_BTN);
	}
	//判断确定按钮是否存在
	public Boolean okBtnExist(){
		return naviafterpage.isExist(OK_BTN);
	}
	//点击确定按钮
	public void okBtnClick(){		
		naviafterpage.clickObj(OK_BTN);
	}	
}