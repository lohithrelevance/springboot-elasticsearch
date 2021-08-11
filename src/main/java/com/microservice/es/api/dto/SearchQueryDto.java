package com.microservice.es.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SearchQueryDto {

	private String query;
    private FilterRequestDto filter;
    private Integer page;
    private Integer size;
}
