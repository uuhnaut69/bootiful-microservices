package com.uuhnaut69.common.ordersaga;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservedProductStockSuccessfullyEvent {

  private String productId;

  private String orderId;

  private int quantity;
}
