package com.cuteBrick.javaPractice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class ItemsOrdersId implements Serializable{
    @ManyToOne(cascade = CascadeType.ALL)
    private Items items;

    @ManyToOne(cascade = CascadeType.ALL)
    private Orders orders;

    public Items getItems(){
        return items;
    }

    public void setItems(Items items){
        this.items = items;
    }

    public Orders getOrders(){
        return orders;
    }

    public void setOrders(Orders orders){
        this.orders = orders;
    }
}
