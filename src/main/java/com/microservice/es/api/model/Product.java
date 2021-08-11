package com.microservice.es.api.model;

import lombok.Data;

@Data
public class Product {

	private Integer id;
	private String name;
	private String description;
	private Double price;
	private String category;
}
