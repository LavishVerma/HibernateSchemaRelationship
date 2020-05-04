package com.HibernatePractice.databaseSchema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.HibernatePractice.databaseSchema.models.User_Recipe;


@Repository
public interface User_Recipe_Repository extends JpaRepository<User_Recipe, Long> {

}
