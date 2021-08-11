package com.microservice.es.api.repository;

import java.io.IOException;
import java.util.List;

import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;

import com.microservice.es.api.dto.SearchQueryDto;
import com.microservice.es.api.model.Product;

public interface ProductRepository  {
	
	SearchResponse search(SearchQueryDto searchQueryDto) throws IOException;
	
	IndexResponse save(Product product) throws IOException;
	
	BulkResponse saveAll(List<Product> products) throws IOException;

}
