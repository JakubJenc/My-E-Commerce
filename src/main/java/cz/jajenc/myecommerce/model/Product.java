package cz.jajenc.myecommerce.model;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Entity
@MappedSuperclass
public abstract class Product {

    public Long id;
    public String name;
    public String description;
    public Float price;
    public int onStock;
    public Float weight;
    public boolean isSoldOut;
}
