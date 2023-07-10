package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entites.Category;
import com.educandoweb.course.entites.User;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}