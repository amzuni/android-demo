package org.coolstyles.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.coolstyles.helloworld.ui.adapter.ProductAdapter;
import org.coolstyles.helloworld.data.model.Product;
import org.coolstyles.helloworld.ui.constract.HomeConstract;
import org.coolstyles.helloworld.ui.constract.HomePresenter;

import java.util.List;

public class HomeActivity extends AppCompatActivity implements HomeConstract.IView{
    private HomeConstract.IPresenter mPresenter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initGUI();
        initData();
    }

    private void initGUI(){
        recyclerView = findViewById(R.id.recycler_view);
    }

    private void initData(){
        mPresenter = new HomePresenter(this);
        mPresenter.setView(this);
        mPresenter.getProductList();
    }

    @Override
    public void setProductListToView(List<Product> productList) {
        ProductAdapter adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void showProductDetail(Product product) {

    }
}