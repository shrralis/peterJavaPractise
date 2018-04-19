package com.cuteBrick.javaPractice.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "items")
public class Items {

    @Id
    @GeneratedValue
    @Column(name = "items_id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "disc", nullable = false)
    private double disc;

    //@Column(name = "cat_id", nullable = false)
    @ManyToOne
    private Categories category;

    @Column(name = "img_url",nullable = false)
    private String imgUrl;

    @Column(name = "modified_at",nullable = false)
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private LocalDateTime modifiedAt;

    //@Column(name = "modified_by", nullable = false)
    @ManyToOne
    private Users modifiedBy;

    @Column(name = "is_removed", nullable = false)
    private boolean isRemoved;

    //@Column(name = "units", nullable = false)
    @ManyToOne
    private Units units;

    @OneToMany(mappedBy = "primaryKey.items", cascade = CascadeType.ALL)
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDisc() {
        return disc;
    }

    public void setDisc(double disc) {
        this.disc = disc;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Users getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Users modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public boolean isRemoved() {
        return isRemoved;
    }

    public void setRemoved(boolean removed) {
        isRemoved = removed;
    }

    public Units getUnits() {
        return units;
    }

    public void setUnits(Units units) {
        this.units = units;
    }
}
