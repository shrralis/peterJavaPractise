package com.cuteBrick.javaPractice.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Orders {

    @Column(name = "orders_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "full_price", nullable = false)
    private double fullPrice;

    @Column(name = "time", nullable = false)
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private LocalDateTime time;

    @ManyToOne
    private Users user;

    @Column(name = "status", nullable = false)
    private Status status;

    @OneToMany(mappedBy = "primaryKey.orders", cascade = CascadeType.ALL)
    private Set<ItemOrders> itemOrders;

    public Set<ItemOrders> getItemOrders() {
        return itemOrders;
    }

    public void setItemOrders(Set<ItemOrders> itemOrders) {
        this.itemOrders = itemOrders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status{
        NEW,
        PENDING,
        PAYED,
        DELIVERING,
        DONE
    }
}
