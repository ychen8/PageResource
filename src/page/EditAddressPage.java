/**
 * 创建日期2015年12月02日
 * 作者：郭艳松
 * */



package page;

import baseMethod.MainMethod;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import driverInterface.EditAddressConstants;

public class EditAddressPage extends UiAutomatorTestCase implements EditAddressConstants{
     MainMethod editaddpage =new MainMethod();
	//判断标题是否存在
	public Boolean titleExist(){
		return editaddpage.isExist(ADDRESSTITLE);
	}
	//获取标题内容
	public String titleText(){
		return editaddpage.getText(ADDRESSTITLE);
	}
	//判断返回按钮是否存在
	public Boolean backBtnExist(){
		return editaddpage.isExist(BACKBTN);
	}
	//点击返回按钮
	public void backBtnClick(){
		editaddpage.clickObj(BACKBTN);
	}
	//判断城市是否存在
	public Boolean cityExist(){
	 	return editaddpage.isExist(CITYNAME);
	}
	//获取城市内容
	public String cityText(){
		return editaddpage.getText(CITYNAME);
	}
	//点击城市
	public void cityClick(){
		editaddpage.clickObj(CITYNAME);
	}
	//判断地址输入框是否存在
	public Boolean inputBlankExist(){
		return editaddpage.isExist(INPUTBLANK);
	}
	//获取地址输入框内容
	public String inputBlankText(){
		return editaddpage.getText(INPUTBLANK);
	}
	//输入地址信息
	public Boolean inputAddress(){
		return editaddpage.setxt(INPUTBLANK, INPUTADDRESS);
	}
	//清除输入的地址信息
	public void clearAddress(){
		editaddpage.cleartxt(INPUTBLANK);
	}
	//判断清除按钮是否存在
	public Boolean delBtnExist(){
		return editaddpage.isExist(DELBTN);
	}
	//点击清除按钮
	public void delBtnClick(){
		editaddpage.clickObj(DELBTN);
	}
	//获取搜索地址结果数量
	public int addressCount(){
		return editaddpage.getChildCount(ADDRESSLIST);
	}
	//获取第I个结果的地址文本
	public String addressNameText(int index){
		return editaddpage.getListText(ADDRESSLIST, index, ADDRESSNAME);
	}
	//获取第I个结果的详细地址文本
	public String addressDetailText(int index){
		return editaddpage.getListText(ADDRESSLIST, index, ADDRESSDETAIL);
	}
	//判断第I个结果的地址是否存在
	public Boolean addressNameExist(int index){
		return editaddpage.isExistFromList(ADDRESSLIST, index, ADDRESSNAME);
	}
	//判断第I个结果的详细地址是否存在
	public Boolean addressDetailExist(int index){
		return editaddpage.isExistFromList(ADDRESSLIST, index, ADDRESSDETAIL);
	}
	//点击第I个结果的地址
	public void addressNameClick(int index){
		editaddpage.clickObjFromList(ADDRESSLIST, index, ADDRESSNAME);
	}
	//点击第I个结果的详细地址
	public void addressDetailClick(int index){
		editaddpage.clickObjFromList(ADDRESSLIST, index, ADDRESSDETAIL);
	}

}
