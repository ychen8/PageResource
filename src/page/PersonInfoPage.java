package page;

import android.R.integer;
import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.PersonInfoConstants;

public class PersonInfoPage extends UiAutomatorTestCase implements PersonInfoConstants{
        
	MainMethod perinfo=new MainMethod();
	//判断标题是否存在
	public boolean titleExist(){
		return perinfo.isExist(PERINFOTITLE);
	}
	//获取标题文本
	public String titleText(){
		return perinfo.getText(PERINFOTITLE);
	}
	//判断返回按钮是否存在
	public boolean backBtnExist(){
		return perinfo.isExist(BACKBTN);
	}
	//点击返回按钮
	public void backBtnClick(){
		perinfo.clickObj(BACKBTN);
	}
	//判断司机姓名是否存在
	public boolean driverNameExist(){
		return perinfo.isExist(DRIVERNAME);
	}
	//获取司机姓名
	public String driverNameText(){
		return perinfo.getText(DRIVERNAME);
	}
	//判断司机手机号是否存在
	public boolean telNumExist(){
		return perinfo.isExist(TELNUM);
	}
	//获取司机手机号
	public String telNumText(){
		return perinfo.getText(TELNUM);
	}
	//判断收藏人数是否存在
	public boolean collNumExist(){
		return perinfo.isExist(COLLNUM);
	}
	//获取收藏人数
	public int collNumCount(){
		String s =perinfo.getText(COLLNUM);
		int i;
		i=Integer.valueOf(s);
		return i;
	}
	//判断司机车牌号是否存在
	public boolean carNumExist(){
		return perinfo.isExist(CARNUM);
	}
	//获取司机车牌号
	public String carNumText(){
		return perinfo.getText(CARNUM);
	}
	//判断二维码是否存在
	public boolean codeImgExist(){
		return perinfo.isExist(CODEIMG);
	}
	//判断我的二维码是否存在
	public boolean myCodeExist(){
		return perinfo.isExist(MYCODE);
	}
	//获取我的二维码文本
	public String myCodeText(){
		return perinfo.getText(MYCODE);
	}
}
