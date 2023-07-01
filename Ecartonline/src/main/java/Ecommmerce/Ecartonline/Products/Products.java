package Ecommmerce.Ecartonline.Products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Products {
    private Integer productid;
    private String productname;
    private Integer productprice;

    private ProductType producttype;
}
