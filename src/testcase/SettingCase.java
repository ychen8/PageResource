package testcase;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.NavigaDownloadConstants;

import page.ChangePasswordPage;
import page.PersonSetPage;
import page.UpgradPage;
import page.NavigaDownloadPage;
/**
 * Description：
 * Date: 2016-1-7
 * @author 李怡萱
 * */
public class SettingCase extends UiAutomatorTestCase implements NavigaDownloadConstants{

	PersonSetPage personsetpage = new PersonSetPage();
	UpgradPage upgradpage=new UpgradPage();
	ChangePasswordPage changepasswordpage = new ChangePasswordPage();
	NavigaDownloadPage navigadownloadpage = new NavigaDownloadPage();
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
	public void testChangePasswordCase()throws UiObjectNotFoundException{
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
	public void testOffLineCase()throws UiObjectNotFoundException{
		personsetpage.llOffLineClick();
		sleep(1000);
		
		assertTrue(navigadownloadpage.returnExist());//返回按钮存在
		assertTrue(navigadownloadpage.mapTypeExist());//全部/已下载tab存在
		assertEquals("  全部          已下载", navigadownloadpage.mapTypeText());
		assertTrue(navigadownloadpage.searchExist());//输入框存在
		assertEquals("拼音、名称、首字母", navigadownloadpage.searchText());
		
		assertTrue(navigadownloadpage.CityValueExist(INDEX_CURREN_CITY));//当前城市存在
		assertEquals("当前城市", navigadownloadpage.cityeValueText(INDEX_CURREN_CITY));
		
		assertTrue(navigadownloadpage.CityValueExist(INDEX_CURREN_CITY_VALUE));//当前城市存在
		assertTrue(navigadownloadpage.downloadProcessExist(INDEX_CURREN_CITY_VALUE));//下载进度存在
		
		if(navigadownloadpage.downloadCompleExist(INDEX_CURREN_CITY_VALUE)){//判断下载完成还是未下载
			System.out.println("当前城市是："+navigadownloadpage.cityeValueText(INDEX_CURREN_CITY_VALUE)+",下载完成");
		}else if(navigadownloadpage.downloadBtnExist(INDEX_CURREN_CITY_VALUE)){
			System.out.println("当前城市是："+navigadownloadpage.cityeValueText(INDEX_CURREN_CITY_VALUE)+",未下载");
		}else if(navigadownloadpage.downloadProcessText(INDEX_CURREN_CITY_VALUE).contains("下载")){
			System.out.println("当前城市是："+navigadownloadpage.cityeValueText(INDEX_CURREN_CITY_VALUE)+",下载中");		
		}
		
		assertTrue(navigadownloadpage.CityValueExist(INDEX_HOT_CITY));//热门城市存在
		assertEquals("热门城市", navigadownloadpage.cityeValueText(INDEX_HOT_CITY));
		
		assertTrue(navigadownloadpage.CityValueExist(INDEX_HOT_CITY1));//热门城市1存在
		assertTrue(navigadownloadpage.downloadProcessExist(INDEX_HOT_CITY1));//热门城市1下载进度存在
		assertTrue(navigadownloadpage.CityValueExist(INDEX_HOT_CITY2));//热门城市2存在
		assertTrue(navigadownloadpage.downloadProcessExist(INDEX_HOT_CITY2));//热门城市2下载进度存在
		assertTrue(navigadownloadpage.CityValueExist(INDEX_HOT_CITY3));//热门城市3存在
		assertTrue(navigadownloadpage.downloadProcessExist(INDEX_HOT_CITY3));//热门城市3下载进度存在
		assertTrue(navigadownloadpage.CityValueExist(INDEX_HOT_CITY4));//热门城市4存在
		assertTrue(navigadownloadpage.downloadProcessExist(INDEX_HOT_CITY4));//热门城市4下载进度存在
		assertTrue(navigadownloadpage.CityValueExist(INDEX_HOT_CITY5));//热门城市5存在
		assertTrue(navigadownloadpage.downloadProcessExist(INDEX_HOT_CITY5));//热门城市5下载进度存在
		
		assertTrue(navigadownloadpage.CityValueExist(INDEX_PROVINCE));//省份存在
		assertEquals("省份", navigadownloadpage.cityeValueText(INDEX_PROVINCE));
		
		
		
		
		
	}
	//设置-意见反馈
	public void testFeedBackCase()throws UiObjectNotFoundException{
		personsetpage.llFeedbackClick();
		sleep(1000);
	}
	//设置-使用指南
	public void testUseGuidCase()throws UiObjectNotFoundException{
		personsetpage.llUseGuidClick();
		sleep(1000);
	}
	//设置-检测新版本
	public void testCheckUpdateCase()throws UiObjectNotFoundException{
		
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
	public void testLogout()throws UiObjectNotFoundException{
		
	}
}
