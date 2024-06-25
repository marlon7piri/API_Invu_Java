package com.InvuApi.entities.Products;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/products")
@Controller
public class ProductsControllers {

    @Autowired
    private ProductsServices productsServices;


    @GetMapping()
    public List<Products> getAllProducts(){

       return  productsServices.getAllProducts();
    }
}
