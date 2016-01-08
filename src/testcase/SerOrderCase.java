package testcase;

import page.NaviAfterPage;
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
	NaviAfterPage naviAfter=new NaviAfterPage();
	public void testOrderDetail(){
		System.out.println("测试未完成订单详情页面");
		//先判断不同未完成订单状态详情页面，共有的控件是否存在
		assertTrue(order.titleExist());
		assertTrue(order.callBtnExist());
		assertTrue(order.slideBarExist());
		assertTrue(order.mapDistanceExist());
		assertTrue(order.mapTimeExist());
		assertTrue(order.locBtnExist());
		assertTrue(order.orderCommitExist());
		
		//待服务状态
		System.out.println("测试待服务详情页面");
		if(order.titleText().contains("接单成功")){
			assertTrue(order.userMsgExist());//判断客户姓名、手机号是否存在
			assertTrue(order.upLocExist());//判断上车地点是否存在
			assertTrue(order.upLocDetialExist());//判断上车地点详情是否存在
			assertEquals("去接客户",order.orderCommitText());//判断按钮是否为去接客户
			
			order.slideBarClick();//点击查看所有		
			assertTrue(order.balanceExist());//判断账户信息是否存在
			order.slideBarClick();//点击收起
			assertTrue(!order.balanceExist());
			
			if(order.titleText().contains("预约")){
				assertTrue(order.remainTimeExist());//如果是预约订单，判断改派按钮一定存在
				assertTrue(order.changeBtnExist());//如果是预约订单，判断离用车时间还有多长时长的提醒一定存在
				order.orderCommitClick();//点击去接客户
				if(order.confirmTextExist()){
					assertEquals("距离用车时间尚早"+"\n"+"不能开始此订单",order.confirmTextText());
					order.okBtnClick();
				}
			}
				
			order.orderCommitClick();//点击去接客户
			if(order.confirmTextExist()){
				order.okBtnClick();
			}	
				
			do{
				sleep(1000);
			}while(base.loadingImgExist());	
		}
		//已出发状态
		System.out.println("测试已出发详情页面");
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
		System.out.println("测试已到达详情页面");
		if(order.titleText().contains("等待出发")){
			assertTrue(order.userMsgExist());//判断客户姓名、手机号是否存在
			assertTrue(order.upLocExist());
			assertTrue(order.upLocDetialExist());
			assertEquals("开始服务",order.orderCommitText());
			
			order.slideBarClick();//点击查看所有
			
			assertTrue(order.balanceExist());//判断账户信息是否存在
			assertTrue(order.rechargeBtnExist());//判断充值按钮是否存在
			
			//点击充值按钮－调用替用户充值用例
		//	order.rechargeBtnClick();
		//	new RechargeCase().testRechare();
			
			order.slideBarClick();//点击收起
			assertTrue(!order.balanceExist());
			
			order.orderCommitClick();//点击开始服务
			order.okBtnClick();
			do{
				sleep(1000);
			}while(base.loadingImgExist());	
			if(naviAfter.titleExist()){
				naviAfter.closeBtn1Click();
			}
		}
		//已开始服务状态
		System.out.println("测试已开始服务页面");
		if(order.titleText().contains("服务中")){
			
		}
				
	}

}
