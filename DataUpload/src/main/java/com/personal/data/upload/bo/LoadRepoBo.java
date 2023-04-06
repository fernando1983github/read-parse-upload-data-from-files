package com.personal.data.upload.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.personal.data.upload.dto.FinanceDto;
import com.personal.data.upload.loader.ItemsRepository;
import com.personal.data.upload.model.Finance;
import com.personal.data.upload.service.FinanceService;
import com.personal.data.upload.util.DtoUtils;

@Component
public class LoadRepoBo {
	@Autowired
	FinanceService financeService;
	public void loadRepo(ItemsRepository itemsRepository) {
		List<FinanceDto> financesDto = itemsRepository.loadItems();
//		financesDto.stream().forEach(f->System.out.println(f));
		List<Finance> fs = DtoUtils.mapList(financesDto, Finance.class);
		financeService.save(fs);
	}
}