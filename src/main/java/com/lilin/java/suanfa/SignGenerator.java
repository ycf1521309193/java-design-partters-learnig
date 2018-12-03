package com.lilin.java.suanfa;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.BeanContext;

public class SignGenerator {

	public static String sign(Object param) {
		TreeMap<String, Object> treeMap = (TreeMap<String, Object>) bean2Map(param);
		StringBuffer stringBuffer = new StringBuffer();
		for (String key : treeMap.keySet()) {
			System.out.println(String.format("key=%s,value=%s", key,
					treeMap.get(key)));
			if(treeMap.get(key) == null ){
				continue;
			}
			stringBuffer.append(treeMap.get(key));
		}

		System.out.println("original=" + stringBuffer.toString());
		// Base64.en
		String md5Str = DigestUtils.md5Hex(stringBuffer.toString());
		System.out.println("md5Str = " + md5Str);
		
		return "";
	}

	public static Map<String, Object> initMap() {
		Map<String, Object> map = new TreeMap<>();
		map.put("hopenId", "123123123");
		map.put("orderName", "100元加油卡");
		map.put("totalAmount", 10000);
		map.put("actualAmount", 10000);
		map.put("fuelAmount", 9.23);
		map.put("serviceSupplier", "youyuer");
		map.put("gasCode", "1234");
		map.put("discountAmount", 1);
		map.put("orderSource", 1);
		map.put("orderNo", "121231231231");
		map.put("phone", "13122021251");
		map.put("payType", 1);
		map.put("payTime", "2018-12-03 12:00:00");
		return map;
	}

	@Test
	public void testSign() {
		Map<String, Object> initMap = initMap();
		sign(initMap);
		System.out.println("------------------------");
		testSignObject();

	}

	public void testSignObject() {
		Domain domain = new Domain();
		domain.setHopenId("123123123");
		domain.setOrderName("100元加油卡");
		domain.setTotalAmount(new BigDecimal(10000));
		domain.setActualAmount(new BigDecimal(10000));
		domain.setFuelAmount(9.23);
		domain.setServiceSupplier("youyuer");
		domain.setGasCode("1234");
		domain.setDiscountAmount(new BigDecimal(1));
		domain.setOrderSource(1);
		domain.setOrderNo("121231231231");
		domain.setPhone("13122021251");
		domain.setPayType(1);
		domain.setPayTime("2018-12-03 12:00:00");
		sign(domain);

	}

	@Test
	public void testJson(){
		String jsonStr = "{\r\n" + 
				"    \"actualAmount\":9000,\r\n" + 
				"    \"appKey\":\"refuel-youyuer\",\r\n" + 
				"    \"discountAmount\":1000,\r\n" + 
				"    \"fuelAmount\":20.25,\r\n" + 
				"    \"gasName\":\"加油站名称\",\r\n" + 
				"    \"hopenId\":\"5b544c5354594e4d5e4e47545b594f77323232393a3c3c\",\r\n" + 
				"    \"orderName\":\"满100减10元\",\r\n" + 
				"    \"orderNo\":\"1230215\",\r\n" + 
				"    \"orderSource\":0,\r\n" + 
				"    \"payTime\":1543830042542,\r\n" + 
				"    \"payType\":1,\r\n" + 
				"    \"serviceSupplier\":\"youyuer\",\r\n" + 
				"    \"sign\":\"3ab824c2d6933de0c25d7418f5a377a8\",\r\n" + 
				"    \"timestamp\":1543830042542,\r\n" + 
				"    \"totalAmount\":10000\r\n" + 
				"}";
		Domain domain = JSONObject.parseObject(jsonStr,Domain.class);
		String sign = sign(domain);
		System.out.println(sign);
	}
	
	
	public static Map<String, Object> bean2Map(Object param) {
		JSONObject jsonObject = (JSONObject) JSON.toJSON(param);
		Set<Entry<String, Object>> entrySet = jsonObject.entrySet();
		Map<String, Object> map = new TreeMap<String, Object>();
		for (Entry<String, Object> entry : entrySet) {
			map.put(entry.getKey(), entry.getValue());
		}
		return map;
	}
}
