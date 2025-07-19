package com.example.InventoryMgtSystem.repositories;

import com.example.InventoryMgtSystem.models.Product;
import com.example.InventoryMgtSystem.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {




}
