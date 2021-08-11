package com.microservice.es.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RangeFilterDto {
	private Double lte;
	private Double gte;
	private Double lt;
	private Double gt;
}
