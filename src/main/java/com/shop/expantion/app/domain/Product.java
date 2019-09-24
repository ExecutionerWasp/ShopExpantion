package com.shop.expantion.app.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Document(collection = "products")
@Data
@Builder
@ToString(of = {"id", "name", "price"})
@EqualsAndHashCode(of = {"id"})
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    @Id
    private String id;
    private String name;
    private String description;
    private Long price;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    private String imageUrl;

    private Boolean isStock;
}
