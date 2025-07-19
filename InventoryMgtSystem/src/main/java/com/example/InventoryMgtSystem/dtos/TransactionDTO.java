package com.example.InventoryMgtSystem.dtos;

import com.example.InventoryMgtSystem.enums.TransactionStatus;
import com.example.InventoryMgtSystem.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class TransactionDTO {


    private Long id;
    private Integer totalProducts;
    private BigDecimal totalPrice;




    private TransactionType transactionType;


    private TransactionStatus status;

    private String description;
    private String none;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;


    private ProductDTO product;


    private UserDTO user;

    private SupplierDTO supplier;

}


