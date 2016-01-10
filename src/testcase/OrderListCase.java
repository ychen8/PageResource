package testcase;

import java.util.Calendar;

import page.LoadingImg;
import page.OrderDetailPage;
import page.OrderListPage;
import page.OrderQueryPage;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * Description：
 * Date: 2016-1-10
 * @author 李怡萱
 * */
public class OrderListCase  extends UiAutomatorTestCase{
	
	OrderListPage orderlistpage = new OrderListPage();
	LoadingImg loadingimg = new LoadingImg();
	OrderQueryPage orderquerypage = new OrderQueryPage();
	OrderDetailPage orderdetailpage = new OrderDetailPage();
	
	//订单列表UI
	public void testOrderList() throws UiObjectNotFoundException{
		
		
		assertTrue(orderlistpage.titleExist());//判断标题是否存在
		assertEquals("近三月订单", orderlistpage.titleText());
		assertTrue(orderlistpage.backBtnExist());//判断返回按钮是否存在
		assertTrue(orderlistpage.queryBtnExist());//判断查询按钮是否存在
		assertTrue(orderlistpage.notFinishedTabExist());//判断未完成tab是否存在
		assertEquals("未完成", orderlistpage.notFinishedTabText());
		assertTrue(orderlistpage.finishedTabExist());//判断已完成tab是否存在
		assertEquals("已完成", orderlistpage.finishedTabText());
		
		checkOrderList();
		
		//已完成tab
		orderlistpage.finishedTabClick();
		do{sleep(1000);}while(loadingimg.loadingImgExist());
		
		assertTrue(orderlistpage.titleExist());//判断标题是否存在
		assertEquals("近三月订单", orderlistpage.titleText());
		assertTrue(orderlistpage.backBtnExist());//判断返回按钮是否存在
		assertTrue(orderlistpage.queryBtnExist());//判断查询按钮是否存在
		assertTrue(orderlistpage.notFinishedTabExist());//判断未完成tab是否存在
		assertEquals("未完成", orderlistpage.notFinishedTabText());
		assertTrue(orderlistpage.finishedTabExist());//判断已完成tab是否存在
		assertEquals("已完成", orderlistpage.finishedTabText());
		
		checkOrderList();
				
	}
	
