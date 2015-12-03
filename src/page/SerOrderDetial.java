package page;

import baseMethod.MainMethod;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.SerOrderDetailConstants;

public class SerOrderDetial extends UiAutomatorTestCase implements SerOrderDetailConstants{
	MainMethod orderdetial= new MainMethod();

	//判断标题栏是否存在
	public Boolean titleExist(){
		return orderdetial.isExist(TITLE);
	}
	//获取标题栏文字
	public String titleText(){
	      String text=orderdetial.getText(TITLE);
		return text;
	}
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return orderdetial.isExist(BACKBTN);        
	}
	//点击返回按钮
	public void backBtnClick(){	
		try {
			orderdetial.getObj(TITLE).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	//判断改派按钮是否存在
	public Boolean changeBtnExist(){
		return orderdetial.isExist(CHANGEORDERBTN);
	}
	//点击改派按钮
	public void changeBtnClick(){
		
		try {
			orderdetial.getObj(CHANGEORDERBTN).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断VIP-banner关闭按钮是否存在
	public Boolean vipCloseBtnExist(){
		return orderdetial.isExist(VIPCLOSEBTN);
	}
	//点击VIP-banner关闭按钮
	public void vipCloseBtnClick(){
		
		try {
			orderdetial.getObj(VIPCLOSEBTN).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断收藏司机标识是否存在
	public Boolean collectDriverExist(){
		return orderdetial.isExist(COLLECTDRIVER);
	}
	
	//判断客户姓名、手机号是否存在
	public Boolean userMsgExist(){
		return orderdetial.isExist(USERMSG);
	}
	//获取客户姓名、手机号
	public String userMsgText(){
		return orderdetial.getText(USERMSG);
	}
	//判断上车地点是否存在
	public Boolean upLocExist(){
		return orderdetial.isExist(UPLOCATION);
	}
    //获取上车地点
	public String upLocText(){
		return orderdetial.getText(UPLOCATION);
	}
	//判断上车地点详情是否存在
	public Boolean upLocDetialExist(){
		return orderdetial.isExist(UPLOCDETAIL);
	}
	//获取上车地点详情
	public String upLocDetialText(){
		return orderdetial.getText(UPLOCDETAIL);
	}
	//判断下车地点是否存在
	public Boolean downLocExist(){
		return orderdetial.isExist(DOWNLOCATION);
	}
    //获取下车地点
	public String downLocText(){
		return orderdetial.getText(DOWNLOCATION);
	}
	//判断下车地点详情是否存在
	public Boolean downLocDetialExist(){
		return orderdetial.isExist(DOWNLOCDETAIL);
	}
	//获取下车地点详情
	public String downLocDetialText(){
		return orderdetial.getText(DOWNLOCDETAIL);
	}
	//判断电话按钮是否存在
	public Boolean callBtnExist(){
		return orderdetial.isExist(CALLBTN);
	}
	//点击电话按钮
	public void callBtnClick(){		
		try {
			orderdetial.getObj(CALLBTN).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断账户信息是否存在
	public Boolean balanceExist(){
		return orderdetial.isExist(BALANCE);
	}
	//获取账户信息
	public String balanceText(){
		return orderdetial.getText(BALANCE);
	}
	//判断充值按钮是否存在
	public Boolean rechargeBtnExist(){
		return orderdetial.isExist(RECHARGEBTN);
	}
	//点击充值按钮
	public void rechargeBtnClick(){		
		try {
			orderdetial.getObj(RECHARGEBTN).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断地图-剩余公里数是否存在
	public Boolean mapDistanceExist(){
		return orderdetial.isExist(MAPDISTANCE);
	}
	//获取地图-剩余公里数
	public String mapDistanceText(){
		return orderdetial.getText(MAPDISTANCE);
	}
	//判断地图-剩余时间是否存在
	public Boolean mapTimeExist(){
		return orderdetial.isExist(MAPTIME);
	}
	//获取地图-剩余时间
	public String mapTimeText(){
		return orderdetial.getText(MAPTIME);
	}
	//判断地图-定位按钮是否存在
	public Boolean locBtnExist(){
		return orderdetial.isExist(LOCATIONBTN);
	}
	//点击地图-定位按钮
	public void locBtnClick(){			
		try {
			orderdetial.getObj(LOCATIONBTN).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断地图-开启导航按钮是否存在
	public Boolean startNaviExist(){
		return orderdetial.isExist(STARTNAVI);
	}
	//点击地图-开启导航按钮
	public void startNaviClick(){			
		try {
			orderdetial.getObj(STARTNAVI).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断“点击查看所有/收起”是否存在
	public Boolean slideBarExist(){
		return orderdetial.isExist(SLIDEBAR);
	}
	//点击“点击查看所有/收起”
	public void slideBarClick(){			
		try {
			orderdetial.getObj(SLIDEBAR).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断预约订单剩余时间是否存在
	public Boolean remainTimeExist(){
		return orderdetial.isExist(REMAINTIME);
	}
	//获取预约订单剩余时间
	public String remainTimeText(){
		return orderdetial.getText(REMAINTIME);
	}
	//判断服务时长是否存在
	public Boolean serveTimeExist(){
		return orderdetial.isExist(SERVETIME);
	}
	//获取服务时长
	public String serveTimeText(){
		return orderdetial.getText(SERVETIME);
	}
	//判断【订单状态切换】按钮是否存在
	public Boolean orderCommitExist(){
		return orderdetial.isExist(ORDERCOMMIT);
	}
	//获取【订单状态切换】按钮文字
	public String orderCommitText(){
		return orderdetial.getText(ORDERCOMMIT);
	}
	//点击【订单状态切换】按钮
	public void orderCommitClick(){			
		try {
			orderdetial.getObj(ORDERCOMMIT).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	///////////////////////下面是拨打电话弹窗部分/////////////////////////////
	//判断弹窗是否存在
	public Boolean winExist(){
		return orderdetial.isExist(POPUPWIN);
	}	
	//判断提示文字是否存在
	public Boolean confirmTextExist(){
		return orderdetial.isExist(CONFIRM_TEXT);
	}
	//获取提示文字
	public String confirmTextText(){
	      String text=orderdetial.getText(CONFIRM_TEXT);
		return text;
	}
	//判断取消按钮是否存在
	public Boolean closeBtnExist(){
		return orderdetial.isExist(CLOSE_BTN);
	}
	//点击取消按钮
	public void closeBtnClick(){		
		try {
			orderdetial.getObj(CLOSE_BTN).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//判断确定按钮是否存在
	public Boolean okBtnExist(){
		return orderdetial.isExist(OK_BTN);
	}
	//点击确定按钮
	public void okBtnClick(){		
		try {
			orderdetial.getObj(OK_BTN).click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
