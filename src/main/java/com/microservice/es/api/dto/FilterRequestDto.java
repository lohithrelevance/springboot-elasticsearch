package com.microservice.es.api.dto;

import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FilterRequestDto {

	private Map<String, Object> match;
	private Map<String, RangeFilterDto> range;
}
