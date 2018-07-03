package com.wx.domain.result;

import lombok.Data;

@Data
public class WxBaseResult {

	private String return_code;

	private String return_msg;

	private String appid;

	private String mch_id;

	private String nonce_str;

	private String sign;

	private String result_code;

	private String err_code;

	private String err_code_des;
}
