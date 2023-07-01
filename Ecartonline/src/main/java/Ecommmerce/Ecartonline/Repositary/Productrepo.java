package Ecommmerce.Ecartonline.Repositary;

import Ecommmerce.Ecartonline.Products.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class Productrepo {

    @Autowired
    private Map <Integer,Products> allproduct;
    public Map<Integer,Products> getproduct() {
        return allproduct;
    }
}
