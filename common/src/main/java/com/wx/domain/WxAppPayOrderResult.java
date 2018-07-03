package com.wx.domain;

import lombok.Data;

@Data
public class WxAppPayOrderResult {

	/**
	 * 签名
	 */
	private String sign;
	
	/**
	 * 预支付交易会话ID
	 */
	private String prepayId;
	
	/**
	 * 商户号
	 */
	private String partnerId;
	
	/**
	 * 应用ID
	 */
	private String appId;
	
	/**
	 * 扩展字段
	 */
	private String packageValue;
	
	/**
	 * 时间戳
	 */
	private String timeStamp;
	
	/**
	 * 随机字符串
	 */
	private String nonceStr;
}
