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
	//判断平均工作时长栏的标题或值是否存在
	public Boolean workTimeExist(int index){
		return performancePage.isExistFromId(RL_WORK_TIME, index);
		
	}
	//获取平均工作时长栏的标题或值
	public String workTimeText(int index){
		return performancePage.getTextFromId(RL_WORK_TIME, index);
	}
	//点击平均工作时长栏
	public void rlWorkTimeClick(){
		performancePage.clickObj(RL_WORK_TIME);
	}

	//判断工作天数栏是否存在
	public Boolean rlWorkDaysExist(){
		return performancePage.isExist(RL_WORK_DAYS);
	}
	//判断工作天数栏的标题或值是否存在
	public Boolean workDaysExist(int index){
		return performancePage.isExistFromId(RL_WORK_DAYS, index);
		
	}
	//获取工作天数栏的标题或值
	public String workDaysText(int index){
		return performancePage.getTextFromId(RL_WORK_DAYS, index);
	}
	//点击工作天数栏
	public void rlWorkDaysClick(){
		performancePage.clickObj(RL_WORK_DAYS);
	}
	
	//判断响应率栏是否存在
	public Boolean rlRspRateExist(){
		return performancePage.isExist(RL_RSP_RATE);
	}
	//判断响应率栏的标题或值或总天数是否存在
	public Boolean rspRateExist(int index){
		return performancePage.isExistFromId(RL_RSP_RATE, index);
		
	}
	//获取响应率栏的标题或值或总天数
	public String rspRateText(int index){
		return performancePage.getTextFromId(RL_RSP_RATE, index);
	}
	//点击响应率栏
	public void rlRspRateClick(){
		performancePage.clickObj(RL_RSP_RATE);
	}
	
	//判断服务评分栏是否存在
	public Boolean rlSvcScoreExist(){
		return performancePage.isExist(RL_SVC_SCORE);
	}
	//判断服务评分栏的标题或值是否存在
	public Boolean svcScoreExist(int index){
		return performancePage.isExistFromId(RL_SVC_SCORE, index);
		
	}
	//获取服务评分栏的标题或值
	public String svcScoreText(int index){
		return performancePage.getTextFromId(RL_SVC_SCORE, index);
	}
	//点击服务评分栏
	public void rlSvcScoreClick(){
		performancePage.clickObj(RL_SVC_SCORE);
	}
	
	//判断订单量栏是否存在
	public Boolean llOrderQuantityExist(){
		return performancePage.isExist(LL_ORDER_QUANTITY);
	}
	//判断订单量栏的标题或值是否存在
	public Boolean orderQuantityExist(int index){
		return performancePage.isExistFromId(LL_ORDER_QUANTITY, index);
		
	}
	//获取订单量栏的标题或值
	public String orderQuantityText(int index){
		return performancePage.getTextFromId(LL_ORDER_QUANTITY, index);
	}
	//点击订单量栏
	public void llOrderQuantityClick(){
		performancePage.clickObj(LL_ORDER_QUANTITY);
	}
	
	//判断客户充值额栏是否存在
	public Boolean llRechargeAmountExist(){
		return performancePage.isExist(LL_RECHARGE_AMOUNT);
	}
	//判断客户充值额栏的标题或值是否存在
	public Boolean rechargeAmountExist(int index){
		return performancePage.isExistFromId(LL_RECHARGE_AMOUNT, index);
		
	}
	//获取客户充值额栏的标题或值
	public String rechargeAmountText(int index){
		return performancePage.getTextFromId(LL_RECHARGE_AMOUNT, index);
	}
	//点击客户充值额栏
	public void llRechargeAmountClick(){
		performancePage.clickObj(LL_RECHARGE_AMOUNT);
	}

	//判断计奖营业额栏是否存在
	public Boolean llTurnoverExist(){
		return performancePage.isExist(LL_TURNOVER);
	}
	//判断计奖营业额栏的标题或值是否存在
	public Boolean turnoverExist(int index){
		return performancePage.isExistFromId(LL_TURNOVER, index);
		
	}
	//获取计奖营业额栏的标题或值
	public String turnoverText(int index){
		return performancePage.getTextFromId(LL_TURNOVER, index);
	}
	//点击计奖营业额栏
	public void llTurnoverClick(){
		performancePage.clickObj(LL_TURNOVER);
	}

	
	

}
