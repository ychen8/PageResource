package driverInterface;
/**
 * Description：订单详情页（提交费用后）
 * Date: 2015-12-4
 * @author 李怡萱
 * */
public interface OrderDetailConstants {
	

//////////////////////////////////////////////////////////////////////////////////////////////////
	//订单详情-资源ID
//////////////////////////////////////////////////////////////////////////////////////////////////
    //标题栏
    static String TITLE="com.szzc.ucar.driver:id/titlebar_title";
    //返回按钮
    static String BACKBTN="com.szzc.ucar.driver:id/titlebar_lefticon";
    //订单金额栏
    static String ORDER_MONEY_LAYOUT="com.szzc.ucar.driver:id/moneydetail_rl";
    //订单金额-文本
    static String ORDER_MONEY_TEXT="com.szzc.ucar.driver:id/tv";
    //订单金额
    static String ORDER_MONEY_VALUE="com.szzc.ucar.driver:id/order_money";
    //支付状态
    static String MONEY_DETAIL="com.szzc.ucar.driver:id/moneydetail";
    //订单号
    static String ORDER_NO="com.szzc.ucar.driver:id/order_no";
    //订单类型
    static String ORDER_TYPE="com.szzc.ucar.driver:id/order_type_des";
    //上车时间
    static String UP_TIME="com.szzc.ucar.driver:id/order_start_time";
    //下车时间
    static String DOWN_TIME="com.szzc.ucar.driver:id/order_stop_time";
    //乘车人姓名
    static String PASSENGER_NAME="com.szzc.ucar.driver:id/order_detail_passenger";
    //乘车人电话按钮
    static String PASSENGER_CALL="com.szzc.ucar.driver:id/passenger_call";
    //订车人姓名
    static String RESERVER_NAME="com.szzc.ucar.driver:id/order_detail_reserver";
    //充值按钮
    static String RECHARGE_BTN="com.szzc.ucar.driver:id/addmoney";
    //订车人电话按钮
    static String RESERVER_CALL="com.szzc.ucar.driver:id/reserver_call";
    //上车地点-文本
    static String UP_LOC_TEXT="com.szzc.ucar.driver:id/left";
    //上车地点
    static String UP_LOC="com.szzc.ucar.driver:id/detail_start_position";
    //上车地点详情
    static String UP_LOC_DETAIL="com.szzc.ucar.driver:id/detail_start_position_detail";
    //下车地点-文本
    static String DOWN_LOC_TEXT="com.szzc.ucar.driver:id/left_";
    //下车地点
    static String DOWN_LOC="com.szzc.ucar.driver:id/detail_end_position";
    //下车地点详情
    static String DOWN_LOC_DETAIL="com.szzc.ucar.driver:id/detail_end_position_detail";
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

    //////////////////////////////text//////////////////////////////////
      
	//订单号-文本
	static String ORDER_NO_TEXT = "订单号";
	//上车时间-文本
	static String UP_TIME_TEXT = "上车时间";
	//下车时间-文本
	static String DOWN_TIME_TEXT = "下车时间";
	//乘车人姓名-文本
	static String PASSENGER_NAME_TEXT = "乘车人";
	//订车人姓名-文本
	static String RESERVER_NAME_TEXT = "订车人";  
	
	//////////////////////////////index///////////////////////////////
	
	//元-文本（父类为ORDER_MONEY_LAYOUT）
	static int YUAN = 2;
	
	//////////////////////////////class//////////////////////////////
	static String ORDER_DETIAL_CLASS = "android.widget.ScrollView";
}

