package com.wx.domain.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import lombok.Data;

/**
 * 申请退款
 * @author wangx
 *
 */
@Data
@XStreamAlias("xml")
public class WxRefundRequest extends WxPayBaseRequest {
	
	/**
	 * 签名类型
	 * 签名类型，目前支持HMAC-SHA256和MD5，默认为MD5
	 */
	@XStreamAlias("sign_type")
	private String signType;
	
	/**
	 * 微信订单号
	 * 微信生成的订单号，在支付通知中有返回
	 */
	@XStreamAlias("transaction_id")
	private String transactionId;
	
	/**
	 * 商户订单号
	 * 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一。
	 */
	@XStreamAlias("out_trade_no")
	private String outTradeNo;
	
	/**
	 * 商户退款单号
	 * 商户系统内部的退款单号，商户系统内部唯一，只能是数字、大小写字母_-|*@ ，同一退款单号多次请求只退一笔。
	 */
	@XStreamAlias("out_refund_no")
	private String outRefundNo;
	
	/**
	 * 订单金额
	 * 订单总金额，单位为分，只能为整数
	 */
	@XStreamAlias("total_fee")
	private int totalFee;
	
	/**
	 * 退款金额
	 * 退款总金额，订单总金额，单位为分，只能为整数
	 */
	@XStreamAlias("refund_fee")
	private int refundFee;
	
	/**
	 * 退款货币种类(默认人民币：CNY)
	 */
	@XStreamAlias("refund_fee_type")
	private String refundFeeType;
	
	/**
	 * 退款原因
	 * 若商户传入，会在下发给用户的退款消息中体现退款原因
	 */
	@XStreamAlias("refund_desc")
	private String refundDesc;
	
	/**
	 * 退款资金来源
	 * 仅针对老资金流商户使用
	 * REFUND_SOURCE_UNSETTLED_FUNDS---未结算资金退款（默认使用未结算资金退款）
	 * REFUND_SOURCE_RECHARGE_FUNDS---可用余额退款
	 */
	@XStreamAlias("refund_account")
	private String refundAccount;
	
	/**
	 * 退款结果通知url
	 * 异步接收微信支付退款结果通知的回调地址，通知URL必须为外网可访问的url，不允许带参数
	 * 如果参数中传了notify_url，则商户平台上配置的回调地址将不会生效
	 */
	@XStreamAlias("notify_url")
	private String notifyUrl;

}
