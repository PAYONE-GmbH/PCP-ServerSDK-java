package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the specific input details for PayPal payments completed by
 * the merchant.
 */
@JsonPropertyOrder({
        CompletePaymentProduct840SpecificInput.JSON_PROPERTY_JAVASCRIPT_SDK_FLOW,
        CompletePaymentProduct840SpecificInput.JSON_PROPERTY_ACTION
})
public class CompletePaymentProduct840SpecificInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String JSON_PROPERTY_JAVASCRIPT_SDK_FLOW = "javaScriptSdkFlow";
    private Boolean javaScriptSdkFlow;

    public static final String JSON_PROPERTY_ACTION = "action";
    private String action;

    public CompletePaymentProduct840SpecificInput() {
    }

    public CompletePaymentProduct840SpecificInput javaScriptSdkFlow(Boolean javaScriptSdkFlow) {
        this.javaScriptSdkFlow = javaScriptSdkFlow;
        return this;
    }

    /**
     * Indicates whether the PayPal JavaScript SDK flow is used.
     * * true = The PayPal JavaScript SDK flow is used.
     * * false = The PayPal JavaScript SDK flow is not used.
     * Default value is false.
     *
     * @return javaScriptSdkFlow
     */
    @JsonProperty(JSON_PROPERTY_JAVASCRIPT_SDK_FLOW)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getJavaScriptSdkFlow() {
        return javaScriptSdkFlow;
    }

    @JsonProperty(JSON_PROPERTY_JAVASCRIPT_SDK_FLOW)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setJavaScriptSdkFlow(Boolean javaScriptSdkFlow) {
        this.javaScriptSdkFlow = javaScriptSdkFlow;
    }

    public CompletePaymentProduct840SpecificInput action(String action) {
        this.action = action;
        return this;
    }

    /**
     * Confirmation of the order status in case of PayPal SDK integration. Currently
     * only CONFIRM_ORDER_STATUS is supported.
     *
     * @return action
     */
    @JsonProperty(JSON_PROPERTY_ACTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAction() {
        return action;
    }

    @JsonProperty(JSON_PROPERTY_ACTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompletePaymentProduct840SpecificInput that = (CompletePaymentProduct840SpecificInput) o;
        return Objects.equals(this.javaScriptSdkFlow, that.javaScriptSdkFlow) &&
                Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(javaScriptSdkFlow, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompletePaymentProduct840SpecificInput {\n");
        sb.append("    javaScriptSdkFlow: ").append(toIndentedString(javaScriptSdkFlow)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
