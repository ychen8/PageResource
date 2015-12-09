package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.ChooseCityConstants;

public class ChooseCityPage extends UiAutomatorTestCase implements ChooseCityConstants{
//  
	MainMethod choosecity=new MainMethod();
	//判断标题是否存在
	public Boolean titleExist(){
		return choosecity.isExist(CHOOSECITYTITLE);
	}
	//获取标题文本
	public String titleText(){
		return choosecity.getText(CHOOSECITYTITLE);
	}
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return choosecity.isExist(BACKBTN);
	}
	//点击返回按钮
	public void backBtnClick(){
		choosecity.clickObj(BACKBTN);
	}
	//获取当前城市
	public String currentCityText(){
		return choosecity.getText(LOCATIONCITY);
	}
	//点击当前城市
	public void currentCityClick(){
		choosecity.clickObj(LOCATIONCITY);
	}
	//判断城市是否存在（通过城市名）
	//这个可能写的不对，现在没精力想，等调试的时候再研究
	public Boolean cityExist(String cityname){
		return choosecity.isExistByText(CITY, cityname);
	}
	//点击城市（通过城市名）
	public void cityClick(String cityname){
		 choosecity.clickObjByText(CITY, cityname);
	}
	//获取城市数量
	public int cityCount(){
		return choosecity.getChildCountByClass(LIST);
	}

	
}
