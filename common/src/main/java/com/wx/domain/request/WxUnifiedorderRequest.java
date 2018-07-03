package com.wx.domain.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import lombok.Data;

/**
 * 统一下单
 * @author wangx
 *
 */
@Data
@XStreamAlias("xml")
public class WxUnifiedorderRequest extends WxPayBaseRequest {

	/**
	 * 接口版本号
	 * 新增字段，接口版本号，区分原接口，默认填写1.0。入参新增version后，
	 * 则支付通知接口也将返回单品优惠信息字段promotion_detail，请确保支付通知的签名验证能通过
	 */
	private String version;
	
	/**
	 * 设备号(终端设备号(门店号或收银设备ID)，默认请传"WEB")
	 */
	@XStreamAlias("device_info")
	private String deviceInfo;
	
	/**
	 * 签名类型(签名类型，目前支持HMAC-SHA256和MD5，默认为MD5)
	 */
	@XStreamAlias("sign_type")
	private String signType;
	
	/**
	 * 商品描述(需传入应用市场上的APP名字-实际商品名称，天天爱消除-游戏充值。)
	 */
	private String body;
	
	/**
	 * 商品详情 (json字符串)
	 * 对于使用"单品"优惠的商户，改字段必须按照规范上传
	 * WxUnifiedorderDetail
	 */
	private String detail;
	
	/**
	 * 附加数据，在查询API和支付通知中原样返回，该字段主要用于商户携带订单的自定义数据
	 */
	private String attach;
	
	/**
	 * 商户订单号
	 * 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*且在同一个商户号下唯一
	 */
	@XStreamAlias("outTradeNo")
	private String out_trade_no;
	
	/**
	 * 货币类型(默认人民币：CNY)
	 */
	@XStreamAlias("fee_type")
	private String feeType;
	
	/**
	 * 总金额(订单总金额，单位为分)
	 */
	@XStreamAlias("total_fee")
	private int totalFee;
	
	/**
	 * 终端IP(用户端实际ip)
	 */
	@XStreamAlias("spbill_create_ip")
	private String spbillCreateIp;
	
	/**
	 * 交易起始时间(订单生成时间，格式为yyyyMMddHHmmss)
	 */
	@XStreamAlias("time_start")
	private String timeStart;
	
	/**
	 * 交易结束时间(格式为yyyyMMddHHmmss)
	 */
	@XStreamAlias("time_expire")
	private String timeExpire;
	
	/**
	 * 订单优惠标记(订单优惠标记，代金券或立减优惠功能的参数)
	 */
	@XStreamAlias("goods_tag")
	private String goodsTag;
	
	/**
	 * 通知地址
	 * 接收微信支付异步通知回调地址，通知url必须为直接可访问的url，不能携带参数。
	 */
	@XStreamAlias("notify_url")
	private String notifyUrl;
	
	/**
	 * 交易类型-支付类型(默认APP)
	 */
	@XStreamAlias("trade_type")
	private String tradeType;
	
	/**
	 * 指定支付方式(no_credit--指定不能使用信用卡支付)
	 */
	@XStreamAlias("limit_pay")
	private String limitPay;
	
	/**
	 * 场景信息
	 * 该字段用于统一下单时上报场景信息，目前支持上报实际门店信息。
	 * {"store_id": "SZT10000","store_name":"腾讯大厦腾大餐厅"}
	 */
	@XStreamAlias("scene_info")
	private String sceneInfo;

}
