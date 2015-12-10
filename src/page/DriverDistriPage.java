package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.DriverDistriConstants;

/**
 *创建日期:2015-12-9
 *作者： 陈玉婵
 */
public class DriverDistriPage extends UiAutomatorTestCase implements DriverDistriConstants {
	MainMethod driverDistriPage= new MainMethod();
	//判断返回icon是否存在
	public Boolean returnExist(){
		return driverDistriPage.isExist(BACK);
	}
	//点击返回
	public void returnClick(){
		driverDistriPage.clickObj(BACK);
	}
	//判断标题是否存在
	public Boolean titleExist(){
		return driverDistriPage.isExist(TITLE);
	}
	//获取标题内容
	public String titleText(){
		return driverDistriPage.getText(TITLE);
	}
	//判断扩大icon是否存在
	public Boolean enlargeExist(){
		return driverDistriPage.isExistFromId(CONTENT, INDEX_ENLARGE);
	}
	//点击扩大icon
	public void enlargeClick(){
		driverDistriPage.clickObjFromId(CONTENT, INDEX_ENLARGE);
	}
	//判断缩小icon是否存在
	public Boolean narrowExist(){
		return driverDistriPage.isExistFromId(CONTENT, INDEX_NARROW);
	}
	//点击缩小icon
	public void narrowClick(){
		driverDistriPage.clickObjFromId(CONTENT, INDEX_NARROW);
	}
	//判断重新定位icon是否存在
	public Boolean rePositionExist(){
		return driverDistriPage.isExistFromId(CONTENT, INDEX_REPOSITION);
	}
	//点击重新定位icon
	public void rePositionClick(){
		driverDistriPage.clickObjFromId(CONTENT, INDEX_REPOSITION);
	}
	//判断看全城icon是否存在
	public Boolean wholeCityExist(){
		return driverDistriPage.isExistFromId(CONTENT, INDEX_WHOLE_CITY);
	}
	//点击看全城icon
	public void wholeCityClick(){
		driverDistriPage.clickObjFromId(CONTENT, INDEX_WHOLE_CITY);
	}
	//判断底部静态价格显示栏是否存在
	public Boolean staticPriceExist(){
		return driverDistriPage.isExistFromId(CONTENT, INDEX_STATIC_PRICE);
	}
	//获取底部静态价格显示栏内容
	public String staticPriceText(){
		return driverDistriPage.getTextFromId(CONTENT, INDEX_STATIC_PRICE);
	}
	

}
