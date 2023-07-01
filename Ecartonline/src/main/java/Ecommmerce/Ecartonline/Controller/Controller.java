package Ecommmerce.Ecartonline.Controller;

import Ecommmerce.Ecartonline.Products.Products;
import Ecommmerce.Ecartonline.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    @Autowired
    Service service;

    @GetMapping("Products")
    public Map<Integer,Products> getallproducts(){
        return service.getallproducts();
    }

   @PostMapping("Addproducts/{products}")
    public String addproducts(@RequestBody List <Products> products){
        return service.addallproducts(products);
   }

   @GetMapping("filteredprice")
    public List<Products> filteredprice(@PathVariable Double price){
        return service.filteredprice(price);
    }


}
