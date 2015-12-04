/**
 * 创建日期2015年12月02日

 * 作者：郭艳松
 * */
package driverInterface;

public interface SetPageConstants {
	//自动开启导航
	static String AUTONAV="com.szzc.ucar.driver:id/chkautonavi";
	//是否使用高德导航
	static String USEGAODE="com.szzc.ucar.driver:id/chknavitype";
	//橙色订单自动接单
	static String AUTOAGAINSTORG="com.szzc.ucar.driver:id/chkautoagainstorder";
	//是否接受蓝色订单
	static String ACCEPTBLUE="com.szzc.ucar.driver:id/chkblueorderpush";
	//增大时间
	static String INCREM="com.szzc.ucar.driver:id/increment";
	//减小时间
	static String DECREM="com.szzc.ucar.driver:id/decrement";
	//时间
	static String TIME="com.szzc.ucar.driver:id/numberpicker_input";
	//确定按钮
	static String OKBTN="com.szzc.ucar.driver:id/ok_btn";
	
	//开始时间增大INDEX
	static int INCERM_START_INDEX=1;
	//开始时间减小INDEX
	static int DECERM_START_INDEX=4;
	//结束时间增大INDEX
	static int INCERM_STOP_INDEX=5;
	//结束时间减小INDEX
	static int DECERM_STOP_INDEX=8;
	//开始时间INDEX
    static int TIME_START_INDEX=2;
	//结束时间INDEX
    static int TIME_STOP_INDEX=6;
}
