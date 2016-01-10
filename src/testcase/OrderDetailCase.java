package testcase;

import page.ChargeDetailPage;
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
public class OrderDetailCase   extends UiAutomatorTestCase{
	
	OrderListPage orderlistpage = new OrderListPage();
	LoadingImg loadingimg = new LoadingImg();
	OrderDetailPage orderdetailpage = new OrderDetailPage();
	ChargeDetailPage chargedetailpage = new ChargeDetailPage();
	SerOrderCase serordercase = new SerOrderCase();
	RechargeCase rechargecase = new RechargeCase();
	
	String payState = "";//支付状态
	String money = "";
	String orderNo = "";//订单号
	String orderType = "";//订单类型
	String orderTime = "";//订单时间
	String orderUpLoc = "";//订单上车地点
	String orderUpLocDetail = "";//订单上车地点详情
	String orderDownLoc = "";//订单下车地点
	String orderDownLocDetail = "";//订单下车地点详情
	
	//订单详情
	public void testOrderDetail() throws UiObjectNotFoundException{
		
		if(orderlistpage.orderListExist()){//有订单
			
			String state = orderlistpage.orderStateText(1);//订单状态
			orderNo = orderlistpage.ordernoText(1);//订单号
			orderType = orderlistpage.orderTypeText(1);//订单类型
			orderTime = orderlistpage.orderDateText(1);//订单时间
			orderUpLoc = orderlistpage.upLocText(1);//订单上车地点
			orderUpLocDetail = orderlistpage.upLocDetailText(1);//订单上车地点详情
			orderDownLoc = orderlistpage.downLocText(1);//订单下车地点
			orderDownLocDetail = orderlistpage.downLocDetailText(1);//订单下车地点详情
			
			if(state.equals("已提交费用")){

				orderlistpage.orderClick(1);
				do{sleep(1000);}while(loadingimg.loadingImgExist());
				
				assertTrue(orderdetailpage.moneyDetailExist());//支付状态存在
				assertTrue(orderdetailpage.passengerCallBtnExist());//乘车人电话按钮存在
				assertTrue(orderdetailpage.reserverCallBtnExist());//订车人电话按钮存在
				assertTrue(orderdetailpage.rechargeBtnExist());//充值按钮
				assertTrue(orderdetailpage.downTimeExist());//下车时间存在
				
				//充值
				orderdetailpage.rechargeBtnClick();
				sleep(1000);
				rechargecase.testRechare();
				
				//乘车人电话
				orderdetailpage.passengerCallBtnClick();
				assertTrue(orderdetailpage.winExist());//弹窗存在
				assertTrue(orderdetailpage.confirmTextExist());//提示文字存在
				assertEquals("是否拨打电话?",orderdetailpage.confirmTextText());
				assertTrue(orderdetailpage.closeBtnExist());//取消按钮存在
				assertTrue(orderdetailpage.okBtnExist());//确定按钮存在
				
				orderdetailpage.closeBtnClick();
				assertFalse(orderdetailpage.winExist());//弹窗消失
				assertEquals("订单详情", orderdetailpage.titleText());//标题为订单详情
				
//				orderdetailpage.passengerCallBtnClick();
//				orderdetailpage.okBtnClick();
				
				//订车人电话
				orderdetailpage.reserverCallBtnClick();
				assertTrue(orderdetailpage.winExist());//弹窗存在
				assertTrue(orderdetailpage.confirmTextExist());//提示文字存在
				assertEquals("是否拨打电话?",orderdetailpage.confirmTextText());
				assertTrue(orderdetailpage.closeBtnExist());//取消按钮存在
				assertTrue(orderdetailpage.okBtnExist());//确定按钮存在
				
				orderdetailpage.closeBtnClick();
				assertFalse(orderdetailpage.winExist());//弹窗消失
				assertEquals("订单详情", orderdetailpage.titleText());//标题为订单详情
				
//				orderdetailpage.reserverCallBtnClick();
//				orderdetailpage.okBtnClick();
				
				sameDetail();
				
				//费用明细
				payState = orderdetailpage.moneyDetailText();
				money = orderdetailpage.orderMoneyValueText();
				checkPayDetail();
				
			}else if(state.equals("已取消")){
				
				orderlistpage.orderClick(1);
				do{sleep(1000);}while(loadingimg.loadingImgExist());
				
				sameDetail();
				
				//费用明细
				if(orderdetailpage.moneyDetailExist()){
					payState = orderdetailpage.moneyDetailText();
					money = orderdetailpage.orderMoneyValueText();
					checkPayDetail();
				}else{
					System.out.println("已取消订单，没有支付状态，订单金额为："+orderdetailpage.orderMoneyValueText());
				}
				
			}else if(state.equals("已完成")){
				
				orderlistpage.orderClick(1);
				do{sleep(1000);}while(loadingimg.loadingImgExist());
				
				sameDetail();
				
				//费用明细
				payState = orderdetailpage.moneyDetailText();
				money = orderdetailpage.orderMoneyValueText();
				checkPayDetail();
				
			}else if(state.equals("待服务")){
				serordercase.pickClientCase();				
			}else if(state.equals("已出发")){
				serordercase.arriveCase();
			}else if(state.equals("已到达")){
				serordercase.WaitSetOutCase();
			}else if(state.equals("已开始服务")){
				serordercase.startServiceCase();
			}else if(state.equals("已结束服务")){
				serordercase.checkBillCase();
				serordercase.orderBalanceCase();
			}else{
				System.out.println("订单状态为："+state+"，没有匹配到对应的case");
			}
		}else{
			System.out.println("没有订单，无法测试订单详情");
		}
	}
	
