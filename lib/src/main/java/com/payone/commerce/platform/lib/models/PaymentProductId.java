package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Payment product identifier - please check product documentation for a full
 * overview of possible values.
 */
public class PaymentProductId implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer value;

    public PaymentProductId() {
    }

    public PaymentProductId(Integer value) {
        this.value = value;
    }

    public PaymentProductId value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Payment product identifier - please check product documentation for a full
     * overview of possible values.
     * 
     * @minimum 0
     * @maximum 99999
     * @example 840
     * @return value
     */
    @JsonValue
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @JsonCreator
    public static PaymentProductId fromValue(Integer value) {
        return new PaymentProductId(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentProductId that = (PaymentProductId) o;
        return Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentProductId {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
