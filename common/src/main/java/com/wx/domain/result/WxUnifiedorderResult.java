package com.wx.domain.result;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import lombok.Data;

/**
 * 统一下单
 * @author wangx
 *
 */
@Data
@XStreamAlias("xml")
public class WxUnifiedorderResult extends WxBaseResult {

	private String trade_type;

	private String prepay_id;
	
	private String device_info;
}
