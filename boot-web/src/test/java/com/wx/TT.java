package com.wx;

public class TT {

	private String id;

	private String name;

	@Contrast(value=false, getString = "aaa")
	private String code;
	
	public TT(String id, String name, String code){
		this.id = id;
		this.name = name;
		this.code = code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
