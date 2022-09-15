package org.coolstyles.helloworld.ui.constract;

import org.coolstyles.helloworld.data.DatabaseDao;
import org.coolstyles.helloworld.data.model.Product;

public class ProductDetailPresenter implements ProductDetailConstract.IPresenter{
    private ProductDetailConstract.IView mView;
    @Override
    public void setView(ProductDetailConstract.IView view) {
        mView = view;
    }

    @Override
    public void getProduct(int productId) {
        Product product = DatabaseDao.getInstance().getProductDao().find(productId);
        mView.showProductDetail(product);
    }

    @Override
    public void order(int productId, int quantity) {

    }
}
