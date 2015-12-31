package baseMethod;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiWatcher;

/**
 *创建日期:2015-12-29
 *作者： 陈玉婵
 */
public class Watcher {

	/**
	 * @param args
	 */
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

}
