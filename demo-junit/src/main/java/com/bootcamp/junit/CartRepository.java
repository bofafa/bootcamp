package com.bootcamp.junit;

import java.util.List;

// Get Cart detail from DB
public class CartRepository {
  
  public List<Item> getItemsFromDB(int customerId) {
    // login db ..
    // select items from tables ...
    return List.of(new Item("apple", 8), new Item("orange", 7));
  }



  public List <Item> getItemsTest(int customerID){
    return List.of(new Item("dress" 1), new Item("top", 8));
  }
}