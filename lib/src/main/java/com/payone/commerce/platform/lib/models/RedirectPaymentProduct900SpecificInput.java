package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * RedirectPaymentProduct900SpecificInput
 */
@JsonPropertyOrder({
    RedirectPaymentProduct900SpecificInput.JSON_PROPERTY_CAPTURE_TRIGGER
})
public class RedirectPaymentProduct900SpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Indicates the event upon which the payment should be captured.
   */
  public enum CaptureTriggerEnum {
    SHIPPING(String.valueOf("shipping")),

    DELIVERY(String.valueOf("delivery")),

    AVAILABILITY(String.valueOf("availability")),

    SERVICE_FULFILLMENT(String.valueOf("serviceFulfillment")),

    OTHER(String.valueOf("other"));

    private String value;

    CaptureTriggerEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CaptureTriggerEnum fromValue(String value) {
      for (CaptureTriggerEnum b : CaptureTriggerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CAPTURE_TRIGGER = "captureTrigger";
  private CaptureTriggerEnum captureTrigger;

  public RedirectPaymentProduct900SpecificInput() {
  }

  public RedirectPaymentProduct900SpecificInput captureTrigger(CaptureTriggerEnum captureTrigger) {
    this.captureTrigger = captureTrigger;
    return this;
  }

  /**
   * Indicates the event upon which the payment should be captured.
   * This value is shown to customers in the Wero portal to clarify
   * when the capture will occur.
   * Has the following possible values:
   * - shipping: Upon shipping the order.
   * - delivery: Upon delivering the order.
   * - availability: As soon as the order is available.
   * - serviceFulfillment: Upon fulfilling the service.
   * - other: For any other use case.
   *
   * @return captureTrigger
   */
  @JsonProperty(JSON_PROPERTY_CAPTURE_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CaptureTriggerEnum getCaptureTrigger() {
    return captureTrigger;
  }

  @JsonProperty(JSON_PROPERTY_CAPTURE_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaptureTrigger(CaptureTriggerEnum captureTrigger) {
    this.captureTrigger = captureTrigger;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectPaymentProduct900SpecificInput redirectPaymentProduct900SpecificInput = (RedirectPaymentProduct900SpecificInput) o;
    return Objects.equals(this.captureTrigger, redirectPaymentProduct900SpecificInput.captureTrigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(captureTrigger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectPaymentProduct900SpecificInput {\n");
    sb.append("    captureTrigger: ").append(toIndentedString(captureTrigger)).append("\n");
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
