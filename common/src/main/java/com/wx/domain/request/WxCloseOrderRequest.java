package com.wx.domain.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import lombok.Data;

/**
 * 关闭订单
 * @author wangx
 *
 */
@Data
@XStreamAlias("xml")
public class WxCloseOrderRequest extends WxPayBaseRequest {

	/**
	 * 商户订单号
	 */
	@XStreamAlias("out_trade_no")
	private String outTradeNo;
}
