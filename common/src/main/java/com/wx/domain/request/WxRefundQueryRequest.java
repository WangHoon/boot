package com.wx.domain.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import lombok.Data;

/**
 * 查询退款
 * @author wangx
 *
 */
@Data
@XStreamAlias("xml")
public class WxRefundQueryRequest extends WxPayBaseRequest {

	/**
	 * 微信订单号
	 * 微信订单号查询的优先级是： refund_id > out_refund_no > transaction_id > out_trade_no
	 */
	@XStreamAlias("transaction_id")
	private String transactionId;
	
	/**
	 * 商户订单号
	 */
	@XStreamAlias("out_trade_no")
	private String outTradeNo;
	
	/**
	 * 商户退款单号
	 */
	@XStreamAlias("out_refund_no")
	private String outRefundNo;
	
	/**
	 * 微信退款单号
	 * 微信生成的退款单号，在申请退款接口有返回
	 */
	@XStreamAlias("refund_id")
	private String refundId;
	
	/**
	 * 偏移量,当部分退款次数超过10次时可使用，表示返回的查询结果从这个偏移量开始取记录
	 */
	private int offset;
}
