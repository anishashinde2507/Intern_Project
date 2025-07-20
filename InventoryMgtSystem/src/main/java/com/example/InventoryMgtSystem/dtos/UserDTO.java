package com.example.InventoryMgtSystem.dtos;

import com.example.InventoryMgtSystem.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.transaction.Transaction;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserDTO {


    private Long id;


    private String name;


    private String email;

    @JsonIgnore
    private String password;

    private String phoneNumber;


    private UserRole role;


    private List<TransactionDTO> transactions;


    private LocalDateTime createdAt;


}

