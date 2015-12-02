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
	
}
