package com.reto.r1mendoza.repository.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "client_account")
    private String clientAccount;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "acc_balance")
    private String accBalance;

    @Column(name = "acc_status")
    private String accStatus;

}
