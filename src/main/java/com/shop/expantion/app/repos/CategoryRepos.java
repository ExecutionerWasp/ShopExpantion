package com.shop.expantion.app.repos;

import com.shop.expantion.app.domain.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepos extends MongoRepository<Category, String> {
}
