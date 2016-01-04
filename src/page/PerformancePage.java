package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.PerformanceConstants;

/**
 *创建日期:2015-12-10
 *作者： 陈玉婵
 */
public class PerformancePage extends UiAutomatorTestCase implements PerformanceConstants {
	MainMethod performancePage= new MainMethod();
	//判断返回icon是否存在
	public Boolean returnExist(){
		return performancePage.isExist(BACK);
	}
	//点击返回
	public void returnClick(){
		performancePage.clickObj(BACK);
	}
	//判断标题是否存在
	public Boolean titleExist(){
		return performancePage.isExist(TITLE);
	}
	//获取标题内容
	public String titleText(){
		return performancePage.getText(TITLE);
	}
	//判断平均工作时长栏是否存在
	public Boolean rlWorkTimeExist(){
		return performancePage.isExist(RL_WORK_TIME);
	}
	//判断平均工作时长栏的标题是否存在
	public Boolean workTimeExist(){
		return performancePage.isExistFromId(RL_WORK_TIME, INDEX_WORK_TIME);
		
	}
	//获取平均工作时长栏的标题
	public String workTimeText(){
		return performancePage.getTextFromId(RL_WORK_TIME, INDEX_WORK_TIME);
	}
	//判断平均工作时长栏的值是否存在
	public Boolean workTimeValueExist(){
		return performancePage.isExistFromId(RL_WORK_TIME, INDEX_WORK_TIME_VALUE);
		
	}
	//获取平均工作时长栏的值
	public String workTimeValueText(){
		return performancePage.getTextFromId(RL_WORK_TIME, INDEX_WORK_TIME_VALUE);
	}
	//点击平均工作时长栏
	public void rlWorkTimeClick(){
		performancePage.clickObj(RL_WORK_TIME);
	}

	//判断工作天数栏是否存在
	public Boolean rlWorkDaysExist(){
		return performancePage.isExist(RL_WORK_DAYS);
	}
	//判断工作天数栏的标题是否存在
	public Boolean workDaysExist(){
		return performancePage.isExistFromId(RL_WORK_DAYS, INDEX_WORK_DAYS);		
	}
	//获取工作天数栏的标题
	public String workDaysText(){
		return performancePage.getTextFromId(RL_WORK_DAYS, INDEX_WORK_DAYS);
	}
	//判断工作天数栏的值是否存在
	public Boolean workDaysValueExist(){
		return performancePage.isExistFromId(RL_WORK_DAYS, INDEX_WORK_DAYS_VALUE);		
	}
	//获取工作天数栏的值
	public String workDaysValueText(){
		return performancePage.getTextFromId(RL_WORK_DAYS, INDEX_WORK_DAYS_VALUE);
	}
	//判断应出勤天数是否存在
	public Boolean wholeDaysValueExist(){
		return performancePage.isExistFromId(RL_WORK_DAYS, INDEX_WHOLE_DAYS_VALUE);
	}
	//获取应出勤天数的值
	public String wholeDaysValueText(){
		return performancePage.getTextFromId(RL_WORK_DAYS, INDEX_WHOLE_DAYS_VALUE);
	}
	//点击工作天数栏
	public void rlWorkDaysClick(){
		performancePage.clickObj(RL_WORK_DAYS);
	}
	
	//判断响应率栏是否存在
	public Boolean rlRspRateExist(){
		return performancePage.isExist(RL_RSP_RATE);
	}
	//判断响应率栏的标题是否存在
	public Boolean rspRateExist(){
		return performancePage.isExistFromId(RL_RSP_RATE, INDEX_RSP_RATE);		
	}
	//获取响应率栏的标题
	public String rspRateText(){
		return performancePage.getTextFromId(RL_RSP_RATE, INDEX_RSP_RATE);
	}
	//判断响应率栏的值是否存在
	public Boolean rspRateValueExist(){
		return performancePage.isExistFromId(RL_RSP_RATE, INDEX_RSP_RATE_VALUE);		
	}
	//获取响应率栏的值
	public String rspRateValueText(){
		return performancePage.getTextFromId(RL_RSP_RATE, INDEX_RSP_RATE_VALUE);
	}
	//点击响应率栏
	public void rlRspRateClick(){
		performancePage.clickObj(RL_RSP_RATE);
	}
	
