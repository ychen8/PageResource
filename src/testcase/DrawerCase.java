package testcase;

import page.DrawerPage;
import page.OrderListPage;
import page.PerformancePage;
import page.PersonManagePage;
import page.RankListPage;
import page.PersonSetPage;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * Description：
 * Date: 2016-1-4
 * @author 李怡萱
 * */
public class DrawerCase extends UiAutomatorTestCase{
	
	DrawerPage drawerpage = new DrawerPage();
	PersonManagePage personmanagepage = new PersonManagePage();
	OrderListPage orderlistpage = new OrderListPage();
	PerformancePage performancepage = new PerformancePage();
	RankListPage ranklistpage = new RankListPage();
	PersonSetPage personsetpage = new PersonSetPage();
	public void testDrawerPage() throws UiObjectNotFoundException{
				
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
		
	}
	//抽屉页-个人管理
	public void testPersonManage() throws UiObjectNotFoundException{
		
		drawerpage.driverNameClick();
		sleep(1000);
		
		assertTrue(personmanagepage.titleExist());//判断标题是否存在
		assertEquals("个人管理", personmanagepage.titleText());
		assertTrue(personmanagepage.returnExist());//判断返回按钮是否存在
		assertTrue(personmanagepage.llBaseInfoExist());//判断查看基本信息栏是否存在
		assertTrue(personmanagepage.baseInfoExist());//判断查看基本信息是否存在
		assertEquals("查看基本信息", personmanagepage.baseInfoText());
		assertTrue(personmanagepage.driverNameExist());//判断司机姓名是否存在
		assertTrue(personmanagepage.llPrivatePhoneExist());//判断私人电话栏是否存在
		assertTrue(personmanagepage.privatePhoneExist());//判断私人电话是否存在
		assertEquals("私人电话", personmanagepage.privatePhoneText());
		assertTrue(personmanagepage.txtPrivatePhoneExist());//判断私人电话值是否存在
		assertTrue(personmanagepage.familyAddrExist());//判断家庭地址是否存在
//		assertEquals("家庭地址", personmanagepage.familyAddrText());
		assertTrue(personmanagepage.txtFamilyAddrExist());//判断家庭地址值是否存在
		assertTrue(personmanagepage.transClassAddrExist());//判断交班地址是否存在
//		assertEquals("交班地址", personmanagepage.transClassAddrText());
		assertTrue(personmanagepage.txtTransClassAddrExist());//判断交班地址值是否存在
		assertTrue(personmanagepage.txtMonthClassExist());//判断本月排班表是否存在
//		assertEquals("本月排班表", personmanagepage.txtMonthClassText());
		assertTrue(personmanagepage.txtMyLeaveExist());//判断我的请假申请是否存在
//		assertEquals("我的请假申请", personmanagepage.txtMyLeaveText());
		
		personmanagepage.returnClick();
		sleep(1000);
			
	}
	//抽屉页-我的订单
	public void testOrderList() throws UiObjectNotFoundException{
		
		drawerpage.myOrderClick();
		sleep(1000);
		
		assertTrue(orderlistpage.titleExist());//判断标题是否存在
		assertEquals("近三月订单", orderlistpage.titleText());
		assertTrue(orderlistpage.backBtnExist());//判断返回按钮是否存在
		assertTrue(orderlistpage.queryBtnExist());//判断查询按钮是否存在
		assertTrue(orderlistpage.notFinishedTabExist());//判断未完成tab是否存在
		assertEquals("未完成", orderlistpage.notFinishedTabText());
		assertTrue(orderlistpage.finishedTabExist());//判断已完成tab是否存在
		assertEquals("已完成", orderlistpage.finishedTabText());
		
		if(orderlistpage.orderListExist()){//有订单
			for(int i=1;i<=orderlistpage.getorderAmount();i++){
				assertTrue(orderlistpage.orderTypeExist(i));//订单类型
				assertTrue(orderlistpage.flightnoExist(i));//航班号
				assertTrue(orderlistpage.orderPriceExist(i));//订单金额
				assertTrue(orderlistpage.orderStateExist(i));//订单状态
				assertTrue(orderlistpage.ordernoExist(i));//订单号
				assertTrue(orderlistpage.orderDateExist(i));//订单日期
				assertTrue(orderlistpage.changeOrderBtnExist(i));//改派按钮
				assertTrue(orderlistpage.upLocExist(i));//上车地点
				assertTrue(orderlistpage.upLocDetailExist(i));//上车地点详情
				assertTrue(orderlistpage.downLocExist(i));//下车地点
				assertTrue(orderlistpage.downLocDetailExist(i));//下车地点详情		
			}
		}
		else{
			assertTrue(orderlistpage.noOrderText1Exist());//判断无订单提示语是否存在	
		}
		
		orderlistpage.backBtnClick();
		sleep(1000);
		
	}
	//抽屉页-我的绩效
	public void testMyPerformance() throws UiObjectNotFoundException{
		
		drawerpage.myPerformanceClick();
		sleep(1000);
		
		assertTrue(performancepage.titleExist());//判断标题是否存在
		assertEquals("本月绩效", performancepage.titleText());
		assertTrue(performancepage.returnExist());//判断返回按钮是否存在
		
//		assertTrue(performancepage.rlWorkTimeExist());//判断平均工作时长栏是否存在
//		assertTrue(performancepage.workTimeExist());//判断平均工作时长是否存在
//		assertEquals("平均工作时长", performancepage.workTimeText());
//		assertTrue(performancepage.workTimeValueExist());//判断平均工作时长的值是否存在
//		
//		assertTrue(performancepage.rlWorkDaysExist());//判断工作天数栏是否存在
//		assertTrue(performancepage.workDaysExist());//判断工作天数是否存在
//		assertEquals("工作天数", performancepage.workDaysText());
//		assertTrue(performancepage.workDaysValueExist());//判断工作天数的值是否存在
//		assertTrue(performancepage.wholeDaysValueExist());//判断应出勤天数的值是否存在
//		
//		assertTrue(performancepage.rlRspRateExist());//判断响应率栏是否存在
//		assertTrue(performancepage.rspRateExist());//判断响应率是否存在
//		assertEquals("响应率", performancepage.rspRateText());
//		assertTrue(performancepage.rspRateValueExist());//判断响应率的值是否存在
//		
//		assertTrue(performancepage.rlSvcScoreExist());//判断服务评分栏是否存在
//		assertTrue(performancepage.svcScoreExist());//判断服务评分是否存在
//		assertEquals("服务评分", performancepage.svcScoreText());
//		assertTrue(performancepage.svcScoreValueExist());//判断服务评分的值是否存在
//
//		assertTrue(performancepage.llOrderQuantityExist());//判断订单量栏是否存在
//		assertTrue(performancepage.orderQuantityExist());//判断订单量是否存在
//		assertEquals("订单量", performancepage.orderQuantityText());
//		assertTrue(performancepage.orderQuantityValueExist());//判断订单量的值是否存在
//		
//		assertTrue(performancepage.llRechargeAmountExist());//判断客户充值额栏是否存在
//		assertTrue(performancepage.rechargeAmountExist());//判断客户充值额是否存在
//		assertEquals("客户充值额", performancepage.rechargeAmountText());
//		assertTrue(performancepage.rechargeAmountValueExist());//判断客户充值额的值是否存在
//
//		assertTrue(performancepage.llTurnoverExist());//判断计奖营业额栏是否存在
//		assertTrue(performancepage.turnoverExist());//判断计奖营业额是否存在
//		assertEquals("计奖营业额", performancepage.turnoverText());
//		assertTrue(performancepage.turnoverValueExist());//判断计奖营业额的值是否存在
		
		performancepage.returnClick();
		sleep(1000);
		
	}
	//抽屉页-我的钱包
	public void testMyWallet() throws UiObjectNotFoundException{
		
	}
	//抽屉页-排行榜
	public void testRank() throws UiObjectNotFoundException{
		
		drawerpage.rankClick();
		sleep(1000);
		
		assertTrue(ranklistpage.titleExist());//判断标题是否存在
		assertEquals("排行榜", ranklistpage.titleText());
		assertTrue(ranklistpage.returnExist());//判断返回按钮是否存在
		assertTrue(ranklistpage.llRechargeAmountExist());//判断充值金额栏是否存在
		assertTrue(ranklistpage.rechargeAmountExist());//判断充值金额是否存在
//		assertEquals("充值金额", ranklistpage.rechargeAmountText());
		
		assertTrue(ranklistpage.llFinishOrderExist());//判断完成订单栏是否存在
		assertTrue(ranklistpage.finishOrderExist());//判断完成订单是否存在
//		assertEquals("完成订单", ranklistpage.finishOrderText());
		
		ranklistpage.returnClick();	
		sleep(1000);
		
	}
	//抽屉页-设置
	public void testSetting() throws UiObjectNotFoundException{
		
		drawerpage.settingClick();
		sleep(1000);
		
		assertTrue(personsetpage.titleExist());//判断标题是否存在
		assertEquals("设置", personsetpage.titleText());
		assertTrue(personsetpage.returnExist());//判断返回按钮是否存在
		
		assertTrue(personsetpage.llModifyPassExist());//判断修改密码是否存在
		assertTrue(personsetpage.modifyPassExist());//判断修改密码文本是否存在
		assertEquals("修改密码", personsetpage.modifyPassText());
		
		assertTrue(personsetpage.llOffLineExist());//判断导航下载是否存在
		assertTrue(personsetpage.offLineExist());//判断导航下载文本是否存在
		assertEquals("导航下载", personsetpage.offLineText());
		
		assertTrue(personsetpage.llFeedbackeExist());//判断意见反馈是否存在
		assertTrue(personsetpage.feedbackExist());//判断意见反馈文本是否存在
		assertEquals("意见反馈", personsetpage.feedbackText());
		
		assertTrue(personsetpage.llUseGuidExist());//判断使用指南是否存在
		assertTrue(personsetpage.useGuidExist());//判断使用指南文本是否存在
		assertEquals("使用指南", personsetpage.useGuidText());
		
		assertTrue(personsetpage.llCheckUpdateExist());//判断检测新版本栏是否存在
		assertTrue(personsetpage.checkUpdateExist());//判断检测新版本文本是否存在
		assertEquals("检测新版本", personsetpage.checkUpdateText());
		assertTrue(personsetpage.checkUpdateValueExist());//判断检测新版本值是否存在
		if(personsetpage.checkUpdateValueText().equals("检测到新版本")){
			assertTrue(personsetpage.llCheckUpdateClickable());
		}
		else if(personsetpage.checkUpdateValueText().equals("已是最新版本")){

			assertFalse(personsetpage.llCheckUpdateClickable());
		}
		else{
			System.out.print(personsetpage.checkUpdateValueText());
		}
		personsetpage.returnClick();
		sleep(1000);
		
	}
			
	
}
