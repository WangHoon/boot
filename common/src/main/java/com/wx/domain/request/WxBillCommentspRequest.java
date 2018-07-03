package com.wx.domain.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import lombok.Data;

/**
 * 拉取订单评价数据
 * @author wangx
 *
 */
@Data
@XStreamAlias("xml")
public class WxBillCommentspRequest extends WxPayBaseRequest {

	/**
	 * 签名类型
	 */
	@XStreamAlias("sign_type")
	private String signType;
	
	/**
	 * 开始时间 
	 * 按用户评论时间批量拉取的起始时间，格式为yyyyMMddHHmmss
	 */
	@XStreamAlias("begin_time")
	private String beginTime;
	
	/**
	 * 结束时间
	 * 按用户评论时间批量拉取的结束时间，格式为yyyyMMddHHmmss
	 */
	@XStreamAlias("end_time")
	private String endTime;
	
	/**
	 * 位移
	 * 指定从某条记录的下一条开始返回记录。
	 * 接口调用成功时，会返回本次查询最后一条数据的offset。
	 * 商户需要翻页时，应该把本次调用返回的offset 作为下次调用的入参。
	 * 注意offset是评论数据在微信支付后台保存的索引，未必是连续的
	 */
	private int offset;
	
	/**
	 * 条数
	 * 一次拉取的条数, 最大值是200，默认是200
	 */
	private int limit;
}
