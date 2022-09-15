package org.coolstyles.helloworld.data.implement;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import org.coolstyles.helloworld.data.DatabaseHelper;
import org.coolstyles.helloworld.data.dao.ProductDao;
import org.coolstyles.helloworld.data.model.Category;
import org.coolstyles.helloworld.data.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImplement extends DatabaseHelper implements ProductDao {
    public ProductDaoImplement(Context context) {
        super(context);
    }

    @Override
    public Product find(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query("products", null, "id = ?", new String[] { String.valueOf(id) },null, null, null);
        if(cursor != null)
            cursor.moveToFirst();
        Product product = new Product(cursor.getInt(0), cursor.getString(1));
        return product;
    }

    @Override
    public List<Product> all() {
        List<Product>  productList = new ArrayList<>();
        String query = "SELECT * FROM products";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        cursor.moveToFirst();

        while(cursor.isAfterLast() == false) {
            Product product = new Product(cursor.getInt(0), cursor.getString(1));
            productList.add(product);
            cursor.moveToNext();
        }
        return productList;
    }

    @Override
    public void insert(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Product> findByName(String name) {
        return null;
    }

    @Override
    public List<Product> getHotProducts() {
        return null;
    }

    @Override
    public List<Product> getNewProducts() {
        return null;
    }
}
