package com.cuteBrick.javaPractice.entity;

import com.sun.istack.internal.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "full_price")
    @NotNull
    private double fullPrice;

    @Column(name = "time")
    @NotNull
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private LocalDateTime time;

    @Column(name = "users_id")
    @NotNull
    @ManyToOne
    @JoinColumn(name = "id")
    private Users user;

    @Column(name = "status")
    @NotNull
    private Status status;

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

    enum Status{
        NEW,
        PENDING,
        PAYED,
        DELIVERING,
        DONE
    }
}
