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

import org.coolstyles.helloworld.adapter.ProductAdapter;
import org.coolstyles.helloworld.adapter.StudentAdapter;
import org.coolstyles.helloworld.data.DatabaseDao;
import org.coolstyles.helloworld.data.DatabaseSQlite;
import org.coolstyles.helloworld.data.dao.CategoryDao;
import org.coolstyles.helloworld.data.dao.ProductDao;
import org.coolstyles.helloworld.data.implement.CategoryDaoImplement;
import org.coolstyles.helloworld.data.implement.ProductDaoImplement;
import org.coolstyles.helloworld.data.model.Category;
import org.coolstyles.helloworld.data.model.Product;
import org.coolstyles.helloworld.ui.constract.HomeConstract;
import org.coolstyles.helloworld.ui.constract.HomePresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements HomeConstract.IView {
    private HomeConstract.IPresenter mPresenter;
    RecyclerView rc;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initGUI();
        initData();
    }

    private void initGUI(){
        rc = findViewById(R.id.rc);
        rc.setLayoutManager(new LinearLayoutManager(this));

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void initData(){
        mPresenter = new HomePresenter(this);
        mPresenter.getProductList();
        mPresenter.setView(this);
    }

    @Override
    public void setProductListToView(List<Product> productList) {
        ProductAdapter adapter = new ProductAdapter(productList);
        rc.setAdapter(adapter);
    }

    @Override
    public void showProductDetail(Product product) {

    }
}