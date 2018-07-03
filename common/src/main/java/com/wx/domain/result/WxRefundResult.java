package com.wx.domain.result;

/**
 * 申请退款
 * @author wangx
 *
 */
public class WxRefundResult extends WxBaseResult {

	private String transaction_id;
	
	private String out_trade_no;
	
	private String out_refund_no;
	
	private String refund_id;
	
	private int refund_fee;
	
	private int settlement_refund_fee;
	
	private int total_fee;
	
	private int settlement_total_fee;
	
	private String fee_type;
	
	private int cash_fee;
	
	private String cash_fee_type;
	
	private int cash_refund_fee;
}
