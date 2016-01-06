package testcase;

import page.EditAddressPage;
import page.LeaveListPage;
import page.LoadingImg;
import page.PerTelNumPage;
import page.PersonInfoPage;
import page.PersonManagePage;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.ParameterConfigConstants;

/**
 * Description：
 * Date: 2016-1-5
 * @author 李怡萱
 * */
public class PersonManageCase  extends UiAutomatorTestCase implements ParameterConfigConstants{
	
	PersonManagePage personmanagepage = new PersonManagePage();
	PersonInfoPage personinfopage = new PersonInfoPage();
	PerTelNumPage pertelnumpage = new PerTelNumPage();
	EditAddressPage editaddresspage = new EditAddressPage();
	LeaveListPage leavelistpage = new LeaveListPage();
	LoadingImg loadingimg = new LoadingImg();
	int leaveAmount = 0;//初始化请假申请数量
	//个人管理UI
	public void testPersonManageUI() throws UiObjectNotFoundException{				

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
		assertEquals("家庭地址维护", personmanagepage.familyAddrText());
		assertTrue(personmanagepage.txtFamilyAddrExist());//判断家庭地址值是否存在
		assertTrue(personmanagepage.transClassAddrExist());//判断交班地址是否存在
		assertEquals("交接班地址维护", personmanagepage.transClassAddrText());
		assertTrue(personmanagepage.txtTransClassAddrExist());//判断交班地址值是否存在
		assertTrue(personmanagepage.txtMonthClassExist());//判断本月排班表是否存在
		assertEquals("本月排班表", personmanagepage.txtMonthClassText());
		assertTrue(personmanagepage.txtMyLeaveExist());//判断我的请假申请是否存在
		assertEquals("我的请假申请", personmanagepage.txtMyLeaveText());
		
	}
	//个人管理-个人信息
	public void testPersonInfo() throws UiObjectNotFoundException{
		
		personmanagepage.llBaseInfoClick();
		sleep(1000);
		
		assertTrue(personinfopage.titleExist());//判断标题是否存在
		assertEquals("个人信息", personinfopage.titleText());
		assertTrue(personinfopage.backBtnExist());//判断返回按钮是否存在
		
		assertTrue(personinfopage.driverImgExist());//判断司机头像是否存在
		assertTrue(personinfopage.driverNameExist());//判断司机姓名是否存在
		assertTrue(personinfopage.telNumExist());//判断司机手机号是否存在
		assertTrue(personinfopage.collNumExist());//判断收藏人数是否存在
		assertTrue(personinfopage.carNumExist());//判断车牌号是否存在
		assertTrue(personinfopage.codeImgExist());//判断二维码是否存在
		assertTrue(personinfopage.myCodeExist());//判断我的二维码文本是否存在
		assertEquals("我的二维码", personinfopage.myCodeText());
		
		personinfopage.backBtnClick();
		sleep(1000);
		
	}
	//个人管理-私人电话
	public void testPerTelNumCase() throws UiObjectNotFoundException{
		
		String oldTelNum = personmanagepage.txtPrivatePhoneText();
		personmanagepage.llPrivatePhoneClick();
		sleep(5000);
		
		assertTrue(pertelnumpage.perTelNumExist());//判断标题是否存在
		assertEquals("私人电话", pertelnumpage.perTelNumText());
		assertTrue(pertelnumpage.backBtnExist());//判断返回按钮是否存在
		assertTrue(pertelnumpage.telNumInputBlankExist());//判断输入框是否存在
		assertTrue(pertelnumpage.tipInfoExist());//判断提示语是否存在
		assertEquals("私人电话将用于密码找回，请正确填写", pertelnumpage.tipInfoText());
		
		assertTrue(pertelnumpage.saveBtnExist());//判断保存按钮是否存在
		assertTrue(pertelnumpage.saveBtnEnable());//保存按钮被激活
		
		
		//手机号格式错误
			
		StringBuilder wrongTelNum = new StringBuilder(oldTelNum);
		wrongTelNum.replace(0, 1, "2");
		String inputWrong = wrongTelNum.toString();//将手机号改为2开头
		
		do{
			pertelnumpage.clearNum();// 清空手机号输入框
		}while(!pertelnumpage.telNumInputBlankText().equals("请输入您的私人手机号"));
		assertFalse(pertelnumpage.saveBtnEnable());//保存按钮置灰
		sleep(500);
		System.out.print(inputWrong);
		pertelnumpage.inputNum(inputWrong);//输入新手机号
		sleep(500);
		assertTrue(pertelnumpage.saveBtnEnable());//保存按钮被激活
		pertelnumpage.saveBtnClick();
		assertTrue(pertelnumpage.errInfoExist());//弹提示
		assertEquals("请输入正确的手机号格式",pertelnumpage.errInfoText());
		assertTrue(pertelnumpage.okBtnExist());
		pertelnumpage.okBtnClick();
		pertelnumpage.backBtnClick();//返回查看
		assertEquals(oldTelNum, personmanagepage.txtPrivatePhoneText());//私人手机号未更改
		
		
		//手机号格式正确
		personmanagepage.llPrivatePhoneClick();
		sleep(1000);
		
		char c =oldTelNum.charAt(10);
		c++;
		String newTelNum = oldTelNum.substring(0,10)+c;//手机号尾号+1
		
		do{
			pertelnumpage.clearNum();// 清空手机号输入框
		}while(!pertelnumpage.telNumInputBlankText().equals("请输入您的私人手机号"));
		assertFalse(pertelnumpage.saveBtnEnable());//保存按钮置灰
		sleep(500);
		pertelnumpage.inputNum(newTelNum);//输入新手机号
		sleep(500);
		assertTrue(pertelnumpage.saveBtnEnable());//保存按钮被激活
		pertelnumpage.saveBtnClick();
		assertEquals(newTelNum, personmanagepage.txtPrivatePhoneText());
			
	}
	//家庭地址维护
	public void testEditAddressCase() throws UiObjectNotFoundException{
		
		String oldHomeAddr = personmanagepage.txtFamilyAddrText();
		personmanagepage.llFamilyAddrClick();
		sleep(5000);
		if(personmanagepage.editHomeAddrExist()){//若能改
			if(oldHomeAddr.equals("空")){//若地址为空
				assertTrue(editaddresspage.titleExist());
				assertEquals("新增地址", editaddresspage.titleText());
				chooseAddr();
				
			}
			else{
				assertTrue(editaddresspage.titleExist());
				assertEquals("编辑地址", editaddresspage.titleText());
				chooseAddr();
			}			
		}
		
	}
	//交接班地址维护
	public void testEditChangeClassCase() throws UiObjectNotFoundException{
		
		String oldChangeClassAddr = personmanagepage.txtChangeClassesText();
		personmanagepage.llTransClassAddrClick();
		sleep(5000);
		if(personmanagepage.editTransClassAddrExist()){//若能改
			if(oldChangeClassAddr.equals("空")){//若地址为空
				assertTrue(editaddresspage.titleExist());
				assertEquals("新增地址", editaddresspage.titleText());
				chooseAddr();
				
			}
			else{
				assertTrue(editaddresspage.titleExist());
				assertEquals("编辑地址", editaddresspage.titleText());
				chooseAddr();
			}			
		}
		
	}
	private void chooseAddr() {
		
		assertTrue(editaddresspage.backBtnExist());//返回按钮存在
		assertTrue(editaddresspage.cityExist());//城市存在
		assertTrue(editaddresspage.inputBlankExist());//地址输入框存在
		assertTrue(editaddresspage.delBtnExist());//清除按钮存在
		assertTrue(editaddresspage.addressNameExist(0));//搜索结果存在
		editaddresspage.addressNameClick(0);		
		
	}
	//个人管理-本月排班表
	//个人管理-我的换班申请
	public  void testMyChangeApplyCase() throws UiObjectNotFoundException{
		
		//personmanagepage.myChangeClassesClick();
		//缺少换班部分的constants和page方法
		
	}
	//个人管理-我的请假申请
	public  void testMyLeaveApplyCase() throws UiObjectNotFoundException{
		
		personmanagepage.txtMyLeaveClick();
		//等待“加载中”消失
		do{
			sleep(1000);
		}while(loadingimg.loadingImgExist());
		
		assertTrue(leavelistpage.titleExist());//标题存在
		assertEquals("我的请假申请", leavelistpage.titleText());
		assertTrue(leavelistpage.backBtnExist());//返回按钮存在
		assertTrue(leavelistpage.validTabExist());//进行中tab存在
		assertEquals("进行中", leavelistpage.validTabText());		
		assertTrue(leavelistpage.invalidTabExist());//过期/无效tab存在
		assertEquals("过期/无效", leavelistpage.invalidTabText());
		
		leavelistpage.backBtnClick();
		do{
			sleep(1000);
		}while(loadingimg.loadingImgExist());
	}
	//个人管理-对班换班申请
	public  void testTxtChangeApplyCase() throws UiObjectNotFoundException{
		
		//personmanagepage.txtChangeClassesClick();
		//缺少换班部分的constants和page方法
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

}
