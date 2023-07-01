package Ecommmerce.Ecartonline.Service;

import Ecommmerce.Ecartonline.Products.Products;
import Ecommmerce.Ecartonline.Repositary.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Productrepo productrepo;

    public Map<Integer,Products>getallproducts() {
        return productrepo.getproduct();
    }

    public String addallproducts(List <Products> products) {

         Map <Integer,Products> product= getallproducts();
         for(Products myproduct:products){
             product.put(myproduct.getProductid(), myproduct);
         }
         return "Products are added";
    }
    public List<Products> filteredprice(Double price) {
        List<Products> priceFilteredProducts = new ArrayList<>();
        Map<Integer, Products> productList = getallproducts();
        for(Integer id : productList.keySet())
        {
            if(productList.get(id).getProductprice() <= price)
            {
                priceFilteredProducts.add(productList.get(id));
            }
        }

        return priceFilteredProducts;
    }


}