	//判断服务评分栏是否存在
	public Boolean rlSvcScoreExist(){
		return performancePage.isExist(RL_SVC_SCORE);
	}
	//判断服务评分栏的标题是否存在
	public Boolean svcScoreExist(){
		return performancePage.isExistFromId(RL_SVC_SCORE, INDEX_SVC_SCORE);	
	}
	//获取服务评分栏的标题
	public String svcScoreText(){
		return performancePage.getTextFromId(RL_SVC_SCORE, INDEX_SVC_SCORE);
	}
	//判断服务评分栏的值是否存在
	public Boolean svcScoreValueExist(){
		return performancePage.isExistFromId(RL_SVC_SCORE, INDEX_SVC_SCORE_VALUE);	
	}
	//获取服务评分栏的值
	public String svcScoreValueText(){
		return performancePage.getTextFromId(RL_SVC_SCORE, INDEX_SVC_SCORE_VALUE);
	}
	//点击服务评分栏
	public void rlSvcScoreClick(){
		performancePage.clickObj(RL_SVC_SCORE);
	}
	
	//判断订单量栏是否存在
	public Boolean llOrderQuantityExist(){
		return performancePage.isExist(LL_ORDER_QUANTITY);
	}
	//判断订单量栏的标题是否存在
	public Boolean orderQuantityExist(){
		return performancePage.isExistFromId(LL_ORDER_QUANTITY, INDEX_ORDER_QUANTITY);		
	}
	//获取订单量栏的标题
	public String orderQuantityText(){
		return performancePage.getTextFromId(LL_ORDER_QUANTITY, INDEX_ORDER_QUANTITY);
	}
	//判断订单量栏的值是否存在
	public Boolean orderQuantityValueExist(){
		return performancePage.isExistFromId(LL_ORDER_QUANTITY, INDEX_ORDER_QUANTITY_VALUE);		
	}
	//获取订单量栏的值
	public String orderQuantityValueText(){
		return performancePage.getTextFromId(LL_ORDER_QUANTITY, INDEX_ORDER_QUANTITY_VALUE);
	}
	//点击订单量栏
	public void llOrderQuantityClick(){
		performancePage.clickObj(LL_ORDER_QUANTITY);
	}
	
	//判断客户充值额栏是否存在
	public Boolean llRechargeAmountExist(){
		return performancePage.isExist(LL_RECHARGE_AMOUNT);
	}
	//判断客户充值额栏的标题是否存在
	public Boolean rechargeAmountExist(){
		return performancePage.isExistFromId(LL_RECHARGE_AMOUNT, INDEX_RECHARGE_AMOUNT);		
	}
	//获取客户充值额栏的标题
	public String rechargeAmountText(){
		return performancePage.getTextFromId(LL_RECHARGE_AMOUNT, INDEX_RECHARGE_AMOUNT);
	}
	//判断客户充值额栏的值是否存在
	public Boolean rechargeAmountValueExist(){
		return performancePage.isExistFromId(LL_RECHARGE_AMOUNT, INDEX_RECHARGE_AMOUNT_VALUE);		
	}
	//获取客户充值额栏的值
	public String rechargeAmountValueText(){
		return performancePage.getTextFromId(LL_RECHARGE_AMOUNT, INDEX_RECHARGE_AMOUNT_VALUE);
	}
	//点击客户充值额栏
	public void llRechargeAmountClick(){
		performancePage.clickObj(LL_RECHARGE_AMOUNT);
	}

	//判断计奖营业额栏是否存在
	public Boolean llTurnoverExist(){
		return performancePage.isExist(LL_TURNOVER);
	}
	//判断计奖营业额栏的标题是否存在
	public Boolean turnoverExist(){
		return performancePage.isExistFromId(LL_TURNOVER, INDEX_TURNOVER);		
	}
	//获取计奖营业额栏的标题
	public String turnoverText(){
		return performancePage.getTextFromId(LL_TURNOVER, INDEX_TURNOVER);
	}
	//判断计奖营业额栏的值是否存在
	public Boolean turnoverValueExist(){
		return performancePage.isExistFromId(LL_TURNOVER, INDEX_TURNOVER_VALUE);		
	}
	//获取计奖营业额栏的值
	public String turnoverValueText(){
		return performancePage.getTextFromId(LL_TURNOVER, INDEX_TURNOVER_VALUE);
	}
	//点击计奖营业额栏
	public void llTurnoverClick(){
		performancePage.clickObj(LL_TURNOVER);
	}

	
	

}
