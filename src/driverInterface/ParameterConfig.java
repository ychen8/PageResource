package driverInterface;

public interface ParameterConfig {
	
///////////////////订单结算-附加费用text//////////////////////////////////
	static String PARKING = "停车费";
	static String HIGHWAY = "路桥费";
	static String CLEAN = "清洁费";
	static String AIRPORT_SERVICE = "机场服务费";
	static String OTHER = "其他费用";
	static String ORDER_KILLO = "行驶里程";
	static String ORDER_TIME = "行驶时间";
	

///////////////////核实账单页元素index//////////////////////////////////
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
	
///////////////////核实账单页输入数据//////////////////////////////////
	//核实账单-公里数
	static String KILLO = "1.23";	
	//附加费用-停车费
	static String PARKING_AMOUNT = "10";
	//附加费用-路桥费
	static String HIGHWAY_AMOUNT = "10";
	//附加费用-清洁费
	static String CLEAN_AMOUNT = "10";
	//附加费用-机场服务费
	static String AIRPORT_SERVICE_AMOUNT = "10";
	//附加费用-其它费用
	static String OTHER_AMOUNT = "10";
	//附加费用-其它费用描述
	static String OTHER_AMOUNT_REMARK = "abcdefg";
	
///////////////////订单详情页元素index//////////////////////////////////
	//元-文本（父类为ORDER_MONEY_LAYOUT）
	static int YUAN = 2;
	//订单号-文本
	static int ORDER_NO_ID = 1;
	//上车时间-文本
	static int UP_TIME_ID = 4;
	//下车时间-文本
	static int DOWN_TIME_ID = 6;
	//乘车人姓名-文本
	static int PASSENGER_NAME_ID = 8;
	//订车人姓名-文本
	static int RESERVER_NAME_ID = 11;
	
	
	//登录页面输入内容
	//测试环境
	static String TEST_ENV="test";
	
	//测试１数据
	//正确的手机号
	static String PHONE_VALUE="15522585168";
	//正确的司机ＩＤ
	static String DRIVERID_VALUE="33936";
	//正确的密码
	static String PASSWORD_VALUE="123456";
	
	//不存在的手机号
	static String WRONG_PHONE_VALUE="15522585167";
	//错误的司机ＩＤ
	static String WRONG_DRIVERID_VALUE="33937";
	//错误的密码
	static String WRONG_PASSWORD_VALUE="123455";
	
	//驾驶证到期手机号、司机ＩＤ、密码
	static String EXPIRE_PHONE_VALUE="15500000000";
	static String EXPIRE_DRIVERID_VALUE="33947";
	static String EXPIRE_PASSWORD_VALUE="123456";
		
	//重设密码页面输入内容	
	//公司配备手机号
	static String REPASS_PHONE_VALUE="15522585168";
	//司机ＩＤ
	static String REPASS_DRIVERID_VALUE="33936";
	//验证码
	static String REPASS_CODE_VALUE="";
	//新密码
	static String REPASS_NEW_PASS_VALUE="654321";
	//确认新密码
	static String REPASS_RENEW_PASS_VALUE="654321";
	
	//测试2数据
	//正确的手机号
	static String PHONE_VALUE2="15100000006";
	//正确的司机ＩＤ
	static String DRIVERID_VALUE2="33600";
	//正确的密码
	static String PASSWORD_VALUE2="123456";
	
	//不存在的手机号
	static String WRONG_PHONE_VALUE2="15522585167";
	//错误的司机ＩＤ
	static String WRONG_DRIVERID_VALUE2="33937";
	//错误的密码
	static String WRONG_PASSWORD_VALUE2="123455";
	
	//驾驶证到期手机号、司机ＩＤ、密码
	static String EXPIRE_PHONE_VALUE2="15522574698";
	static String EXPIRE_DRIVERID_VALUE2="33724";
	static String EXPIRE_PASSWORD_VALUE2="123456";
		
	//重设密码页面输入内容	
	//公司配备手机号
	static String REPASS_PHONE_VALUE2="15100000006";
	//司机ＩＤ
	static String REPASS_DRIVERID_VALUE2="33600";
	//验证码
	static String REPASS_CODE_VALUE2="";
	//新密码
	static String REPASS_NEW_PASS_VALUE2="654321";
	//确认新密码
	static String REPASS_RENEW_PASS_VALUE2="654321";
	
	//预生产环境数据
	//正确的手机号
	static String PHONE_VALUE_PRE="15100000008";
	//正确的司机ＩＤ
	static String DRIVERID_VALUE_PRE="36762";
	//正确的密码
	static String PASSWORD_VALUE_PRE="123456";
	
	//不存在的手机号
	static String WRONG_PHONE_VALUE_PRE="15522585167";
	//错误的司机ＩＤ
	static String WRONG_DRIVERID_VALUE_PRE="33937";
	//错误的密码
	static String WRONG_PASSWORD_VALUE_PRE="123455";
	
	//驾驶证到期手机号、司机ＩＤ、密码
	static String EXPIRE_PHONE_VALUE_PRE="15522596352";
	static String EXPIRE_DRIVERID_VALUE_PRE="37124";
	static String EXPIRE_PASSWORD_VALUE_PRE="123456";
		
	//重设密码页面输入内容	
	//公司配备手机号
	static String REPASS_PHONE_VALUE_PRE="15100000008";
	//司机ＩＤ
	static String REPASS_DRIVERID_VALUE_PRE="33600";
	//验证码
	static String REPASS_CODE_VALUE_PRE="";
	//新密码
	static String REPASS_NEW_PASS_VALUE_PRE="654321";
	//确认新密码
	static String REPASS_RENEW_PASS_VALUE_PRE="654321";
	
}
