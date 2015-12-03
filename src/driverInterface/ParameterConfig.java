package driverInterface;

public interface ParameterConfig {
	
	//核实账单页输入数据
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
