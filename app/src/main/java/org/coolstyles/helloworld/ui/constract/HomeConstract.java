package org.coolstyles.helloworld.ui.constract;

import org.coolstyles.helloworld.data.model.Product;

import java.util.List;

public interface HomeConstract {
    interface IView{
        void setProductListToView(List<Product> productList);
        void setHotProductsToView(List<Product> productList);
        void setNewProductsToView(List<Product> productList);
    }

    interface IPresenter{
        void setView(IView view);
        void getProductList();
        void getHotProducts();
        void getNewProducts();
    }
}
