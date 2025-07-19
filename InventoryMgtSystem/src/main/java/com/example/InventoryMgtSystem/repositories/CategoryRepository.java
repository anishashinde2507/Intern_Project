package com.example.InventoryMgtSystem.repositories;

import com.example.InventoryMgtSystem.models.Category;
import com.example.InventoryMgtSystem.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {




}
