package testcase;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import page.ChangePasswordPage;
import page.PersonSetPage;
import page.UpgradPage;
/**
 * Description：
 * Date: 2016-1-7
 * @author 李怡萱
 * */
public class SettingCase extends UiAutomatorTestCase {

	PersonSetPage personsetpage = new PersonSetPage();
	UpgradPage upgradpage=new UpgradPage();
	ChangePasswordPage changepasswordpage = new ChangePasswordPage();
	//设置
	public void testSetting() throws UiObjectNotFoundException{
			
		assertTrue(personsetpage.titleExist());//标题存在
		assertEquals("设置", personsetpage.titleText());
		assertTrue(personsetpage.returnExist());//返回按钮存在
			
		assertTrue(personsetpage.llModifyPassExist());//修改密码存在
		assertTrue(personsetpage.modifyPassExist());//修改密码文本存在
		assertEquals("修改密码", personsetpage.modifyPassText());
			
		assertTrue(personsetpage.llOffLineExist());//导航下载存在
		assertTrue(personsetpage.offLineExist());//导航下载文本存在
		assertEquals("导航下载", personsetpage.offLineText());
			
		assertTrue(personsetpage.llFeedbackeExist());//意见反馈存在
		assertTrue(personsetpage.feedbackExist());//意见反馈文本存在
		assertEquals("意见反馈", personsetpage.feedbackText());
			
		assertTrue(personsetpage.llUseGuidExist());//使用指南存在
		assertTrue(personsetpage.useGuidExist());//使用指南文本存在
		assertEquals("使用指南", personsetpage.useGuidText());
			
		assertTrue(personsetpage.llCheckUpdateExist());//检测新版本栏存在
		assertTrue(personsetpage.checkUpdateExist());//检测新版本文本存在
		assertEquals("检测新版本", personsetpage.checkUpdateText());
		assertTrue(personsetpage.checkUpdateValueExist());//检测新版本值存在
		
		assertTrue(personsetpage.logoutExist());//退出登录按钮存在
		assertEquals("退出登录", personsetpage.logoutText());
		
		
	}
	//设置-修改密码
	public void testChangePasswordCase(){
		personsetpage.llModifyPassClick();
		sleep(1000);
		
		assertTrue(changepasswordpage.titleExist());//标题存在
		assertEquals("修改密码",changepasswordpage.titleText());
		assertTrue(changepasswordpage.returnExist());//返回按钮存在
		
		assertTrue(changepasswordpage.pwCurExist());//当前密码存在
		assertEquals("当前密码",changepasswordpage.pwCurText());
		assertTrue(changepasswordpage.pwNewExist());//新密码存在
		assertEquals("新密码",changepasswordpage.pwNewText());
		
		assertTrue(changepasswordpage.tipExist());//提示语存在
		assertEquals("密码为6-18位英文字母、数字或符号",changepasswordpage.tipText());
		
		assertTrue(changepasswordpage.showCkExist());//显示密码存在
		assertEquals("显示密码",changepasswordpage.showCkText());
		
		assertTrue(changepasswordpage.showCkChecked());//显示密码被勾选
		assertTrue(changepasswordpage.pwModfiyExist());//确定按钮存在
		assertFalse(changepasswordpage.pwModifyEnable());//确定按钮置灰
		
		changepasswordpage.returnClick();
		sleep(1000);
		
	}
	//设置-导航下载
	public void testOffLineCase(){
		personsetpage.llOffLineClick();
		sleep(1000);
	}
	//设置-意见反馈
	public void testFeedBackCase(){
		personsetpage.llFeedbackClick();
		sleep(1000);
	}
	//设置-使用指南
	public void testUseGuidCase(){
		personsetpage.llUseGuidClick();
		sleep(1000);
	}
	//设置-检测新版本
	public void testCheckUpdateCase(){
		
		if(personsetpage.checkUpdateValueText().equals("检测到新版本")){
			assertTrue(personsetpage.llCheckUpdateClickable());//可点击
			personsetpage.llCheckUpdateClick();
			sleep(1000);
			assertTrue(upgradpage.upgradTitleExist());//标题存在
			assertEquals("发现新版本", upgradpage.upgradTitleText());
			assertTrue(upgradpage.upgradContentExist());//内容存在
			assertTrue(upgradpage.upgradLaterExist());//稍后再说按钮存在
			assertTrue(upgradpage.upgradExist());//立即升级按钮存在
			upgradpage.upgradLaterClick();
			sleep(1000);
			
		}
		else if(personsetpage.checkUpdateValueText().equals("已是最新版本")){
			assertFalse(personsetpage.llCheckUpdateClickable());//不可点击
		}
		else{
			System.out.print(personsetpage.checkUpdateValueText());
		}
		
	}
	//设置-退出登录
	public void testLogout(){
		
	}
}
