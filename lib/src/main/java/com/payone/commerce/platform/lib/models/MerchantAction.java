package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object that contains the action, including the needed data, that you should
 * perform next, like showing instructions, showing the transaction results or
 * redirect to a third party to complete the payment
 */
@JsonPropertyOrder({
    MerchantAction.JSON_PROPERTY_ACTION_TYPE,
    MerchantAction.JSON_PROPERTY_REDIRECT_DATA
})
public class MerchantAction implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
  private ActionType actionType;

  public static final String JSON_PROPERTY_REDIRECT_DATA = "redirectData";
  private RedirectData redirectData;

  public MerchantAction() {
  }

  public MerchantAction actionType(ActionType actionType) {

    this.actionType = actionType;
    return this;
  }

  /**
   * Action merchants needs to take in the online payment process. See
   * {@link ActionType}
   * for possible values and their descriptions.
   * 
   * @return actionType The type of action to be performed
   **/

  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActionType getActionType() {
    return actionType;
  }

  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionType(ActionType actionType) {
    this.actionType = actionType;
  }

  public MerchantAction redirectData(RedirectData redirectData) {

    this.redirectData = redirectData;
    return this;
  }

  /**
   * Get redirectData
   * 
   * @return redirectData
   **/

  @JsonProperty(JSON_PROPERTY_REDIRECT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RedirectData getRedirectData() {
    return redirectData;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectData(RedirectData redirectData) {
    this.redirectData = redirectData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantAction merchantAction = (MerchantAction) o;
    return Objects.equals(this.actionType, merchantAction.actionType) &&
        Objects.equals(this.redirectData, merchantAction.redirectData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, redirectData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantAction {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    redirectData: ").append(toIndentedString(redirectData)).append("\n");
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
