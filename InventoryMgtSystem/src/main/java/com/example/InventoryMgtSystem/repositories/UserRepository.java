package com.example.InventoryMgtSystem.repositories;

import com.example.InventoryMgtSystem.models.Product;
import com.example.InventoryMgtSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


   Optional<User> findByEmail(String email);

}
