package com.restapiproduct.controller;

import com.restapiproduct.models.entities.Product;
import com.restapiproduct.services.ProductService;
import com.restapiproduct.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product){

        return productService.save(product);

    }

    @GetMapping
    public Iterable<Product> findAll(){

        return productService.findAll();

    }

    @GetMapping("/{id}")
    public Product findOne(@PathVariable("id")Long id){

        return productService.findOne(id);
    }

    @PutMapping
    public Product update(@RequestBody Product product){

        return productService.save(product);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Long id){

         productService.removeOne(id);
    }

}
