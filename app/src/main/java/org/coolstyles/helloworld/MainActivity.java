package org.coolstyles.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.coolstyles.helloworld.adapter.StudentAdapter;
import org.coolstyles.helloworld.data.DatabaseDao;
import org.coolstyles.helloworld.data.DatabaseSQlite;
import org.coolstyles.helloworld.data.dao.CategoryDao;
import org.coolstyles.helloworld.data.dao.ProductDao;
import org.coolstyles.helloworld.data.implement.CategoryDaoImplement;
import org.coolstyles.helloworld.data.implement.ProductDaoImplement;
import org.coolstyles.helloworld.data.model.Category;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rc;
    List<String> studentName = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initGUI();
        initData();
    }

    private void initGUI(){
        rc = findViewById(R.id.rc);
    }

    private void initData(){
        for (int i=0; i < 10; i++){
            studentName.add("Student " + i);
        }

        StudentAdapter adapter = new StudentAdapter(studentName);
        rc.setAdapter(adapter);
        rc.setLayoutManager(new LinearLayoutManager(this));

        DatabaseDao.init(new DatabaseSQlite(this));

        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
        List<Category> categoryList = categoryDao.all();
        categoryDao.find(1);
    }
}