	//已提交费用/已取消/已完成订单详情-共同部分
	private void sameDetail() {
		assertTrue(orderdetailpage.titleExist());//标题存在
		assertEquals("订单详情", orderdetailpage.titleText());//标题为订单详情
		assertTrue(orderdetailpage.backBtnExist());//返回按钮存在
		assertTrue(orderdetailpage.layoutExist());//订单金额栏存在
		assertTrue(orderdetailpage.orderMoneyTextExist());//订单金额-文本存在
		assertEquals("订单金额", orderdetailpage.orderMoneyTextText());
		assertTrue(orderdetailpage.orderMoneyValueExist());//订单金额存在
		assertTrue(orderdetailpage.yuanExist());//元-文本存在
		assertEquals("元", orderdetailpage.yuanText());
		
		assertTrue(orderdetailpage.orderNoTextExist());//订单号-文本存在
		assertTrue(orderdetailpage.orderNoExist());//订单号存在
		assertEquals(orderNo, orderdetailpage.orderNoText());
		assertTrue(orderdetailpage.orderTypeExist());//订单类型存在
		assertEquals("("+orderType+")", orderdetailpage.orderTypeText());
		assertTrue(orderdetailpage.upTimeTextExist());//上车时间-文本存在
		assertTrue(orderdetailpage.upTimeExist());//上车时间存在
		assertEquals(orderTime, orderdetailpage.upTimeText());
		assertTrue(orderdetailpage.downTimeTextExist());//下车时间-文本存在
		
		assertTrue(orderdetailpage.passengerNameTextExist());//乘车人-文本存在
		assertTrue(orderdetailpage.passengerNameExist());//乘车人姓名存在

		assertTrue(orderdetailpage.reserverNameTextExist());//订车人-文本存在
		assertTrue(orderdetailpage.reserverNameExist());//订车人姓名存在
		
		assertTrue(orderdetailpage.upLocTextExist());//上车地点-文本存在
		assertTrue(orderdetailpage.upLocExist());//上车地点存在
		assertEquals(orderUpLoc, orderdetailpage.upLocText());
		assertTrue(orderdetailpage.upLocDetailExist());//上车地点详情存在
		assertEquals(orderUpLocDetail, orderdetailpage.upLocDetailText());
		
		assertTrue(orderdetailpage.downLocTextExist());//下车地点-文本存在
		assertTrue(orderdetailpage.downLocExist());//下车地点存在
		assertEquals(orderDownLoc, orderdetailpage.downLocText());
		assertTrue(orderdetailpage.downLocDetailExist());//下车地点详情存在
		assertEquals(orderDownLocDetail, orderdetailpage.downLocDetailText());
		
				
	}
	
	//收费明细页
	private void checkPayDetail() {
		orderdetailpage.moneyDetailClick();
		do{sleep(1000);}while(loadingimg.loadingImgExist());
		
		assertTrue(chargedetailpage.titleExist());//标题存在
		assertEquals("收费明细", chargedetailpage.titleText());
		assertTrue(chargedetailpage.backBtnExist());//返回按钮存在
		assertTrue(chargedetailpage.payStatusTextExist());//支付状态-文本存在
		assertEquals("支付状态", chargedetailpage.payStatusTextText());
		assertTrue(chargedetailpage.payStatusExist());//支付状态存在
		assertEquals(payState, chargedetailpage.payStatusText());
		
		assertTrue(chargedetailpage.moneyAmountExist());//总金额存在
		assertEquals(money, chargedetailpage.moneyAmountText());
		
		assertTrue(chargedetailpage.yuanExist());//元-文本存在
		assertEquals("元", chargedetailpage.yuanText());
		
		assertTrue(chargedetailpage.costListExist());//明细列表存在
		int costItemAmount = chargedetailpage.costItemCount();
		for(int i=0;i<costItemAmount;i=i+2){
			assertTrue(chargedetailpage.costNameExist(i));//费用项名称存在
			assertTrue(chargedetailpage.costValueExist(i+1));//费用项数值存在
			String name = chargedetailpage.costNameText(i);
			String value = chargedetailpage.costValueText(i+1);
			System.out.println(name+"---"+value);	
		}		
	}
}
