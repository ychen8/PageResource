package driverInterface;
/**
 * Description：改派原因列表
 * Date: 2015-12-4
 * @author 李怡萱
 * */
public interface ChangeOrderConstants {
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	//改派页面-资源ID
	//////////////////////////////////////////////////////////////////////////////////////////////////
	//标题栏
	static String TITLE="com.szzc.ucar.driver:id/titlebar_title";
    //返回按钮
    static String BACKBTN="com.szzc.ucar.driver:id/titlebar_lefticon";
	//提示语（class）
    static String MARK_WORD_CLASS="android.widget.TextView";
    //提示语内容
    static String MARK_WORD="请真实填写申请改派的原因";
    //改派原因（class）
    static String CHANGE_REASON_CLASS="android.widget.RelativeLayout";
    //交接班改派text
    static String REASON_EXCHANGE="交接班改派";
    //无法按时到达index
    static String REASON_CANNOTARRIVE="无法按时到达";
    //车辆出险/故障index
    static String REASON_CARBREAK="车辆出险/故障";
    //订单冲突index
    static String REASON_ORDERCONFLICT="订单冲突";
    //其它index
    static String REASON_OTHER="其它";
    //其它原因描述
    static String REASON_OTHER_DETAIL="com.szzc.ucar.driver:id/tvreason";
    //确定按钮
    static String SUBMIT_BTN="com.szzc.ucar.driver:id/btn_submit";
    //////////////////////////////////////////////////////////////////////////////////
    //弹窗-资源ID
    //////////////////////////////////////////////////////////////////////////////////
    //弹窗
    static String POPUPWIN="com.szzc.ucar.driver:id/fragment_bg_click";
    //弹窗文字提示
    static String CONFIRM_TEXT="com.szzc.ucar.driver:id/confirm_text";
    //确定按钮
    static String OK_BTN="com.szzc.ucar.driver:id/ok_btn";
    //取消按钮
    static String CLOSE_BTN="com.szzc.ucar.driver:id/close_btn";
    
    //改派倒计时窗口
    static String COUNTDOWN_WIN="com.szzc.ucar.driver:id/base_bg_click";
    //正在改派text
    static String CHANGING="正在改派，请耐心等待";
    //倒计时
    static String COUNTDOWN="com.szzc.ucar.driver:id/loading_time";
    
    //////////////////////////////////////////////////////////////////////////////////

}
