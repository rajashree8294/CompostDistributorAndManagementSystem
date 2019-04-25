/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.models.workRequest;

/**
 *
 * @author Rajashree
 */
public class FoodProductWorkRequest extends WorkRequest{
    private double quantity;
    private String productName;
    private String productId;
    private double productPrice;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
