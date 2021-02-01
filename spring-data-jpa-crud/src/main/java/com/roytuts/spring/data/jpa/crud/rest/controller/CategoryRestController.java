package com.roytuts.spring.data.jpa.crud.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.spring.data.jpa.crud.entity.Category;
import com.roytuts.spring.data.jpa.crud.service.CategoryService;

@RestController
public class CategoryRestController {

	@Autowired
	private CategoryService service;

	@GetMapping("/categories")
	public ResponseEntity<List<Category>> categoryList() {
		return new ResponseEntity<List<Category>>(service.getCategoryList(), HttpStatus.OK);
	}

	@GetMapping("/category/id/{id}")
	public ResponseEntity<Category> categoryById(@PathVariable final Integer id) {
		return new ResponseEntity<Category>(service.getCategoryById(id), HttpStatus.OK);
	}

	@GetMapping("/category/name/{name}")
	public ResponseEntity<Category> categoryByName(@PathVariable final String name) {
		return new ResponseEntity<Category>(service.getCategoryByName(name), HttpStatus.OK);
	}

	@PostMapping("/category")
	public ResponseEntity<Void> saveCategory(@RequestBody final Category category) {
		service.saveCategory(category);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/category/{id}")
	public ResponseEntity<Void> deleteCategory(@PathVariable final Integer id) {
		service.deleteCategory(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
