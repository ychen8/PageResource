package page;
/**
 * Description：订单详情页（提交费用后）
 * Date: 2015-12-4
 * @author 李怡萱
 * */
import baseMethod.MainMethod;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import driverInterface.OrderDetailConstants;


public class OrderDetailPage  extends UiAutomatorTestCase implements OrderDetailConstants{
	MainMethod orderdetailpage= new MainMethod();
	
	//判断标题栏是否存在
	public Boolean titleExist(){
		return orderdetailpage.isExist(TITLE);
	}
	//获取标题栏文字
	public String titleText(){
		return orderdetailpage.getText(TITLE);
	}
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return orderdetailpage.isExist(BACKBTN);
	}
	//点击返回按钮
	public void backBtnClick(){		
		orderdetailpage.clickObj(BACKBTN);
	}
	//判断订单金额栏是否存在
	public Boolean layoutExist(){
		return orderdetailpage.isExist(ORDER_MONEY_LAYOUT);
	}
	//判断订单金额-文本是否存在
	public Boolean orderMoneyTextExist(){
		return orderdetailpage.isExist(ORDER_MONEY_TEXT);
	}
	//获取订单金额-文本
	public String orderMoneyTextText(){
		return orderdetailpage.getText(ORDER_MONEY_TEXT);
	}
	//判断订单金额是否存在
	public Boolean orderMoneyValueExist(){
		return orderdetailpage.isExist(ORDER_MONEY_VALUE);
	}
	//获取订单金额
	public String orderMoneyValueText(){
		return orderdetailpage.getText(ORDER_MONEY_VALUE);
	}
	//判断元-文本是否存在
	public Boolean yuanExist(){
		return orderdetailpage.isExist(ORDER_MONEY_LAYOUT, YUAN);
	}
	//获取元-文本
	public String yuanText(){
		return orderdetailpage.getText(ORDER_MONEY_LAYOUT, YUAN);
	}
	//判断支付状态是否存在
	public Boolean moneyDetailExist(){
		return orderdetailpage.isExist(MONEY_DETAIL);
	}
	//获取支付状态
	public String moneyDetailText(){
		return orderdetailpage.getText(MONEY_DETAIL);
	}
	//点击支付状态
	public void moneyDetailClick(){		
		orderdetailpage.clickObj(MONEY_DETAIL);
	}
	//判断订单号-文本是否存在
	public Boolean orderNoTextExist(){
		return orderdetailpage.isExist(ORDER_DETIAL_CLASS,ORDER_NO_TEXT);
	}
	//判断订单号是否存在
	public Boolean orderNoExist(){
		return orderdetailpage.isExist(ORDER_NO);
	}
	//获取订单号
	public String orderNoText(){
		return orderdetailpage.getText(ORDER_NO);
	}
	//判断订单类型是否存在
	public Boolean orderTypeExist(){
		return orderdetailpage.isExist(ORDER_TYPE);
	}
	//获取订单类型
	public String orderTypeText(){
		return orderdetailpage.getText(ORDER_TYPE);
	}
	//判断上车时间-文本是否存在
	public Boolean upTimeTextExist(){
		return orderdetailpage.isExist(ORDER_DETIAL_CLASS,UP_TIME_TEXT);
	}
	//判断上车时间是否存在
	public Boolean upTimeExist(){
		return orderdetailpage.isExist(UP_TIME);
	}
	//获取上车时间
	public String upTimeText(){
		return orderdetailpage.getText(UP_TIME);
	}
	//判断下车时间-文本是否存在
	public Boolean downTimeTextExist(){
		return orderdetailpage.isExist(ORDER_DETIAL_CLASS,DOWN_TIME_TEXT);
	}
	//判断下车时间是否存在
	public Boolean downTimeExist(){
		return orderdetailpage.isExist(DOWN_TIME);
	}
	//获取下车时间
	public String downTimeText(){
		return orderdetailpage.getText(DOWN_TIME);
	}
	//判断乘车人-文本是否存在
	public Boolean passengerNameTextExist(){
		return orderdetailpage.isExist(ORDER_DETIAL_CLASS,PASSENGER_NAME_TEXT);
	}
	//判断乘车人姓名是否存在
	public Boolean passengerNameExist(){
		return orderdetailpage.isExist(PASSENGER_NAME);
	}
	//获取乘车人姓名
	public String passengerNameText(){
		return orderdetailpage.getText(PASSENGER_NAME);
	}
	//判断乘车人电话按钮是否存在
	public Boolean passengerCallBtnExist(){
		return orderdetailpage.isExist(PASSENGER_CALL);
	}
	//点击乘车人电话按钮
	public void passengerCallBtnClick(){		
		orderdetailpage.clickObj(PASSENGER_CALL);
	}
	//判断订车人-文本是否存在
	public Boolean reserverNameTextExist(){
		return orderdetailpage.isExist(ORDER_DETIAL_CLASS,RESERVER_NAME_TEXT);
	}
	//判断订车人姓名是否存在
	public Boolean reserverNameExist(){
		return orderdetailpage.isExist(RESERVER_NAME);
	}
	//获取订车人姓名
	public String reserverNameText(){
		return orderdetailpage.getText(RESERVER_NAME);
	}
	//判断充值按钮是否存在
	public Boolean rechargeBtnExist(){
		return orderdetailpage.isExist(RECHARGE_BTN);
	}
	//点击充值按钮
	public void rechargeBtnClick(){		
		orderdetailpage.clickObj(RECHARGE_BTN);
	}
	//判断订车人电话按钮是否存在
	public Boolean reserverCallBtnExist(){
		return orderdetailpage.isExist(RESERVER_CALL);
	}
	//点击订车人电话按钮
	public void reserverCallBtnClick(){		
		orderdetailpage.clickObj(RESERVER_CALL);
	}
	//判断上车地点-文本是否存在
	public Boolean upLocTextExist(){
		return orderdetailpage.isExist(UP_LOC_TEXT);
	}
	//获取上车地点-文本
	public String upLocTextText(){
		return orderdetailpage.getText(UP_LOC_TEXT);
	}
	//判断上车地点是否存在
	public Boolean upLocExist(){
		return orderdetailpage.isExist(UP_LOC);
	}
	//获取上车地点
	public String upLocText(){
		return orderdetailpage.getText(UP_LOC);
	}
	//判断上车地点详情是否存在
	public Boolean upLocDetailExist(){
		return orderdetailpage.isExist(UP_LOC_DETAIL);
	}
	//获取上车地点详情
	public String upLocDetailText(){
		return orderdetailpage.getText(UP_LOC_DETAIL);
	}	
	//判断下车地点-文本是否存在
	public Boolean downLocTextExist(){
		return orderdetailpage.isExist(DOWN_LOC_TEXT);
	}
	//获取下车地点-文本
	public String downLocTextText(){
		return orderdetailpage.getText(DOWN_LOC_TEXT);
	}
	//判断下车地点是否存在
	public Boolean downLocExist(){
		return orderdetailpage.isExist(DOWN_LOC);
	}
	//获取下车地点
	public String downLocText(){
		return orderdetailpage.getText(DOWN_LOC);
	}
	//判断下车地点详情是否存在
	public Boolean downLocDetailExist(){
		return orderdetailpage.isExist(DOWN_LOC_DETAIL);
	}
	//获取下车地点详情
	public String downLocDetailText(){
		return orderdetailpage.getText(DOWN_LOC_DETAIL);
	}
	////////////////////////////弹窗/////////////////////////////
	//判断弹窗是否存在
	public Boolean winExist(){
		return orderdetailpage.isExist(POPUPWIN);
	}	
	//判断提示文字是否存在
	public Boolean confirmTextExist(){
		return orderdetailpage.isExist(CONFIRM_TEXT);
	}
	//获取提示文字
	public String confirmTextText(){
		return orderdetailpage.getText(CONFIRM_TEXT);
	}
	//判断取消按钮是否存在
	public Boolean closeBtnExist(){
		return orderdetailpage.isExist(CLOSE_BTN);
	}
	//点击取消按钮
	public void closeBtnClick(){		
		orderdetailpage.clickObj(CLOSE_BTN);
	}
	//判断确定按钮是否存在
	public Boolean okBtnExist(){
		return orderdetailpage.isExist(OK_BTN);
	}
	//点击确定按钮
	public void okBtnClick(){		
		orderdetailpage.clickObj(OK_BTN);
	}
}
