package cz.jajenc.myecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "order")
public class Order {

    @Column(name = "order_date")
    public LocalDate orderDate;

    @Column(name = "address")
    public Address address;

    @Column(name = "shipment")
    public Shipment shipment;

    @Column(name = "is_active")
    public boolean isActive;
}
