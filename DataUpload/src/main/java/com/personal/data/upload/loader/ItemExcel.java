package com.personal.data.upload.loader;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;
public class ItemExcel {
	
	@ExcelRow
	private int rowIndex;
	
	@ExcelCellName("Segment")
	private String segment;
	
	@ExcelCellName("Country")
	private String country;
	
	@ExcelCellName("Product")
	private String product;
	
	@ExcelCellName("Discount Band")
	private String discountBand;
	
	@ExcelCellName("Units Sold")
	private BigDecimal unitsSold;
	
	@ExcelCellName("Manufacturing Price")
	private BigDecimal manufacturingPrice;
	
	@ExcelCellName("Sale Price")
	private BigDecimal salePrice;
	
	@ExcelCellName("Gross Sales")
	private BigDecimal grossSales;
	
	@ExcelCellName("Discounts")
	private BigDecimal discounts;
	
	@ExcelCellName("Sales")
	private BigDecimal sales;
	
	@ExcelCellName("COGS")
	private BigDecimal cogs;
	
	@ExcelCellName("Profit")
	private BigDecimal profit;
	
	@ExcelCellName("Date")
	private Date date;
	
	@ExcelCellName("Month Number")
	private Integer monthNumber;
	
	@ExcelCellName("Month Name")
	private String monthName;
	
	@ExcelCellName("Year")
	private Integer year;
	
	@ExcelCellName("Teams")
	private List<String> teams;
	
	@ExcelCellName("Status")
	private boolean status;
	
	@ExcelCellName("Record Date")
	private LocalDateTime recordDate;
	
	public ItemExcel() {
		teams = new ArrayList<>();
	}
	
	public int getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getDiscountBand() {
		return discountBand;
	}

	public void setDiscountBand(String discountBand) {
		this.discountBand = discountBand;
	}

	public BigDecimal getUnitsSold() {
		return unitsSold;
	}

	public void setUnitsSold(BigDecimal unitsSold) {
		this.unitsSold = unitsSold;
	}

	public BigDecimal getManufacturingPrice() {
		return manufacturingPrice;
	}

	public void setManufacturingPrice(BigDecimal manufacturingPrice) {
		this.manufacturingPrice = manufacturingPrice;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public BigDecimal getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(BigDecimal grossSales) {
		this.grossSales = grossSales;
	}

	public BigDecimal getDiscounts() {
		return discounts;
	}

	public void setDiscounts(BigDecimal discounts) {
		this.discounts = discounts;
	}

	public BigDecimal getSales() {
		return sales;
	}

	public void setSales(BigDecimal sales) {
		this.sales = sales;
	}

	public BigDecimal getCogs() {
		return cogs;
	}

	public void setCogs(BigDecimal cogs) {
		this.cogs = cogs;
	}

	public BigDecimal getProfit() {
		return profit;
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getMonthNumber() {
		return monthNumber;
	}

	public void setMonthNumber(Integer monthNumber) {
		this.monthNumber = monthNumber;
	}

	public String getMonthName() {
		return monthName;
	}

	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public List<String> getTeams() {
		return teams;
	}

	public void setTeams(List<String> teams) {
		this.teams = teams;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDateTime getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(LocalDateTime recordDate) {
		this.recordDate = recordDate;
	}

	public ItemExcel trim() {
		this.country = this.country != null ? this.country.trim() : "";
		/*this.opportunityLeader = this.opportunityLeader != null ? this.opportunityLeader.trim() : "";
		this.percent = this.percent != null ? this.percent : 0;*/
//		this.secciones = this.secciones != null ? this.secciones : 0;
//		this.tiempo = this.tiempo != null ? this.tiempo : BigDecimal.ZERO;
//		this.precio = this.precio != null ? this.precio : BigDecimal.ZERO;
//		this.costo = this.costo != null ? this.costo : BigDecimal.ZERO;		
		return this;
	}

	@Override
	public String toString() {
		return "ItemExcel [rowIndex=" + rowIndex + ", segment=" + segment + ", country=" + country + ", product="
				+ product + ", discountBand=" + discountBand + ", unitsSold=" + unitsSold + ", manufacturingPrice="
				+ manufacturingPrice + ", salePrice=" + salePrice + ", grossSales=" + grossSales + ", discounts="
				+ discounts + ", sales=" + sales + ", cogs=" + cogs + ", profit=" + profit + ", date=" + date
				+ ", monthNumber=" + monthNumber + ", monthName=" + monthName + ", year=" + year + ", teams=" + teams
				+ ", status=" + status + ", recordDate=" + recordDate + "]";
	}
}