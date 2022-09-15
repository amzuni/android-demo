package org.coolstyles.helloworld.data.implement;

import org.coolstyles.helloworld.data.dao.OrderDao;
import org.coolstyles.helloworld.data.model.Order;

import java.util.List;

public class OrderImplement implements OrderDao {
    @Override
    public Order find(int id) {
        return null;
    }

    @Override
    public List<Order> all() {
        return null;
    }

    @Override
    public void insert(Order product) {

    }

    @Override
    public void update(Order product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Order> findByName(String name) {
        return null;
    }
}
