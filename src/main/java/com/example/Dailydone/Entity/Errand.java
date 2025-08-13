package com.example.Dailydone.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Errand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Double price;

    private String status; // Could be Enum

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name = "runner_id")
    private User runner;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "pickup_address_id")
    private Address pickupAddress;

    @ManyToOne
    @JoinColumn(name = "drop_address_id")
    private Address dropAddress;
}
