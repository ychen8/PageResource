package testcase;

import page.MainPage;
import page.NoticeListPage;
import page.OrderListPage;
import page.DrawerPage;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * Description：
 * Date: 2015-12-28
 * @author 李怡萱
 * */
public class MainPageCase extends UiAutomatorTestCase{
	
	MainPage mainpage = new MainPage();
	OrderListPage orderlistpage = new OrderListPage();
	DrawerPage drawerpage = new DrawerPage();
	NoticeListPage noticelistpage = new NoticeListPage();
	
	//首页UI
	public void testMainPageUI() throws UiObjectNotFoundException{				
		System.out.print("测试首页UI");		
		assertTrue(mainpage.msgExist());//判断消息控件是否存在
//		assertTrue(mainpage.msgCountExist());//判断消息数控件是否存在
		assertTrue(mainpage.testEnvExist());//判断测试环境控件是否存在
		assertTrue(mainpage.titleExist());//判断标题是否存在
		assertTrue(mainpage.personBtnExist());//判断抽屉按钮是否存在
		assertTrue(mainpage.responseRateExist());//判断响应率是否存在
		assertTrue(mainpage.workTimeExist());//判断工作时长是否存在
		assertTrue(mainpage.finishOrderCountExist());//判断完成单量是否存在
		assertTrue(mainpage.turnoverAmountExist());//判断计奖营业额是否存在
		assertTrue(mainpage.rechargeAmountExist());//判断代充金额是否存在
		assertTrue(mainpage.myOrderExist());//判断我的订单是否存在
		assertTrue(mainpage.stateBtnExist());//判断当前工作状态是否存在
		assertFalse(mainpage.setBtnExist());//判断接单设置是否存在
		assertTrue(mainpage.changeBtnExist());//判断切换状态是否存在
//		assertTrue(mainpage.unFinishCountExist());//判断未完成订单数是否存在
			
	}
//	//消息数为1
//	public void testMsgCount1() throws UiObjectNotFoundException{		
//		assertEquals("1", mainpage.msgCountText());		
//	}
//	//消息数为99
//	public void testMsgCount99() throws UiObjectNotFoundException{		
//		assertEquals("99", mainpage.msgCountText());		
//	}
	//未完成订单
	public void testMainPageOrder() throws UiObjectNotFoundException{
		System.out.print("测试首页订单");		
		
		if(mainpage.myOrderText() == "未完成订单"){
			assertTrue(mainpage.orderTypeExist());//判断订单类型是否存在
			assertTrue(mainpage.flightNoExist());//判断航班号是否存在
			assertTrue(mainpage.orderStatusExist());//判断订单状态是否存在
			assertTrue(mainpage.useDateExist());//判断用车时间是否存在
			assertTrue(mainpage.changeOrderBtnExist());//判断改派按钮是否存在
			assertTrue(mainpage.upLocationExist());//判断上车地点是否存在	
		}
		else{
			assertEquals("我的订单", mainpage.myOrderText());
		}
		
	}
	//首页-链接至订单列表页
	public void testOrderListPage() throws UiObjectNotFoundException{
		System.out.print("测试订单列表页");		
		
		mainpage.myOrderClick();
		
		assertTrue(orderlistpage.titleExist());//判断标题栏是否存在
		assertEquals("近三月订单", orderlistpage.titleText());//标题栏内容为近三月订单
		assertTrue(orderlistpage.backBtnExist());//判断返回按钮是否存在
		assertTrue(orderlistpage.queryBtnExist());//判断查询按钮是否存在
		assertTrue(orderlistpage.notFinishedTabExist());//判断未完成tab是否存在
		assertEquals("未完成", orderlistpage.notFinishedTabText());//未完成text
		assertTrue(orderlistpage.finishedTabExist());//判断已完成tab是否存在
		assertEquals("已完成", orderlistpage.finishedTabText());//已完成text
		assertTrue(orderlistpage.orderListExist());//判断订单是否存在
		
		for(int i=0 ; i<orderlistpage.getorderAmount(); i++){
			assertTrue(orderlistpage.orderTypeExist(i));//判断订单类型是否存在
//			assertTrue(orderlistpage.flightnoExist(i));//判断航班号是否存在
			assertTrue(orderlistpage.orderPriceExist(i));//判断订单金额是否存在
			assertTrue(orderlistpage.orderStateExist(i));//判断订单状态是否存在
			assertTrue(orderlistpage.ordernoExist(i));//判断订单号是否存在
			assertTrue(orderlistpage.orderDateExist(i));//判断订单日期是否存在
//			assertTrue(orderlistpage.changeOrderBtnExist(i));//判断改派按钮是否存在
			assertTrue(orderlistpage.upLocExist(i));//判断上车地点是否存在
			assertTrue(orderlistpage.upLocDetailExist(i));//判断上车地点详情是否存在
			assertTrue(orderlistpage.downLocExist(i));//判断下车地点是否存在
			assertTrue(orderlistpage.downLocDetailExist(i));//判断下车地点详情是否存在	
		}
		
		orderlistpage.backBtnClick();//返回首页
	}
	//首页-抽屉页
	public void testDrawerPage() throws UiObjectNotFoundException{
		System.out.print("测试抽屉页");		
		
		mainpage.personBtnClick();
		
		assertTrue(drawerpage.driverNameExist());//判断司机姓名是否存在
		assertTrue(drawerpage.vhicleNumExist());//判断车牌号是否存在
		assertTrue(drawerpage.classesExist());//判断今日排班是否存在
		assertTrue(drawerpage.myOrderExist());//判断我的订单是否存在
		assertEquals("我的订单", drawerpage.myOrderText());
		assertTrue(drawerpage.myPerformanceExist());//判断我的绩效是否存在
		assertEquals("我的绩效", drawerpage.myPerformanceText());
		assertTrue(drawerpage.myWalletExist());//判断我的钱包是否存在
		assertEquals("我的钱包", drawerpage.myWalletText());
		assertTrue(drawerpage.rankExist());//判断排行榜是否存在
		assertEquals("排行榜", drawerpage.rankText());
		assertTrue(drawerpage.settingExist());//判断设置是否存在
		assertEquals("设置", drawerpage.settingText());
		assertTrue(drawerpage.driverDistributionExist());//判断司机分布是否存在
		assertEquals("司机分布", drawerpage.driverDistributionText());
		assertTrue(drawerpage.customServiceExist());//判断联系客服是否存在
		
		mainpage.myOrderClick(); //返回首页

	}
	//首页-消息列表
	public void testMsgListPage() throws UiObjectNotFoundException{
		System.out.print("测试消息列表页");		
		
		mainpage.msgClick();
		
		assertTrue(noticelistpage.noticeListTitleExist());//判断标题栏是否存在
		assertTrue(noticelistpage.backBtnExist());
		assertEquals("消息通知", noticelistpage.noticeListTitleTxt());
		for(int i=1 ; i<noticelistpage.noticeAmount(); i++){
			assertTrue(noticelistpage.noticeTitleExist(i));//判断消息标题是否存在
			assertTrue(noticelistpage.noticeTimeExist(i));//判断消息时间是否存在
			assertTrue(noticelistpage.noticeContentExist(i));//判断消息内容是否存在
		}

		noticelistpage.backBtnClick();//返回首页
	}
	
		

}
