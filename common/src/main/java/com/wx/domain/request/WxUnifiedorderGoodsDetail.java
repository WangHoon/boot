package com.wx.domain.request;

import lombok.Data;

@Data
public class WxUnifiedorderGoodsDetail {

	/**
	 * 商品编码 由半角的大小写字母、数字、中划线、下划线中的一种或几种组成
	 */
	private String goods_id;

	/**
	 * 微信侧商品编码 微信支付定义的统一商品编号（没有可不传）
	 */
	private String wxpay_goods_id;

	/**
	 * 商品名称(商品的实际名称)
	 */
	private String goods_name;

	/**
	 * 商品数量
	 */
	private int quantity;

	/**
	 * 商品单价 单位为：分。如果商户有优惠，需传输商户优惠后的单价
	 * (例如：用户对一笔100元的订单使用了商场发的纸质优惠券100-50，则活动商品的单价应为原单价-50)
	 */
	private int price;
}
