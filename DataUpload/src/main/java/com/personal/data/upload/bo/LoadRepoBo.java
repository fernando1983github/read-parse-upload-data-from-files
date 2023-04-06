package com.personal.data.upload.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.personal.data.upload.dto.FinanceDto;
import com.personal.data.upload.loader.ItemsRepository;
import com.personal.data.upload.model.Finance;
import com.personal.data.upload.service.FinanceService;

@Component
public class LoadRepoBo {
	@Autowired
	FinanceService financeService;
	public void loadRepo(ItemsRepository itemsRepository) {
		List<FinanceDto> financesDto = itemsRepository.loadItems();
//		financesDto.stream().forEach(f->System.out.println(f));
		Finance f = new Finance();
		FinanceDto financeDto = financesDto.get(0);
		f.setSegment(financeDto.getSegment());
		f.setCountry(financeDto.getCountry());
		f.setProduct(financeDto.getProduct());
		f.setDiscountBand(financeDto.getDiscountBand());
		f.setUnitsSold(financeDto.getUnitsSold());
		f.setManufacturingPrice(financeDto.getManufacturingPrice());
		f.setSalePrice(financeDto.getSalePrice());
		f.setGrossSales(financeDto.getGrossSales());
		f.setDiscounts(financeDto.getDiscounts());
		f.setSales(financeDto.getSales());
		f.setCogs(financeDto.getCogs());
		f.setProfit(financeDto.getProfit());
		f.setDate(financeDto.getDate());
		f.setMonthNumber(financeDto.getMonthNumber());
		f.setMonthName(financeDto.getMonthName());
		f.setYear(financeDto.getYear());
		f.setStatus(financeDto.isStatus());
		f.setRecordDate(financeDto.getRecordDate());
		
		financeService.save(f);
	}

}
