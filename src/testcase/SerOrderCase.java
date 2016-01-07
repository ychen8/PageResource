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
		
		//待服务状态
		if(order.titleText().contains("接单成功")){
			assertTrue(order.userMsgExist());//判断客户姓名、手机号是否存在
			assertTrue(order.upLocExist());//判断上车地点是否存在
			assertTrue(order.upLocDetialExist());//判断上车地点详情是否存在
			assertTrue(order.remainTimeExist());
			assertEquals("去接客户",order.orderCommitText());//判断按钮是否为去接客户
			
			order.slideBarClick();//点击查看所有
			
			assertTrue(order.balanceExist());//判断账户信息是否存在
			
			order.slideBarClick();//点击收起
			assertTrue(!order.balanceExist());
			
			order.orderCommitClick();//点击去接客户
			if(order.remainTimeText().substring(8, 9).equals("")){
				
			}
			order.okBtnClick();
			do{
				sleep(1000);
			}while(base.loadingImgExist());	
		}
		//已出发状态
		if(order.titleText().contains("去接客户")){
			assertTrue(order.userMsgExist());//判断客户姓名、手机号是否存在
			assertTrue(order.upLocExist());//判断上车地点是否存在
			assertTrue(order.upLocDetialExist());//判断上车地点详情是否存在
			
			assertTrue(order.startNaviExist());//判断开启导航是否存在
			
			assertEquals("到达上车地点",order.orderCommitText());
			
			order.slideBarClick();//点击查看所有
			
			//点击查看所有包括：账户信息、下车地点、下车详情
			assertTrue(order.balanceExist());
			assertTrue(order.downLocExist());
			assertTrue(order.downLocDetialExist());
			
			order.slideBarClick();//点击收起
			assertTrue(!order.balanceExist());
			/////////////此处调用开始导航用例－/////////////////////
			//点击开始导航//////////////
			//order.startNaviClick();
			//////////////////////////
			
			order.orderCommitClick();//点击到达上车地点
			order.okBtnClick();
			do{
				sleep(1000);
			}while(base.loadingImgExist());	
		}
		//已到达状态
		if(order.titleText().contains("等待出发")){
			assertTrue(order.userMsgExist());//判断客户姓名、手机号是否存在
			assertTrue(order.downLocExist());
			assertTrue(order.downLocDetialExist());
			assertEquals("开始服务",order.orderCommitText());
			
			order.slideBarClick();//点击查看所有
			
			assertTrue(order.balanceExist());//判断账户信息是否存在
			assertTrue(order.rechargeBtnExist());//判断充值按钮是否存在
			
			//点击充值按钮－调用替用户充值用例
			order.rechargeBtnClick();
			new RechargeCase().testRechare();
			
			order.slideBarClick();//点击收起
			assertTrue(!order.balanceExist());
			
			order.orderCommitClick();//点击开始服务
			order.okBtnClick();
			do{
				sleep(1000);
			}while(base.loadingImgExist());	
		}
		//已开始服务状态
		
				
	}

}
