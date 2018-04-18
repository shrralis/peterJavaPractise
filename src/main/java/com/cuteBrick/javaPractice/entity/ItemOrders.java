package com.cuteBrick.javaPractice.entity;

import javax.persistence.*;

@Entity
@Table(name = "items_orders")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.items",
            joinColumns = @JoinColumn(name = "items_id")),
        @AssociationOverride(name = "primaryKey.orders",
            joinColumns = @JoinColumn(name = "orders_id")) })
public class ItemOrders {

    @EmbeddedId
    private ItemsOrdersId primaryKey = new ItemsOrdersId();

    @Column(name = "amount", nullable = false)
    private int amount;

    public ItemsOrdersId getPrimaryKey(){
        return primaryKey;
    }

    public void setPrimaryKey(ItemsOrdersId primaryKey) {
        this.primaryKey = primaryKey;
    }

    @Transient
    public Items getItems(){
        return getPrimaryKey().getItems();
    }

    public void setItems(Items items){
        getPrimaryKey().setItems(items);
    }

    @Transient
    public Orders getOrders(){
        return getPrimaryKey().getOrders();
    }

    public void setOrders(Orders orders){
        getPrimaryKey().setOrders(orders);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
