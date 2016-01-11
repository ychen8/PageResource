package testcase;

import page.CheckBillPage;
import page.NaviAfterPage;
import page.OrderBalancePage;
import page.SerOrderDetialPage;

import baseMethod.Base;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.CheckBillConstants;

/**
 * 未完成订单相关页面
 *创建日期:2016-1-7
 *作者： 陈玉婵
 */
public class SerOrderCase extends UiAutomatorTestCase implements CheckBillConstants{
	SerOrderDetialPage order=new SerOrderDetialPage();
	Base base=new Base();
	NaviAfterPage naviAfter=new NaviAfterPage();
	CheckBillPage checkBill=new CheckBillPage();
	OrderBalancePage orderBalance=new OrderBalancePage();
	public void testOrderDetail(){
		System.out.println("测试未完成订单详情页面");
		sleep(1000);
		//待服务状态-去接客户		
		if(order.titleText().contains("接单成功")){
			pickClientCase();
		}
		//已出发状态	
		if(order.titleText().contains("去接客户")){
			arriveCase();
		}
		//已到达状态
		if(order.titleText().contains("等待出发")){
			WaitSetOutCase();
		}
		//已开始服务状态		
		if(order.titleText().contains("服务中")){
			startServiceCase();
		}
		//已结束服务状态－核实账单-订单结算
		if(checkBill.titleExist()){
			checkBillCase();
			orderBalanceCase();		
		}
				
	}
	protected void pickClientCase(){
		System.out.println("测试待服务详情页面");
		sleep(1000);
		//先判断不同未完成订单状态详情页面，共有的控件是否存在
		assertTrue(order.titleExist());//判断标题栏是否存在
		assertTrue(order.slideBarExist());//判断“点击查看所有/收起”是否存在
		assertTrue(order.mapDistanceExist());//判断地图-剩余公里数是否存在
		assertTrue(order.mapTimeExist());//判断地图-剩余时间是否存在
		assertTrue(order.locBtnExist());//判断地图-定位按钮是否存在
		assertTrue(order.orderCommitExist());//判断【订单状态切换】按钮是否存在
		
		assertTrue(order.userMsgExist());//判断客户姓名、手机号是否存在
		assertTrue(order.upLocExist());//判断上车地点是否存在
		assertTrue(order.upLocDetialExist());//判断上车地点详情是否存在
		assertEquals("去接客户",order.orderCommitText());//判断按钮是否为去接客户
		assertTrue(order.callBtnExist());//判断电话图标按钮是否存在
		
		order.slideBarClick();//点击查看所有		
		assertTrue(order.balanceExist());//判断账户信息是否存在
		order.slideBarClick();//点击收起
		assertTrue(!order.balanceExist());
		/*
		if(order.titleText().contains("预约")){
			assertTrue(order.remainTimeExist());//如果是预约订单，判断改派按钮一定存在
			assertTrue(order.changeBtnExist());//如果是预约订单，判断离用车时间还有多长时长的提醒一定存在
			order.orderCommitClick();//点击去接客户
			if(order.confirmTextExist()){
				assertEquals("距离用车时间尚早"+"\n"+"不能开始此订单",order.confirmTextText());
				order.okBtnClick();
			}
		}*/
			
		order.orderCommitClick();//点击去接客户
		if(order.confirmTextExist()){
			assertEquals("您确定现在去接客户吗？",order.confirmTextText());
			order.okBtnClick();
		}	
			
		do{
			sleep(1000);
		}while(base.loadingImgExist());	
	}
	
	protected void arriveCase(){
		System.out.println("测试已出发详情页面");
		sleep(1000);
		//先判断不同未完成订单状态详情页面，共有的控件是否存在
		assertTrue(order.titleExist());//判断标题栏是否存在
		assertTrue(order.slideBarExist());//判断“点击查看所有/收起”是否存在
		//assertTrue(order.mapDistanceExist());//判断地图-剩余公里数是否存在/////有可能会被挡住，则找不到
		//assertTrue(order.mapTimeExist());//判断地图-剩余时间是否存在
		assertTrue(order.locBtnExist());//判断地图-定位按钮是否存在
		assertTrue(order.orderCommitExist());//判断【订单状态切换】按钮是否存在
		
		assertTrue(order.userMsgExist());//判断客户姓名、手机号是否存在
		assertTrue(order.upLocExist());//判断上车地点是否存在
		assertTrue(order.upLocDetialExist());//判断上车地点详情是否存在
		assertTrue(order.callBtnExist());//判断电话图标按钮是否存在
		
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
		if(order.confirmTextExist()){
			assertEquals("确认已到达上车地点？",order.confirmTextText());
			order.okBtnClick();
		}	
		do{
			sleep(1000);
		}while(base.loadingImgExist());	
	}
	
