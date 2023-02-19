package com.example.byusell.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "description", columnDefinition = "text")
    private String description;
    
    @Column(name = "price")
    private int price;
    
    @Column(name = "city")
    private String city;
    
    @Column(name = "author")
    private String author;
    
}
