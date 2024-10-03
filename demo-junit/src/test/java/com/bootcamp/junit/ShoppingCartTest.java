package com.bootcamp.junit;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.mockito.Mockito.when;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

// Test A
@ExtendWith(MockitoExtension.class) // @Mock
public class ShoppingCartTest {
  // Mock B
  @Mock
  private CartRepository cartRepository;

  @Test
  void testGetItems() {
    // Test A
    when(cartRepository.getItemsFromDB(13))
        .thenReturn(List.of(new Item("banana", 3), new Item("cherry", 4)));
    ShoppingCart sc = new ShoppingCart(this.cartRepository);
    List<Item> cartItems = sc.getCartItems(13);
    assertThat(cartItems, hasItems(new Item("cherry", 4), new Item("banana", 3)));
    verify(cartRepository, times(1)).getItemsFromDB(13);
  }

  @Test
  void testGetItemsTotalPrice() {
    // Test A
    when(cartRepository.getItemsFromDB(13))
        .thenReturn(List.of(new Item("banana", 3), new Item("cherry", 4)));
    ShoppingCart sc = new ShoppingCart(this.cartRepository);
    assertThat(sc.getCartItemsTotalPrice(13), equalTo(7));
    verify(cartRepository, times(1)).getItemsFromDB(13);
  }
}