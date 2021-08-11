package com.microservice.es.api.controller;

import java.io.IOException;
import java.util.List;

import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.es.api.dto.SearchQueryDto;
import com.microservice.es.api.model.Product;
import com.microservice.es.api.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping
	public IndexResponse addProduct(@RequestBody Product product) throws IOException {
		return productRepository.save(product);
	}
	
	@PostMapping("/bulk")
	public BulkResponse addProducts(@RequestBody List<Product> products) throws IOException {
	    return productRepository.saveAll(products);
	}
	
	@PostMapping("/search")
    public SearchResponse searchProduct(@RequestBody SearchQueryDto searchQueryDto) throws IOException {
        return productRepository.search(searchQueryDto);
    }
}
