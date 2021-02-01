package com.roytuts.spring.data.jpa.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.data.jpa.crud.entity.Category;
import com.roytuts.spring.data.jpa.crud.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> getCategoryList() {
		return repository.findAll();
	}

	public Category getCategoryById(final Integer id) {
		return repository.findById(id).orElse(new Category(1234, "Dummy Category"));
	}

	public Category getCategoryByName(final String name) {
		return repository.findByName(name);
	}

	public void saveCategory(final Category category) {
		repository.save(category);
	}

	public void deleteCategory(final Integer id) {
		repository.deleteById(id);
	}

}
