package com.xammer.billops.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(nullable = false)
    private String subject;

    @Lob // For longer text content
    private String description;

    private String status; // e.g., "OPEN", "IN_PROGRESS", "CLOSED"

    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters and Setters
}