	//查询
	public void testQueryOrder() throws UiObjectNotFoundException{
		
		orderlistpage.queryBtnClick();
		sleep(1000);
		
		assertTrue(orderquerypage.titleExist());//标题存在
		assertEquals("选择日期", orderquerypage.titleText());
		assertTrue(orderquerypage.backBtnExist());//返回按钮存在
		
		assertTrue(orderquerypage.validTabExist());//按日查询tab存在
		assertEquals("按日查询", orderquerypage.validTabText());
		assertTrue(orderquerypage.invalidTabExist());//按月查询tab存在
		assertEquals("按月查询", orderquerypage.invalidTabText());
		
		assertTrue(orderquerypage.preMonthBtnExist());//上月按钮存在
		assertTrue(orderquerypage.sundayExist());//周日存在
		assertEquals("周日", orderquerypage.sundayText());
		assertTrue(orderquerypage.mondayExist());//周一存在
		assertEquals("周一", orderquerypage.mondayText());
		assertTrue(orderquerypage.tuesdayExist());//周二存在
		assertEquals("周二", orderquerypage.tuesdayText());
		assertTrue(orderquerypage.wednesdayExist());//周三存在
		assertEquals("周三", orderquerypage.wednesdayText());
		assertTrue(orderquerypage.thursdayExist());//周四存在
		assertEquals("周四", orderquerypage.thursdayText());
		assertTrue(orderquerypage.fridayExist());//周五存在
		assertEquals("周五", orderquerypage.fridayText());
		assertTrue(orderquerypage.saturdayExist());//周六存在
		assertEquals("周六", orderquerypage.saturdayText());
		
		assertTrue(orderquerypage.queryBtnExist());//查询按钮存在
		
		Calendar cal = Calendar.getInstance();
	    int day = cal.get(Calendar.DATE);
	    int month = cal.get(Calendar.MONTH) + 1;
	    int year = cal.get(Calendar.YEAR);
	    System.out.println("今天是"+year+"年"+month+"月"+day+"日");
	    
	    assertTrue(orderquerypage.monthNameExist());//月份存在
	    assertEquals(year+"年"+month+"月", orderquerypage.monthNameText());
	    //查询今天的订单
	    orderquerypage.queryBtnClick();
	    do{sleep(1000);}while(loadingimg.loadingImgExist());
	    
	    assertTrue(orderquerypage.titleExist());//标题存在
	    assertEquals(year+"年"+month+"月"+day+"日", orderquerypage.titleText());
	    
	    checkOrderList();
	    
	    //返回查询
	    orderquerypage.backBtnClick();
	    do{sleep(1000);}while(loadingimg.loadingImgExist());
	    //按月查询
	    orderquerypage.invalidTabClick();
	    sleep(1000);
	    
	    assertTrue(orderquerypage.titleExist());//标题存在
		assertEquals("选择日期", orderquerypage.titleText());
		assertTrue(orderquerypage.backBtnExist());//返回按钮存在
		
		assertTrue(orderquerypage.validTabExist());//按日查询tab存在
		assertEquals("按日查询", orderquerypage.validTabText());
		assertTrue(orderquerypage.invalidTabExist());//按月查询tab存在
		assertEquals("按月查询", orderquerypage.invalidTabText());
		assertTrue(orderquerypage.queryBtnExist());//查询按钮存在
		
		assertTrue(orderquerypage.yearNameExist());//年份存在
	    assertEquals(year+"年", orderquerypage.yearNameText());
	    
	    //查询本月的订单
	    orderquerypage.queryBtnClick();
	    do{sleep(1000);}while(loadingimg.loadingImgExist());
	    
	    assertTrue(orderquerypage.titleExist());//标题存在
	    assertEquals(year+"年"+month+"月", orderquerypage.titleText());
	    
	    checkOrderList();
	    
	}
	
	private void checkOrderList() {
		
		if(orderlistpage.orderListExist()){//有订单
			assertTrue(orderlistpage.orderTypeExist(1));//订单类型
		//	assertTrue(orderlistpage.flightnoExist(1));//航班号
			assertTrue(orderlistpage.orderPriceExist(1));//订单金额
			assertTrue(orderlistpage.orderStateExist(1));//订单状态
			assertTrue(orderlistpage.ordernoExist(1));//订单号
			assertTrue(orderlistpage.orderDateExist(1));//订单日期
		//	assertTrue(orderlistpage.changeOrderBtnExist(1));//改派按钮
			assertTrue(orderlistpage.upLocExist(1));//上车地点
			assertTrue(orderlistpage.upLocDetailExist(1));//上车地点详情
			assertTrue(orderlistpage.downLocExist(1));//下车地点
			assertTrue(orderlistpage.downLocDetailExist(1));//下车地点详情		
		}
		else{
			assertTrue(orderlistpage.noOrderText1Exist());//判断无订单提示语是否存在	
		}
		
	}
	
	//跳转订单详情
	public void testOrderDetail() throws UiObjectNotFoundException{
		
		if(orderlistpage.orderListExist()){
			String state = orderlistpage.orderStateText(1);
			if(state.equals("已提交费用")||state.equals("已取消")||state.equals("已完成")){
				orderlistpage.orderClick(1);
				do{sleep(1000);}while(loadingimg.loadingImgExist());
				assertTrue(orderdetailpage.titleExist());//标题存在
				assertEquals("订单详情", orderdetailpage.titleText());//标题为订单详情
			}
			else{
				orderlistpage.orderClick(1);
				do{sleep(1000);}while(loadingimg.loadingImgExist());
				System.out.println("订单状态为"+state+"，订单详情页标题为"+orderdetailpage.titleText());
			}
		}
		else{
			System.out.println("没有订单，无法测试订单详情");
		}
	}
}
