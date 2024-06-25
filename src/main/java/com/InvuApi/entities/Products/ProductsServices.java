package com.InvuApi.entities.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@EnableTransactionManagement
public class ProductsServices {

    @Autowired
    private ProductsRepository productsRepository;


    public List<Products> getAllProducts (){
         return productsRepository.findAll();
    }
}
