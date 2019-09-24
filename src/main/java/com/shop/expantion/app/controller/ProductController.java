package com.shop.expantion.app.controller;

import com.shop.expantion.app.domain.Product;
import com.shop.expantion.app.repos.CategoryRepos;
import com.shop.expantion.app.repos.ProductRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepos productRepos;

    @Autowired
    public ProductController(ProductRepos productRepos) {
        this.productRepos = productRepos;
    }

    @GetMapping("/test")
    public String test(){
        var retention = 10_000;
        for (int i = 0; i < retention; i++) {
            productRepos.save(
                    Product
                            .builder()
                            .name("name" + i)
                            .description("description")
                            .price(100L)
                            .creationDate(new Date())
                            .imageUrl("localhost:8081/products")
                            .isStock(true)
                            .build());
        }

        var name = "name1000";
        var start = System.currentTimeMillis();
        var product = productRepos.findByName(name);
        var end = System.currentTimeMillis();
        var result = end - start;
        return "Executable time : " + result + "\n" + product;
    }
}
