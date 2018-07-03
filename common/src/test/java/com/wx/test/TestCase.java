package com.wx.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCase {

	/*public static void main(String[] args) {
		Person p = new Person();
		p.setCode("01");
		p.setName("wx");
		
		XStream xstream = new XStream();
		xstream.processAnnotations(p.getClass());
		System.out.println(xstream.toXML(p));
	}*/
	
	/*public static void main(String[] args) {
		String str = "{'name':'wx','code':'190010','age':'20'}";
		JSONObject json = JSONObject.parseObject(str);
		System.out.println(json.getBigDecimal("age"));
	}*/
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			long startTime = df.parse(df.format(calendar.getTime())).getTime();
			calendar.add(calendar.MONTH, 3);
			long endTime = df.parse(df.format(calendar.getTime())).getTime();
			int nDay = (int) ((endTime - startTime) / (24 * 60 * 60 * 1000));
			System.out.println(nDay);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
