package org.coolstyles.helloworld.ui.constract;

import org.coolstyles.helloworld.data.model.Product;

import java.util.List;

public interface ProductDetailConstract {
    interface IView{
        void showProductDetail(Product product);
    }

    interface IPresenter{
        void setView(IView view);
        void getProduct(int productId);
        void order(int productId, int quantity);
    }
}
