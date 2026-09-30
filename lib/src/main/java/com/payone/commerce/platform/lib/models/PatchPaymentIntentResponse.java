package com.payone.commerce.platform.lib.models;

/**
 * The updated payment intent has the same fields as a created payment intent.
 */
public class PatchPaymentIntentResponse extends CreatePaymentIntentResponse {
  private static final long serialVersionUID = 1L;

  @Override
  public PatchPaymentIntentResponse shoppingCart(ShoppingCartData value) {
    super.shoppingCart(value);
    return this;
  }

  @Override
  public PatchPaymentIntentResponse paymentIntentOutput(PaymentIntentOutput value) {
    super.paymentIntentOutput(value);
    return this;
  }
}
