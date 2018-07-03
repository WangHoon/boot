package com.wx.domain.result;

/**
 * 支付结果通知
 * @author wangx
 *
 */
public class WxPayResult extends WxBaseResult {

	private String device_info;
	
	private String openid;
	
	private String is_subscribe;
	
	private String trade_type;
	
	private String bank_type;
	
	private int total_fee;
	
	private String fee_type;
	
	private int cash_fee;
	
	private String cash_fee_type;
	
	private int coupon_fee;
	
	private int coupon_count;
	
	private String coupon_id;
	
	private String transaction_id;
	
	private String out_trade_no;
	
	private String attach;
	
	private String time_end;
}
