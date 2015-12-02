package driverInterface;

public interface ParameterConfig {
	//核实账单-公里数
	static String KILLO = "1.23";
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
	
	//登录页面输入内容
	
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
	
	
	//驾驶证快过期的司机－手机号
	static String EXPIRE_PHONE_VALUE="";
	//驾驶证快过期的司机－司机ＩＤ
	static String EXPIRE_DRIVERID_VALUE="";
	//驾驶证快过期的司机－正确的密码
	static String EXPIRE_PASSWORD_VALUE="";
	
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
	
}
