package com.wx.domain.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import lombok.Data;

@Data
public class WxPayBaseRequest {

	/**
	 * 应用ID(微信开放平台审核通过的应用APPID)
	 */
	@XStreamAlias("appid")
	private String appId;

	/**
	 * 商户号(微信支付分配的商户号)
	 */
	@XStreamAlias("mch_id")
	private String mchId;
	
	/**
	 * 随机字符串
	 */
	@XStreamAlias("nonce_str")
	private String nonceStr;
	
	/**
	 * 签名
	 */
	private String sign;
}
