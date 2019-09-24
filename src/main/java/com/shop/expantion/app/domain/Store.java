package com.shop.expantion.app.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Document(collection = "stores")
@Data
@Builder
@ToString(of = {"id", "name", "url"})
@EqualsAndHashCode(of = {"id", "url"})
@NoArgsConstructor
@AllArgsConstructor
public class Store implements Serializable {

    @Id
    private String id;
    private String name;
    private String description;
    private String url;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "store_id")
    private List<Category> categories;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @ElementCollection
    @CollectionTable(name = "contact")
    @Column(name = "contact")
    private Set<String> contacts = new HashSet<>();

}
