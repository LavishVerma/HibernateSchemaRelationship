package com.HibernatePractice.databaseSchema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HibernatePractice.databaseSchema.models.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
