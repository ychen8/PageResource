package testcase;

import page.LeaveListPage;
import page.LoadingImg;
import page.NewLeaveApplyPage;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * Description：
 * Date: 2016-1-6
 * @author 李怡萱
 * */
public class LeaveListCase   extends UiAutomatorTestCase{
	
	NewLeaveApplyPage newleaveapplypage = new NewLeaveApplyPage();
	LeaveListPage leavelistpage = new LeaveListPage();
	LoadingImg loadingimg = new LoadingImg();
	int leaveAmount = 0;//初始化请假申请数量
	
	//我的请假申请
	public  void testMyLeaveApplyCase() throws UiObjectNotFoundException{
			
		assertTrue(leavelistpage.titleExist());//标题存在
		assertEquals("我的请假申请", leavelistpage.titleText());
		assertTrue(leavelistpage.backBtnExist());//返回按钮存在
		assertTrue(leavelistpage.validTabExist());//进行中tab存在
		assertEquals("进行中", leavelistpage.validTabText());		
		assertTrue(leavelistpage.invalidTabExist());//过期/无效tab存在
		assertEquals("过期/无效", leavelistpage.invalidTabText());
			
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
	
	//添加新申请
	public  void testNewApplyCase() throws UiObjectNotFoundException{
		
		leavelistpage.addApplyBtnClick();
		do{
			sleep(1000);
		}while(loadingimg.loadingImgExist());
		
		assertTrue(newleaveapplypage.titleExist());//标题存在
		assertEquals("新增请假申请", newleaveapplypage.titleText());
		assertTrue(newleaveapplypage.backBtnExist());//返回按钮存在
		
		assertTrue(newleaveapplypage.leaveTypeTextExist());//请假类型-文本存在
		assertEquals("请假类型", newleaveapplypage.leaveTypeTextText());
		assertTrue(newleaveapplypage.leaveTypeExist());//请假类型存在
		assertEquals("请选择", newleaveapplypage.leaveTypeText());
		
		assertTrue(newleaveapplypage.leaveClassTextExist());//请假班次-文本存在
		assertEquals("请假班次", newleaveapplypage.leaveClassTextText());
		assertTrue(newleaveapplypage.leaveClassExist());//请假班次存在
		assertEquals("请选择", newleaveapplypage.leaveClassText());
		
		assertTrue(newleaveapplypage.leaveClassAmountText0Exist());//请假班次数量-文本存在
		assertEquals("请假班次数量", newleaveapplypage.leaveClassAmountText0Text());
		assertFalse(newleaveapplypage.leaveClassAmountExist());//请假班次数量不存在
		
		assertTrue(newleaveapplypage.leaveCauseBoxExist());//请假原因输入框存在
		assertTrue(newleaveapplypage.leaveCauseExist());//请假原因存在
		assertEquals("请如实填写您的请假原因", newleaveapplypage.leaveCauseText());
		assertTrue(newleaveapplypage.remainWordNumberExist());//字数限制存在
		assertEquals("500字", newleaveapplypage.remainWordNumberText());
		
		assertTrue(newleaveapplypage.saveBtnExist());//保存按钮存在
		assertTrue(newleaveapplypage.saveBtnEnable());//保存按钮置灰
		
		//未选择请假类型，点击请假班次，弹窗
		newleaveapplypage.leaveClassClick();
		assertTrue(newleaveapplypage.confirmTextExist());//提示文字存在
		assertEquals("请先选择请假类型",newleaveapplypage.confirmTextText());
		assertTrue(newleaveapplypage.okBtnExist());//确定按钮存在
		newleaveapplypage.okBtnClick();//点击确定
				
		
		//病假
		newleaveapplypage.leaveTypeClick();
		do{
			sleep(1000);
		}while(loadingimg.loadingImgExist());
		
		assertTrue(newleaveapplypage.classTitleExist());//请假类型标题存在
		assertEquals("请假类型",newleaveapplypage.classTitleText());
		
		assertTrue(newleaveapplypage.cancelBtnExist());//取消按钮存在
		newleaveapplypage.cancelBtnClick();
		assertEquals("请选择",newleaveapplypage.leaveTypeText());
		
		newleaveapplypage.leaveTypeClick();
		do{
			sleep(1000);
		}while(loadingimg.loadingImgExist());
		assertTrue(newleaveapplypage.completeBtnExist());//确定按钮存在
		newleaveapplypage.completeBtnClick();
		assertEquals("病假",newleaveapplypage.leaveTypeText());
		
		newleaveapplypage.leaveClassClick();
		
		if(newleaveapplypage.confirmTextExist()){//有弹窗-无可选班次
			assertEquals("当前无可选的请假班次", newleaveapplypage.confirmTextText());
			assertTrue(newleaveapplypage.okBtnExist());//确定按钮存在
			System.out.println("新增请假申请：当前无可选的请假班次");
			newleaveapplypage.okBtnClick();
		}else{
			assertTrue(newleaveapplypage.classTitleExist());//请假班次标题存在
			assertEquals("请假班次",newleaveapplypage.classTitleText());

			assertTrue(newleaveapplypage.cancelBtnExist());//取消按钮存在
			newleaveapplypage.cancelBtnClick();
			assertEquals("请选择",newleaveapplypage.leaveClassText());
			
			newleaveapplypage.leaveClassClick();
			assertTrue(newleaveapplypage.completeBtnExist());//确定按钮存在
			newleaveapplypage.completeBtnClick();
			if(newleaveapplypage.leaveTypeText().equals("请选择")){
				System.out.print("选了班次，结果错误。");
			}
			assertTrue(newleaveapplypage.leaveClassAmountExist());//请假班次数量存在
			newleaveapplypage.leaveCauseSetText();//输入请假原因
			assertTrue(newleaveapplypage.saveBtnEnable());//保存按钮可点击
			
			assertTrue(newleaveapplypage.hospitalCertificate1Exist());//医院证明1
			newleaveapplypage.hospitalCertificate1Click();
			assertTrue(newleaveapplypage.chooseFromAlbumExist());//从相册选择
			newleaveapplypage.chooseAlbumClick();//相册
			newleaveapplypage.choosePhotoClick();//照片
			newleaveapplypage.rightBtnClick();//右上角对勾
			
			assertTrue(newleaveapplypage.hospitalCertificate2Exist());//医院证明2
			newleaveapplypage.hospitalCertificate2Click();
			assertTrue(newleaveapplypage.chooseFromAlbumExist());//从相册选择
			newleaveapplypage.chooseAlbumClick();//相册
			newleaveapplypage.choosePhotoClick();//照片
			newleaveapplypage.rightBtnClick();//右上角对勾
			
			assertTrue(newleaveapplypage.hospitalCertificate3Exist());//医院证明3
			newleaveapplypage.hospitalCertificate3Click();
			assertTrue(newleaveapplypage.chooseFromAlbumExist());//从相册选择
			newleaveapplypage.chooseAlbumClick();//相册
			newleaveapplypage.choosePhotoClick();//照片
			newleaveapplypage.rightBtnClick();//右上角对勾
			
			newleaveapplypage.saveBtnClick();//保存
			
			
			
		}
		
		
	}
}
