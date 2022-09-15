package com.restapiproduct.services;

import com.restapiproduct.models.entities.Product;
import com.restapiproduct.models.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

        @Autowired
        private ProductRepo productRepo;

            public Product save(Product product){

                return productRepo.save(product);

            }

            public Product findOne(Long id){

                return productRepo.findById(id).get();

            }

            public Iterable<Product> findAll(){

                return productRepo.findAll();

            }

            public void removeOne(Long id){

                productRepo.deleteById(id);

            }

            public List<Product> findByName(String name){

                return productRepo.findByNameContains(name);

            }

}
