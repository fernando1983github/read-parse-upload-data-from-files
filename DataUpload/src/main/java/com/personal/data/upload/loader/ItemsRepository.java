package com.personal.data.upload.loader;

import java.util.List;
import com.personal.data.upload.dto.FinanceDto;

public interface ItemsRepository {
	public List<FinanceDto> loadItems();
	public Integer getTotal();
	public Integer getFiltered();
}