package com.xammer.billops.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    // Can be a specific service like "AmazonEC2" or "ALL" for a general discount
    private String serviceName;

    // The discount percentage
    @Column(precision = 5, scale = 2) // e.g., 10.50 for 10.50%
    private BigDecimal percentage;

    private String description;

    // Getters and Setters
}