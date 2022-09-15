package org.coolstyles.helloworld.data.dao;

import org.coolstyles.helloworld.data.model.OrderDetail;

import java.util.List;

public interface OrderDetailDao {
    OrderDetail find(int id);
    List<OrderDetail> all();
    void insert(OrderDetail product);
    void update(OrderDetail product);
    void delete(int id);
    List<OrderDetail> findByName(String name);
}
