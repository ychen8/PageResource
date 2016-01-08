package testcase;

import page.ChangePasswordPage;
import page.LoadingImg;
import page.PersonSetPage;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * Description：
 * Date: 2016-1-8
 * @author 李怡萱
 * */

 public class ChangePasswordCase extends UiAutomatorTestCase {
	 
 	ChangePasswordPage changepassword = new ChangePasswordPage();
 	LoadingImg loadingimg = new LoadingImg();
 	PersonSetPage personsetpage = new PersonSetPage();
 	
 	public void testChangePasswordCase() {

 		System.out.println("测试修改密码页");
 		
 		assertTrue(changepassword.titleExist());//标题存在
 		assertEquals("修改密码", changepassword.titleText());
 		assertTrue(changepassword.returnExist());//返回按钮存在
 		
 		assertTrue(changepassword.pwCurExist());//当前密码存在
 		assertEquals("当前密码", changepassword.pwCurText());
 		assertTrue(changepassword.pwNewExist());//新密码
 		assertEquals("新密码", changepassword.pwNewText());
 		
 		assertTrue(changepassword.tipExist());//提示存在
 		assertEquals("密码为6-18位英文字母、数字或符号", changepassword.tipText());
 		
 		assertTrue(changepassword.showCkExist());//显示密码存在
 		assertEquals("显示密码", changepassword.showCkText());
 		assertTrue(changepassword.showCkChecked());//显示密码被勾选
 		
 		assertTrue(changepassword.pwModfiyExist());//确定按钮存在
 		assertEquals("确 定", changepassword.pwModifyText());
 		assertFalse(changepassword.pwModifyEnable());//确定按钮置灰

 		changepassword.pwCur19Set();//输入19位密码1122334455667788990
 		assertEquals("112233445566778899", changepassword.pwCurText());//只显示前18位
 		
 		changepassword.pwNew19Set();//输入19位新密码1122334455667788990
 		assertEquals("112233445566778899", changepassword.pwCurText());//只显示前18位
 		
 		assertTrue(changepassword.pwModifyEnable());//确定按钮被激活
 		changepassword.pwModfiyClick();//确定
 		do {sleep(1000);} while (loadingimg.loadingImgExist());//loading...
 		 
 		assertEquals("密码不正确", changepassword.confirmTextText());//弹窗提示
 		changepassword.okBtnClick();//弹窗确定
 
 		changepassword.showCkClick();//不显示密码
 		assertEquals("", changepassword.pwCurText());//密码值为空
 		assertEquals("", changepassword.pwNewText());//密码值为空
 		
 		changepassword.pwCurClear1();
 		changepassword.pwCur5Set();//输入5位密码12345 
 		assertFalse(changepassword.pwModifyEnable());//确定按钮置灰
 		
 		changepassword.pwCurClear1();
 		changepassword.pwCur19Set();//输入19位密码
 		changepassword.pwNewClear1();
 		changepassword.pwNew5Set();//输入5位新密码12345
 		assertFalse(changepassword.pwModifyEnable());//确定按钮置灰
 		
 		changepassword.pwCurClear1();
 		changepassword.pwCurSet();//输入正确密码
 		changepassword.pwNewClear1();
 		changepassword.pwNewSet();//输入正确密码
 		changepassword.pwModfiyClick();//确定
 		do {sleep(1000);} while (loadingimg.loadingImgExist());
 
 		assertTrue(changepassword.confirmTextExist());//弹窗文字存在
 		assertEquals("密码修改成功", changepassword.confirmTextText());
 		assertTrue(changepassword.okBtnExist());//确定按钮存在
 		changepassword.okBtnClick();//确定
 		
 		personsetpage.llModifyPassClick();//把密码改回来
 		sleep(1000);
 		changepassword.pwCurClear1();
 		changepassword.pwCur1Set();//输入正确密码
 		changepassword.pwNewClear1();
 		changepassword.pwNew1Set();//输入正确密码
 		changepassword.pwModfiyClick();//确定
 		do {sleep(1000);} while (loadingimg.loadingImgExist());
 		assertEquals("密码修改成功", changepassword.confirmTextText());
 		changepassword.okBtnClick();//确定
 		
 		
 	}
 
 }