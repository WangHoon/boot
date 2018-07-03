package com.wx.domain.result;

/**
 * 查询订单
 * @author wangx
 *
 */
public class WxOrderQueryResult extends WxBaseResult {

	private String device_info;
	
	private String openid;
	
	private String is_subscribe;
	
	private String trade_type;
	
	private String trade_state;
	
	private String bank_type;
	
	private int total_fee;
	
	private String fee_type;
	
	private int cash_fee;
	
	private String cash_fee_type;
	
	private int settlement_total_fee;
	
	private int coupon_fee;
	
	private int coupon_count;
	
	private String transaction_id;
	
	private String out_trade_no;
	
	private String attach;
	
	private String time_end;
	
	private String trade_state_desc;
}
