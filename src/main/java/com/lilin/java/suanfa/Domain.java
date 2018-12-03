package com.lilin.java.suanfa;

import java.math.BigDecimal;

public class Domain {

	private String hopenId;
	private String orderName;
	private BigDecimal totalAmount;
	private BigDecimal actualAmount;
	private Double fuelAmount;
	private String serviceSupplier;
	private String gasCode;
	private BigDecimal discountAmount;
	private Integer orderSource;
	private String orderNo;
	private String phone;
	private Integer payType;
	private String payTime;

	public String getHopenId() {
		return hopenId;
	}

	public void setHopenId(String hopenId) {
		this.hopenId = hopenId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getActualAmount() {
		return actualAmount;
	}

	public void setActualAmount(BigDecimal actualAmount) {
		this.actualAmount = actualAmount;
	}

	public Double getFuelAmount() {
		return fuelAmount;
	}

	public void setFuelAmount(Double fuelAmount) {
		this.fuelAmount = fuelAmount;
	}

	public String getServiceSupplier() {
		return serviceSupplier;
	}

	public void setServiceSupplier(String serviceSupplier) {
		this.serviceSupplier = serviceSupplier;
	}

	public String getGasCode() {
		return gasCode;
	}

	public void setGasCode(String gasCode) {
		this.gasCode = gasCode;
	}

	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Integer getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(Integer orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

}
