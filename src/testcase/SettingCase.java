package testcase;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import page.PersonSetPage;
/**
 * Description：
 * Date: 2016-1-7
 * @author 李怡萱
 * */
public class SettingCase extends UiAutomatorTestCase {

	PersonSetPage personsetpage = new PersonSetPage();
	
	//设置
	public void testSetting() throws UiObjectNotFoundException{
			
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
			
	}

}
