package cz.jajenc.myecommerce.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tea")
public class Tea extends Product {
    public boolean isWeighed;
}
