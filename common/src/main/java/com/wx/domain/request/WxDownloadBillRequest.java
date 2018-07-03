package com.wx.domain.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import lombok.Data;

/**
 * 下载对账单
 * @author wangx
 *
 */
@Data
@XStreamAlias("xml")
public class WxDownloadBillRequest extends WxPayBaseRequest {

	/**
	 * 签名类型
	 */
	@XStreamAlias("sign_type")
	private String signType;
	
	/**
	 * 对账单日期(下载对账单的日期，格式：20140603)
	 */
	@XStreamAlias("bill_date")
	private String billDate;
	
	/**
	 * 账单类型
	 * ALL，返回当日所有订单信息，默认值
	 * SUCCESS，返回当日成功支付的订单
	 * REFUND，返回当日退款订单
	 * RECHARGE_REFUND，返回当日充值退款订单
	 */
	@XStreamAlias("bill_type")
	private String billType;
	
	/**
	 * 压缩账单
	 * 非必传参数，固定值：GZIP，返回格式为.gzip的压缩包账单。不传则默认为数据流形式。
	 */
	@XStreamAlias("tar_type")
	private String tarType;
}
