package com.personal.data.upload.loader;

import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.personal.data.upload.dto.FinanceDto;
import com.personal.data.upload.util.DtoUtils;
import com.poiji.bind.Poiji;
import com.poiji.bind.mapping.PoijiLogCellFormat;
import com.poiji.bind.mapping.PoijiLogCellFormat.InternalCellFormat;
import com.poiji.bind.mapping.PoijiNumberFormat;
import com.poiji.exception.PoijiExcelType;
import com.poiji.exception.PoijiException;
import com.poiji.option.PoijiOptions;
import com.poiji.option.PoijiOptions.PoijiOptionsBuilder;
@Repository
public class ExcelRepository implements ItemsRepository {
	private InputStream is;
	private List<FinanceDto> items;
	private String extension;
	private Integer total = 0;
	private Integer filtered = 0;
	
	public Integer getTotal() {
		return total;
	}

	public Integer getFiltered() {
		return filtered;
	}
	
	public ExcelRepository() {}
	
	public ExcelRepository(InputStream is, String extension) {
		this.is = is;
		this.extension = extension;
	}
	
	public List<FinanceDto> loadItems() {
		if(items == null) {
			items = new ArrayList<>();
			try {
//				DateTimeFormatter format = new DateTimeFormatterBuilder()
//		                .appendPattern("M/dd/yyyy").toFormatter();
//				PoijiOptions options = PoijiOptionsBuilder.settings().dateTimeFormatter(format).dateLenient(true).namedHeaderMandatory(true).build();
//				PoijiOptions options = PoijiOptionsBuilder.settings().datePattern("MM/dd/yyyy").namedHeaderMandatory(true).build();
				PoijiLogCellFormat log = new PoijiLogCellFormat();
				
				PoijiNumberFormat numberFormat = new PoijiNumberFormat();
				numberFormat.putNumberFormat((short) 164, "#,##0.00");
				numberFormat.putNumberFormat((short) 14, "dd/MM/yyyy");
				numberFormat.putNumberFormat((short) 172, "dd/MM/yyyy HH:mm:ss");
				
				PoijiOptions options = PoijiOptionsBuilder.settings().poijiLogCellFormat(log).poijiNumberFormat(numberFormat).namedHeaderMandatory(true).build();
				PoijiExcelType excelType = getExcelType();
				if(excelType != null) {
					List<ItemExcel> itemsExcel = Poiji.fromExcel(is, excelType, ItemExcel.class, options);
					
					List<InternalCellFormat> formats = log.formats();
					
					InternalCellFormat cell211 = formats.get(30);
					System.out.println(cell211.getFormatString());// _("$"* #,##0.00_);_("$"* \(#,##0.00\);_("$"* "-"??_);_(@_)
					System.out.println(cell211.getFormatIndex());// 164
					
					InternalCellFormat cell212 = formats.get(31);
					
					System.out.println(cell212.getFormatString());// m/d/yy
					System.out.println(cell212.getFormatIndex());// 14
					
					InternalCellFormat cell212x = formats.get(37);
					
					System.out.println(cell212x.getFormatString());// dd/mm/yyyy\ hh:mm:ss
					System.out.println(cell212x.getFormatIndex());// 172
					/*for(InternalCellFormat i : formats) {
						System.out.println("format:" + i.getFormatString() + ", index:"+i.getFormatIndex());
					}*/
					
					for(ItemExcel e : itemsExcel) {
						System.out.println(e);
						for(String s : e.getTeams()) {
							System.out.println(s);
						}
					}
					this.total = itemsExcel.size();
					itemsExcel = filterInvalid(itemsExcel);
					items = convert(itemsExcel);
					return items;

					}
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		return items;
	}
	
	private PoijiExcelType getExcelType() {
		PoijiExcelType excelType = null;
		if(extension.equalsIgnoreCase("xlsx")) {
			excelType = PoijiExcelType.XLSX;
		} else if(extension.equalsIgnoreCase("xls")) {
			excelType = PoijiExcelType.XLS;
		}
		return excelType;
	}
	
	private List<ItemExcel> filterInvalid(List<ItemExcel> itemsExcel) {
		List<ItemExcel> filtered = itemsExcel.stream()
	    .filter(i -> (
	    		//TODO: validate all columns 
	    		(i.getCountry() != null && !i.getCountry().trim().isEmpty()) //&&
//	    		(i.getOpportunityLeader() != null && !i.getOpportunityLeader().trim().isEmpty()) &&
//	    		(i.getPercent() != null && !i.getPercent().equals(0))
	    		))
	    .map(i -> i.trim())
	    .collect(Collectors.toList());
		this.filtered = filtered.size();
		return filtered;
	}
	
	private List<FinanceDto> convert(List<ItemExcel> itemsExcel) throws Exception {
		List<FinanceDto> financeDto = DtoUtils.mapList(itemsExcel, FinanceDto.class);
		return financeDto;
	}
}