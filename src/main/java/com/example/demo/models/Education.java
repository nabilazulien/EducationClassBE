package com.example.demo.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Education {
    /**
     * Nabila
     * - POST
     * - GET ALL
     * - GET BY ID
     * - UPDATE
     * - DELETE
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * -SD, SMP, SMA, D3 dll
     */
    @Column(name="name", nullable = false, length = 50)
    private String name;

    @Column(name="description", nullable = false)
    private String description;

    @Column(name="isDeleted")
    private boolean isDeleted;

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private Date created_at;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updated_at;
}
