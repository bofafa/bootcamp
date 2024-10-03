package com.bootcamp.junit.exercise;
import java.util.Map;
import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     *
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        this.ordersOfFurnitures = new HashMap<>();
    }

  

    public void addToOrder(final Furniture type, final int furnitureCount) {
        this.ordersOfFurnitures.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {

        return  this.ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        float sum1 = 0;
       for (Map.Entry <Furniture, Integer> items : ordersOfFurnitures.entrySet()) {
        sum1 += (items.getValue()* items.getKey().cost());
       }
        return sum1;
    }

    public int getTypeCount(Furniture type) {
        Integer count = ordersOfFurnitures.get(type);
        return count != null ? count : 0;
    }

    public float getTypeCost(Furniture type) {
        Integer count = getTypeCount(type);
        if (count != null) 
            return count * type.cost();
        return 0.0f;
    }

    public int getTotalOrderQuantity() {
        int sum = 0;
       for (Map.Entry <Furniture, Integer> items : ordersOfFurnitures.entrySet()) {
        sum += items.getValue();
       }
        return sum;
    }



}