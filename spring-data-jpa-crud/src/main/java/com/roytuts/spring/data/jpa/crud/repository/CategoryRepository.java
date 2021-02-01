package com.roytuts.spring.data.jpa.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.data.jpa.crud.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

	Category findByName(final String name);

}
