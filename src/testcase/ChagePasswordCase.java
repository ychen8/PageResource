package testcase;

import page.ChangePasswordPage;

import baseMethod.Base;
import baseMethod.Watcher;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 创建日期:2016-1-7 作者： 陈玉婵
 */
public class ChagePasswordCase extends UiAutomatorTestCase {
	ChangePasswordPage cpass = new ChangePasswordPage();
	Watcher watcher = new Watcher();
	Base base = new Base();

	public void testChangePass() {
		watcher.watchPhone();
		watcher.watchOrderPush();
		System.out.println("测试修改密码页面－－－－－－－");
		// 判断修改密码页面各控件是否存在
		assertTrue(cpass.returnExist());
		assertTrue(cpass.titleExist());
		assertTrue(cpass.pwCurExist());
		assertTrue(cpass.pwNewExist());
		assertTrue(cpass.tipExist());
		assertTrue(cpass.showCkExist());
		assertTrue(cpass.pwModfiyExist());
		// 判断对应控件的文本是否正确
		assertEquals("修改密码", cpass.titleText());
		assertEquals("密码为6-18位英文字母、数字或符号", cpass.tipText());
		// 判断初始,显示密码是否是选中状态
		assertTrue(cpass.showCkChecked());

		cpass.pwCurWrongSet();// 输入错误的当前密码
		cpass.pwNewSet();// 输入新密码
		cpass.pwModfiyClick();// 点击确定按钮
		// 如果加载中……。则等待
		do {
			sleep(1000);
		} while (base.loadingImgExist());

		assertEquals("密码不正确", cpass.confirmTextText());// 加载结束后，弹框提示
		cpass.okBtnClick();// 点击弹框的确定按钮

		// 重新输入正确的当前密码
		// 先清空错误的密码
		while (!cpass.pwCurText().equals("当前密码")) {
			cpass.pwCurClear();
		}

		cpass.pwCurSet();// 再输入正确的当前密码
		cpass.pwModfiyClick();// 点击确定按钮
		do {
			sleep(1000);
		} while (base.loadingImgExist());

		assertEquals("密码修改成功", cpass.confirmTextText());// 加载结束后，弹框提示
		cpass.okBtnClick();// 点击弹框的确定按钮
		

	}

}
