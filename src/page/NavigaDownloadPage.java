package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.NavigaDownloadConstants;

/**
 *创建日期:2015-12-11
 *作者： 陈玉婵
 */
public class NavigaDownloadPage extends UiAutomatorTestCase implements
		NavigaDownloadConstants {
	MainMethod navigaDownloadPage=new MainMethod();
	//判断返回icon是否存在
	public Boolean returnExist(){
		return navigaDownloadPage.isExist(BACK);
	}
	//点击返回
	public void returnClick(){
		navigaDownloadPage.clickObj(BACK);
	}
	//判断全部、已下载tab是否存在
	public Boolean mapTypeExist(){
		return navigaDownloadPage.isExist(MAP_TYPE_CHECKBOX);
	}
	//获取全部、已下载内容
	public String mapTypeText(){
		return navigaDownloadPage.getText(MAP_TYPE_CHECKBOX);
	}
	//点击全部、已下载tab
	public void mapTypeClick(){
		navigaDownloadPage.clickObj(MAP_TYPE_CHECKBOX);
	}
	//判断城市输入框是否存在
	public Boolean searchExist(){
		return navigaDownloadPage.isExist(SEARCH);
	}
	//获取输入框内容
	public String searchText(){
		return navigaDownloadPage.getText(SEARCH);
	}
	//清空城市输入框内容
	public void searchClear(){
		navigaDownloadPage.cleartxt(SEARCH);
	}
	//输入城市
	public void searchSet(){
		navigaDownloadPage.setxt(SEARCH, SEARCH_VALUE);
	}
	//判断城市值是否存在
	public Boolean CityValueExist(int index){
		return navigaDownloadPage.isExistFromList(LISTVIEW, index,CITY_VALUE);
	}
	//获取城市值文本
	public String cityeValueText(int index){
		return navigaDownloadPage.getListText(LISTVIEW, index,CITY_VALUE);
	}
	//判断城市下载进度是否存在
	public Boolean downloadProcessExist(int index){
		return navigaDownloadPage.isExistFromList(LISTVIEW, index,DOWNLOAD_PROCESS);
	}
	//获取城市下载进度文本
	public String downloadProcessText(int index){
		return navigaDownloadPage.getListText(LISTVIEW, index,DOWNLOAD_PROCESS);
	}
	//判断城市下载完成label是否存在
	public Boolean downloadCompleExist(int index){
		return navigaDownloadPage.isExistFromList(LISTVIEW, index,LABEL_DOWNLOAD_COMPLETE);
	}
	//获取城市下载完成label文本
	public String downloadCompleText(int index){
		return navigaDownloadPage.getListText(LISTVIEW, index,LABEL_DOWNLOAD_COMPLETE);
	}
	//判断下载按钮是否存在
	public Boolean downloadBtnExist(int index){
		return navigaDownloadPage.isExistFromList(LISTVIEW, index,DOWNLOAD_BTN);
	}

}
