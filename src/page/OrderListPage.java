package page;
/**
 * Description：订单列表页
 * Date: 2015-12-10
 * @author 李怡萱
 * */
import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.OrderListConstants;


public class OrderListPage extends UiAutomatorTestCase implements OrderListConstants{

	MainMethod orderlistpage = new MainMethod();
	//判断标题栏是否存在
	public Boolean titleExist(){
		return orderlistpage.isExist(TITLE);
	}
	//获取标题栏文字
	public String titleText(){
		return orderlistpage.getText(TITLE);		
	}
	//点击标题栏
	public void titleClick(){	
		orderlistpage.clickObj(TITLE);
	}	
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return orderlistpage.isExist(BACKBTN);        
	}
	//点击返回按钮
	public void backBtnClick(){	
		orderlistpage.clickObj(BACKBTN);
	}	
	//判断查询按钮是否存在
	public Boolean queryBtnExist(){
		return orderlistpage.isExist(QUERYBTN);        
	}
	//点击查询按钮
	public void queryBtnClick(){	
		orderlistpage.clickObj(QUERYBTN);
	}	
	//判断未完成tab是否存在
	public Boolean notFinishedTabExist(){
		return orderlistpage.isExistFromId(TAB_BAR, NOT_FINISHED);
	}
	//获取未完成text
	public String notFinishedTabText(){
		return orderlistpage.getTextFromId(TAB_BAR, NOT_FINISHED);
	}
	//点击未完成tab
	public void notFinishedTabClick(){
		orderlistpage.clickObjFromId(TAB_BAR, NOT_FINISHED);
	}
	//判断已完成tab是否存在
	public Boolean finishedTabExist(){
		return orderlistpage.isExistFromId(TAB_BAR, FINISHED);
	}
	//获取已完成text
	public String finishedTabText(){
		return orderlistpage.getTextFromId(TAB_BAR, FINISHED);
	}
	//点击已完成tab
	public void finishedTabClick(){
		orderlistpage.clickObjFromId(TAB_BAR, FINISHED);
	}
	//判断近三月-无订单提示语是否存在
	public Boolean noOrderText1Exist(){
		return orderlistpage.isExistFromText(NO_ORDER);
	}

	//判断其他时间-无订单提示语是否存在
	public Boolean noOrderText2Exist(){
		return orderlistpage.isExistFromText(NO_ORDER);
	}

	//判断是否存在订单
	public Boolean orderListExist(){
		return orderlistpage.isExist(ORDER_LIST);
	}
	//获取订单数量
	public int getorderAmount(){
		return orderlistpage.getChildCount(ORDER_LIST);
	}
	//判断订单类型是否存在
	public Boolean orderTypeExist(int index){
		return orderlistpage.isExistFromList(ORDER_LIST, index, ORDER_TYPE);
	}
	//获取订单类型
	public String orderTypeText(int index){
		return orderlistpage.getListText(ORDER_LIST, index, ORDER_TYPE);
	}
	//判断航班号是否存在
	public Boolean flightnoExist(int index){
		return orderlistpage.isExistFromList(ORDER_LIST, index, FLIGHT_NO);
	}
	//获取航班号
	public String flightnoText(int index){
		return orderlistpage.getListText(ORDER_LIST, index, FLIGHT_NO);
	}
	//判断订单金额是否存在
	public Boolean orderPriceExist(int index){
		return orderlistpage.isExistFromList(ORDER_LIST, index, ORDER_PRICE);
	}
	//获取订单金额
	public String orderPriceText(int index){
		return orderlistpage.getListText(ORDER_LIST, index, ORDER_PRICE);
	}
	//判断订单状态是否存在
	public Boolean orderStateExist(int index){
		return orderlistpage.isExistFromList(ORDER_LIST, index, ORDER_STATE);
	}
	//获取订单状态
	public String orderStateText(int index){
		return orderlistpage.getListText(ORDER_LIST, index, ORDER_STATE);
	}
	//判断订单号是否存在
	public Boolean ordernoExist(int index){
		return orderlistpage.isExistFromList(ORDER_LIST, index, ORDER_NO);
	}
	//获取订单号
	public String ordernoText(int index){
		return orderlistpage.getListText(ORDER_LIST, index, ORDER_NO);
	}
	//点击订单
	public void orderClick(int index){
		orderlistpage.clickObjFromList(ORDER_LIST, index, ORDER_NO);
	}
	//判断订单日期是否存在
	public Boolean orderDateExist(int index){
		return orderlistpage.isExistFromList(ORDER_LIST, index, ORDER_DATE);
	}
	//获取订单日期
	public String orderDateText(int index){
		return orderlistpage.getListText(ORDER_LIST, index, ORDER_DATE);
	}
	//判断改派按钮是否存在
	public Boolean changeOrderBtnExist(int index){
		return orderlistpage.isExistFromList(ORDER_LIST, index, CHANGE_ORDER_BTN);
	}
	//点击改派按钮
	public void changeOrderBtnClick(int index){
		orderlistpage.clickObjFromList(ORDER_LIST, index, CHANGE_ORDER_BTN);
	}
	//判断上车地点是否存在
	public Boolean upLocExist(int index){
		return orderlistpage.isExistFromList(ORDER_LIST, index, UP_LOC);
	}
	//获取上车地点
	public String upLocText(int index){
		return orderlistpage.getListText(ORDER_LIST, index, UP_LOC);
	}
	//判断上车地点详情是否存在
	public Boolean upLocDetailExist(int index){
		return orderlistpage.isExistFromList(ORDER_LIST, index, UP_LOC_DETAIL);
	}
	//获取上车地点详情
	public String upLocDetailText(int index){
		return orderlistpage.getListText(ORDER_LIST, index, UP_LOC_DETAIL);
	}
	//判断下车地点是否存在
	public Boolean downLocExist(int index){
		return orderlistpage.isExistFromList(ORDER_LIST, index, DOWN_LOC);
	}
	//获取下车地点
	public String downLocText(int index){
		return orderlistpage.getListText(ORDER_LIST, index, DOWN_LOC);
	}
	//判断下车地点详情是否存在
	public Boolean downLocDetailExist(int index){
		return orderlistpage.isExistFromList(ORDER_LIST, index, DOWN_LOC_DETAIL);
	}
	//获取下车地点详情
	public String downLocDetailText(int index){
		return orderlistpage.getListText(ORDER_LIST, index, DOWN_LOC_DETAIL);
	}
}


