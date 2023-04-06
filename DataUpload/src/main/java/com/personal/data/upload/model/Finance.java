package com.personal.data.upload.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;


/**
 * The persistent class for the FINANCES database table.
 * 
 */
@Entity
@Table(name="FINANCES")
@NamedQuery(name="Finance.findAll", query="SELECT f FROM Finance f")
public class Finance extends Auditable<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FINANCES_ID_GENERATOR", sequenceName="FINANCES_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FINANCES_ID_GENERATOR")
	private long id;

	private BigDecimal cogs;

	private String country;

	@Column(name="\"date\"")
	private Date date;

	@Column(name="DISCOUNT_BAND")
	private String discountBand;

	private BigDecimal discounts;

	@Column(name="GROSS_SALES")
	private BigDecimal grossSales;

	@Column(name="MANUFACTURING_PRICE")
	private BigDecimal manufacturingPrice;

	@Column(name="MONTH_NAME")
	private String monthName;

	@Column(name="MONTH_NUMBER")
	private Integer monthNumber;

	private String product;

	private BigDecimal profit;

	@Column(name="SALE_PRICE")
	private BigDecimal salePrice;

	private BigDecimal sales;

	@Column(name="\"SEGMENT\"")
	private String segment;

	private boolean status;

	@Column(name="UNITS_SOLD")
	private BigDecimal unitsSold;

	@Column(name="\"YEAR\"")
	private Integer year;

	@Column(name="RECORD_DATE")
	private LocalDateTime recordDate;

	public Finance() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getCogs() {
		return this.cogs;
	}

	public void setCogs(BigDecimal cogs) {
		this.cogs = cogs;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDiscountBand() {
		return this.discountBand;
	}

	public void setDiscountBand(String discountBand) {
		this.discountBand = discountBand;
	}

	public BigDecimal getDiscounts() {
		return this.discounts;
	}

	public void setDiscounts(BigDecimal discounts) {
		this.discounts = discounts;
	}

	public BigDecimal getGrossSales() {
		return this.grossSales;
	}

	public void setGrossSales(BigDecimal grossSales) {
		this.grossSales = grossSales;
	}

	public BigDecimal getManufacturingPrice() {
		return this.manufacturingPrice;
	}

	public void setManufacturingPrice(BigDecimal manufacturingPrice) {
		this.manufacturingPrice = manufacturingPrice;
	}

	public String getMonthName() {
		return this.monthName;
	}

	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}

	public Integer getMonthNumber() {
		return this.monthNumber;
	}

	public void setMonthNumber(Integer monthNumber) {
		this.monthNumber = monthNumber;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public BigDecimal getProfit() {
		return this.profit;
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}

	public BigDecimal getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public BigDecimal getSales() {
		return this.sales;
	}

	public void setSales(BigDecimal sales) {
		this.sales = sales;
	}

	public String getSegment() {
		return this.segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public BigDecimal getUnitsSold() {
		return this.unitsSold;
	}

	public void setUnitsSold(BigDecimal unitsSold) {
		this.unitsSold = unitsSold;
	}

	public Integer getYear() {
		return this.year;
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

}