package com.shop.expantion.app.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Document(collection = "categories")
@Data
@Builder
@ToString(of = {"id", "name", "description"})
@EqualsAndHashCode(of = {"id"})
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable {

    @Id
    private String id;
    private String name;
    private String description;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private List<Product> products;
}
