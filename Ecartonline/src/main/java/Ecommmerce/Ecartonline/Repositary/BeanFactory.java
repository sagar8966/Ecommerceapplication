package Ecommmerce.Ecartonline.Repositary;

import Ecommmerce.Ecartonline.Products.Products;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanFactory {

    @Bean
    public Map<Integer, Products> allproducts(){
       return new HashMap<>();
    }
}
