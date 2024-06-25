package com.InvuApi.entities.Products;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name")

    private String name;
    @Column(name="price")

    private Double price;
    @Column(name="category")

    private  String category;
    @Column(name="unit")

    private String unit;
    @Column(name="supliers_id")

    private String supliers_id;
    @Column(name="restaurante_id")

    private String restaurante_id;
    @Column(name="more_seller")

    private Boolean more_seller;
    @Column(name="min_stock")

    private Double min_stock;
    @Column(name="stock")

    private Double stock;
    @Column(name="itbms")

    private Double itbms;
    @Column(name="price_for_unit")

    private Double price_for_unit;
    @Column(name="unit_presentation")

    private Double unit_presentation;


// INSERT INTO products (name, price , category , unit , supliers_id , restaurante_id , more_seller , min_stock , stock , itbms , price_for_unity , unit_presentation) VALUES ("Aguacate", 23 , "vegetales" , "KG" , "2333434" , "1" , true , 2 , 20 , 0 , 2.56 , 2  );


}
