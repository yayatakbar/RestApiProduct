package com.restapiproduct.models.repos;

import com.restapiproduct.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product,  Long> {

        List<Product> findByNameContains (String name);

}
