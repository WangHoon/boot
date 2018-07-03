package com.wx.domain.request;

import lombok.Data;

@Data
public class WxUnifiedorderDetail {

	/**
	 * 订单原价
	 * 1.商户侧一张小票订单可能被分多次支付，订单原价用于记录整张小票的交易金额。
	 * 2.当订单原价与支付金额不相等，则不享受优惠。
	 * 3.该字段主要用于防止同一张小票分多次支付，以享受多次优惠的情况，正常支付订单不必上传此参数
	 */
	private int cost_price;
	
	/**
	 * 商品小票ID
	 */
	private String receipt_id;
	
	/**
	 * 单品列表(单品信息，使用Json数组格式提交)
	 * WxUnifiedorderGoodsDetail
	 */
	private String goods_detail;
}
