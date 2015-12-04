/**
 * 创建日期2015年12月02日
 * 作者：郭艳松
 * */
package driverInterface;

public interface MainPageConstants {
	

//////////////////////////////////////////////////////////////////////////////////////////////////
	//主页资源ID  edit
//////////////////////////////////////////////////////////////////////////////////////////////////
      //标题
      static String TITLE="com.szzc.ucar.driver:id/titlebar_title_icon";
      //消息
      static String MSG="com.szzc.ucar.driver:id/titlebar_righticon";
      //消息数
      static String MSGCOUNT="com.szzc.ucar.driver:id/titlebar_msg";
      //抽屉按钮
      static String PERSONINFO="com.szzc.ucar.driver:id/titlebar_lefticon";
      //测试环境
      static String TESTENVIRONMENT="com.szzc.ucar.driver:id/titlebar_apienv";
      //内存占用
      static String MEMORY="com.szzc.ucar.driver:id/tvmemory";
      //响应率
      static String RESPONSERATE="com.szzc.ucar.driver:id/tv_order_persent";
      //工作时长
      static String WORKTIME="com.szzc.ucar.driver:id/tv_worktime";
      //完成单量
      static String FINISHORDERCOUNT="com.szzc.ucar.driver:id/finishOrderCount";
      //计将营业额
      static String TURNOVERAMOUNT="com.szzc.ucar.driver:id/turnoverAmount";
      //代充金额
      static String RECHARGEAMOUNT="com.szzc.ucar.driver:id/rechargeamount";
      //我的订单（未完成订单）  
      static String MYORDER="com.szzc.ucar.driver:id/txt_order_title";
      //接单设置
      static String SETBTN="com.szzc.ucar.driver:id/btnset";
      //状态按钮
      static String STATEBTN="com.szzc.ucar.driver:id/btnstate";
      //状态变更
      static String CHANGEBTN="com.szzc.ucar.driver:id/btnchange";
      //未完成订单数  
      static String UNFINISHCOUNT="com.szzc.ucar.driver:id/tvunfinishnum";
      //订单类型  
      static String ORDERTYPE="com.szzc.ucar.driver:id/txt_order_type";
      //航班号
      static String FLIGHTNO="com.szzc.ucar.driver:id/txt_flightno";
      //订单状态
      static String ORDERSTATUS="com.szzc.ucar.driver:id/order_state";
      //使用日期
      static String USEDATE="com.szzc.ucar.driver:id/use_date";
      //改拍按钮
      static String CHANGEORDERBTN="com.szzc.ucar.driver:id/btn_change_order";
      //上车地点
      static String UPLOCATION="com.szzc.ucar.driver:id/uplocation_name";
     //////////////////////////////////////////////////////////////////////////////////
      //////弹出框ID
     //////////////////////////////////////////////////////////////////////////////////
  	//请先录入交班地址
  	static String WARNING="com.szzc.ucar.driver:id/confirm_text";
  	//确定按钮
  	static String OKBTN="com.szzc.ucar.driver:id/ok_btn";
  	//返回按钮
  	static String CANCELBTN="com.szzc.ucar.driver:id/close_btn";
    //////////////////////////////////////////////////////////////////////////////////
    //////输入里程框ID
   //////////////////////////////////////////////////////////////////////////////////
  	//输入里程框
  	static String KILOTXT="com.szzc.ucar.driver:id/edit_total_kilometer";
  	//输入里程过大提示
  	static String ERRTXT="com.szzc.ucar.driver:id/error_input";
  	//确定上班按钮
  	static String WORKBTN="com.szzc.ucar.driver:id/input_btn";
    //////////////////////////////////////////////////////////////////////////////////
    //////公里数过大
   //////////////////////////////////////////////////////////////////////////////////
  	static int MAXKILO=10000000;
    //////////////////////////////////////////////////////////////////////////////////
    //////正常公里数
   //////////////////////////////////////////////////////////////////////////////////
  	static int KILO=100;
      
}
