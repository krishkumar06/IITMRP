package com.example.airline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.airline.bean.*;




@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}