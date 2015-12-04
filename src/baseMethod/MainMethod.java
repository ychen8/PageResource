package baseMethod;


//import android.text.StaticLayout;


import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;



public class MainMethod extends UiAutomatorTestCase{

	//点击
	public Boolean clickObj(String resourceId){
		UiObject obj=new UiObject(new UiSelector().resourceId(resourceId));
		try {
			obj.click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	//获取文本

	public String getText(String resourceId) {
		// TODO Auto-generated method stub
		UiObject obj=new UiObject(new UiSelector().resourceId(resourceId));
		String text="";
		try {
			text = obj.getText();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
	}
	
	//获取文本

	public String getText(String resourceId, int index) {
		// TODO Auto-generated method stub
		UiObject obj=new UiObject(new UiSelector().resourceId(resourceId).index(index));
		String text="";
		try {
			text = obj.getText();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
	}

	//获取object

	public UiObject getObj(String resourceId) {
		// TODO Auto-generated method stub
		UiObject obj=new UiObject(new UiSelector().resourceId(resourceId));
		return obj;
	}
	
	//获取object
	public UiObject getObj(String resourceId, int index) {
		// TODO Auto-generated method stub
		UiObject obj=new UiObject(new UiSelector().resourceId(resourceId).index(index));
		return obj;
	}
	
	//获取object（寻找【指定父类】下，匹配【指定text】的子类）
	public UiObject getObj(String resourceId, String text) {
		// TODO Auto-generated method stub
		UiObject obj=new UiObject(new UiSelector().resourceId(resourceId).childSelector(new UiSelector().text(text)));
		return obj;
	}
	
	//断言

	public Boolean testMatch(String expectResult, String actualResult) {
		// TODO Auto-generated method stub
		if(expectResult==actualResult){
			return true;
		}
		else
		return false;	
	}
	public Boolean isExist(String ResouceId){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResouceId));
		return obj.exists();		
	}
	public Boolean isExist(String ResouceId, int index){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResouceId).index(index));
		return obj.exists();	
	}
	
	//是否存在 （寻找【指定父类】下，匹配【指定text】的子类）
	public Boolean isExist(String ResouceId, String text){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResouceId).childSelector(new UiSelector().text(text)));
		return obj.exists();		
	}
	//输入文本
	public Boolean setxt(String ResouceId, String input){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResouceId));
		try {
			return obj.setText(input);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public Boolean setxt(String ResouceId, String input,int index){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResouceId).index(index));
		try {
			return obj.setText(input);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
