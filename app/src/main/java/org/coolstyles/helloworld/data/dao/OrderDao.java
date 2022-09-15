package org.coolstyles.helloworld.data.dao;

import org.coolstyles.helloworld.data.model.Order;

import java.util.List;

public interface OrderDao {
    Order find(int id);
    List<Order> all();
    void insert(Order product);
    void update(Order product);
    void delete(int id);
    List<Order> findByName(String name);
}
