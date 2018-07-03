package com.wx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wx.inter.InterTestCase;

@RestController
@RequestMapping("/my")
public class MyController {

	@ResponseBody
	@RequestMapping("")
	@InterTestCase(code = "199010")
	public String getAll(){
		return "wx";
	}
}
