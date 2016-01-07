package testcase;

import page.SerOrderDetialPage;

import baseMethod.Base;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 *创建日期:2016-1-7
 *作者： 陈玉婵
 */
public class SerOrderCase extends UiAutomatorTestCase  {
	SerOrderDetialPage order=new SerOrderDetialPage();
	Base base=new Base();
	public void testOrderDetail(){
		//先判断不同未完成订单状态详情页面，共有的控件是否存在
		assertTrue(order.titleExist());
		assertTrue(order.callBtnExist());
		assertTrue(order.slideBarExist());
		assertTrue(order.mapDistanceExist());
		assertTrue(order.mapTimeExist());
		assertTrue(order.locBtnExist());
		assertTrue(order.orderCommitExist());
		
		//判断待服务状态
		if(order.titleText().contains("接单成功")){
			assertTrue(order.userMsgExist());//判断客户姓名、手机号是否存在
			assertTrue(order.upLocExist());//判断上车地点是否存在
			assertTrue(order.upLocDetialExist());//判断上车地点详情是否存在
			assertEquals("去接客户",order.orderCommitText());//点击去接客户
			
			order.slideBarClick();//点击查看所有
			order.balanceExist();//判断账户信息是否存在
			order.slideBarClick();//点击收起
			assertTrue(!order.balanceExist());
			
			order.orderCommitClick();
			order.okBtnClick();
			do{
				sleep(1000);
			}while(base.loadingImgExist());	
		}
		//判断已出发状态
		if(order.titleText().contains("去接客户")){
			assertTrue(order.userMsgExist());
			assertTrue(order.upLocExist());
			assertTrue(order.upLocDetialExist());
			assertTrue(order.startNaviExist());//判断开启导航是否存在
			assertEquals("到达上车地点",order.orderCommitText());
			
			order.slideBarClick();//点击查看所有
			//此状态下包括：账户信息、下车地点、下车详情
			order.balanceExist();
			order.downLocExist();
			order.downLocDetialExist();
			
			order.slideBarClick();//点击收起
			assertTrue(!order.balanceExist());
			
			order.orderCommitClick();
			order.okBtnClick();
			do{
				sleep(1000);
			}while(base.loadingImgExist());	
		}
				
	}

}
