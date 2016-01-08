package driverInterface;
/**
 * Description：核实账单页面
 * Date: 2015-12-2
 * @author 李怡萱
 * */
public interface CheckBillConstants {
	

//////////////////////////////////////////////////////////////////////////////////////////////////
	//核实账单-资源ID
//////////////////////////////////////////////////////////////////////////////////////////////////
      //标题栏
      static String TITLE="com.szzc.ucar.driver:id/titlebar_title";
      //返回按钮
      static String BACKBTN="com.szzc.ucar.driver:id/titlebar_lefticon";
      //本次服务里程-文本
      static String KILLOTITLE="com.szzc.ucar.driver:id/killo_title";
      //里程输入框
      static String KILLOVALUE="com.szzc.ucar.driver:id/killo_value";
      //公里-文本
      static String KILLOTEXT="com.szzc.ucar.driver:id/tv";
      //附加费用-文本（包括：停车费、路桥费、清洁费、机场服务费、其它费用、其它费用描述）
      static String COSTNAME="com.szzc.ucar.driver:id/cost_name";
      //附加费用输入框
      static String COSTVALUE="com.szzc.ucar.driver:id/cost_value";
      //元-文本
      static String YUAN="com.szzc.ucar.driver:id/yuan";
      //确认按钮
      static String CHARGECOMMIT="com.szzc.ucar.driver:id/charge_commit";
     //////////////////////////////////////////////////////////////////////////////////
      ///////////////////////////////index/////////////////////////////////////////////
      /////重构///////
      static String EXTRAFEELL ="com.szzc.ucar.driver:id/extraFeeLl";
      //停车费栏-index
      static int PANKING_INDEX=0;
      //各费用文本-index
      static int TEXT_IDNDEX=0;
      //停车费输入框-index
      static int TEXT_INPUT_IDNDEX=1;
      //停车费对应的元-index
      static int YUAN_INDEX=2;
      
      //路桥费栏-index
      static int HIGHWAY_INDEX=1;
      //清洁费栏-index
      static int CLEAN_INDEX=2;
      //机场服务费栏-index
      static int AIRPORT_SERVICE=3;
      //路桥费栏-index
      static int OTHER_INDEX=4;
      //其它费用描述栏-index
      static int OTHER_AMOUNT_REMARK=5;
      
      
      //停车费-文本-index
      static int PARKING_TEXT_ID = 0;
      //路桥费-文本-index
      static int HIGHWAY_TEXT_ID = 3;
      //清洁费-文本-index
      static int CLEAN_TEXT_ID = 6;
      //机场服务费-文本-index
      static int AIRPORT_SERVICE_TEXT_ID = 9;
      //其它费用-文本-index
      static int OTHER_TEXT_ID = 12;
      //其它费用描述-文本index
      static int OTHER_AMOUNT_REMARK_TEXT_ID = 15;
      //停车费-输入框-index
      static int PARKING_INPUT_ID = 1;
      //路桥费-输入框-index
      static int HIGHWAY_INPUT_ID = 4;
      //清洁费-输入框-index
      static int CLEAN_INPUT_ID = 7;
      //机场服务费-输入框-index
      static int AIRPORT_SERVICE_INPUT_ID = 10;
      //其它费用-输入框-index
      static int OTHER_INPUT_ID = 13;
      //其它费用描述文本index
      static int OTHER_AMOUNT_REMARK_INPUT_ID = 16;
      //停车费-元-index
      static int PARKING_YUAN_ID = 2;
      //路桥费-元-index
      static int HIGHWAY_YUAN_ID = 5;
      //清洁费-元-index
      static int CLEAN_YUAN_ID = 8;
      //机场服务费-元-index
      static int AIRPORT_SERVICE_YUAN_ID = 11;
      //其它费用-元-index
      static int OTHER_YUAN_ID = 14;


     //////////////////////////////////////////////////////////////////////////////////
      
      
}
