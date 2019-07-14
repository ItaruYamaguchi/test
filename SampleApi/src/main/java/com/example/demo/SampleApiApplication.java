package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Item;

@SpringBootApplication
@RestController
public class SampleApiApplication {
	
//	@GetMapping
//	String home() {
//		return "Hello World!";
//	}

    @GetMapping
    List<Item> getItems() {
        List<Item> itemList = getTestData();
        return itemList;
    }
    
    private List<Item> getTestData() {
    	Item item = new Item();
    	item.setName("aaa");
    	item.setPrice(1000);
    	List<Item> items = new ArrayList<Item>();
    	items.add(item);
    	return items;
    }

	public static void main(String[] args) {
		SpringApplication.run(SampleApiApplication.class, args);
	}
}