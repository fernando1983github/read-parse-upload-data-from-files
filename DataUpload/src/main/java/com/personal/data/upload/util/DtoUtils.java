package com.personal.data.upload.util;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Hibernate;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DtoUtils {
	private static ModelMapper modelMapper;
	
	public static <S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
	    return source
	      .stream()
	      .map(element -> map(element, targetClass))
	      .collect(Collectors.toList());
	}
	
	public static <S, T> T map(S source, Class<T> targetClass) {
		modelMapper.getConfiguration().setPropertyCondition(context -> (Hibernate.isInitialized(context.getSource())));
		return modelMapper.map(source, targetClass);
	}

	@Autowired
    public void setModelMapper(ModelMapper modelMapper){
        DtoUtils.modelMapper = modelMapper;
    }
}