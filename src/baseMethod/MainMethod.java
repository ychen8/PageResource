package baseMethod;


//import android.text.StaticLayout;


import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;



public class MainMethod extends UiAutomatorTestCase{
////////////////////////////////////////////////////////////////////////////////////
	//点击方法
////////////////////////////////////////////////////////////////////////////////////
	
	//点击
	public void clickObj(String resourceId){
		UiObject obj=new UiObject(new UiSelector().resourceId(resourceId));
		try {
			obj.clickAndWaitForNewWindow(10000);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public void clickObj(String resourceId,int index){
		UiObject obj=new UiObject(new UiSelector().resourceId(resourceId).index(index));
		try {
			obj.clickAndWaitForNewWindow(10000);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickObj(String classname,int index,String resuorceId){
		UiObject obj=new UiObject(new UiSelector().className(classname).index(index).resourceId(resuorceId));
		try {
			obj.clickAndWaitForNewWindow(10000);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickObjFromClass(String classname, int index){
		UiObject obj=new UiObject(new UiSelector().className(classname).childSelector(new UiSelector().index(index)));
		try {
			obj.clickAndWaitForNewWindow(10000);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickObjFromId(String resourceId, int index){
		UiObject obj=new UiObject(new UiSelector().resourceId(resourceId).childSelector(new UiSelector().index(index)));
		try {
			obj.clickAndWaitForNewWindow(10000);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//点击【list】中，【指定index】的layout中，【指定的子元素】
	public void clickObjFromList(String listResourceId,int relativeLayoutIndex,String childResourceId){
		UiObject obj = new UiObject(new UiSelector().resourceId(childResourceId));
		try{
			UiObject listObj = new UiObject(new UiSelector().resourceId(listResourceId));
			UiObject relativeLayout = listObj.getChild(new UiSelector().index(relativeLayoutIndex));
			obj = relativeLayout.getChild(new UiSelector().resourceId(childResourceId));
			obj.clickAndWaitForNewWindow(10000);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickPoint(int x,int y){
		UiDevice.getInstance().click(x, y);
	}
	public void clickObjByText(String resourceId,String text){
		UiObject listObj= new UiObject(new UiSelector().resourceId(resourceId).text(text));
		try {
			listObj.clickAndWaitForNewWindow(10000);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
////////////////////////////////////////////////////////////////////////////////////
//点击方法
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
//获取文本方法
////////////////////////////////////////////////////////////////////////////////////
	
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
	public String getTextFromClass(String classname, int index){
		UiObject obj=new UiObject(new UiSelector().className(classname).childSelector(new UiSelector().index(index)));
		String text="";
		try {
			text=obj.getText();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
	}
	//获取指定父类的，匹配指定index的子类
	public String getTextFromId(String resourceId, int index){
		UiObject obj=new UiObject(new UiSelector().resourceId(resourceId).childSelector(new UiSelector().index(index)));
		String text="";
		try {
			text=obj.getText();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
	}
	//通过class\index\resourceId获取文本
	public String getText(String classname,int index,String resourceId){
		String text="";
		try {
			text = new UiObject(new UiSelector().className(classname).index(index).resourceId(resourceId)).getText();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
	}
	public String getTextBrother(String parentText,int childindex){
		String text="";
		try{
			text=new UiObject(new UiSelector().text(parentText).fromParent(new UiSelector().index(childindex))).getText();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
	}
	public String getTextBrotherChild(String parentText,int broindex,int childindex){
		String text="";
		try{
			text=new UiObject(new UiSelector().text(parentText).fromParent(new UiSelector().index(broindex)).childSelector(new UiSelector().index(childindex))).getText();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
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
	//获取【list】中，【指定index】的layout中，【指定子元素】的text
	public String getListText(String listResourceId,int relativeLayoutIndex,String childResourceId){
		String text = "";
		try{
			UiObject listObj = new UiObject(new UiSelector().resourceId(listResourceId));
			UiObject relativeLayout = listObj.getChild(new UiSelector().index(relativeLayoutIndex));
			UiObject childObj = relativeLayout.getChild(new UiSelector().resourceId(childResourceId));
			text = childObj.getText();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;		
	}
	public String getListGrandChildText(String listResourceId,int childIndex,int grandIndex){
		String text = "";
		try{
			UiObject listObj = new UiObject(new UiSelector().resourceId(listResourceId));
			UiObject childLayout = listObj.getChild(new UiSelector().index(childIndex));
			UiObject grandchildObj = childLayout.getChild(new UiSelector().index(grandIndex));
			text = grandchildObj.getText();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;		
	}
	public String getListRegrandChildText(String listResourceId,int childIndex,int grandIndex,int regrandIndex){
		String text = "";
		try{
			UiObject listObj = new UiObject(new UiSelector().resourceId(listResourceId));
			UiObject childLayout = listObj.getChild(new UiSelector().index(childIndex));
			UiObject grandchildObj = childLayout.getChild(new UiSelector().index(grandIndex));
			UiObject regrandchildObj = grandchildObj.getChild(new UiSelector().index(regrandIndex));
			text = grandchildObj.getText();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;		
	}
	//获取文本（针对消息通知列表特殊嵌套模式）
	public String[] getTextForMsg(String ListResourceId, int index, String[] ResourceId) {
		// TODO Auto-generated method stub
		String[] text = {"","",""};
		try{
			UiObject listObj=new UiObject(new UiSelector().resourceId(ListResourceId));
			UiObject obj1=listObj.getChild(new UiSelector().index(index));
			UiObject obj2 = obj1.getChild(new UiSelector().index(0));
			UiObject obj3 = obj2.getChild(new UiSelector().index(0));
			UiObject obj4 = obj3.getChild(new UiSelector().index(0));
			UiObject obj5 = obj4.getChild(new UiSelector().index(0));
			UiObject childObj1 = obj5.getChild(new UiSelector().resourceId(ResourceId[0]));//标题
			UiObject childObj2 = obj4.getChild(new UiSelector().resourceId(ResourceId[1]));//时间
			UiObject childObj3 = obj3.getChild(new UiSelector().resourceId(ResourceId[2]));//内容
		
			text[0] = childObj1.getText();
			text[1] = childObj2.getText();
			text[2] = childObj3.getText();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
	}
////////////////////////////////////////////////////////////////////////////////////
//获取文本方法
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
//获取对象方法
////////////////////////////////////////////////////////////////////////////////////

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
	//通过class\index\resourceId获取对象
	public UiObject getObjByClassNameAndIndex(String classname,int index,String resourceId){
		UiObject obj=new UiObject(new UiSelector().className(classname).index(index).resourceId(resourceId));
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

////////////////////////////////////////////////////////////////////////////////////
//获取对象方法
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
//获取child总数方法
////////////////////////////////////////////////////////////////////////////////////
	public int getChildCount(String resourceId){
		UiObject obj=new UiObject(new UiSelector().resourceId(resourceId));
		int childCount=0;
		try {
			childCount=obj.getChildCount();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return childCount;
	}
	public int getChildCountByClass(String className){
		UiObject obj=new UiObject(new UiSelector().className(className));
		try {
			return obj.getChildCount();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;		
	}
	
////////////////////////////////////////////////////////////////////////////////////
//获取child总数方法
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
//断言
////////////////////////////////////////////////////////////////////////////////////
	//断言

	public Boolean testMatch(String expectResult, String actualResult) {
		// TODO Auto-generated method stub
		if(expectResult==actualResult){
			return true;
		}
		else
		return false;	
	}

////////////////////////////////////////////////////////////////////////////////////
//断言
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
//判断对象是否存在方法
////////////////////////////////////////////////////////////////////////////////////
	public Boolean isExist(String ResourceId){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId));
		return obj.exists();		
	}
	public Boolean isExistFromText(String text){
		UiObject obj=new UiObject(new UiSelector().text(text));
		return obj.exists();		
	}
	//找到匹配ＴＥＸＴ的兄弟类
	public Boolean isExistTextBrother(String text,int index){
		UiObject obj=new UiObject(new UiSelector().text(text).fromParent(new UiSelector().index(index)));
		return obj.exists();
	}
	//找到匹配ＴＥＸＴ的兄弟类的子类
	public Boolean isExistTextBroChild(String text,int broindex,int childindex){
		UiObject obj=new UiObject(new UiSelector().text(text).fromParent(new UiSelector().index(broindex)).childSelector(new UiSelector().index(childindex)));
		return obj.exists();
	}
	public Boolean isExist(String ResourceId, int index){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId).index(index));
		return obj.exists();	
	}
	//通过classname和index判断对象是否存在
	public Boolean isExistFromClass(String className, int index){
		UiObject obj=new UiObject(new UiSelector().className(className).childSelector(new UiSelector().index(index)));
		return obj.exists();
	}
	//是否存在 （寻找【指定父类】下，匹配【指定text】的子类）
	public Boolean isExist(String ResourceId, String text){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId).childSelector(new UiSelector().text(text)));
		return obj.exists();		
	}
	//通过classname和text判断对象是否存在（寻找【指定class】下，匹配【指定text】的子类）
	public Boolean isExistFromClass(String className, String text) {
		// TODO Auto-generated method stub
		UiObject obj=new UiObject(new UiSelector().className(className).childSelector(new UiSelector().text(text)));
		return obj.exists();
	}
	//是否存在 （寻找【指定父类】下，匹配【指定index】的子类）
	public Boolean isExistFromId(String ResourceId, int index){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId).childSelector(new UiSelector().index(index)));
		return obj.exists();		
	}
	//通过classname、text和resourceId判断对象是否存在
	public boolean isExist(String classname,int index,String resuorceId){
		UiObject obj=new UiObject(new UiSelector().className(classname).index(index).resourceId(resuorceId));
		return obj.exists();
		
	}
	//判断【list】中，【指定index】的layout中，【指定子元素】是否存在
	public boolean isExistFromList(String listResourceId,int relativeLayoutIndex,String childResourceId){
		UiObject listObj = new UiObject(new UiSelector().resourceId(listResourceId).childSelector(new UiSelector().index(relativeLayoutIndex).childSelector(new UiSelector().resourceId(childResourceId))));
		return listObj.exists();		
	}
	public boolean isExistByText(String ResourceId,String text){
		UiObject listObj= new UiObject(new UiSelector().resourceId(ResourceId).text(text));
		return listObj.exists();
	}
	public boolean isExistFromListGrand(String ResourceId,int childindex,int grandindex){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId).childSelector(new UiSelector().index(childindex)).childSelector(new UiSelector().index(grandindex)));
		return obj.exists();
	}
	public boolean isExistFromListRegrand(String ResourceId,int childindex,int grandindex,int regrandindex){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId).childSelector(new UiSelector().index(childindex)).childSelector(new UiSelector().index(grandindex)).childSelector(new UiSelector().index(regrandindex)));
		return obj.exists();
	}
	//判断是否存在（针对消息通知列表特殊嵌套模式）
	public Boolean[] isExistForMsg(String ListResourceId, int index, String[] ResourceId) {
		// TODO Auto-generated method stub
		Boolean[] isExist = {false,false,false};
		try{
			UiObject listObj=new UiObject(new UiSelector().resourceId(ListResourceId));
			UiObject obj1=listObj.getChild(new UiSelector().index(index));
			UiObject obj2 = obj1.getChild(new UiSelector().index(0));
			UiObject obj3 = obj2.getChild(new UiSelector().index(0));
			UiObject obj4 = obj3.getChild(new UiSelector().index(0));
			UiObject obj5 = obj4.getChild(new UiSelector().index(0));
			UiObject childObj1 = obj5.getChild(new UiSelector().resourceId(ResourceId[0]));//标题
			UiObject childObj2 = obj4.getChild(new UiSelector().resourceId(ResourceId[1]));//时间
			UiObject childObj3 = obj3.getChild(new UiSelector().resourceId(ResourceId[2]));//内容
		
			isExist[0] = childObj1.exists();
			isExist[1] = childObj2.exists();
			isExist[2] = childObj3.exists();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isExist;
	}
////////////////////////////////////////////////////////////////////////////////////
//判断对象是否存在方法
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
//清空文本方法
////////////////////////////////////////////////////////////////////////////////////
//清空文本
	public void cleartxt(String resourceId){
		UiObject obj=new UiObject(new UiSelector().resourceId(resourceId));
		try {
			for(int i=0;i<11;i++){
				obj.longClickBottomRight();
				UiDevice.getInstance().pressDelete();
			}
			
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
////////////////////////////////////////////////////////////////////////////////////
//清空文本方法
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
//输入文本方法
////////////////////////////////////////////////////////////////////////////////////
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
////////////////////////////////////////////////////////////////////////////////////
//输入文本方法
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
//判断对象是否可点击
////////////////////////////////////////////////////////////////////////////////////
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
////////////////////////////////////////////////////////////////////////////////////
//判断对象是否可点击
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
//判断对象是否被选中
////////////////////////////////////////////////////////////////////////////////////
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
////////////////////////////////////////////////////////////////////////////////////
//判断对象是否被选中
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
//判断对象是否被激活
////////////////////////////////////////////////////////////////////////////////////
   //判断对象是否被激活
	public Boolean objEnabled(String ResourceId){
		UiObject obj=new UiObject(new UiSelector().resourceId(ResourceId));
		try {
			return obj.isEnabled();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;		
	}
////////////////////////////////////////////////////////////////////////////////////
//判断对象是否被激活
////////////////////////////////////////////////////////////////////////////////////

}
