package driverInterface;
/**
 * Description：新增请假申请页面
 * Date: 2015-12-8
 * @author 李怡萱
 * */
public interface NewLeaveApplyConstants {

	//////////////////////////////////////////////////////////////////////////////////////////////////
	//新增请假申请-资源ID
	//////////////////////////////////////////////////////////////////////////////////////////////////
	//标题栏
	static String TITLE="com.szzc.ucar.driver:id/titlebar_title";
	//返回按钮
	static String BACKBTN="com.szzc.ucar.driver:id/titlebar_lefticon";
	//FrameLayout
	static String FRAME_LAYOUT="android.widget.FrameLayout";
	//请假类型-文本-ID
	static int LEAVE_TYPE_TEXT_ID=2;
	//请假班次-文本-ID
	static int LEAVE_CLASS_TEXT_ID=4;
	//请假班次数量-文本-ID
	static int LEAVE_CLASS_AMOUNT_TEXT_ID=5;
	//调休班次-文本
	static String OFF_CLASS_TEXT="调休班次";
	
	//请假类型
	static String LEAVE_TYPE="com.szzc.ucar.driver:id/txt_apply_type";
	//请假班次
	static String LEAVE_CLASS="com.szzc.ucar.driver:id/txt_off_shift";
	//请假班次数量
	static String LEAVE_CLASS_AMOUNT="com.szzc.ucar.driver:id/txt_apply_leave_number";
	//调休班次
	static String OFF_CLASS="com.szzc.ucar.driver:id/txt_apply_off_time";
	
	//请假原因输入框
	static String LEAVE_CAUSE_BOX="com.szzc.ucar.driver:id/ll_apply_cause";
	//请假原因
	static String LEAVE_CAUSE="com.szzc.ucar.driver:id/apply_cause";
	//字数限制
	static String REMAINING_WORD_NUMBER="com.szzc.ucar.driver:id/Remaining_word_number";
	//医院证明1
	static String HOSPITAL_CERTIFICATE_ONE="com.szzc.ucar.driver:id/hospital_certificate_one";
	//医院证明2
	static String HOSPITAL_CERTIFICATE_TWO="com.szzc.ucar.driver:id/hospital_certificate_two";
	//医院证明3
	static String HOSPITAL_CERTIFICATE_THREE="com.szzc.ucar.driver:id/hospital_certificate_three";
	//从相册选择
	static String CHOOSE_FROM_ALBUM="android:id/button2";
	//相册
	static String CHOOSE_ALBUM="com.android.gallery3d:id/list_albumset";
	static int MOBILE_ALBUM_ID=0;
	//照片坐标
	static int PHOTO_X=120;
	static int PHOTO_Y=250;
	//右上角对勾
	static String RIGHT_BTN="com.android.gallery3d:id/head_select_right";
	//保存按钮
	static String SAVE_BTN="com.szzc.ucar.driver:id/btn_save";
	////////////////////////////////////////////请假类型/请假班次弹窗////////////////////////////////////////////
	//弹窗标题
	static String CLASS_TITLE="com.szzc.ucar.driver:id/base_title";
	//取消按钮
	static String CANCEL_BTN="com.szzc.ucar.driver:id/cancel";
	//确定按钮
	static String COMPLETE_BTN="com.szzc.ucar.driver:id/complete";
	///////////////////////////////////////////无可选时间/提交成功/失败弹窗/////////////////////////////////////////////////
	//提示语
	static String CONFIRM_TEXT="com.szzc.ucar.driver:id/confirm_text";
	//确定按钮
	static String OK_BTN="com.szzc.ucar.driver:id/ok_btn";
	
	

}
