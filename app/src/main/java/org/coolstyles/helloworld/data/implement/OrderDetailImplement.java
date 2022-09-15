package org.coolstyles.helloworld.data.implement;

import org.coolstyles.helloworld.data.dao.OrderDetailDao;
import org.coolstyles.helloworld.data.model.OrderDetail;

import java.util.List;

public class OrderDetailImplement implements OrderDetailDao {
    @Override
    public OrderDetail find(int id) {
        return null;
    }

    @Override
    public List<OrderDetail> all() {
        return null;
    }

    @Override
    public void insert(OrderDetail product) {

    }

    @Override
    public void update(OrderDetail product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<OrderDetail> findByName(String name) {
        return null;
    }
}
