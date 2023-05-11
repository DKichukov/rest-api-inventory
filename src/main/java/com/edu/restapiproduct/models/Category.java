package com.edu.restapiproduct.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
