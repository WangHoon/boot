package com.wx.domain.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import lombok.Data;

/**
 * 查询订单
 * @author wangx
 *
 */
@Data
@XStreamAlias("xml")
public class WxOrderQueryRequest extends WxPayBaseRequest {

	
	/**
	 * 微信订单号
	 * 微信的订单号，优先使用
	 */
	@XStreamAlias("transaction_id")
	private String transactionId;
	
	/**
	 * 商户订单号
	 * 商户系统内部的订单号，当没提供transaction_id时需要传这个。
	 */
	@XStreamAlias("out_trade_no")
	private String outTradeNo;
}
