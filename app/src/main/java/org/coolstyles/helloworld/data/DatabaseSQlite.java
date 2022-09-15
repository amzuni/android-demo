package org.coolstyles.helloworld.data;

import android.content.Context;

import org.coolstyles.helloworld.data.dao.CategoryDao;
import org.coolstyles.helloworld.data.dao.OrderDao;
import org.coolstyles.helloworld.data.dao.OrderDetailDao;
import org.coolstyles.helloworld.data.dao.ProductDao;
import org.coolstyles.helloworld.data.implement.CategoryDaoImplement;
import org.coolstyles.helloworld.data.implement.ProductDaoImplement;

public class DatabaseSQlite extends DatabaseDao{
    private Context context;

    public DatabaseSQlite(Context context){
        this.context = context;
    }

    @Override
    public CategoryDao getCategoryDao() {
        return new CategoryDaoImplement(context);
    }

    @Override
    public ProductDao getProductDao() {
        return new ProductDaoImplement(context);
    }

    @Override
    public OrderDao getOrderDao() {
        return null;
    }

    @Override
    public OrderDetailDao getOrderDetailDao() {
        return null;
    }
}
