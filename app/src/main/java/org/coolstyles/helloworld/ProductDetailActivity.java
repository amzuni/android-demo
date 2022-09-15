package org.coolstyles.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.coolstyles.helloworld.data.model.Product;
import org.coolstyles.helloworld.ui.constract.ProductDetailConstract;
import org.coolstyles.helloworld.ui.constract.ProductDetailPresenter;
import org.coolstyles.helloworld.utils.Constants;

public class ProductDetailActivity extends AppCompatActivity implements ProductDetailConstract.IView {
    private TextView tvId;
    private TextView tvName;
    private Button btnOrder;
    private EditText edtQuantity;

    private int productId;

    private ProductDetailConstract.IPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        initGUI();
        initData();
    }

    private void initGUI(){
        tvId = findViewById(R.id.tv_id);
        tvName = findViewById(R.id.tv_name);
        edtQuantity = findViewById(R.id.edt_quantity);
        btnOrder = findViewById(R.id.btn_order);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int quantity = Integer.parseInt(edtQuantity.getText().toString());
                mPresenter.order(productId, quantity);
            }
        });
    }

    private void initData(){
        productId = getIntent().getIntExtra(Constants.PRODUCT_ID, 0);
        mPresenter = new ProductDetailPresenter();
        mPresenter.setView(this);
        mPresenter.getProduct(productId);
    }

    @Override
    public void showProductDetail(Product product) {
        tvId.setText(product.id + "");
        tvName.setText(product.name);
    }
}