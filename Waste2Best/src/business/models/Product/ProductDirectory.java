/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDirectory {
    private ArrayList<Product> productList;
    
    public ProductDirectory(){
        productList = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return productList;
    }

    public void setProducts(ArrayList<Product> products) {
        this.productList = products;
    }
    
    public Product createProduct(String type){
        Product product = productFactory(type);
        productList.add(product);
        return product;
    }
    
    private Product productFactory(String type){
        switch(type){
            case "seed":    return new Seed();
            case "crop":    return new CropProduce();
            case "tumbler": return new Tumbler();
            case "compost": return new Compost();
            default:        return null;
        } 
    }
}
