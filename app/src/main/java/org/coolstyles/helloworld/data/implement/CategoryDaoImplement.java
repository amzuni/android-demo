package org.coolstyles.helloworld.data.implement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.coolstyles.helloworld.data.dao.CategoryDao;
import org.coolstyles.helloworld.data.model.Category;
import org.coolstyles.helloworld.utils.Constants;

import java.util.List;

public class CategoryDaoImplement extends SQLiteOpenHelper implements CategoryDao {

    public CategoryDaoImplement(Context context){
        super(context, Constants.DATABASE_NAME, null, Constants.DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    @Override
    public Category find(int id) {
        return null;
    }

    @Override
    public List<Category> all() {
        return null;
    }

    @Override
    public void insert(Category category) {

    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Category> findByName(String name) {
        return null;
    }
}
