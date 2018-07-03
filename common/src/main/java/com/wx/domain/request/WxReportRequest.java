package com.wx.domain.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import lombok.Data;

/**
 * 交易保障
 * @author wangx
 *
 */
@Data
@XStreamAlias("xml")
public class WxReportRequest extends WxPayBaseRequest {

	/**
	 * 设备号
	 * 微信支付分配的终端设备号，商户自定义
	 */
	@XStreamAlias("device_info")
	private String deviceInfo;
}
