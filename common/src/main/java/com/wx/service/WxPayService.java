package com.wx.service;

import com.wx.domain.request.WxUnifiedorderRequest;
import com.wx.domain.result.WxUnifiedorderResult;

public interface WxPayService {

	public WxUnifiedorderResult unifiedorder(WxUnifiedorderRequest order);
}
