
/**
 *创建日期:2015-12-8
 *作者： 郭艳松
 */
package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.OrderPushConstants;

public class OrderPushPage extends UiAutomatorTestCase implements OrderPushConstants{
	MainMethod orderpush=new MainMethod();
	//判断关闭按钮是否存在
	public Boolean clsBtnExist(){
		return orderpush.isExist(CLSBTN);
	}
	//点击关闭按钮
	public void clsBtnClick(){
		orderpush.clickObj(CLSBTN);
	}
	//判断订单类型图标是否存在
	public Boolean orderTypeImgExist(){
		return orderpush.isExist(ORDTYPEIMG);
	}
	//判断订单类型
	public String orderType(){
		return orderpush.getText(ORDERTYPE);
	}
	//订单类型是否存在
	public Boolean orderTypeExist(){
		return orderpush.isExist(ORDERTYPE);
	}
	//获取订单类型文本
	public String orderTypeText(){
		return orderpush.getText(ORDERTYPE);
	}
	//判断订单颜色
	//////////////////////////////////////////
	///////////////////不知道怎么写////////////
	//////////////////////////////////////////
	//推送详情页应该可以滚动
	//////////////////////////////////////////
	////////////暂未发现有什么用///////////////
	//////////////////////////////////////////
	//获取用车时间
	public String useDateText(){
		return orderpush.getText(USEDATE);
	}
	//判断用车时间是否存在
	public Boolean useDateExist(){
		return orderpush.isExist(USEDATE);
	}
	//获取用车距离
	public String orderDistanceText(){
		return orderpush.getText(ORDDISTANCE);
	}
	//判断用车距离是否存在
	public Boolean orderDistanceExist(){
		return orderpush.isExist(ORDDISTANCE);
	}
	//获取上车地点
	public String upNameText(){
		return orderpush.getText(UPNAME);
	}
	//判断上车地点是否存在
	public Boolean upNameExist(){
		return orderpush.isExist(UPNAME);
	}
	//获取上车地点详情
	public String upDetailText(){
		return orderpush.getText(UPDETAIL);
	}
	//判断上车地点详情是否存在
	public Boolean upDetailExist(){
		return orderpush.isExist(UPDETAIL);
	}
	//获取上车地点TIP
	public String upTipText(){
		return orderpush.getText(UPTIP);
	}
	//判断上车地点TIP是否存在
	public Boolean upTipExist(){
		return orderpush.isExist(UPTIP);
	}
	//获取下车地点
	public String downNameText(){
		return orderpush.getText(DOWNAME);
	}
	//判断下车地点是否存在
	public Boolean downNameExist(){
		return orderpush.isExist(DOWNAME);
	}
	//获取下车地点详情
	public String downDetailText(){
		return orderpush.getText(DOWNDETAIL);
	}
	//判断下车地点详情是否存在
	public Boolean downDetailExist(){
		return orderpush.isExist(DOWNDETAIL);
	}
	//获取下车地点TIP
	public String downTipText(){
		return orderpush.getText(DOWNTIP);
	}
	//判断下车地点TIP是否存在
	public Boolean downTupExist(){
		return orderpush.isExist(DOWNTIP);
	}
	//获取特别提示
	public String specNameText(){
		return orderpush.getText(SPECNAME);
	}
	//判断特别提示是否存在
	public Boolean specNameExist(){
		return orderpush.isExist(SPECNAME);
	}
	//获取特别提示TIP
	public String specTipText(){
		return orderpush.getText(SPECTIP);
	}
	//判断特别提示TIP是否存在
	public Boolean specTipExist(){
		return orderpush.isExist(SPECTIP);
	}
	//获取向上滑动地图文本
	public String moveUpText(){
		return orderpush.getText(MOVEUP, 0);
	}
	//判断向上滑动地图问题是否存在
	public Boolean moveUpExist(){
		return orderpush.isExist(MOVEUP, 0);
	}
	//获取确定按钮文本
	public String okBtnText(){
		return orderpush.getText(OKBTN);
	}
	//判断确定按钮是否存在
	public Boolean okBtnExist(){
		return orderpush.isExist(OKBTN);
	}
	//点击确定按钮
	public void okBtnClick(){
		orderpush.clickObj(OKBTN);
	}
	//获取接单设置按钮文本
	public String setBtnText(){
		return orderpush.getText(SETBTN);
	}
	//判断接单设置按钮是否存在
	public Boolean setBtnExist(){
		return orderpush.isExist(SETBTN);
	}
	//点击接单设置按钮
	public void setBtnClick(){
		orderpush.clickObj(SETBTN);
	}
	//获取备注信息
	public String reMarkText(){
		return orderpush.getText(REMARK);
	}
	//判断备注是否存在
	public Boolean reMarkExist(){
		return orderpush.isExist(REMARK);
	}
	//获取备注TIP
	public String reMarkTipText(){
		return orderpush.getText(REMARKTIP);
	}
	//判断备注TIP是否存在
	public Boolean reMarkTipExist(){
		return orderpush.isExist(REMARKTIP);
	}
	//获取浮动系数信息
	public String factorText(){
		return orderpush.getText(FACTOR);
	}
	//判断浮动系数是否存在
	public Boolean factorExist(){
		return orderpush.isExist(FACTOR);
	}
	

}
