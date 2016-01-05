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
	//判断平均工作时长是否存在
	public Boolean workTimeExist(){
		return performancePage.isExistFromText(TEXT_WORK_TIME);
		
	}
	//判断平均工作时长栏的值是否存在
	public Boolean workTimeValueExist(){
		return performancePage.isExistTextBrother(TEXT_WORK_TIME, INDEX_WORK_TIME_VALUE);
		
	}
	//获取平均工作时长栏的值
	public String workTimeValueText(){
		return performancePage.getTextBrother(TEXT_WORK_TIME, INDEX_WORK_TIME_VALUE);
	}
	//点击平均工作时长栏
	public void rlWorkTimeClick(){
		performancePage.clickObj(RL_WORK_TIME);
	}

	//判断工作天数是否存在
	public Boolean workDaysExist(){
		return performancePage.isExistFromText(TEXT_WORK_DAYS);		
	}
	//判断应出勤天数的值是否存在
	public Boolean workDaysValueExist(){
		return performancePage.isExistTextBroChild(TEXT_WORK_DAYS, INDEX_WORK_DAYS_PAREN, INDEX_WORK_DAYS_VALUE);		
	}
	//获取应出勤天数的值
	public String workDaysValueText(){
		return performancePage.getTextBrotherChild(TEXT_WORK_DAYS, INDEX_WORK_DAYS_PAREN, INDEX_WORK_DAYS_VALUE);
	}
	//判断总工作天数是否存在
	public Boolean wholeDaysValueExist(){
		return performancePage.isExistTextBroChild(TEXT_WORK_DAYS, INDEX_WORK_DAYS_PAREN, INDEX_WHOLE_DAYS_VALUE);
	}
	//获取总工作天数的值
	public String wholeDaysValueText(){
		return performancePage.getTextBrotherChild(TEXT_WORK_DAYS, INDEX_WORK_DAYS_PAREN, INDEX_WHOLE_DAYS_VALUE);
	}
	//点击工作天数栏
	public void rlWorkDaysClick(){
		performancePage.clickObj(RL_WORK_DAYS);
	}

	//判断响应率栏是否存在
	public Boolean rspRateExist(){
		return performancePage.isExistFromText(TEXT_RSP_RATE);		
	}
	//判断响应率栏的值是否存在
	public Boolean rspRateValueExist(){
		return performancePage.isExistTextBrother(TEXT_RSP_RATE, INDEX_RSP_RATE_VALUE);		
	}
	//获取响应率栏的值
	public String rspRateValueText(){
		return performancePage.getTextBrother(TEXT_RSP_RATE, INDEX_RSP_RATE_VALUE);
	}
	//点击响应率栏
	public void rlRspRateClick(){
		performancePage.clickObj(RL_RSP_RATE);
	}
	
	//判断服务评分栏的标题是否存在
	public Boolean svcScoreExist(){
		return performancePage.isExistFromText(TEXT_SVC_SCORE);	
	}
	//判断服务评分栏的值是否存在
	public Boolean svcScoreValueExist(){
		return performancePage.isExistTextBrother(TEXT_SVC_SCORE, INDEX_SVC_SCORE_VALUE);	
	}
	//获取服务评分栏的值
	public String svcScoreValueText(){
		return performancePage.getTextBrother(TEXT_SVC_SCORE, INDEX_SVC_SCORE_VALUE);
	}
	//点击服务评分栏
	public void rlSvcScoreClick(){
		performancePage.clickObj(RL_SVC_SCORE);
	}
	
	//判断订单量是否存在
	public Boolean orderQuantityExist(){
		return performancePage.isExistFromText(TEXT_ORDER_QUANTITY);		
	}
	//判断订单量栏的值是否存在
	public Boolean orderQuantityValueExist(){
		return performancePage.isExistTextBrother(TEXT_ORDER_QUANTITY, INDEX_ORDER_QUANTITY_VALUE);		
	}
	//获取订单量栏的值
	public String orderQuantityValueText(){
		return performancePage.getTextBrother(TEXT_ORDER_QUANTITY, INDEX_ORDER_QUANTITY_VALUE);
	}
	//点击订单量栏
	public void llOrderQuantityClick(){
		performancePage.clickObj(LL_ORDER_QUANTITY);
	}
	
	//判断客户充值额是否存在
	public Boolean rechargeAmountExist(){
		return performancePage.isExistFromText(TEXT_RECHARGE_AMOUNT);		
	}
	//判断客户充值额栏的值是否存在
	public Boolean rechargeAmountValueExist(){
		return performancePage.isExistTextBrother(TEXT_RECHARGE_AMOUNT, INDEX_RECHARGE_AMOUNT_VALUE);		
	}
	//获取客户充值额栏的值
	public String rechargeAmountValueText(){
		return performancePage.getTextBrother(TEXT_RECHARGE_AMOUNT, INDEX_RECHARGE_AMOUNT_VALUE);
	}
	//点击客户充值额栏
	public void llRechargeAmountClick(){
		performancePage.clickObj(LL_RECHARGE_AMOUNT);
	}

	//判断计奖营业额是否存在
	public Boolean turnoverExist(){
		return performancePage.isExistFromText(TEXT_TURNOVER);		
	}
	//判断计奖营业额栏的值是否存在
	public Boolean turnoverValueExist(){
		return performancePage.isExistTextBrother(TEXT_TURNOVER, INDEX_TURNOVER_VALUE);		
	}
	//获取计奖营业额栏的值
	public String turnoverValueText(){
		return performancePage.getTextBrother(TEXT_TURNOVER, INDEX_TURNOVER_VALUE);
	}
	//点击计奖营业额栏
	public void llTurnoverClick(){
		performancePage.clickObj(LL_TURNOVER);
	}

	
	

}
