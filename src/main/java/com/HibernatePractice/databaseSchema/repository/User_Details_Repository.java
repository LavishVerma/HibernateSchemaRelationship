package com.HibernatePractice.databaseSchema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HibernatePractice.databaseSchema.models.User_Details;

@Repository
public interface User_Details_Repository extends JpaRepository<User_Details, Long> {

}
