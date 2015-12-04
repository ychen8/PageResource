package baseMethod;


//import android.text.StaticLayout;


import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;



public class MainMethod extends UiAutomatorTestCase{

	//点击
	public void clickObj(String resourceId){
		UiObject obj=new UiObject(new UiSelector().resourceId(resourceId));
		try {
			obj.click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public void clickObj(String resourceId,int index){
		UiObject obj=new UiObject(new UiSelector().resourceId(resourceId).index(index));
		try {
			obj.click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	//获取object（寻找【指定class】下，匹配【指定text】的子类）
	public UiObject getObjFromClass(String className, String text) {
		// TODO Auto-generated method stub
		UiObject obj=new UiObject(new UiSelector().className(className).childSelector(new UiSelector().text(text)));
		return obj;
	}
	//获取【指定父类】下，匹配【指定text】的子类的兄弟的text
	public String getOtherChild(String parentResourceId,String text,String childResourceId){
		UiObject obj = new UiObject(new UiSelector().resourceId(childResourceId));
		String objText = "";
		try {
			obj = getObj(parentResourceId, text).getFromParent(new UiSelector().resourceId(childResourceId));
			objText = obj.getText();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objText;
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
	public Boolean isExist(String ResourceId){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId));
		return obj.exists();		
	}
	public Boolean isExist(String ResourceId, int index){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId).index(index));
		return obj.exists();	
	}
	
	//是否存在 （寻找【指定父类】下，匹配【指定text】的子类）
	public Boolean isExist(String ResourceId, String text){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId).childSelector(new UiSelector().text(text)));
		return obj.exists();		
	}
	//输入文本
	public Boolean setxt(String ResourceId, String input){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId));
		try {
			return obj.setText(input);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public Boolean setxt(String ResourceId, String input,int index){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId).index(index));
		try {
			return obj.setText(input);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
   //判断对象是否可点击
	public Boolean objClickable(String ResourceId){
		try {
			 UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId));
			 return obj.isClickable();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public Boolean objClickable(String ResourceId,int index){
		try {
			 UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId).index(index));
			 return obj.isClickable();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//判断对象是否被选中
	public Boolean objChecked(String ResourceId){
		try {
			UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId));
			return obj.isChecked();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public Boolean objChecked(String ResourceId,int index){
		try {
			UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId).index(index));
			return obj.isChecked();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
   //判断对象是否可点击
	public Boolean objClicked(String ResourceId){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId));
		try {
			return obj.isEnabled();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
}