	protected void WaitSetOutCase(){
		System.out.println("测试已到达详情页面");
		sleep(1000);
		//先判断不同未完成订单状态详情页面，共有的控件是否存在
		assertTrue(order.titleExist());//判断标题栏是否存在
		assertTrue(order.slideBarExist());//判断“点击查看所有/收起”是否存在
		//assertTrue(order.mapDistanceExist());//判断地图-剩余公里数是否存在
		//assertTrue(order.mapTimeExist());//判断地图-剩余时间是否存在
		assertTrue(order.locBtnExist());//判断地图-定位按钮是否存在
		assertTrue(order.orderCommitExist());//判断【订单状态切换】按钮是否存在
		
		assertTrue(order.userMsgExist());//判断客户姓名、手机号是否存在
		assertTrue(order.upLocExist());//这里其实是下车地点
		assertTrue(order.upLocDetialExist());//这里其实是下车详情
		assertEquals("开始服务",order.orderCommitText());
		assertTrue(order.callBtnExist());//判断电话图标按钮是否存在
		
		order.slideBarClick();//点击查看所有
		
		assertTrue(order.balanceExist());//判断账户信息是否存在
		assertTrue(order.rechargeBtnExist());//判断充值按钮是否存在
		
		//点击充值按钮－调用替用户充值用例
	//	order.rechargeBtnClick();
	//	new RechargeCase().testRechare();
		
		order.slideBarClick();//点击收起
		assertTrue(!order.balanceExist());
		
		order.orderCommitClick();//点击开始服务
		if(order.confirmTextExist()){
			assertEquals("确认开始服务？",order.confirmTextText());
			order.okBtnClick();
		}	
		do{
			sleep(1000);
		}while(base.loadingImgExist());	
		//如果进入调用导航，则关闭导航
		if(naviAfter.titleExist()){
			naviAfter.closeBtn1Click();
		}
	}
	protected void startServiceCase(){
		System.out.println("测试已开始服务页面");
		sleep(1000);
		//先判断不同未完成订单状态详情页面，共有的控件是否存在
		assertTrue(order.titleExist());//判断标题栏是否存在
		assertTrue(order.slideBarExist());//判断“点击查看所有/收起”是否存在
		//assertTrue(order.mapDistanceExist());//判断地图-剩余公里数是否存在
		//assertTrue(order.mapTimeExist());//判断地图-剩余时间是否存在
		assertTrue(order.locBtnExist());//判断地图-定位按钮是否存在
		assertTrue(order.orderCommitExist());//判断【订单状态切换】按钮是否存在
		
		assertTrue(order.upLocExist());//这里其实是下车地点
		assertTrue(order.upLocDetialExist());//这里其实是下车详情
		assertTrue(order.startNaviExist());//判断开启导航是否存在
		assertTrue(order.goRestExist());
		assertTrue(order.serveTimeExist());
		
		order.slideBarClick();//点击查看所有
		assertTrue(order.balanceExist());//判断账户信息是否存在
		assertTrue(order.rechargeBtnExist());//判断充值按钮是否存在
		
		//点击充值按钮－调用替用户充值用例
	//	order.rechargeBtnClick();
	//	new RechargeCase().testRechare();
		
		order.slideBarClick();//点击收起
		assertTrue(!order.balanceExist());
		
		order.orderCommitClick();
		if(order.confirmTextExist()){
			assertEquals("确认结束服务？",order.confirmTextText());
			order.okBtnClick();
		}	
		do{
			sleep(1000);
		}while(base.loadingImgExist());
	}
	protected void checkBillCase(){
		System.out.println("核实账单");
		sleep(1000);
		assertEquals("核实账单",checkBill.titleText());//判断标题是否正确
		assertTrue(checkBill.backBtnExist());//判断返回按钮是否存在
		assertTrue(checkBill.killoTitleExist());//判断本次服务里程-文本是否存在
		assertTrue(checkBill.killoValueExist());//判断里程输入框是否存在
		assertTrue(checkBill.killoTextExist());//判断公里-文本是否存在
		//附加费用
		
		assertTrue(checkBill.costName2Exist(PANKING_INDEX,TEXT_IDNDEX));//判断附加费用-停车费-文本是否存在
		assertTrue(checkBill.costName2Exist(HIGHWAY_INDEX,TEXT_IDNDEX));//判断附加费用-路桥费-文本是否存在
		assertTrue(checkBill.costName2Exist(CLEAN_INDEX,TEXT_IDNDEX));//判断附加费用-清洁费-文本是否存在
		assertTrue(checkBill.costName2Exist(AIRPORT_SERVICE,TEXT_IDNDEX));//判断附加费用-机场服务费-文本是否存在
		assertTrue(checkBill.costName2Exist(OTHER_INDEX,TEXT_IDNDEX));//判断附加费用-其它费用-文本是否存在
		
		assertTrue(checkBill.costValue2Exist(PANKING_INDEX,TEXT_INPUT_IDNDEX));//判断附加费用-停车费-输入框是否存在
		assertTrue(checkBill.costValue2Exist(CLEAN_INDEX,TEXT_INPUT_IDNDEX));//判断附加费用-路桥费-输入框是否存在
		assertTrue(checkBill.costValue2Exist(CLEAN_INDEX,TEXT_INPUT_IDNDEX));//判断附加费用-清洁费-输入框是否存在
		assertTrue(checkBill.costValue2Exist(AIRPORT_SERVICE,TEXT_INPUT_IDNDEX));//判断附加费用-机场服务费-输入框是否存在
		assertTrue(checkBill.costValue2Exist(OTHER_INDEX,TEXT_INPUT_IDNDEX));//判断附加费用-其它费用-输入框是否存在
		/*
		assertTrue(checkBill.yuanExist(PARKING_TEXT_ID));//判断附加费用-停车费-元是否存在
		assertTrue(checkBill.yuanExist(HIGHWAY_TEXT_ID));//判断附加费用-路桥费-元是否存在
		assertTrue(checkBill.yuanExist(CLEAN_TEXT_ID));//判断附加费用-清洁费-元是否存在
		assertTrue(checkBill.yuanExist(AIRPORT_SERVICE_TEXT_ID));//判断附加费用-机场服务费-元是否存在
		assertTrue(checkBill.yuanExist(OTHER_TEXT_ID ));//判断附加费用-其它费用-元是否存在
		*/
		assertEquals("停车费",checkBill.costName2Text(PANKING_INDEX,TEXT_IDNDEX));//判断附加费用-停车费-文本是否正确
		assertEquals("路桥费",checkBill.costName2Text(HIGHWAY_INDEX,TEXT_IDNDEX));//判断附加费用-路桥费-文本是否正确
		assertEquals("清洁费",checkBill.costName2Text(CLEAN_INDEX,TEXT_IDNDEX));//判断附加费用-清洁费-文本是否正确
		assertEquals("机场服务费",checkBill.costName2Text(AIRPORT_SERVICE,TEXT_IDNDEX));//判断附加费用-机场服务费-文本是否正确
		assertEquals("其它费用",checkBill.costName2Text(OTHER_INDEX,TEXT_IDNDEX));//判断附加费用-其它费用-文本是否正确
		
		assertTrue(checkBill.chargeCommitExist());//判断确认按钮是否存在
		

		System.out.println("输入其它费用....");
		checkBill.costValueSetText2(OTHER_INDEX,TEXT_INPUT_IDNDEX, "1");
		System.out.println("其它费用输入框内的值为："+checkBill.costValue2Text(OTHER_INDEX,TEXT_IDNDEX));
		assertTrue(checkBill.costName2Exist(OTHER_AMOUNT_REMARK,TEXT_IDNDEX));//判断附加费用-其它费用描述--文本是否存在
		//UiDevice.getInstance().pressBack();
		checkBill.costValueSetText2(OTHER_AMOUNT_REMARK,TEXT_INPUT_IDNDEX, "1");
		
		checkBill.chargeCommitClick();
		do{
			sleep(1000);
		}while(base.loadingImgExist());
	}
	protected void orderBalanceCase(){	
		//订单结算页面
		System.out.println("订单结算页面");
		assertTrue(orderBalance.titleExist());////判断标题栏是否存在
		assertEquals("订单结算",orderBalance.titleText());//判断标题是否为订单结算
		assertTrue(orderBalance.orderNoTextExist());//判断订单号-文本是否存在
		//assertEquals("订单号",orderBalance.orderNoText());//判断订单号文本是否正确
		assertTrue(orderBalance.orderNoExist());//判断订单号是否存在
		assertTrue(orderBalance.moneyAmountExist());//判断订单金额是否存在
		assertTrue(orderBalance.moneyYuanExist());//判断订单金额-元是否存在
		assertTrue(orderBalance.listTotalFeeExist());//判断费用明细列表是否存在
		assertTrue(orderBalance.rechargeBtnExist());//判断替用户充值按钮是否存在
		assertTrue(orderBalance.editFeeBtnExist());//判断修改附加费用按钮是否存在
		assertTrue(orderBalance.orderCommitBtnExist());//判断提交并结束按钮是否存在
		
		
		orderBalance.orderCommitBtnClick();//点击提交并结束按钮
		if(orderBalance.confirmTextExist()){
			assertEquals("确认费用信息无误并提交？",orderBalance.confirmTextText());
			orderBalance.okBtnClick();
			do{
				sleep(1000);
			}while(base.loadingImgExist());
		}
		
		
	}

}
