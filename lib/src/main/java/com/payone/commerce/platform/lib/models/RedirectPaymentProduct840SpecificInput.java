package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing specific input required for PayPal payments (Payment
 * product ID 840)
 */
@JsonPropertyOrder({
    RedirectPaymentProduct840SpecificInput.JSON_PROPERTY_ADDRESS_SELECTION_AT_PAY_PAL
})
public class RedirectPaymentProduct840SpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ADDRESS_SELECTION_AT_PAY_PAL = "addressSelectionAtPayPal";
  private Boolean addressSelectionAtPayPal;

  public RedirectPaymentProduct840SpecificInput() {
  }

  public RedirectPaymentProduct840SpecificInput addressSelectionAtPayPal(Boolean addressSelectionAtPayPal) {

    this.addressSelectionAtPayPal = addressSelectionAtPayPal;
    return this;
  }

  /**
   * Indicates whether to use PayPal Express Checkout Shortcut. * true &#x3D; When
   * shortcut is enabled, the consumer can select a shipping address during PayPal
   * checkout. * false &#x3D; When shortcut is disabled, the consumer cannot
   * change the shipping address. Default value is false. Please note that this
   * field is ignored when order.additionalInput.typeInformation.purchaseType is
   * set to \&quot;digital\&quot;
   * 
   * @return addressSelectionAtPayPal
   **/

  @JsonProperty(JSON_PROPERTY_ADDRESS_SELECTION_AT_PAY_PAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAddressSelectionAtPayPal() {
    return addressSelectionAtPayPal;
  }

  @JsonProperty(JSON_PROPERTY_ADDRESS_SELECTION_AT_PAY_PAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressSelectionAtPayPal(Boolean addressSelectionAtPayPal) {
    this.addressSelectionAtPayPal = addressSelectionAtPayPal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectPaymentProduct840SpecificInput redirectPaymentProduct840SpecificInput = (RedirectPaymentProduct840SpecificInput) o;
    return Objects.equals(this.addressSelectionAtPayPal,
        redirectPaymentProduct840SpecificInput.addressSelectionAtPayPal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressSelectionAtPayPal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectPaymentProduct840SpecificInput {\n");
    sb.append("    addressSelectionAtPayPal: ").append(toIndentedString(addressSelectionAtPayPal)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
