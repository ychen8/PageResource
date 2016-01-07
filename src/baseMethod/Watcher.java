package baseMethod;

import page.OrderPushPage;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiWatcher;

/**
 *创建日期:2015-12-29
 *作者： 陈玉婵
 */
public class Watcher {
	OrderPushPage push=new OrderPushPage();


	public void watchPhone(){
		UiDevice.getInstance().registerWatcher("endPhone", new UiWatcher(){

			@Override
			public boolean checkForCondition() {
				// TODO Auto-generated method stub
				return false;
			}
			
		});
	}
	
	public void watchNetwork(){
		UiDevice.getInstance().registerWatcher("network", new UiWatcher(){

			@Override
			public boolean checkForCondition() {
				// TODO Auto-generated method stub
				return false;
			}
			
		});
	}
	public void watchOrderPush(){
		UiDevice.getInstance().registerWatcher("orderPush", new UiWatcher(){

			@Override
			public boolean checkForCondition() {
				if(push.orderTypeExist()){
					System.out.println(push.orderTypeText());
					push.clsBtnClick();
				}
				return false;
			}
			
		});		
	}

}
