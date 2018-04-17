package com.cuteBrick.javaPractice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemsOrdersId {
    private Items items;
    private Orders orders;

    @ManyToOne(cascade = CascadeType.ALL)
    public Items getItems(){
        return items;
    }

    public void setItems(Items items){
        this.items = items;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Orders getOrders(){
        return orders;
    }

    public void setOrders(Orders orders){
        this.orders = orders;
    }
}
