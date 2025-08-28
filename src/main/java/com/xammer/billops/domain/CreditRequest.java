package com.xammer.billops.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class CreditRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    private String reason;
    private double amount;
    private String status; // e.g., "PENDING", "APPROVED", "REJECTED"
    private LocalDateTime requestedAt = LocalDateTime.now();

    // Getters and Setters
}