package testcase;

import page.LeaveListPage;
import page.LoadingImg;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * Description：
 * Date: 2016-1-6
 * @author 李怡萱
 * */
public class LeaveListCase   extends UiAutomatorTestCase{
	
	LeaveListPage leavelistpage = new LeaveListPage();
	LoadingImg loadingimg = new LoadingImg();
	int leaveAmount = 0;//初始化请假申请数量
	
	public  void testMyLeaveApplyCase() throws UiObjectNotFoundException{
				
		assertTrue(leavelistpage.titleExist());//标题存在
		assertEquals("我的请假申请", leavelistpage.titleText());
		assertTrue(leavelistpage.backBtnExist());//返回按钮存在
		assertTrue(leavelistpage.validTabExist());//进行中tab存在
		assertEquals("进行中", leavelistpage.validTabText());		
		assertTrue(leavelistpage.invalidTabExist());//过期/无效tab存在
		assertEquals("过期/无效", leavelistpage.invalidTabText());
		assertTrue(leavelistpage.addApplyBtnExist());//添加新申请按钮存在
		
		if(!leavelistpage.leaveListExist()){//无数据-提示语
			assertTrue(leavelistpage.noApplyTextExist());
			assertEquals("暂无进行中的请假申请", leavelistpage.noApplyTextText());
		}
		else{//有数据
			assertTrue(leavelistpage.applyTimeTextExist(1));//申请时间-文本
			assertEquals("申请时间", leavelistpage.applyTimeTextText(1));
			assertTrue(leavelistpage.applyTimeExist(1));//申请时间-值
				
			assertTrue(leavelistpage.applyTypeTextExist(1));//请假类型-文本
			assertEquals("请假类型", leavelistpage.applyTypeTextText(1));
			assertTrue(leavelistpage.applyTypeExist(1));//请假类型-值

			assertTrue(leavelistpage.applyClassTextExist(1));//请假班次-文本
			assertEquals("请假班次", leavelistpage.applyClassTextText(1));
			assertTrue(leavelistpage.applyClassExist(1));//请假班次-值
			//调休-有调休班次	
			if(leavelistpage.applyTypeText(1).equals("调休")){
				assertTrue(leavelistpage.offClassTextExist(1));//调休班次-文本
				assertEquals("调休班次", leavelistpage.offClassTextText(1));
				assertTrue(leavelistpage.offClassExist(1));//调休班次-值
			}
			else{
				System.out.println("请假类型是"+leavelistpage.applyTypeText(1)+"，没有调休班次。");
			}
				
			assertTrue(leavelistpage.applyStatusTextExist(1));//申请状态-文本
			assertEquals("申请状态", leavelistpage.applyStatusTextText(1));
			assertTrue(leavelistpage.applyStatusExist(1));//申请状态-值
			//待审核-有取消按钮	
			if(leavelistpage.applyStatusText(1).equals("待审核")){
				assertTrue(leavelistpage.cancelBtnExist(1));//取消按钮
				cancelApply(1);
			}
			else{
				System.out.println("申请状态是"+leavelistpage.applyStatusText(1)+"，没有取消按钮。");
			}
				
		}
		
		//过期/无效tab
		leavelistpage.invalidTabClick();
		do{
			sleep(1000);
		}while(loadingimg.loadingImgExist());
		
		
		if(!leavelistpage.leaveListExist()){//无数据-提示语
			assertTrue(leavelistpage.noApplyTextExist());
			assertEquals("暂无过期/无效的请假申请", leavelistpage.noApplyTextText());
		}
		else{//有数据
			assertTrue(leavelistpage.applyTimeTextExist(1));//申请时间-文本
			assertEquals("申请时间", leavelistpage.applyTimeTextText(1));
			assertTrue(leavelistpage.applyTimeExist(1));//申请时间-值
				
			assertTrue(leavelistpage.applyTypeTextExist(1));//请假类型-文本
			assertEquals("请假类型", leavelistpage.applyTypeTextText(1));
			assertTrue(leavelistpage.applyTypeExist(1));//请假类型-值

			assertTrue(leavelistpage.applyClassTextExist(1));//请假班次-文本
			assertEquals("请假班次", leavelistpage.applyClassTextText(1));
			assertTrue(leavelistpage.applyClassExist(1));//请假班次-值
			
			//调休-有调休班次
			if(leavelistpage.applyTypeText(1).equals("调休")){
				assertTrue(leavelistpage.offClassTextExist(1));//调休班次-文本
				assertEquals("调休班次", leavelistpage.offClassTextText(1));
				assertTrue(leavelistpage.offClassExist(1));//调休班次-值
			}
			else{
				System.out.println("请假类型是"+leavelistpage.applyTypeText(1)+"，没有调休班次。");
			}
			
			assertTrue(leavelistpage.applyStatusTextExist(1));//申请状态-文本
			assertEquals("申请状态", leavelistpage.applyStatusTextText(1));
			assertTrue(leavelistpage.applyStatusExist(1));//申请状态-值
			
			//已取消-有审批意见
			if(leavelistpage.applyStatusTextText(1).equals("已取消")){
				assertTrue(leavelistpage.opinionTextExist(1));//审批意见-文本
				assertEquals("审批意见", leavelistpage.opinionTextText(1));
				assertTrue(leavelistpage.opinionExist(1));//审批意见-值
				assertEquals("司机本人申请取消", leavelistpage.opinionText(1));
				
			}
		
		}
		
	}
	private void cancelApply(int index) {
		
		leavelistpage.cancelBtnClick(index);
		assertTrue(leavelistpage.winExist());//弹窗存在
		assertTrue(leavelistpage.confirmTextExist());//提示文字存在
		assertEquals("确定撤销该条申请？", leavelistpage.confirmTextText());
		assertTrue(leavelistpage.closeBtnExist());//取消按钮存在
		assertTrue(leavelistpage.okBtnExist());//确定按钮存在
		leavelistpage.closeBtnClick();
		sleep(1000);
		
		leavelistpage.cancelBtnClick(index);
		assertTrue(leavelistpage.winExist());//弹窗存在
		assertTrue(leavelistpage.confirmTextExist());//提示文字存在
		assertEquals("确定撤销该条申请？", leavelistpage.confirmTextText());
		assertTrue(leavelistpage.closeBtnExist());//取消按钮存在
		assertTrue(leavelistpage.okBtnExist());//确定按钮存在
		leavelistpage.okBtnClick();
		sleep(1000);
	}	
	public  void testNewApplyCase() throws UiObjectNotFoundException{
		
		leavelistpage.addApplyBtnClick();
	}
		
}
