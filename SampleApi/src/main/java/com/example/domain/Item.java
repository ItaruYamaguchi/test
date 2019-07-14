package com.example.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Item implements Serializable{
	
	private String name;
	private Integer price;
}