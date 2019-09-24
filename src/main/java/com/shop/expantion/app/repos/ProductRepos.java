package com.shop.expantion.app.repos;

import com.shop.expantion.app.domain.Category;
import com.shop.expantion.app.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepos extends MongoRepository<Product, String> {

    Optional<Product> findByName(String name);
}
