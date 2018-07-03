package com.wx.domain.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import lombok.Data;

/**
 * 下载资金账单
 * @author wangx
 *
 */
@Data
@XStreamAlias("xml")
public class WxDownloadFundFlowRequest extends WxPayBaseRequest {

	/**
	 * 签名类型
	 */
	@XStreamAlias("sign_type")
	private String signType;
	
	/**
	 * 资金账单日期(格式：20140603)
	 */
	@XStreamAlias("bill_date")
	private String billDate;
	
	/**
	 * 资金账户类型
	 * 账单的资金来源账户：
	 * Basic  基本账户
	 * Operation 运营账户
	 * Fees 手续费账户
	 */
	@XStreamAlias("account_type")
	private String accountType;
	
	/**
	 * 压缩账单
	 * 非必传参数，固定值：GZIP，返回格式为.gzip的压缩包账单。不传则默认为数据流形式。
	 */
	@XStreamAlias("tar_type")
	private String tarType;
}
