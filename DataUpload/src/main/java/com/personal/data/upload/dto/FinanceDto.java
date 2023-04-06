package com.personal.data.upload.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public class FinanceDto {
	private long id;

	private BigDecimal cogs;

	private String country;

	private Date date;

	private String discountBand;

	private BigDecimal discounts;

	private BigDecimal grossSales;

	private BigDecimal manufacturingPrice;

	private String monthName;

	private Integer monthNumber;

	private String product;

	private BigDecimal profit;

	private BigDecimal salePrice;

	private BigDecimal sales;

	private String segment;

	private boolean status;

	private BigDecimal unitsSold;

	private Integer year;
	
	private LocalDateTime recordDate;

	public FinanceDto() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getCogs() {
		return cogs;
	}

	public void setCogs(BigDecimal cogs) {
		this.cogs = cogs;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDiscountBand() {
		return discountBand;
	}

	public void setDiscountBand(String discountBand) {
		this.discountBand = discountBand;
	}

	public BigDecimal getDiscounts() {
		return discounts;
	}

	public void setDiscounts(BigDecimal discounts) {
		this.discounts = discounts;
	}

	public BigDecimal getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(BigDecimal grossSales) {
		this.grossSales = grossSales;
	}

	public BigDecimal getManufacturingPrice() {
		return manufacturingPrice;
	}

	public void setManufacturingPrice(BigDecimal manufacturingPrice) {
		this.manufacturingPrice = manufacturingPrice;
	}

	public String getMonthName() {
		return monthName;
	}

	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}

	public Integer getMonthNumber() {
		return monthNumber;
	}

	public void setMonthNumber(Integer monthNumber) {
		this.monthNumber = monthNumber;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public BigDecimal getProfit() {
		return profit;
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public BigDecimal getSales() {
		return sales;
	}

	public void setSales(BigDecimal sales) {
		this.sales = sales;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public BigDecimal getUnitsSold() {
		return unitsSold;
	}

	public void setUnitsSold(BigDecimal unitsSold) {
		this.unitsSold = unitsSold;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public LocalDateTime getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(LocalDateTime recordDate) {
		this.recordDate = recordDate;
	}

	@Override
	public String toString() {
		return "FinanceDto [id=" + id + ", cogs=" + cogs + ", country=" + country + ", date=" + date + ", discountBand="
				+ discountBand + ", discounts=" + discounts + ", grossSales=" + grossSales + ", manufacturingPrice="
				+ manufacturingPrice + ", monthName=" + monthName + ", monthNumber=" + monthNumber + ", product="
				+ product + ", profit=" + profit + ", salePrice=" + salePrice + ", sales=" + sales + ", segment="
				+ segment + ", status=" + status + ", unitsSold=" + unitsSold + ", year=" + year + "]";
	}
}