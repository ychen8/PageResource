package page;
/**
 * Description：服务流程-订单详情页
 * Date: 2015-12-2
 * @author 李怡萱
 * */
import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import driverInterface.SerOrderDetailConstants;

public class SerOrderDetialPage extends UiAutomatorTestCase implements SerOrderDetailConstants{
	MainMethod serorderdetialpage= new MainMethod();

	//判断标题栏是否存在
	public Boolean titleExist(){
		return serorderdetialpage.isExist(TITLE);
	}
	//获取标题栏文字
	public String titleText(){
		return serorderdetialpage.getText(TITLE);		
	}
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return serorderdetialpage.isExist(BACKBTN);        
	}
	//点击返回按钮
	public void backBtnClick(){	
		serorderdetialpage.clickObj(TITLE);
	}	
	//判断改派按钮是否存在
	public Boolean changeBtnExist(){
		return serorderdetialpage.isExist(CHANGEORDERBTN);
	}
	//点击改派按钮
	public void changeBtnClick(){
		serorderdetialpage.clickObj(CHANGEORDERBTN);
	}
	//判断VIP-banner关闭按钮是否存在
	public Boolean vipCloseBtnExist(){
		return serorderdetialpage.isExist(VIPCLOSEBTN);
	}
	//点击VIP-banner关闭按钮
	public void vipCloseBtnClick(){
		serorderdetialpage.clickObj(VIPCLOSEBTN);
	}
	//判断收藏司机标识是否存在
	public Boolean collectDriverExist(){
		return serorderdetialpage.isExist(COLLECTDRIVER);
	}	
	//判断客户姓名、手机号是否存在
	public Boolean userMsgExist(){
		return serorderdetialpage.isExist(USERMSG);
	}
	//获取客户姓名、手机号
	public String userMsgText(){
		return serorderdetialpage.getText(USERMSG);
	}
	//判断上车地点是否存在
	public Boolean upLocExist(){
		return serorderdetialpage.isExist(UPLOCATION);
	}
    //获取上车地点
	public String upLocText(){
		return serorderdetialpage.getText(UPLOCATION);
	}
	//判断上车地点详情是否存在
	public Boolean upLocDetialExist(){
		return serorderdetialpage.isExist(UPLOCDETAIL);
	}
	//获取上车地点详情
	public String upLocDetialText(){
		return serorderdetialpage.getText(UPLOCDETAIL);
	}
	//判断下车地点是否存在
	public Boolean downLocExist(){
		return serorderdetialpage.isExist(DOWNLOCATION);
	}
    //获取下车地点
	public String downLocText(){
		return serorderdetialpage.getText(DOWNLOCATION);
	}
	//判断下车地点详情是否存在
	public Boolean downLocDetialExist(){
		return serorderdetialpage.isExist(DOWNLOCDETAIL);
	}
	//获取下车地点详情
	public String downLocDetialText(){
		return serorderdetialpage.getText(DOWNLOCDETAIL);
	}
	//判断电话按钮是否存在
	public Boolean callBtnExist(){
		return serorderdetialpage.isExist(CALLBTN);
	}
	//点击电话按钮
	public void callBtnClick(){		
		serorderdetialpage.clickObj(CALLBTN);
	}
	//判断账户信息是否存在
	public Boolean balanceExist(){
		return serorderdetialpage.isExist(BALANCE);
	}
	//获取账户信息
	public String balanceText(){
		return serorderdetialpage.getText(BALANCE);
	}
	//判断充值按钮是否存在
	public Boolean rechargeBtnExist(){
		return serorderdetialpage.isExist(RECHARGEBTN);
	}
	//点击充值按钮
	public void rechargeBtnClick(){		
		serorderdetialpage.clickObj(RECHARGEBTN);
	}
	//判断地图-剩余公里数是否存在
	public Boolean mapDistanceExist(){
		return serorderdetialpage.isExist(MAPDISTANCE);
	}
	//获取地图-剩余公里数
	public String mapDistanceText(){
		return serorderdetialpage.getText(MAPDISTANCE);
	}
	//判断地图-剩余时间是否存在
	public Boolean mapTimeExist(){
		return serorderdetialpage.isExist(MAPTIME);
	}
	//获取地图-剩余时间
	public String mapTimeText(){
		return serorderdetialpage.getText(MAPTIME);
	}
	//判断地图-定位按钮是否存在
	public Boolean locBtnExist(){
		return serorderdetialpage.isExist(LOCATIONBTN);
	}
	//点击地图-定位按钮
	public void locBtnClick(){			
		serorderdetialpage.clickObj(LOCATIONBTN);
	}
	//判断地图-开启导航按钮是否存在
	public Boolean startNaviExist(){
		return serorderdetialpage.isExist(STARTNAVI);
	}
	//点击地图-开启导航按钮
	public void startNaviClick(){			
		serorderdetialpage.clickObj(STARTNAVI);
	}
	//判断“点击查看所有/收起”是否存在
	public Boolean slideBarExist(){
		return serorderdetialpage.isExist(SLIDEBAR);
	}
	//点击“点击查看所有/收起”
	public void slideBarClick(){			
		serorderdetialpage.clickObj(SLIDEBAR);
	}
	//判断预约订单剩余时间是否存在
	public Boolean remainTimeExist(){
		return serorderdetialpage.isExist(REMAINTIME);
	}
	//获取预约订单剩余时间
	public String remainTimeText(){
		return serorderdetialpage.getText(REMAINTIME);
	}
	//判断服务时长是否存在
	public Boolean serveTimeExist(){
		return serorderdetialpage.isExist(SERVETIME);
	}
	//获取服务时长
	public String serveTimeText(){
		return serorderdetialpage.getText(SERVETIME);
	}
	//判断【订单状态切换】按钮是否存在
	public Boolean orderCommitExist(){
		return serorderdetialpage.isExist(ORDERCOMMIT);
	}
	//获取【订单状态切换】按钮文字
	public String orderCommitText(){
		return serorderdetialpage.getText(ORDERCOMMIT);
	}
	//点击【订单状态切换】按钮
	public void orderCommitClick(){			
		serorderdetialpage.clickObj(ORDERCOMMIT);
	}
	///////////////////////弹窗/////////////////////////////
	//判断弹窗是否存在
	public Boolean winExist(){
		return serorderdetialpage.isExist(POPUPWIN);
	}	
	//判断提示文字是否存在
	public Boolean confirmTextExist(){
		return serorderdetialpage.isExist(CONFIRM_TEXT);
	}
	//获取提示文字
	public String confirmTextText(){
	    return serorderdetialpage.getText(CONFIRM_TEXT);		
	}
	//判断取消按钮是否存在
	public Boolean closeBtnExist(){
		return serorderdetialpage.isExist(CLOSE_BTN);
	}
	//点击取消按钮
	public void closeBtnClick(){		
		serorderdetialpage.clickObj(CLOSE_BTN);
	}
	//判断确定按钮是否存在
	public Boolean okBtnExist(){
		return serorderdetialpage.isExist(OK_BTN);
	}
	//点击确定按钮
	public void okBtnClick(){		
		serorderdetialpage.clickObj(OK_BTN);
	}
	//判断结束服务去小休按钮是否存在
	public Boolean goRestExist(){
		return serorderdetialpage.isExist(BTN_GO_REST);
	}
	//点击结束服务去小休
	public void goRestClick(){
		serorderdetialpage.clickObj(BTN_GO_REST);
	}
	
	//判断开 启导航页面的开 启导航按钮是否存在
	public Boolean naviExist(){
		return serorderdetialpage.isExist(NAV_NAVI);
	}
	//点击开 启导航页面的开 启导航
	public void naviClick(){
		serorderdetialpage.clickObj(NAV_NAVI);
	}
}
