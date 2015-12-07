package page;
/**
 * Description：
 * Date: 2015-12-7
 * @author 李怡萱
 * */
import baseMethod.MainMethod;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.NaviBeforeConstants;
import driverInterface.ParameterConfig;

public class NaviBeforePage extends UiAutomatorTestCase implements NaviBeforeConstants,ParameterConfig{
	
	MainMethod navibeforepage= new MainMethod();
	
	//判断标题栏是否存在
	public Boolean titleExist(){
		return navibeforepage.isExist(TITLE);
	}
	//获取标题栏文本
	public String titleText(){
		return navibeforepage.getText(TITLE);
	}	
	//判断目的地输入框是否存在
	public Boolean destinationBoxExist(){
		return navibeforepage.isExist(DESTINATION_BOX);
	}
	//输入目的地
	public void destinationSetText(){
		navibeforepage.setxt(DESTINATION_BOX, DESTINATION);
	}
	//判断目的地删除按钮是否存在
	public Boolean destinationDelExist(){
		return navibeforepage.isExist(DESTINATION_DEL);
	}
	//点击目的地删除按钮
	public void destinationDelClick(){
		navibeforepage.clickObj(DESTINATION_DEL);
	}
	//判断目的地列表是否存在
	public Boolean destinationListExist(){
		return navibeforepage.isExist(DESTINATION_LIST);
	}
	//获取目的地列表中的选项数量
	public int destinationListGetCount(){
		return navibeforepage.getChildCount(DESTINATION_LIST);
	}
	//判断目的地title是否存在（index由destinationListGetCount()方法决定）
	public Boolean navPoiTitleExist(int index){
		return navibeforepage.isExistFromList(DESTINATION_LIST, index, NAV_POI_TITLE);
	}
	//获取目的地title
	public String navPoiTitleText(int index){
		return navibeforepage.getListText(DESTINATION_LIST, index, NAV_POI_TITLE);
	}
	//判断目的地详情是否存在
	public Boolean navPoiAddrExist(int index){
		return navibeforepage.isExistFromList(DESTINATION_LIST, index, NAV_POI_ADDR);
	}
	//获取目的地详情
	public String navPoiAddrText(int index){
		return navibeforepage.getListText(DESTINATION_LIST, index, NAV_POI_ADDR);
	}
	//点击目的地选项
	public void navPoiClick(int index){
		navibeforepage.clickObj(DESTINATION_LIST, index);
	}
	//判断导航类型栏是否存在
	public Boolean naviTypeBoxExist(){
		return navibeforepage.isExist(NAVI_TYPE_BOX);
	}
	//判断导航类型-各个类型是否存在
	public Boolean naviNoexpressExist(int index){
		return navibeforepage.isExist(NAVI_TYPE_BOX,index);
	}
	//判断导航类型-中间字是否存在
	public Boolean naviTypeBigExist(int index){
		return navibeforepage.isExist(NAVI_TYPE_BOX_CLASS, index, NAVI_TYPE_BIG);
	}
	//获取导航类型-中间字
	public String naviTypeBigText(int index){
		return navibeforepage.getText(NAVI_TYPE_BOX_CLASS, index, NAVI_TYPE_BIG);
	}
	//判断导航类型-上方小字是否存在
	public Boolean naviTypeSmallExist(int index){
		return navibeforepage.isExist(NAVI_TYPE_BOX_CLASS, index, NAVI_TYPE_SMALL);
	}
	//获取导航类型-上方小字
	public String naviTypeSmallText(int index){
		return navibeforepage.getText(NAVI_TYPE_BOX_CLASS, index, NAVI_TYPE_SMALL);
	}
	//判断导航类型-预计时间是否存在
	public Boolean naviTimeExist(int index){
		return navibeforepage.isExist(NAVI_TYPE_BOX_CLASS, index, NAVI_TIME);
	}
	//获取导航类型-预计时间
	public String naviTimeText(int index){
		return navibeforepage.getText(NAVI_TYPE_BOX_CLASS, index, NAVI_TIME);
	}
	//判断导航类型-预计里程是否存在
	public Boolean naviDistanceExist(int index){
		return navibeforepage.isExist(NAVI_TYPE_BOX_CLASS, index, NAVI_DISTANCE);
	}
	//获取导航类型-预计里程
	public String naviDistanceText(int index){
		return navibeforepage.getText(NAVI_TYPE_BOX_CLASS, index, NAVI_DISTANCE);
	}
	//判断开始导航按钮是否存在
	public Boolean naviBtnExist(){
		return navibeforepage.isExist(NAVI_BTN);
	}
	//点击开始导航按钮
	public void naviBtnClick(){
		navibeforepage.clickObj(NAVI_BTN);
	}	
}
