package cz.jajenc.myecommerce.model;

import javax.persistence.*;

@Entity
@Table(name = "shipment")
public class Shipment {

    @Id
    @Column(name = "address_id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Address address;

    public boolean isAlreadyShipped;
}
