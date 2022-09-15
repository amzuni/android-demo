package org.coolstyles.helloworld.ui.constract;

import org.coolstyles.helloworld.data.model.Product;

import java.util.List;

public interface CategoryConstract {
    interface IView{
        void setProductListToView(List<Product> productList);
    }

    interface IPresenter{
        void setView(HomeConstract.IView view);
        void getProductList(int categoryId);
    }
}
