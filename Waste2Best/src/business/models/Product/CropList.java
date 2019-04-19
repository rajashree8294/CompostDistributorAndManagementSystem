/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.Product;

import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class CropList {
private ArrayList<CropProduce> cropProduceList;

    public ArrayList<CropProduce> getCropProduce() {
        return cropProduceList;
    }

    public void setCropProduce(ArrayList<CropProduce> cropProduce) {
        this.cropProduceList = cropProduce;
    }

   public CropProduce addCropProduce(){
    
    CropProduce cropProduce = new CropProduce();
    cropProduceList.add(cropProduce);
    return cropProduce;
    
    
}
    
    
}
