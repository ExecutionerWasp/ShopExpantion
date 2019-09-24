package com.shop.expantion.app.repos;

import com.shop.expantion.app.domain.Store;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepos extends MongoRepository<Store, String> {
}
